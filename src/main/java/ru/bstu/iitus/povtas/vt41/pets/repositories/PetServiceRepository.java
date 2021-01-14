package ru.bstu.iitus.povtas.vt41.pets.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.bstu.iitus.povtas.vt41.pets.models.PetService;

@Repository
public interface PetServiceRepository extends JpaRepository<PetService, Long> {

}
