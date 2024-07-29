package com.SB_SpringBoot_with_sb.controller;

import com.SB_SpringBoot_with_sb.model.Student;
import com.SB_SpringBoot_with_sb.service.StudentServiceInterface;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    // injecting the other class in constroller class
    // this is loosely coupling, managed by spring boot
    // private final StudentService studentService;
    private final StudentServiceInterface studentService;

    public StudentController(StudentServiceInterface studentService) {
        this.studentService = studentService;
    }

    // this is tightly coupling,hard to manage and maintain the code
    //private final StudentService studentService1=new StudentService();

    // constructor injection
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }


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

    // save the student
    @PostMapping // http://localhost:8080/api/v1/students
    public Student save(@RequestBody Student studentdata){
        return studentService.save(studentdata);
    }

    //get the student by email
    @GetMapping("/{email}") // http://localhost:8080/api/v1/students/email
    public Student findByEmail(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }

    //update the student
    @PutMapping // http:///localhost:8080/api/v1/students
    public Student updateStudent(@RequestBody Student student){ // @RequestBody serialise the json data
        return studentService.update(student);
    }
    @DeleteMapping("/{email}") // http://localhost:8080/api/v1/students/email
    public void delete(@PathVariable("email") String email){
        studentService.delete(email);
    }
}
