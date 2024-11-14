package com.asilstore.services;

import com.asilstore.models.Categoria;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements ICategoriaService{
    @Override
    public List<Categoria> findAll() {
        return null;
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
