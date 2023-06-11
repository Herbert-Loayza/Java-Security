package com.example.loayza.security.model;



import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Contacto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contacto")
    private Integer id;

    private String nombre;

    @Column(name = "fechaNac")
    private LocalDate fechaNacimiento;

    private String email;
    private String telefono;

}
