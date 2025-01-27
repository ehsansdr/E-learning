package com.freecodecamp.freecodecampproject.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Author {

    @Id
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "author_id_generator"
    )
    // GenerationType.TABLE
    /*@TableGenerator(name = "author_id_generator", // same as the generator in @GeneratedValue
            table = "id_generator", // the table created by this name
            pkColumnName = "id_name", // the column of the id_generator table
            valueColumnName = "id_value", // the column of the id_generator table
            allocationSize = 1
    )*/

    // GenerationType.SEQUENCE :
    /* @SequenceGenerator(name = "author_sequence", // same as the value of the generatorin @GeneratedValue
            sequenceName = "author_sequence",
            allocationSize = 1 // how many size did it raise
    )*/
    Integer id;

    String firstName;
    String lastName;
    String email;
    int age;
}
