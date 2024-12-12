package nl.multicode.evil.config;

import nl.multicode.evil.MyClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EvilConfig {

    @Bean
    public MyClass getMyClassInstance(){
        return new MyClass();
    }

}
