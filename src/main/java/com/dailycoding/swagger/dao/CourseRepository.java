package com.dailycoding.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailycoding.swagger.model.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{

}
