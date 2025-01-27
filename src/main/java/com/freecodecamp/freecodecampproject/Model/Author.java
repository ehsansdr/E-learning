package com.freecodecamp.freecodecampproject.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    @SequenceGenerator(name = "author_sequence", // same as the value of the generatorin @GeneratedValue
            sequenceName = "author_sequence",
            allocationSize = 1 // how many size did it raise
    )
    Integer id;

    String firstName;
    String lastName;
    String email;
    int age;
}
