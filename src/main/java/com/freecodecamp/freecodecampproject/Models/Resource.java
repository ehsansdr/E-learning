package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Resource {

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
