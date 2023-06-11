package com.example.loayza.security.repository;

import com.example.loayza.security.model.Contacto;
import com.example.loayza.security.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository  extends CrudRepository<Usuario,Integer> {

    Optional<Usuario>findOneByEmail(String email);
}
