package com.asilstore.services;

import com.asilstore.models.Direccion;
import com.asilstore.models.Pedido;

import java.util.List;
import java.util.Optional;

public interface IDireccionService {
    List<Direccion> findAll();
    Optional<Direccion> findById(Long id);
    Direccion save(Direccion direccion);
    void delete(Long id);
}
