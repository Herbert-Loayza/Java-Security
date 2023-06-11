package com.example.loayza.security.controller;

import com.example.loayza.security.model.Contacto;
import com.example.loayza.security.repository.ContactoRepository;
import com.example.loayza.security.service.ContactoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contactos")
@AllArgsConstructor
public class ContactoController {

    private final ContactoService contactoService;

    @GetMapping("/listar")
    public List<Contacto>listaContacto(){
        return contactoService.listar();
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crear(@RequestBody Contacto contacto){
        return ResponseEntity.status(HttpStatus.CREATED).body(contactoService.guardar(contacto));
    }
}
