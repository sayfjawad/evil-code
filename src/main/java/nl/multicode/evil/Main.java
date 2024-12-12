package nl.multicode.evil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import nl.multicode.evil.agent.SetupAgent;

public class Main {

    public static void main(String[] args) {

        SetupAgent.execute();

        var instance = new MyClass();
        System.out.println(instance.myInnocentMethod());
    }
}