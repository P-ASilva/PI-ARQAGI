package com.insper.PI.usuario;

import com.insper.PI.cargo.Cargo;
import com.insper.PI.cargo.CargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private CargoService cargoService;
    @GetMapping
    public List<Usuario> listaUsuarios() {
        return usuarioService.listarUsuarios();
    }
    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Integer id) {
        return usuarioService.buscaUsuario(id);
    }
    @GetMapping("/cargo/{cargo_id}")
    public List<Usuario> listarUsuariosId(@PathVariable Integer cargo_id) {
        Cargo cargo = cargoService.buscaCargo(cargo_id);
        return usuarioService.listarUsuarios(cargo);
    }
    @PostMapping
    public Usuario salvarUsuario(@RequestBody @Valid Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

}
