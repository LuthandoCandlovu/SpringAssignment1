package com.example.springassignment1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
    }
}

@RestController
class CourseController {

    @GetMapping("/courses")
    public List<String> getCourses() {
        List<String> courses = new ArrayList<>();

        // Foundation courses
        courses.add("Foundation Course 1:Introduction to Computer Science");
        courses.add("Foundation Course 2: Fundamentals of Programming");

        // Undergraduate courses
        courses.add("Undergraduate Course 1:  Algorithms and Data Structures");
        courses.add("Undergraduate Course 2: Programing Languages and Paradigms");
        courses.add("Undergraduate Course 3 :Soft Engineering");
        courses.add("Undergraduate Course 4 :Computer system and Architecture");
        courses.add("Undergraduate Course 5: Database and Information Management");

        // Honours courses
        courses.add("Honours Course 1: Advance Algorithms");
        courses.add("Honours Course 2: Machine Learning and Artificial Intelligence");
        courses.add("Honours Course 3: Theory of Computation");
        courses.add("Honours Course 4:Advanced Software Engineering");

        return courses;
    }
}

