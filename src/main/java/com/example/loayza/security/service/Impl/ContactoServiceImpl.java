package com.example.loayza.security.service.Impl;


import com.example.loayza.security.model.Contacto;
import com.example.loayza.security.repository.ContactoRepository;
import com.example.loayza.security.service.ContactoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoServiceImpl implements ContactoService {

    private final ContactoRepository contactoRepository;

    public ContactoServiceImpl(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @Override
    public List<Contacto> listar() {
        return (List<Contacto>) contactoRepository.findAll();
    }

    @Override
    public Contacto guardar(Contacto contacto) {
        return contactoRepository.save(contacto);
    }
}
