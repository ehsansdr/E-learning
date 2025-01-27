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
public class Section {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private int sectionOrder; // of yoy name tis order you will get
    // exception and you should rename that

    // the owner of the relation
    @ManyToOne //(fetch = FetchType.LAZY)
    @JoinColumn(name = "cource_id")
    private Course course;

    // the inverse
    @OneToMany(mappedBy = "section")
    private List<Lecture> lecture;
}
