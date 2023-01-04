package com.example.demo.Repository;


import com.example.demo.domain.Telefono;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TelefonoRepository  extends JpaRepository<Telefono, Integer> {
    @Modifying
    @Query(value = "update Telefono tel set tel.telefono = :telefono, tel.updatedAt = CURRENT_TIMESTAMP where tel.id = :id",nativeQuery = true)
    public void updateTelefono(@Param(value= "id") Integer id, @Param(value = "telefono") String telefono);
}
