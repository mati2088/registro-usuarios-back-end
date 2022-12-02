package com.register.users.registroAndlogin.entidades;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    //genero constructor

    public Role(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Role() {
    }

    public Role(String nombre) {
        this.nombre = nombre;
    }
    //genero getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
