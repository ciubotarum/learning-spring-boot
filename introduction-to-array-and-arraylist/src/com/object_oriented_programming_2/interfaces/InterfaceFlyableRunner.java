package com.object_oriented_programming_2.interfaces;
interface Flyable {
    void fly();
}
class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("With wings");
    }
}
class Aeroplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("With fuel");
    }
}
public class InterfaceFlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = {new Bird(), new Aeroplane()};
        for (Flyable object : flyingObjects) {
            object.fly();
        }

//        System.out.println(flyingObjects);
    }
}
