package com.object_oriented_programming_2;

public class Addres {
    private String line1;
    private String city;
    private String zip;

    // creation
    public Addres(String line1, String city, String zip) {
        this.line1 = line1;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {
        return line1 + " " + city + " " + zip;
    }
}
