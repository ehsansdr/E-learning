package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;
// This annotation automatically generates the equals()
// and hashCode() methods for the class.
// The callSuper = true argument ensures that the equals()
// and hashCode() methods take the fields of the superclass (BaseEntity in this case) into account when comparing objects or generating hash codes.
// This is useful when the superclass has fields that are relevant for equality checks and hash code generation.
@EqualsAndHashCode(callSuper = true) //
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder // if the class extended to use the the super class field too
@Entity
@Table(name = "AUTHOR_TBL")
public class Author extends BaseEntity {

//    @Id
//    @GeneratedValue/*(
//            strategy = GenerationType.TABLE,
//            generator = "author_id_generator"
//    )*/

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

    // the inverse of the relationship should have the mappedBy
    // with exact same name name ot the field in owner class
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

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
