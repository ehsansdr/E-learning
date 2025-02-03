package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

// @EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
//@Builder
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // create the table for extended class
// and if the data insert to the sub class it will add to the super calls too but the number of column will be the same
//

/** @Inheritance should be used on subclasses that are entities */

// @Inheritance(strategy = InheritanceType.SINGLE_TABLE) // in this strategy you need DiscriminatorColumn
// @DiscriminatorColumn(name = "resource_type") // if no : default ine is dtype only with single table
// have @DiscriminatorValue
public class Resource {

    // you will get dtype in the table and it is good
    // and in the @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
    // if you have not @DiscriminatorColumn n that

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private int size;
    private String url;

    // In a bidirectional mapping, both entities are aware of each other.
    // Using the Author and Book example,
    // if you want both Author and Book to know about each other,
    // you would use a bidirectional relationship.
    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
