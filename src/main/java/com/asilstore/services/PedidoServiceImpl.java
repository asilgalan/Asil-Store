package com.asilstore.services;

import com.asilstore.models.Pedido;
import com.asilstore.repositories.IPedidoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoServiceImpl implements IPedidoService{
    @Autowired
    private IPedidoRespository pedidoRespository;
    @Override
    public List<Pedido> findAll() {
        return pedidoRespository.findAll();
    }

    @Override
    public Optional<Pedido> findById(Long id) {
        return pedidoRespository.findById(id);
    }

    @Override
    public Pedido save(Pedido pedido) {
        return pedidoRespository.save(pedido);
    }

    @Override
    public void delete(Long id) {
          pedidoRespository.deleteById(id);
    }
}
