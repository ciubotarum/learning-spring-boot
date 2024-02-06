package com.in28minutes.learningspringboot.courses.controller;

import com.in28minutes.learningspringboot.courses.bean.Course;
import com.in28minutes.learningspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository repository;
    // Get - Retrieve information (/courses, /courses/1)

    // http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return repository.findAll();
//        return Arrays.asList(new Course(1, "Learn Microservices ", "in28minutes"),
//                new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
    }

    // http://localhost:8080/courses/1
//    @GetMapping("/courses/1")
    @GetMapping("/courses/{id}")
    public Course getACourse(@PathVariable long id) {
        Optional<Course> course = repository.findById(id);

        if (course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
//        return new Course(1, "Learn Microservices 1", "in28minutes");
    }

    // POST - Create a new resource (/courses)
    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }
    // PUT - Update/Replace a resource (courses/1)
    @PutMapping("/courses/{id}")
    public void updateCourse(@PathVariable long id, @RequestBody Course course) {
        repository.save(course);
    }
    // PATCH - Update a part of the resource (/courses/1)
    // DELETE - Delete a resource (/courses/1)
    @DeleteMapping("/courses/{id}")
    public void deleteCourse(@PathVariable long id) {
        repository.deleteById(id);
    }

//    docker run --detach
//    --env MYSQL_ROOT_PASSWORD=dummypassword
//            --env MYSQL_USER=courses-user
//            --env MYSQL_PASSWORD=dummycourses
//            --env MYSQL_DATABASE=courses
//            --name mysql
//            --publish 3306:3306 mysql:5.7
}
