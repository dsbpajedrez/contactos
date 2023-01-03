package com.example.demo.domain;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "telefono")
public class Telefono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tel_id", nullable = false)
    private Integer id;

    @Column(name = "tel_contacto_id", nullable = false)
    private Integer contacto;

    @Column(name = "tel_telefono", nullable = false)
    private String telefono;

    @Column(name = "tel_created_at")
    private Date fechaCreacion;

    @Column(name = "tel_updated_at")
    private Date fechaActualizacion;
}
