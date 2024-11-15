package com.asilstore.services;

import com.asilstore.models.Direccion;
import com.asilstore.repositories.IDireccionRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DireccionServiceImpl implements IDireccionService {
    @Autowired
    private IDireccionRespository direccionRespository;
    @Override
    public List<Direccion> findAll() {
        return direccionRespository.findAll();
    }

    @Override
    public Optional<Direccion> findById(Long id) {
        return direccionRespository.findById(id);
    }

    @Override
    public Direccion save(Direccion direccion) {
        return direccionRespository.save(direccion);
    }

    @Override
    public void delete(Long id) {
            direccionRespository.deleteById(id);
    }
}
