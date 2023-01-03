package com.example.demo.service;

import com.example.demo.domain.Contacto;
import com.example.demo.domain.Telefono;
import com.example.demo.Repository.ContactoRepository;
import com.example.demo.Repository.TelefonoRepository;
import com.example.demo.service.interfaces.ILibreta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.HashSet;
import java.util.List;

@Service
public class LibretaService implements ILibreta {

    /**
     * Repositorio de Contacto
     */
    @Autowired
    private ContactoRepository contactoRepository;

    /**
     * Repositorio de Telefono
     */
    @Autowired
    private TelefonoRepository telefonoRepository;


    @Override
    @Transactional(readOnly = true)
    public List<Contacto> getList() {
        return (List<Contacto>) contactoRepository.findAll();
    }

    @Override
    public List<Contacto> getList(String field, Sort.Direction order) {
        return null;
    }


    //@Override
    //@Transactional(readOnly = true)
    //public List<Contacto> getList(String field, Sort.Direction order) {
    //    return contactoRepository.findAll(Sort.by(order, field));
    //}


    @Override
    @Transactional(readOnly = true)
    public List<Contacto> searchContacto(String dataToSearch) {
        //var contacto1 = contactoRepository.findByNombreOrApellidoStartingWith(dataToSearch);
        //var contacto2 = contactoRepository.findByNombreOrApellidoContains(dataToSearch);
        //var contacto3 = contactoRepository.findByNombreOrApellidoEndingWith(dataToSearch);
        //var answer = new HashSet<Contacto>();
        //answer.addAll(contacto1);
        //answer.addAll(contacto2);
        //answer.addAll(contacto3);
        //return answer.stream().toList();
        return null;
    }


    @Override
    @Transactional
    public Contacto createContacto(Contacto contacto) {
        contacto.setCreatedAt(Instant.now());
        return contactoRepository.save(contacto);
    }


    @Override
    @Transactional
    public Telefono createTelefono(Telefono telefono) {
        //telefono.setCreatedAt(Instant.now());
        //return telefonoRepository.save(telefono);
        return null;
    }


    @Override
    @Transactional
    public Contacto updateContacto(Integer id, Contacto contacto) {
        contacto.setId(id);
        contacto.setUpdatedAt(Instant.now());
        return contactoRepository.save(contacto);
    }


    @Override
    @Transactional
    public Contacto updateNombre(Integer id, Contacto contacto) {
//        contacto.setId(id);
//        contacto.setUpdatedAt(Instant.now());
//        contactoRepository.updateNombre(id, contacto.getNombre());
//        return contacto;
        return null;
    }


    @Override
    @Transactional
    public Contacto updateApellidos(Integer id, Contacto contacto) {
//        contacto.setId(id);
//        contacto.setUpdatedAt(Instant.now());
//        contactoRepository.updateApellido(id, contacto.getApellido());
//        return contacto;
        return null;
    }


    @Override
    @Transactional
    public Telefono updateTelefono(Integer id, Telefono telefono) {
//        telefono.setId(id);
//        telefono.setUpdatedAt(Instant.now());
//        telefonoRepository.save(telefono);
//        return telefono;
        return null;
    }


    @Override
    @Transactional
    public Telefono updateOnlyTelefono(Integer id, Telefono telefono) {
//        telefono.setId(id);
//        telefono.setUpdatedAt(Instant.now());
//        telefonoRepository.updateTelefono(id, telefono.getTelefono());
//        return telefono;
        return null;
    }


    @Override
    @Transactional
    public Contacto deleteContacto(Integer id) {
        var contacto = contactoRepository.findById(id);
        if (contacto.isPresent()) {
            contactoRepository.delete(contacto.get());
            return contacto.get();
        } else {
            return null;
        }
    }

    @Override
    @Transactional
    public Telefono deleteTelefono(Integer id) {
        var telefono = telefonoRepository.findById(id);
        if (telefono.isPresent()) {
            telefonoRepository.delete(telefono.get());
            return telefono.get();
        } else {
            return null;
        }
    }
}