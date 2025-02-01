package com.freecodecamp.freecodecampproject.Models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder  If @Builder is being applied to the BaseEntity class, it will generate a standard builder for BaseEntity. However, the @SuperBuilder annotation in Author is what should be used to ensure that both BaseEntity and Author fields are handled properly.
@SuperBuilder  // Added this to generate the builder for BaseEntity

@MappedSuperclass
public class BaseEntity {

    // if you use this you do not need to have id in the sub class
    @Id
    @GeneratedValue
    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime lastModifiedAt;
    private String createdBy;
    private String lastModifiedBy;
}
