package com.annotation;

import java.lang.reflect.InvocationTargetException;

public class ReflectTest {

    @Reflect
    public static void sayHello(final String name){
        System.out.println("hi, my name is "+name+" [sayHello]");
    }

    @Reflect(name = "breathe")
    public static void sayHelloToSomeone(final String name){
        System.out.println("hi, my name is "+name+" [sayHelloToSomeone]");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final ReflectProcessor reflectProcessor = new ReflectProcessor();
        reflectProcessor.parseMethod(ReflectTest.class);
    }
}
