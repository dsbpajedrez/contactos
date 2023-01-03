package com.example.demo.Repository;


import com.example.demo.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}