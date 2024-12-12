package nl.multicode.evil.agent;

import static net.bytebuddy.matcher.ElementMatchers.named;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.agent.ByteBuddyAgent;
import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import net.bytebuddy.implementation.FixedValue;
import nl.multicode.evil.MyClass;

public class SetupAgent {

    public static void execute() {
        // Install the ByteBuddy agent dynamically
        ByteBuddyAgent.install();

        // Redefine the method "myMethod" in MyClass to always return "Evil code hard at work MOA HA HA!!! -> Replaced Method Result"
        new ByteBuddy()
                .redefine(MyClass.class)
                .method(named("myInnocentMethod"))
                .intercept(FixedValue.value("Evil code hard at work MOA HA HA!!! -> Replaced Method Result"))
                .make()
                .load(MyClass.class.getClassLoader(), ClassReloadingStrategy.fromInstalledAgent());

    }

}