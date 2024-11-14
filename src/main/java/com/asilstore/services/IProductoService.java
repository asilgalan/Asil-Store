package com.asilstore.services;

import com.asilstore.models.Categoria;
import com.asilstore.models.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    Producto save(Producto producto);
    void delete(Long id);
}
