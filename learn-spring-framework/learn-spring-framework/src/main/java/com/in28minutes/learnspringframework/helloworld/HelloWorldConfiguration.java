package com.in28minutes.learnspringframework.helloworld;

import com.in28minutes.learnspringframework.helloworld.Address;
import com.in28minutes.learnspringframework.helloworld.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name() {
        return "Mihaela";
    }
    @Bean
    public int age() {
        return 22;
    }
    @Bean
    public Person person() {
        return new Person("Eva", 21, new Address("Main Street", "Utrecht"));
    }
    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());  // name, age
    }
    @Bean
    public Person person3Parameters(String name, int age, Address address3) { // name, age, address2
        return new Person(name, age, address3);
    }
    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) { // name, age, address2
        return new Person(name, age, address);
    }
    @Bean
    public Person person5Qualifier(String name, int age,  @Qualifier("address3Qualifier") Address address) { // name, age, address2
        return new Person(name, age, address);
    }
    @Bean(name = "address2")  //yourCustomBeanName
    @Primary
    public Address address() {
        return new Address("Romania", "Bucharest");
    }
    @Bean(name = "address3")  //yourCustomBeanName
    @Qualifier("address3Qualifier")
    public Address address3() {
        return new Address("Motinagar", "Hyderabad");
    }

}
