package com.example.demo.service.interfaces;

import com.example.demo.domain.Contacto;
import com.example.demo.domain.Telefono;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ILibreta {
    public List<Contacto> getAll();
    public List<Contacto> getListOrdered(String field, Sort.Direction order);
    public List<Contacto> searchContacto(String dataToSearch);
    public Contacto createContacto(Contacto contacto);
    public Telefono createTelefono(Telefono telefono);
    public Contacto updateContacto(Integer id, Contacto contacto);
    public Contacto updateNombre(Integer id, Contacto contacto);
    public Contacto updateApellidos(Integer id, Contacto contacto);
    public Telefono updateTelefono(Integer id, Telefono telefono);
    public Telefono updateOnlyTelefono(Integer id, Telefono telefono);
    public Contacto deleteContacto(Integer id);
    public Telefono deleteTelefono(Integer id);
}
