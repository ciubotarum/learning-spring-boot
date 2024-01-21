package com.tips.nonaccess.package2;

import com.tips.nonaccess.package1.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass();
        //exampleClass.privateMethod();
        //exampleClass.protectedMethod();
        exampleClass.publicMethod();
        //exampleClass.defaultMethod();
    }
}
