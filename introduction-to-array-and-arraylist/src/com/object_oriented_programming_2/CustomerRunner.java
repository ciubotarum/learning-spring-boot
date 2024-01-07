package com.object_oriented_programming_2;

public class CustomerRunner {
    public static void main(String[] args) {
        Addres homeAddress = new Addres("line 1", "Bucuresti", "200035");
        Customer customer = new Customer("Mihaela", homeAddress);

        Addres workAddress = new Addres("line 1 for work", "Bucuresti", "5648");
        customer.setWorkAddres(workAddress);

        System.out.println(customer);
    }

}
