package com.freecodecamp.freecodecampproject.Models.embedded;


import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_order")
public class Order {

    //  when you use EmbeddedId ,the field @EmbeddedId should implements Serializable
    @EmbeddedId
    private OrderId id;

    @Embedded
    private Address shippingAddress;

    private String orderInfo;
    private String anotherInfo;

}
