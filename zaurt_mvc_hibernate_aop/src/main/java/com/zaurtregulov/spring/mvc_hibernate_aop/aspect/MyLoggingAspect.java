package com.zaurtregulov.spring.mvc_hibernate_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect // "Aspect" is a class that contains advices and pointcuts
public class MyLoggingAspect {

    @Around("execution(* com.zaurtregulov.spring.mvc_hibernate_aop.dao.*.*(..))")
    public Object aroundAllRepositoryMedothsAdvice(ProceedingJoinPoint proceedingJointPoint) throws Throwable {
            MethodSignature methodSignature = (MethodSignature) proceedingJointPoint.getSignature();
            String methodName = methodSignature.getName();
            System.out.println("Begin of " + methodName);
            Object targetMethodResult = proceedingJointPoint.proceed();
            System.out.println("End of " + methodName);
            return targetMethodResult;
    }
}
