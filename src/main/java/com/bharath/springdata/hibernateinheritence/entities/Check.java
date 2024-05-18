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
public class Check extends Payment {
    private String checkNumber;
}
