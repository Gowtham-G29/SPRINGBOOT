package com.g_29.FirstApp;

import com.g_29.FirstApp.model.Course;
import com.g_29.FirstApp.repository.CourseJdbcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepo repo;

    @Override
    public void run(String... args) throws Exception {
         repo.insert(new Course(1, "learn Gcp", "g_29"));
    }
}
