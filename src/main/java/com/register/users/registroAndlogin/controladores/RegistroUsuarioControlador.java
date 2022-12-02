package com.register.users.registroAndlogin.controladores;

import com.register.users.registroAndlogin.dto.UsuarioRegistroDto;
import com.register.users.registroAndlogin.servicio.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/registro")
public class RegistroUsuarioControlador {
    @Autowired
    private UsuarioServicio usuarioServicio;

    @ModelAttribute("usuario")
    public UsuarioRegistroDto retornarNuevoUsuarioRegistroDto(){
        return  new UsuarioRegistroDto();
    }
    @GetMapping
    public String mostrarFormularioDeRegistro(){
        return "registro";
    }
    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("usuario") UsuarioRegistroDto usuarioRegistroDto){
        usuarioServicio.guardar(usuarioRegistroDto);
        return "redirect:/registro?exito";

    }
}
