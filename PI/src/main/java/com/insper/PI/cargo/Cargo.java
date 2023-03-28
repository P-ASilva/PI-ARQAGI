package com.insper.PI.cargo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // jakarta automates int ids
    private Integer id;
    private String nome;
    private Double salario;
}
