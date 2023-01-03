package com.example.demo.Repository;


import com.example.demo.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
        @Query(value = "SELECT cnt " +
                "FROM Contacto cnt " +
                "WHERE (cnt.nombre LIKE :data% OR cnt.apellido LIKE :data%) " +
                "ORDER BY cnt.nombre ASC")
        public List<Contacto> findByNombreOrApellidoStartingWith(@Param("data") String data);
    //public List<Contacto> findByNombreOrApellidoContains()
}