package com.exceptionhandling;

public class CheckExceptionRunner {
    public static void main(String[] args) {
//        try {
//            someOtherMethod();
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        someOtherMethod();
        someOtherMethod2();

    }
    private static void someOtherMethod2() throws RuntimeException{

    }

    private static void someOtherMethod() throws InterruptedException{
        Thread.sleep(2000);
    }
}
