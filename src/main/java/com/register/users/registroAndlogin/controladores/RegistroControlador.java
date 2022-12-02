package com.register.users.registroAndlogin.controladores;

import com.register.users.registroAndlogin.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class RegistroControlador {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/login")
    public String iniciarSesion(){
        return "login";
    }
    @GetMapping("/")
    public String verPaginaDeInicio(Model modelo){
        modelo.addAttribute("usuarios",usuarioServicio.listarUsuarios());
        return "index";
    }
}
