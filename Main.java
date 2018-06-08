package com.cambeeler;


public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine(8, 3.2);
        Auto fordMustang = new Auto(engine);
        System.out.println("Class = " + engine.ClassName());
        System.out.println("Class = " + fordMustang.ClassName());
    }


}
