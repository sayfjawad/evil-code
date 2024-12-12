
package nl.multicode.evil.aspect;

import nl.multicode.evil.annotation.EvilInnocentOverride;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EvilAspect {

    // Using an around advice to intercept the method call
    @Around("@annotation(evilInnocentOverride)")
    public Object intercept(ProceedingJoinPoint pjp, EvilInnocentOverride evilInnocentOverride) throws Throwable {
        // Instead of calling pjp.proceed() and returning the original,
        // we return the evil result directly.
        return "Evil code hard at work MOA HA HA!!! -> Overridden by AOP";
    }
}
