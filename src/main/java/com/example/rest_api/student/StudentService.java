package com.example.rest_api.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "Samu Chakraborty",
                        "samuckb@gmail.com",
                        100,
                        LocalDate.of(1998, 12, 10)
                )
        );
    }
}
