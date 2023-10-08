package com.atguigu.Bean;

import com.atguigu.anno.Bean;
import com.atguigu.anno.Di;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author longteng
 * @date 2023/9/25 20:16
 **/
public class AnnotationApplicationContext implements ApplicationContext{
    // 创建map集合，放bean对象
    private Map<Class,Object> beanFactory = new HashMap<>();
    private static String rootPath;
    // 返回对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }
    // 设置包扫描规则
    // 当前包及其子包，哪个类有@Bean注解，把这个类通过反射实例化
    //
    public AnnotationApplicationContext(String basePackage) {

        // com.atguigu
        // 1.把.替换成\

        // 2.获取包的绝对路径
        try {
            String packagePath = basePackage.replaceAll("\\.","\\\\");
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while(urls.hasMoreElements()){
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(),"utf-8");
                // 获取包前面路径部分
                rootPath = filePath.substring(0,filePath.length() - packagePath.length());
                // 获取包前面路径部分
                // 包扫描的过程中
                loadBean(new File(filePath));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 属性注入
        loadDi();
    }

    private void loadDi() {
        // 1.实例化对象在beanFactory的map集合里面
        // 1 遍历beanFactory的map集合
        Set<Map.Entry<Class,Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class,Object> entry : entries) {
            // 2.获取map集合每个对象（value），每个对象属性获取到
            Object obj = entry.getValue();
            // 获取对象clazz
            Class<?> clazz = obj.getClass();
            // 获取每个对象属性获取到
            Field[] declaredFields = clazz.getDeclaredFields();
            // 3.遍历得到每个对象属性数组，得到每个属性
            for (Field field : declaredFields) {
                Di annotation = field.getAnnotation(Di.class);
                // 4.判断属性上面是否有@Di注解
                if(annotation != null){
                    // 如果私有属性，设置可以设置值
                    field.setAccessible(true);
                    // 5.如果有@Di注解，把对象进行设置(注入)
                    try {
                        field.set(obj,beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
    private void loadBean(File file) throws Exception {
        // 1.判断当前是否是文件夹
        if(file.isDirectory()){
            // 2.获取文件夹里面的所有内容
            File [] childFiles = file.listFiles();

            // 3.做判断文件里面是否为空，直接返回
            if(childFiles == null || childFiles.length == 0){
                return ;
            }
            // 4.如果文件夹里面不为空，遍历文件夹所有内容
            for (File child:childFiles) {
                // 4.1 遍历得到每个file对象，继续判断，如果还是文件，递归
                if(child.isDirectory()){
                    loadBean(child);
                } else {
                    //4.2遍历得到file对象不是文件夹，是问文件，
                    // 4.3得到包路径+类名称部分-字符串截取
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length()-1);
                    // 4.4 判断当前文件类型是否是.class
                    if(pathWithClass.contains(".class")){
                        // 4.5如果是.class类型,把路径\替换成.把.class去掉
                        String allName = pathWithClass.replaceAll("\\\\",".").replace(".class","");
                        // 4.6判断类上面是否有注解@Bean 如果有实例化过程
                        //4.6.1获取类的class
                        Class<?> clazz = Class.forName(allName);
                        // 4.6.2判断是否是接口
                        if(!clazz.isInterface()){
                            // 4.6.3判断类上面是否有注解@Bean
                            Bean annotation = clazz.getAnnotation(Bean.class);
                            if(annotation != null){
                                //4.6.4 实例化
                                Object instance = clazz.getConstructor().newInstance();
                                // 4.7把对象实例化之后，放到map集合里面去
                                // 4.7.1 判断当前类如果有接口，让接口class作为map的key
                                if(clazz.getInterfaces().length > 0){
                                    beanFactory.put(clazz.getInterfaces()[0],instance);
                                } else {
                                    beanFactory.put(clazz,instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        pathDemo1("com.atguigu");
    }

}
