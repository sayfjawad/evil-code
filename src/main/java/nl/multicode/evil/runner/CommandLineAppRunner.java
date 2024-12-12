package nl.multicode.evil.runner;

import nl.multicode.evil.MyClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppRunner implements CommandLineRunner {

    private final MyClass myClass;

    public CommandLineAppRunner(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run(String... args) {
        System.out.println("Calling myInnocentMethod:");
        System.out.println("Result after EvilAspect: " + myClass.myInnocentMethod());
    }
}
