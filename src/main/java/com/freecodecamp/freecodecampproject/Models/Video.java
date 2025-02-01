package com.freecodecamp.freecodecampproject.Models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@DiscriminatorValue("V")
public class Video extends Resource {
    // in the free code camp the table did not crated fot Vedeo ond text and file but for use it create for file and text and i do not know why
    private int length;


}
