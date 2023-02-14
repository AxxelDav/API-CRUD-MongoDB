package com.axel.project.service;

import com.axel.project.entity.Futbolista;

import java.util.List;

public interface FutbolService {

    public List<Futbolista> getAll();
    public Futbolista getById(Long id);
    public Futbolista updateById(Long id, Futbolista futbolista);
    public Futbolista createOne(Futbolista futbolista);
    public Boolean deleteById(Long id);

}
