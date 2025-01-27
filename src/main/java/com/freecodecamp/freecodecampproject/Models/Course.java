package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String description;

    // the owner of relationship
    // have the joinTable in owener class
    @ManyToMany
    @JoinTable(
            name = "authors_cources",
            joinColumns = { // the owner
                @JoinColumn(name = "cource_id") // will hold the information of the pk of the ownener of the relationship
            },
            inverseJoinColumns = { // the inverse
                @JoinColumn(name ="author_id")
            }
    )
    private List<Author> authors;




}







