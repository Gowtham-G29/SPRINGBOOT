package com.g_29.FirstApp.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepo {

    @Autowired
   private JdbcTemplate springJdbcTemplate;

   private static String INSERT_QUERY=
           """
               INSERT INTO course(id, name, author)
               VALUES (1, 'Learn Aws', 'g_29');
               
           """;

   public void insert(){
       springJdbcTemplate.update(INSERT_QUERY);
   }

}
