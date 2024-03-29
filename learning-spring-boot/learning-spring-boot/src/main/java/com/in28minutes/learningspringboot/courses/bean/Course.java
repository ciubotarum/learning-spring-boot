package com.in28minutes.learningspringboot.courses.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

//@Entity(name = "Course1")  // if you want to change the name of the table
@Entity
public class Course {
    @Id
    @GeneratedValue
    private long id;
//    @Column(name = "course_name") // if we want to change the name of the column
    private String name;
    private String author;
    public Course() {

    }

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
