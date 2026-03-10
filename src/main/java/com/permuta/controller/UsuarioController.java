package com.permuta.controller;

import com.permuta.model.dto.UsuarioDTO;
import com.permuta.model.entity.Usuario;
import com.permuta.repo.IUsuarioRepo;

import java.util.List;
import java.util.Optional;

public class UsuarioController implements IUsuarioController {
    private IUsuarioRepo usuarioRepo;

    public UsuarioController(IUsuarioRepo usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }


    @Override
    public Optional<UsuarioDTO> crearUsuario(UsuarioDTO usuarioDTO) {
        return Optional.empty();
    }

    @Override
    public Optional<UsuarioDTO> obtenerUsuarioPorId(Long id) {
        var usuarioEntidad = usuarioRepo.findById(id);



        return Optional.empty();
    }

    @Override
    public List<UsuarioDTO> obtenerTodosLosUsuarios() {
        return List.of();
    }

    @Override
    public Optional<UsuarioDTO> actualizarUsuario(Long id, UsuarioDTO usuarioDTO) {
        return Optional.empty();
    }

    @Override
    public void eliminarUsuario(Long id) {

    }
}

