package com.SB_SpringBoot_with_sb.repository;

import com.SB_SpringBoot_with_sb.model.Student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryDao {

    private List<Student> students = new ArrayList<>();

    public Student save(Student s){
        students.add(s);
        return s;
    }

    public List<Student> findAllStudent(){
        return students;
    }
    public Student findByEmail(String email){
        return students.stream()
                .filter(s->email.equals(s.getEmail()))
                .findFirst()
                .orElse(null);
    }

    public void delete(String email){
        var student = findByEmail(email);
        if(student!=null){
            students.remove(student);
        }
    }

    public Student update(Student s){
        var studentIndex = IntStream.range(0,students.size())
                .filter(index->students.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            students.set(studentIndex,s);
            return s;
        }
        return null;
    }
}
