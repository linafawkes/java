package ru.bstu.iitus.povtas.vt41.pets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.bstu.iitus.povtas.vt41.pets.models.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {
}
