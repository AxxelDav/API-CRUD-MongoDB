package com.axel.project.repository;

import com.axel.project.entity.Futbolista;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FutbolistaRepository extends MongoRepository<Futbolista, Long> {
}
