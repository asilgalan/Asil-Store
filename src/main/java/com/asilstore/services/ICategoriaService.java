package com.asilstore.services;

import com.asilstore.models.Categoria;


import java.util.List;
import java.util.Optional;

public interface ICategoriaService {
    List<Categoria> findAll();
    Optional<Categoria> findById(Long id);
    Categoria save(Categoria categoria);
    void delete(Long id);
}
