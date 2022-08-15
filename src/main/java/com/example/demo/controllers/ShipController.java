package com.example.demo.controllers;

import com.example.demo.models.Ship;
import com.example.demo.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ShipController {

    @Autowired
    ShipRepository shipRepository;

    @GetMapping(name = "/ships")
    public List<Ship> getAllShips() {
        return shipRepository.findAll();
    }

    @GetMapping(name = "/ships/{id}")
    public Optional<Ship> getShip(@PathVariable Long id) {
        return shipRepository.findById(id);
    }
}
