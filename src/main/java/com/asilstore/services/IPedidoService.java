package com.asilstore.services;

import com.asilstore.models.Categoria;
import com.asilstore.models.Pedido;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {
    List<Pedido> findAll();
    Optional<Pedido> findById(Long id);
    Pedido save(Pedido pedido);
    void delete(Long id);
}
