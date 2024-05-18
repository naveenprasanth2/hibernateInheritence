package com.bharath.springdata.hibernateinheritence.entities;


import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class CreditCard extends Payment{
    private String card;
}
