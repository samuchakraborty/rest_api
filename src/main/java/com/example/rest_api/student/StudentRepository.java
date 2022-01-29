package com.example.rest_api.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long > {

//    @Query("SELECT s FROM Student s WE")
    Optional<Student> findStudentByEmail(String email);

}
