package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
//@Table(name = "AUTHOR_TBL")
public class Course extends BaseEntity {

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

    // the inverse
    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}







