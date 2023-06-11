package com.example.loayza.security.service;

import com.example.loayza.security.model.Contacto;

import java.util.List;

public interface ContactoService {

    List<Contacto>listar();
    Contacto guardar(Contacto contacto);
}
