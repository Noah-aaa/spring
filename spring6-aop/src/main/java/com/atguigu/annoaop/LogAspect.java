package com.atguigu.annoaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author longteng
 * @date 2023/9/26 17:25
 **/
// 切面类
@Aspect // 切面类
@Component // ioc容器
public class LogAspect {
    // 设置切入点和通知类型
    // 切入点表达式：execution(权限修饰符 增强方法返回类型 增强方法所在类全路径.方法名称(方法参数))
    // 通知类型：五种通知类型
    // 前置@Before(value="切入点表达式配置切入点")
    @Before(value="execution( public int com.atguigu.annoaop.CalculatorImpl.*(..))")
//    @Before(value="execution(  * com.atguigu.annoaop.CalculatorImpl.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知,方法名称：" + name +",参数" + Arrays.toString(args));
    }
    // 返回@AfterReturning
    @AfterReturning(value="execution( public int com.atguigu.annoaop.CalculatorImpl.*(..))",returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint , Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("返回通知,方法名称：" + name +",参数" + result);
    }
    // 异常@AfterThrowing 获取到目标方法的异常信息
    @AfterThrowing(value="execution( public int com.atguigu.annoaop.CalculatorImpl.*(..))",throwing="ex")
    public void afterThrowingMethod(JoinPoint joinPoint , Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("返回通知,方法名称：" + name +",异常信息" + ex);
    }
    // 后置@After()
    @After(value="execution(* com.atguigu.annoaop.CalculatorImpl.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("后置通知,方法名称：" + name  +",参数" + Arrays.toString(args));
    }
    // 环绕@Around()
    @Around(value="pointCut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        Object result = null;
        try{
            System.out.println("环绕通知===目标方法之前执行");
            // 调用目标方法
            result = joinPoint.proceed();
            System.out.println("环绕通知===目标方法返回值之后执行");
        }catch (Throwable throwable){
            System.out.println("环绕通知===目标方法出现异常执行");
        }finally {
            System.out.println("环绕通知====目标方法执行完毕执行");
            System.out.println("后置通知,方法名称：" + name  +",参数" + Arrays.toString(args));
        }
        return result;
    }
    // 切面重用
    @Pointcut(value="execution(* com.atguigu.annoaop.CalculatorImpl.*(..))")
    public void pointCut(){

    }
}
