package ru.bstu.iitus.povtas.vt41.pets.controllers;

import org.springframework.web.bind.annotation.*;
import ru.bstu.iitus.povtas.vt41.pets.models.Tag;
import ru.bstu.iitus.povtas.vt41.pets.repositories.TagRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class TagController {
    private final TagRepository repository;

    TagController(TagRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/tags")
    List<Tag> all() {
        return repository.findAll();
    }

    @GetMapping("/tags/{id}")
    Optional<Tag> one(@PathVariable Long id) {
        return repository.findById(id);
    }
    @PostMapping("/tags")
    Tag newTag(@RequestBody Tag tag) {
        return repository.save(tag);
    }

}
