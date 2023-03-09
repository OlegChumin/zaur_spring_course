package aop_30_order.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(* get*())")
    public void allGetMethods() {
    }
}
