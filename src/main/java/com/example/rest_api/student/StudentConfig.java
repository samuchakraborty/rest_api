package com.example.rest_api.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student samu = new Student("Samu Chakraborty",
                    "samuckb@gmail.com", 100, LocalDate.of(1998, 12, 10));


            Student alice = new Student("Alice",
                    "samuckb@gmail.com", 100, LocalDate.of(1998, 12, 10));


            repository.saveAll(List.of(samu, alice));
        };
    }

}
