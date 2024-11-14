package com.asilstore.repositories;

import com.asilstore.models.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDireccionRespository extends JpaRepository<Direccion,Long> {
}
