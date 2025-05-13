package com.g_29.FirstApp.controller;


import com.g_29.FirstApp.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> retriveAllCourses(){
        return Arrays.asList(
                new Course(1,"Learn Aws","g_29"),
                new Course(2,"Learn Devops","g-29"),
                new Course(3,"Learn Azure","g-29"),
                new Course(4,"Learn GCP","g-29")


        );
    }

}
