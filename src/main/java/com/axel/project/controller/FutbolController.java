package com.axel.project.controller;

import com.axel.project.entity.Futbolista;
import com.axel.project.service.FutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/futbol/v1")
public class FutbolController {

    @Autowired
    private FutbolService futbolService;

    @GetMapping(value = "/futbolistas")
    public ResponseEntity<List<Futbolista>> getAll () {
        List<Futbolista> futbolistas = futbolService.getAll();
        return new ResponseEntity<>(futbolistas, HttpStatus.OK);
    }

    @GetMapping(value = "/futbolistas/{id}")
    public ResponseEntity<Futbolista> getById(@PathVariable("id") Long id) {
        Futbolista futbolista = futbolService.getById(id);
        return new ResponseEntity<>(futbolista, HttpStatus.OK);
    }

    @PostMapping(value = "/futbolistas")
    public ResponseEntity<Futbolista> create(@RequestBody Futbolista futbolista) {
        Futbolista newFutbolista = futbolService.createOne(futbolista);
        return new ResponseEntity<>(newFutbolista, HttpStatus.CREATED);
    }

    @PutMapping(value = "/futbolistas/{id}")
    public ResponseEntity<Futbolista> updateById(@PathVariable("id") Long id, @RequestBody Futbolista futbolista) {
        Futbolista futbolistaDB = futbolService.getById(id);
        if (futbolistaDB == null)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        futbolistaDB = futbolService.updateById(id, futbolista);
        return new ResponseEntity<>(futbolistaDB, HttpStatus.OK);
    }

    @DeleteMapping(value = "/futbolistas/{id}")
    public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
        if (!futbolService.deleteById(id))
            return new ResponseEntity<>("Recurso NO encontrado", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>("Recurso eliminado correctamente", HttpStatus.OK);
    }


}
