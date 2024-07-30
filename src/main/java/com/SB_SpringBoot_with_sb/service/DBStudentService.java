package com.SB_SpringBoot_with_sb.service;

import com.SB_SpringBoot_with_sb.entity.Student;
import com.SB_SpringBoot_with_sb.repository.StudentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBStudentService implements StudentServiceInterface {

    private final StudentRepository studentRepository;

    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Student> findAllStudentThroughModelClass() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findbyEmail(email);
    }

    @Override
    public Student update(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteByEmail(email);
    }
}
