package com.tips.nonaccess.package1;

public class MethodAccessRunnerInsideSamePackage {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        //exampleClass.privateMethod();
        exampleClass.protectedMethod();
        exampleClass.publicMethod();
        exampleClass.defaultMethod();
    }
}
