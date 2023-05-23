package com.example.carros.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarrosRepository extends CrudRepository<Carro, Long> {
    List<Carro> findByTipo(String tipo);
}
