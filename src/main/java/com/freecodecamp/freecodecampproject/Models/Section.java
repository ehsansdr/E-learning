package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
public class Section extends BaseEntity {


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
