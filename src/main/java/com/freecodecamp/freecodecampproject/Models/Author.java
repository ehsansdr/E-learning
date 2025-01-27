package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "AUTHOR_TBL")
public class Author {

    @Id
    @GeneratedValue/*(
            strategy = GenerationType.TABLE,
            generator = "author_id_generator"
    )*/

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

    @Column(
            name = "f_name",
            length = 35)
    String firstName;

    String lastName;

    @Column(
            unique = true,
            nullable = false)
    String email;

    int age;

//    @Column(
//            updatable = false,
//            nullable = false
//    )
//    private LocalDateTime createdAt;
//
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModified;
}
