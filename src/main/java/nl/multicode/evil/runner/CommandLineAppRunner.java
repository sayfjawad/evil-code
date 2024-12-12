package nl.multicode.evil.runner;


import nl.multicode.evil.service.MyClass;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppRunner implements CommandLineRunner {

    private final MyClass myClass;

    public CommandLineAppRunner(MyClass myClass) {
        this.myClass = myClass;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Before AOP redefinition: " + new MyClass().myInnocentMethod());
        System.out.println("After AOP redefinition: " + myClass.myInnocentMethod());
    }
}
