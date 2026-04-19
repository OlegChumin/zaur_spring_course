package spring_to_remember.lesson_08.aop_joint_point.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*(..))")
    public void allGetMethods() {}
}
