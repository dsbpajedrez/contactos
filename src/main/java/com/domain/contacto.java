package com.sofka.taller9.domain;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "conctacto")
public class Contacto {
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
    private Date fechaCreacion;

    // Fecha de actualizacion
    @Column(name = "cnt_updated_at")
    private Date fechaActualizacion;
}
