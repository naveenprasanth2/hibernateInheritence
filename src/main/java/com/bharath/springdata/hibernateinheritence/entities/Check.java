package com.bharath.springdata.hibernateinheritence.entities;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
//@DiscriminatorValue("ch")
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "bankcheck")
public class Check extends Payment {
    private String checknumber;
}
