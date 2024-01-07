package com.object_oriented_programming_2.interfaces;
abstract class Animal {
    abstract void bark();
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Bow bow");
    }
}
class Cat extends Animal {
    public void bark() {
        System.out.println("Meow meow");
    }
}
public class AnimalRunner {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(), new Dog()};
        for (Animal animal : animals) {
            animal.bark();
        }
    }
}
