package com.insper.PI.usuario;

import com.insper.PI.cargo.Cargo;
import com.insper.PI.cargo.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository  usuarioRepository;

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> listarUsuarios(Cargo cargo) {
        return usuarioRepository.findByCargo(cargo);
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
    public Usuario buscaUsuario(Integer id) {
        return usuarioRepository.findById(id).get();
    }
}
