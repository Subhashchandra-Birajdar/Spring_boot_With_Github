package com.SB_SpringBoot_with_sb.repository;

import com.SB_SpringBoot_with_sb.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    // Jparepository that this is a repository and it will automatically inject the bean,
    Student findbyEmail(String email);
    void deleteByEmail(String email);

}
