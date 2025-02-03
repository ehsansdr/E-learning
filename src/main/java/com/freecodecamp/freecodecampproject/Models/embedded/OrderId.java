package com.freecodecamp.freecodecampproject.Models.embedded;


import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable // this is embedded entity
public class OrderId implements Serializable { //

    private String ordername;
    public LocalDateTime orderdate;


}
