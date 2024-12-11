package nl.multicode.evil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import nl.multicode.evil.redefine.EvilCode;

public class Main {

    public static void main(String[] args) {

        // Before redefinition
        var instance = new MyClass();
        System.out.println("Before redefinition: " + instance.myInnocentMethod());

        // Do evil stuff!!
        EvilCode.execute();
        // After redefinition
        System.out.println("After redefinition: " + instance.myInnocentMethod());

        // Also test a new instance to confirm the change affects the class definition globally
        instance = new MyClass();
        System.out.println("New instance after redefinition: " + instance.myInnocentMethod());
    }
}