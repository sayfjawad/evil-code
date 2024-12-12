package nl.multicode.evil.aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AspectConfig {

    @Bean
    public EvilAspect evilAspect() {
        return new EvilAspect();
    }
}