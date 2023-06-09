package com.insper.PI.cargo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Cargo {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // jakarta automates int ids
    private Integer id;
    @Column
    private String nome;
    private Double salario;
}
