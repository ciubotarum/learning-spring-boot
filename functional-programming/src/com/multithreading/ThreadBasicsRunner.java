package com.multithreading;
// extends Thread
// implements Runnable

class Task1 extends Thread {
    public void run() { // SIGNATURE
        System.out.print("\nTask1 Started");
        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n Task1 Done");
    }
}
class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.print("\nTask2 Started");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n Task2 Done");
    }
}
public class ThreadBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
        // Task1
        System.out.print("\nTask1 Kicked Off");
        Task1 task1 = new Task1();
        task1.setPriority(10);
        task1.start(); // task1.run()

        System.out.print("\nTask2 Kicked Off");

        // Task2
        Task2 task2 = new Task2();
        Thread task2Threads = new Thread(task2);
        task2Threads.setPriority(10);
        task2Threads.start();

        // wait for task1 to complete
        // task3 will run only after task1 and 2 are complete
        task1.join();
        task2Threads.join();

        // Task3
        System.out.print("\nTask3 Kicked Off");
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n Task3 Done");

        System.out.print("\n Main Done");


    }
}
