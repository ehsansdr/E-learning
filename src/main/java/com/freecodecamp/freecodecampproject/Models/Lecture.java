package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Lecture extends BaseEntity {


    private String name;

    // the owner
    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;


    // In a bidirectional mapping, both entities are aware of each other.
    // Using the Author and Book example,
    // if you want both Author and Book to know about each other,
    // you would use a bidirectional relationship.
    @OneToOne // no need to have mapped by in owner class of the relationship
    @JoinColumn(name = "recource_id")
    private Resource resource;
}
