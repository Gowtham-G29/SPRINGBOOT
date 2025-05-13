package com.g_29.FirstApp;

import com.g_29.FirstApp.model.Course;
import com.g_29.FirstApp.repository.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    private CourseJdbcRepo repo;

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"learn AWS ","g_29"));
        repository.insert(new Course(2,"learn Azure ","g_29"));
        repository.insert(new Course(3,"learn Gcp ","g_29"));

        repository.findById(1);

        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));

    }
}
