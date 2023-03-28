package com.insper.PI.usuario;

import com.insper.PI.cargo.Cargo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY) // jakarta automates int ids
    private Integer id;
    @ManyToOne
    private Cargo cargo;
    private String nome;
    private Integer idade;
}
