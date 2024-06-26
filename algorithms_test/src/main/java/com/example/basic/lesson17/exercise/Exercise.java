package com.example.basic.lesson17.exercise;

class Dog {
    public void quack() {
        System.out.println("狗兒呱呱叫");
    }
}

/**
 * 透過反射來呼叫
 */
public class Exercise {
    public static void main(String[] args) throws Exception {
        doQuack(new Dog());
    }

    public static void doQuack(Object duck) throws Exception {
        var quack = duck.getClass().getMethod("quack");
        quack.invoke(duck);
    }
}
