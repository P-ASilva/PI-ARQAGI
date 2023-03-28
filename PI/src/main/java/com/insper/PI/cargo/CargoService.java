package com.insper.PI.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {
    @Autowired
    private CargoRepository cargoRepository;

    public List<Cargo> listarCargos() {
        return cargoRepository.findAll();
    }

    public Cargo salvarCargo(Cargo cargo) {
        return cargoRepository.save(cargo);
    }
    public Cargo buscaCargo(Integer id) {
        return cargoRepository.findById(id).get();
    }
}
