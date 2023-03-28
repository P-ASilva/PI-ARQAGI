package com.insper.PI.usuario;

import com.insper.PI.cargo.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    List<Usuario> findByCargo(Cargo cargo);
}
