package com.example.controller;

import com.example.model.Paciente;
import com.example.repositories.PacienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PacienteController {

    @Autowired
    PacienteRepository repository;

    @PostMapping("/paciente")
    public String add(@RequestBody Paciente paciente) {
        repository.save(paciente);
        return "Deu certo, toma seus pacientes.";
    }

    @GetMapping("/paciente")
    public String get() {
        return "batata";
    }

    @DeleteMapping("/paciente/{id}")
    public String remove(@PathVariable String id) {
        repository.delete(id);
        return "Removido com sucesso";
    }
}
