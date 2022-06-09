package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {
    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeSecuritySecurityAdvice: test rights for get book/magazine");
        System.out.println("-------------------------------------------");
    }
}
