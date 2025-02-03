package com.freecodecamp.freecodecampproject.Models;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
// @PrimaryKeyJoinColumn(name = "video_id") // with this annotation the id column of the vedoe will raname to the name = ""
// Foreign key to Resource
// this will work with Joined strategy
@Polymorphism(type = PolymorphismType.EXPLICIT) // it will quey the sub class when i ask for it
// the default is implicit
// @DiscriminatorValue("V") // only with @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Video extends Resource {
    // @Inheritance(strategy = InheritanceType.SINGLE_TABLE) with the in the free code camp the table did not crated fot Vedeo ond text and file but for use it create for file and text and i do not know why
    private int length;
}
