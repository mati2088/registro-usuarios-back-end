package com.register.users.registroAndlogin.repository;

import com.register.users.registroAndlogin.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepositorio extends JpaRepository<Usuario,Long> {
    public Usuario findByEmail(String email);
}
