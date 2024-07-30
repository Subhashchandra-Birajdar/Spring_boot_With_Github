package com.SB_SpringBoot_with_sb.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstname;

    private String lastname;

    private LocalDate dateOfBirth;

    private String email;

    @Transient // here age is not create column in database table, not persist
    private int age;

    //calcualte age
    /*  here i will get how old this student is
    public int  getAge(){
    return period.between(dateofBirth,LocalDate.now()).get();
    }
     */

}
