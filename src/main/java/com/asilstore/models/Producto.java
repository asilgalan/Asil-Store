package com.asilstore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "productos")
public abstract class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Nombre;
    private Double precio;
    private String Descripcion;
    private Long cantidad;
    private int talla;
    private String color;
    private Long stock;
    private String marca;


    @ManyToOne
    private Categoria categoria;

    public void actualizarStock(long totalpedidos){
        this.stock-=cantidad;
    }
}
