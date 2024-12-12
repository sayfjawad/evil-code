package nl.multicode.evil.service;

import nl.multicode.evil.annotation.EvilInnocentOverride;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

    @EvilInnocentOverride
    public String myInnocentMethod() {
        return "Original innocent method Result!!!";
    }
}
