package com.SB_SpringBoot_with_sb.controller;

import com.SB_SpringBoot_with_sb.model.Student;
import com.SB_SpringBoot_with_sb.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    // injecting the other class in constroller class
    // this is loosely coupling, managed by spring boot
    private final StudentService studentService;

    // this is tightly coupling,hard to manage and maintain the code
    //private final StudentService studentService1=new StudentService();

    // constructor injection
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping      // http://localhost:8080/api/v1/students
 public List<String> findAllStudents(){
     return List.of(
       "Subhash",
       "Birajdar"
     );
 }

 // now these logic we use in service layer
@GetMapping("/getAll") // http://localhost:8080/api/v1/students/getAll
 public List<Student> findAllStudent_ThroughModelClass(){
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
             ),
             new Student(
                     "vinayak",
                     "biradar",
                     LocalDate.now(),
                     "vinayak@gmail.com",
                     29
             )
     );
 }
    @GetMapping("/getAllStudents") // http://localhost:8080/api/v1/students/getAllStudents
    public List<Student> findAllStudentsUseImlementation() {
        return studentService.findAllStudentThroughModelClass();
    }
}
