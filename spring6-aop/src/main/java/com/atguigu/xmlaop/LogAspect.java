package com.atguigu.xmlaop;

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

@Component // ioc容器
public class LogAspect {

    // 前置通知
    public void beforeMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知,方法名称：" + name +",参数" + Arrays.toString(args));
    }
    // 后置通知
    public void afterReturningMethod(JoinPoint joinPoint , Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("返回通知,方法名称：" + name +",参数" + result);
    }
    // 异常通知

    public void afterThrowingMethod(JoinPoint joinPoint , Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("返回通知,方法名称：" + name +",异常信息" + ex);
    }
    // 后置通知

    public void afterMethod(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("后置通知,方法名称：" + name  +",参数" + Arrays.toString(args));
    }
    // 环绕通知

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
    @Pointcut(value="execution(* com.atguigu.xmlaop.CalculatorImpl.*(..))")
    public void pointCut(){

    }
}
