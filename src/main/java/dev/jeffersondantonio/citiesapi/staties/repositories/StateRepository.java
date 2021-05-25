package dev.jeffersondantonio.citiesapi.staties.repositories;

import dev.jeffersondantonio.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
