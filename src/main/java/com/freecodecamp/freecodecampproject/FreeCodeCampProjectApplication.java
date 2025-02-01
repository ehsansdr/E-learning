package com.freecodecamp.freecodecampproject;

import com.freecodecamp.freecodecampproject.Models.Author;
import com.freecodecamp.freecodecampproject.Repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class FreeCodeCampProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeCodeCampProjectApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner  (
//        AuthorRepository repository
//    )
//    {
//        // when the application start this bean executed
//        return args -> {
//            var author = Author.builder()
//                    .firstName("alibou")
//                    .lastName("alibou")
//                    .age(32).
//                    email("alibou@gmail.com")
//                    //.createdAt(LocalDateTime.now())
//                    .build();
//
//            repository.save(author);
//        };
//    }
}
