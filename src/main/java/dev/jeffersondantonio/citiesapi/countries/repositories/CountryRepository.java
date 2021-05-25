package dev.jeffersondantonio.citiesapi.countries.repositories;

import dev.jeffersondantonio.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
