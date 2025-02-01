package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
// @EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
//@Builder
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //
public class Resource {

    // you will get dtype in the table and it is good

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
