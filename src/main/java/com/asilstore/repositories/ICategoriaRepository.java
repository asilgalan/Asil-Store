package com.asilstore.repositories;

import com.asilstore.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ICategoriaRepository extends JpaRepository<Categoria,Long> {
}
