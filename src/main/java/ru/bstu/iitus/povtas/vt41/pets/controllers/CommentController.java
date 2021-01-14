package ru.bstu.iitus.povtas.vt41.pets.controllers;

import org.springframework.web.bind.annotation.*;
import ru.bstu.iitus.povtas.vt41.pets.models.Comment;
import ru.bstu.iitus.povtas.vt41.pets.repositories.CommentRepository;

import java.util.List;
import java.util.Optional;

@RestController
public class CommentController {
    private final CommentRepository repository;

    CommentController(CommentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/comments")
    List<Comment> all() {
        return repository.findAll();
    }

    @GetMapping("/comments/{id}")
    Optional<Comment> one(@PathVariable Long id) {
        return repository.findById(id);
    }

    @PostMapping("/comments")
    Comment newComment(@RequestBody Comment comment) {
        return repository.save(comment);
    }
}
