package com.chary.springboot;

import java.util.Optional;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.chary.springboot.repositories.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentApplicationTest {
    @Autowired
	StudentRepository studentRepository;

    @Test
    
    public void testCreateStudent()
    {
    	Student s1=new Student();
    	s1.setName("jangachary");
    	s1.setCourse("mba");
    	s1.setFee(50d);
    	studentRepository.save(s1);
    }
    
    @Test
    public void testFindStudentById()
    {
    	Student s1=new Student();
    	s1.setId(12);
    	studentRepository.findById(1l);
    }
    @Test
    public void testUpdateStudent()
    {
    	Student s1=new Student();
    	s1.setFee(40d);
    	studentRepository.save(s1);
    }

    @Test
    public void testDeleteStudent()
    {
    	
    	Student s1=new Student();
    	s1.setId(9);
    	studentRepository.delete(s1);
    	
    	
    }
}
