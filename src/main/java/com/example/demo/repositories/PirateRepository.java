package com.example.demo.repositories;

import com.example.demo.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PirateRepository extends JpaRepository<Pirate, Long> {
}
