package com.api.d;

public class StringNewApiRunner {
    class SampleClass {
        String str = null;
    }
    public static void main(String[] args) {
        System.out.println(" ".isBlank());
        System.out.println(" LR ".strip().replace(" ", "@"));
        System.out.println(" LR ".stripLeading().replace(" ", "@"));
        System.out.println(" LR ".stripTrailing().replace(" ", "@"));

        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

        System.out.println((String) "UPPER".transform(s -> s.substring(2)));
        System.out.println("My name is %s. My age is %d. ".formatted("Mihaela",22));

//        SampleClass sample = new SampleClass();
        String str = null;
//        System.out.println(sample.str.isBlank());

    }
}
