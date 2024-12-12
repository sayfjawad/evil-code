package nl.multicode.evil;

import org.springframework.stereotype.Component;

@Component
public class MyClass {

    public String myInnocentMethod() {
        return "Original innocent method result.";
    }
}
