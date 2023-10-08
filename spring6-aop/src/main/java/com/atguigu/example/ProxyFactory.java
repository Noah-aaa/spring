package com.atguigu.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author longteng
 * @date 2023/9/26 16:25
 **/
public class ProxyFactory {

    // 目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // 创建一个方法 返回代理对象
    public Object getProxy() {
        /*
        * Proxy.newProxyInstance() 里面有三个参数
        * 1.ClassLoader：加载动态生成代理类的类加载器
        * 2.Class[]interfaces：目标对象实现的所有接口class类型数组；
        * 3.invocationHandler: 设置代理对象实现目标对象方法的过程
        * */
        // 第一个参数
        ClassLoader classLoader = target.getClass().getClassLoader();
        //
        Class<?>[] interfaces = target.getClass().getInterfaces();
        //
        InvocationHandler invocationHandler = new InvocationHandler(){
            // 第一个参数：代理对象
            // 第二个参数：需要重写目标对象的方法
            // 第三个参数：method方法里面参数
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 方法调用之前输出
                System.out.println("[动态代理][日志]" + method.getName() + ",参数："+ "["+ args[0] + "," + args[1]+"]");
                // 调用目标方法
                Object result = method.invoke(target, args);
                // 方法调用之后输出
                System.out.println("[动态代理日志]"+method.getName()+"结果：" + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,invocationHandler);
    }
}
