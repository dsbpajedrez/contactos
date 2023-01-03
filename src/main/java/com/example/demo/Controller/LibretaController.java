package com.example.demo.Controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class LibretaController {
    @Autowired
    private LibretaService libretaService;
    private Response response = new Response();
    private HttpStatus httpStatus = HttpStatus.OK;
    @GetMapping(path = "/")
    public ResponseEntity<Response> homeIndex1(HttpServletResponse httpResponse) { }
    @GetMapping(path = "/api/")
    public ResponseEntity<Response> homeIndex2(HttpServletResponse httpResponse) { }
    @GetMapping(path = "/api/v1/")
    public ResponseEntity<Response> homeIndex3(HttpServletResponse httpResponse) { }
    @GetMapping(path = "/api/v1/index")
    public ResponseEntity<Response> index() { }
    @GetMapping(path = "/api/v1/index/orderby/{orderBy}/{order}")
    public ResponseEntity<Response> indexOrderBy(
            @PathVariable(value="orderBy") String orderBy,
            @PathVariable(value="order") Sort.Direction order
    ) { }
    @GetMapping(path = "/api/v1/search/contact/{dataToSearch}")
    public ResponseEntity<Response> searchContactByNombreOrApellido(
            @PathVariable(value="dataToSearch") String dataToSearch
    ) { }
    @PostMapping(path = "/api/v1/contact")
    public ResponseEntity<Response> createContacto(@RequestBody Contacto contacto) { }
    @PostMapping(path = "/api/v1/phone")
    public ResponseEntity<Response> createTelefono(@RequestBody Telefono telefono) { }

    @PutMapping(path = "/api/v1/contact/{id}")
    public ResponseEntity<Response> updateContacto(
            @RequestBody Contacto contacto,
            @PathVariable(value="id") Integer id
    ) { }
    @PutMapping(path = "/api/v1/phone/{id}")
    public ResponseEntity<Response> updateTelefono(
            @RequestBody Telefono telefono,
            @PathVariable(value="id") Integer id
    ) { }
    @PatchMapping(path = "/api/v1/contact/{id}/name")
    public ResponseEntity<Response> updateNombreFromContacto(
            @RequestBody Contacto contacto,
            @PathVariable(value="id") Integer id
    ) { }
    @PatchMapping(path = "/api/v1/contact/{id}/lastname")
    public ResponseEntity<Response> updateApellidoFromContacto(
            @RequestBody Contacto contacto,
            @PathVariable(value="id") Integer id
    ) { }
    @PatchMapping(path = "/api/v1/phone/{id}/number")
    public ResponseEntity<Response> updateOnlyTelefono(
            @RequestBody Telefono telefono,
            @PathVariable(value="id") Integer id
    ) { }
    @DeleteMapping(path = "/api/v1/contact/{id}")
    public ResponseEntity<Response> deleteContacto(@PathVariable(value="id") Integer id) { }
    @DeleteMapping(path = "/api/v1/phone/{id}")
    public ResponseEntity<Response> deleteTelefono(@PathVariable(value="id") Integer id) { }
    private ResponseEntity<Response> getResponseHome(HttpServletResponse httpResponse) { }
    private void getErrorMessageInternal(Exception exception) { }
    private void getErrorMessageForResponse(DataAccessException exception) { }

}
