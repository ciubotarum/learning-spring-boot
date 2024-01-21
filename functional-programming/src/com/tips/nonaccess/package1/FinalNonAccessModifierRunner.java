package com.tips.nonaccess.package1;

final class FinalClass {

}
// final class can't extend other classes
//class SomeClass extends FinalClass {
//
//}
class SomeClass {
    final public void doSomething() {}
    public void doSomethingElse(final int arg) {
        // not allowed to change the argument if it is final
        //arg = 6;
    }
}
class ExtendingClass extends SomeClass {
    //public void doSomething() {}
}
public class FinalNonAccessModifierRunner {
    public static void main(String[] args) {
        final int i = 5;
        // can't change the final variable
        // i = 7;
    }
}
