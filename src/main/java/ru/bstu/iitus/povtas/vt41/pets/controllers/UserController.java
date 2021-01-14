package ru.bstu.iitus.povtas.vt41.pets.controllers;

import org.springframework.web.bind.annotation.*;
import ru.bstu.iitus.povtas.vt41.pets.models.User;
import ru.bstu.iitus.povtas.vt41.pets.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class UserController {
    private final UserRepository repository;

    UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/users")
    List<User> all() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    Optional<User> one(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/users")
    User newUser(@RequestBody User user) {
        return repository.save(user);
    }
}
