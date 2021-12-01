package com.algaworks.crm.model;

import lombok.*;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Data
@Entity
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;

}





