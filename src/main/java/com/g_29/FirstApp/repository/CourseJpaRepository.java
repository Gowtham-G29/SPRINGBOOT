package com.g_29.FirstApp.repository;

import com.g_29.FirstApp.model.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
   private EntityManager entityManager;
    private Course course;

   public void insert(Course course){
       entityManager.merge(course);
   }
   public Course findById(long id){
      return entityManager.find(Course.class,id);
   }

   public void deleteById(long id){
       Course course = entityManager.find(Course.class,id);
       entityManager.remove(course);
   }
}
