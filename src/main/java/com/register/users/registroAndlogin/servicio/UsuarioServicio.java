package com.register.users.registroAndlogin.servicio;

import com.register.users.registroAndlogin.dto.UsuarioRegistroDto;
import com.register.users.registroAndlogin.entidades.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsuarioServicio extends UserDetailsService {
    public Usuario guardar(UsuarioRegistroDto usuarioRegistroDto);

    public List<Usuario> listarUsuarios();


}
