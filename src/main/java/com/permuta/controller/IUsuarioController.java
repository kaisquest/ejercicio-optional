package com.permuta.controller;

import java.util.List;
import java.util.Optional;

import com.permuta.model.dto.UsuarioDTO;

public interface IUsuarioController {

    Optional<UsuarioDTO> crearUsuario(UsuarioDTO usuarioDTO);
    Optional<UsuarioDTO> obtenerUsuarioPorId(Long id);
    List<UsuarioDTO> obtenerTodosLosUsuarios();
    Optional<UsuarioDTO> actualizarUsuario(Long id, UsuarioDTO usuarioDTO);
    void eliminarUsuario(Long id);

}
