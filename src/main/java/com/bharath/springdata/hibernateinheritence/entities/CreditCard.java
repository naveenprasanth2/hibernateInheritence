package com.bharath.springdata.hibernateinheritence.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
//@DiscriminatorValue("cc")
@Table(name = "card")
public class CreditCard extends Payment{
    private String cardnumber;
}
