package aop_31_joint_point;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* add*())")
    public void allAddMethods() {
    }
}
