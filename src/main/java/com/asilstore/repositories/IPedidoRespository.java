package com.asilstore.repositories;

import com.asilstore.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedidoRespository extends JpaRepository<Pedido,Long> {
}
