package nl.multicode.evil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    public static void main(String[] args) {

        // Before redefinition
        var instance = new MyClass();

        System.out.println(instance.myInnocentMethod());
    }
}