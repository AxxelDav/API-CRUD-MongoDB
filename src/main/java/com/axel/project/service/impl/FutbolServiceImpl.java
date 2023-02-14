package com.axel.project.service.impl;

import com.axel.project.entity.Futbolista;
import com.axel.project.repository.FutbolistaRepository;
import com.axel.project.service.FutbolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolServiceImpl implements FutbolService {

    @Autowired
    private FutbolistaRepository futbolistaRepository;

    @Override
    public List<Futbolista> getAll() {
        return futbolistaRepository.findAll();
    }

    @Override
    public Futbolista getById(Long id) {
        return futbolistaRepository.findById(id).orElse(null);
    }

    @Override
    public Futbolista updateById(Long id, Futbolista futbolista) {
        Futbolista futbolistaDB = getById(id);
        if (futbolistaDB == null)
            return null;
        futbolistaDB.setNombre(futbolista.getNombre());
        futbolistaDB.setApellido(futbolista.getApellido());
        futbolistaDB.setTelefono(futbolista.getTelefono());
        futbolistaDB.setEquipo(futbolista.getEquipo());
        return futbolistaRepository.save(futbolistaDB);
    }

    @Override
    public Futbolista createOne(Futbolista futbolista) {
        return futbolistaRepository.save(futbolista);
    }

    @Override
    public Boolean deleteById(Long id) {
        Futbolista futbolista = getById(id);
        if (futbolista == null)
            return false;
        return true;

    }
}
