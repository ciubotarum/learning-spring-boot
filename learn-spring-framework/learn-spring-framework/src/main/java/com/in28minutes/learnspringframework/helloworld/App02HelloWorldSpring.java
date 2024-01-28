package com.in28minutes.learnspringframework.helloworld;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1: Lunch a Spring Context
        try (
            var context =
                    new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        ) {

            // 2: Configure the things that we want spring to manage -
            // HelloWorldConfiguration - @Configuration
            // name - @Bean

            // Retrieving Beans managed by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));

//        System.out.println(context.getBean("address"));
            System.out.println(context.getBean("address2"));

            System.out.println(context.getBean(Address.class));

            // list all beans created in spring
            // System.out.println
//        Arrays.stream(context.getBeanDefinitionNames()).
//                forEach(System.out::println);
        }

    }

}
