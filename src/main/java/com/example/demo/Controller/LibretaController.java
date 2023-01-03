package com.example.demo.Controller;

import com.example.demo.domain.Contacto;
import com.example.demo.domain.Telefono;
import com.example.demo.service.LibretaService;

import com.example.demo.utility.Response;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class LibretaController {
    @Autowired
    private LibretaService libretaService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;
    @GetMapping(path = "/")
    public ResponseEntity<Response> homeIndex1(HttpServletResponse httpResponse) {
        return null;
    }
    @GetMapping(path = "/api/")
    public ResponseEntity<Response> homeIndex2(HttpServletResponse httpResponse) {
        return null;

    }
    @GetMapping(path = "/api/v1/")
    public ResponseEntity<Response> homeIndex3(HttpServletResponse httpResponse) {
        return null;
    }
    @GetMapping(path = "/api/v1/index")
    public ResponseEntity<Response> index() {
        return (ResponseEntity<Response>) libretaService.getAll();
    }
    @GetMapping(path = "/api/v1/index/orderby/{orderBy}/{order}")
    public ResponseEntity<Response> indexOrderBy(
            @PathVariable(value="orderBy") String orderBy,
            @PathVariable(value="order") Sort.Direction order
    ) {
        return (ResponseEntity<Response>) libretaService.getListOrdered(orderBy, order);

    }
    //@GetMapping(path = "/api/v1/search/contact/{dataToSearch}")
    //public ResponseEntity<Response> searchContactByNombreOrApellido(
//            @PathVariable(value="dataToSearch") String dataToSearch
    //) {
//        return null;
//
    //}
    @PostMapping(path = "/api/v1/contact")
    public ResponseEntity<Response> createContacto(@RequestBody Contacto contacto) {
      libretaService.createContacto(contacto)  ;
      return new  ResponseEntity<>(HttpStatus.CREATED);
        //return (ResponseEntity<Response>) libretaService.createContacto(contacto);
    }
    @PostMapping(path = "/api/v1/phone")
    public ResponseEntity<Response> createTelefono(@RequestBody Telefono telefono) {
        libretaService.createTelefono(telefono);
        return new  ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping(path = "/api/v1/contact/{id}")
    public ResponseEntity<Response> updateContacto(
            @RequestBody Contacto contacto,
            @PathVariable(value="id") Integer id
    ) {
        libretaService.updateContacto(id, contacto);
        return new  ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping(path = "/api/v1/phone/{id}")
    public ResponseEntity<Response> updateTelefono(
            @RequestBody Telefono telefono,
            @PathVariable(value="id") Integer id
    ) {
        libretaService.updateTelefono(id, telefono);
        return new  ResponseEntity<>(HttpStatus.OK);
    }
    @PatchMapping(path = "/api/v1/contact/{id}/name")
    public ResponseEntity<Response> updateNombreFromContacto(
            @RequestBody Contacto contacto,
            @PathVariable(value="id") Integer id
    ) {
        libretaService.updateNombre(id, contacto);
        return new  ResponseEntity<>(HttpStatus.OK);
    }
    @PatchMapping(path = "/api/v1/contact/{id}/lastname")
    public ResponseEntity<Response> updateApellidoFromContacto(
            @RequestBody Contacto contacto,
            @PathVariable(value="id") Integer id
    ) {
         libretaService.updateApellidos(id, contacto);
         return new  ResponseEntity<>(HttpStatus.OK);
    }
    @PatchMapping(path = "/api/v1/phone/{id}/number")
    public ResponseEntity<Response> updateOnlyTelefono(
            @RequestBody Telefono telefono,
            @PathVariable(value="id") Integer id
    ) {
        libretaService.updateOnlyTelefono(id, telefono);
        return new  ResponseEntity<>(HttpStatus.OK); 
    }
    @DeleteMapping(path = "/api/v1/contact/{id}")
    public ResponseEntity<Response> deleteContacto(@PathVariable(value="id") Integer id) {
        libretaService.deleteContacto(id);
         return new  ResponseEntity<>(HttpStatus.OK); 
    }
    @DeleteMapping(path = "/api/v1/phone/{id}")
    public ResponseEntity<Response> deleteTelefono(@PathVariable(value="id") Integer id) {
        libretaService.deleteTelefono(id);
        return new  ResponseEntity<>(HttpStatus.OK);
    }
    private ResponseEntity<Response> getResponseHome(HttpServletResponse httpResponse) {
        return null;

    }
    private void getErrorMessageInternal(Exception exception) { }
    private void getErrorMessageForResponse(DataAccessException exception) { }

}
