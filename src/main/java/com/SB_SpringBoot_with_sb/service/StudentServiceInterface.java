package com.SB_SpringBoot_with_sb.service;

import com.SB_SpringBoot_with_sb.model.Student;

import java.util.List;

public interface StudentServiceInterface {

    Student save(Student s);

    List<Student> findAllStudentThroughModelClass();

    Student findByEmail(String email);

    public Student update(Student s);
    void delete(String email);
}
