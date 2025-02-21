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
// @DiscriminatorValue("F") // only with @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class File extends Resource {

    private String type;
}
