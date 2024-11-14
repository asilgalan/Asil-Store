package com.asilstore.repositories;

import com.asilstore.models.Descuento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDescuentoRepository extends JpaRepository<Descuento,Long> {
}
