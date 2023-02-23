package com.chary.springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.chary.springboot.Student;

public interface StudentRepository extends CrudRepository<Student,Long>{

}
