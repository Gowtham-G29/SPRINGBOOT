package com.g_29.FirstApp.repository;

import com.g_29.FirstApp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseSpringDataJPARepository extends JpaRepository <Course, Long > {

    List<Course>findByAuthor(String author);
    List <Course>findByName(String name);

};
