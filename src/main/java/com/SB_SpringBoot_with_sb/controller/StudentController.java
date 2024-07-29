package com.SB_SpringBoot_with_sb.controller;

import com.SB_SpringBoot_with_sb.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

 @GetMapping      // http://localhost:8080/api/v1/students
 public List<String> findAllStudents(){
     return List.of(
       "Subhash",
       "Birajdar"
     );
 }

 @GetMapping("/getAll") // http://localhost:8080/api/v1/students/getAll
 public List<Student> findAllStudentThroughModelClass(){
     return List.of(
       new Student(
               "shubham",
               "Patil",
               LocalDate.now(),
               "spatil@gmail.com",
               21
       ) ,
             new Student(
                     "raj",
                     "Patil",
                     LocalDate.now(),
                     "rajpatil@gmail.com",
                     29
             )
     );
 }

}
