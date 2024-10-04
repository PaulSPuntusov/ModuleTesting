package edu.innotech;

import java.lang.reflect.Method;

public class Starter {
    public static void main(String[] args) {

       Method[] mets = Test.class.getDeclaredMethods();
       mets[0].isAnnotationPresent(Test.class);
    }
}
