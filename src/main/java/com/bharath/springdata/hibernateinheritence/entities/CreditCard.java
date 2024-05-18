package com.bharath.springdata.hibernateinheritence.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
@DiscriminatorValue("cc")
public class CreditCard extends Payment{
    private String cardnumber;
}
