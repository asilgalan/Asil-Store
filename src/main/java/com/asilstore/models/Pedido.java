package com.asilstore.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private Double total;

    @ManyToOne
    private Cliente cliente;

    @ManyToMany
    private List<Producto> productos;

    // Getters y setters
    // Constructor

    public void calcularTotal() {
        this.total = productos.stream()
                .mapToDouble(e-> e.getPrecio()*e.getCantidad())
                .sum();
    }
}