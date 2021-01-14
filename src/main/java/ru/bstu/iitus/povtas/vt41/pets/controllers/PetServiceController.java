package ru.bstu.iitus.povtas.vt41.pets.controllers;

import org.springframework.web.bind.annotation.*;
import ru.bstu.iitus.povtas.vt41.pets.models.PetService;
import ru.bstu.iitus.povtas.vt41.pets.repositories.PetServiceRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class PetServiceController {
    private final PetServiceRepository repository;

    PetServiceController(PetServiceRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/services")
    List<PetService> all() {
        return repository.findAll();
    }

    @GetMapping("/services/{id}")
    Optional<PetService> one(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/services")
    PetService newPetService(@RequestBody PetService service) {
        return repository.save(service);
    }
}