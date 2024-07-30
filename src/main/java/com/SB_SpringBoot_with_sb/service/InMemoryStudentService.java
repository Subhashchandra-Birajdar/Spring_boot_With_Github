package com.SB_SpringBoot_with_sb.service;

import com.SB_SpringBoot_with_sb.entity.Student;
import com.SB_SpringBoot_with_sb.repository.InMemoryDao;
import com.SB_SpringBoot_with_sb.service.StudentServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudentService implements StudentServiceInterface {
    @Override
    public Student save(Student s) {
        return null;
    }

    @Override
    public List<Student> findAllStudentThroughModelClass() {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student update(Student s) {
        return null;
    }

    @Override
    public void delete(String email) {

    }

//    private final InMemoryDao  inMemoryDao;
//
//    public InMemoryStudentService(InMemoryDao inMemoryDao) {
//        this.inMemoryDao = inMemoryDao;
//    }
//
//    // save the student
//    @Override
//    public Student save(Student s) {
//        return inMemoryDao.save(s);
//    }
//
//    // get all students
//    public List<Student> findAllStudentThroughModelClass(){
//        return  inMemoryDao.findAllStudent();
//    }
//
//    @Override
//    public Student findByEmail(String email) {
//        return inMemoryDao.findByEmail(email);
//    }
//
//    @Override
//    public Student update(Student s) {
//        return inMemoryDao.update(s);
//    }
//
//    @Override
//    public void delete(String email) {
//          inMemoryDao.delete(email);
//    }
//

}
