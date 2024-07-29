package com.SB_SpringBoot_with_sb.service;

import com.SB_SpringBoot_with_sb.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

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
}
