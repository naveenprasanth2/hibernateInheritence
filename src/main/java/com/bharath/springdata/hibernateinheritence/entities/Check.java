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
@DiscriminatorValue("ch")
public class Check extends Payment {
    private String checknumber;
}
