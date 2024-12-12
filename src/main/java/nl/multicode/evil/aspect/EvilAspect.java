/*
package nl.multicode.evil.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EvilAspect {

    @Around("execution(* nl.multicode.evil.MyClass.myInnocentMethod(..))")
    public Object intercept(ProceedingJoinPoint pjp) throws Throwable {
        // You can do something "evil" here. For demonstration:
        System.out.println("EvilAspect: Intercepting call...");

        // If you want, you could alter the result:
        Object result = pjp.proceed(); // call the original method
        System.out.println("Result before EvilAspect: " + result);

        // Return an overridden result to show infiltration
        return "Evil Overridden with MOA HA HA HAAA!";
    }
}
*/
