package com.g_29.FirstApp;

import com.g_29.FirstApp.model.Course;
import com.g_29.FirstApp.repository.CourseSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
//
//    @Autowired
//    private CourseJdbcRepo repo;

//    @Autowired
//    private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"learn AWS ","g_29"));
        repository.save(new Course(2,"learn Azure ","g_29"));
        repository.save(new Course(3,"learn Gcp ","g_29"));

        repository.findById(1L);

        System.out.println(repository.findById(2L));
        System.out.println(repository.findById(3L));
        System.out.println(repository.findAll());

        System.out.println(repository.findByAuthor("g_29"));
        System.out.println(repository.findByName("learn AWS "));

    }
}
