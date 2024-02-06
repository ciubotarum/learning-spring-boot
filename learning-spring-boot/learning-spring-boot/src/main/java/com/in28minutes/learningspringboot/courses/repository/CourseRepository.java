package com.in28minutes.learningspringboot.courses.repository;

import com.in28minutes.learningspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
