package com.axel.project.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Futbolista {

    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private Long telefono;
    private String equipo;
}
