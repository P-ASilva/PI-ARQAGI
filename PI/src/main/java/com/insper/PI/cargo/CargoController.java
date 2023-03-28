package com.insper.PI.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cargo")
public class CargoController {
    @Autowired
    private CargoService cargoService;

    @GetMapping
    public List<Cargo> listaCargos() {
        return cargoService.listarCargos();
    }
    @GetMapping("/{id}")
    public Cargo getCargo(@PathVariable Integer id) {
        return cargoService.buscaCargo(id);
    }
    @PostMapping
    public Cargo salvarMensagem(@RequestBody @Valid Cargo cargo) {
        return cargoService.salvarCargo(cargo);
    }
}
