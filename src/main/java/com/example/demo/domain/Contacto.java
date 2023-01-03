package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Entity
@Data
@Table(name = "conctacto")
public class Contacto implements Serializable {

    private static final long serialVersionUID = 1l;

    // Id de la entidad
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ctn_id", nullable = false)
    private Integer id;
    // Nombre
    @Column(name = "cnt_nombre", nullable = false)
    private String nombre;

    // Apellido
    @Column(name = "cnt_apellido", nullable = false)
    private Integer apellido;

    // Fecha de creacion
    @Column(name = "cnt_created_at")
    private Instant createdAt;

    // Fecha de actualizacion
    @Column(name = "cnt_updated_at")
    private Instant updatedAt;

    // Fecha de eliminacion
    @Column(name = "cnt_deleted_at")
    private Instant deleteAt;
}