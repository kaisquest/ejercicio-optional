package com.permuta.repo;

import com.permuta.model.entity.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioRepoInMemory implements IUsuarioRepo {
    private static final List<Usuario> USUARIOS = new ArrayList<>();
    private static long IDCOUNTER = 1;

    @Override
    public Optional<Usuario> findById(Long id) {
        return USUARIOS.stream()
            .filter(u -> u.id() == id)
            .findFirst();
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return USUARIOS.stream()
            .filter(u -> u.email().equals(email))
            .findFirst();
    }

    @Override
    public Usuario save(String email, String password, Optional<Long> id) {

      /*  if (id.isEmpty()) {
            var usuario = new Usuario(++IDCOUNTER, email, password);
            USUARIOS.add(usuario);
            return usuario;

        } else {
            var idUsuario = USUARIOS.stream().filter(u -> u.id() == id.orElse(-1L)).findFirst();
            var usuariActualizado = new Usuario(idUsuario.get().id(), email, password);
            USUARIOS.removeIf(u -> u.id() == id.orElse(-1L));
            USUARIOS.add(usuariActualizado);
            return usuariActualizado;
        }
        */

     /* id.ifPresentOrElse(identificador -> update(identificador, email, password),
            () -> create(email, password));*/

      return id.map(identificaodr -> update(identificaodr,email,password))
            .orElse(create(email,password));
    }



    private Usuario create(String email, String password) {
        var usuario = new Usuario(++IDCOUNTER, email, password);
        USUARIOS.add(usuario);
        return usuario;

    }

    private Usuario update(long id, String email, String password) {
        var idUsuario = USUARIOS.stream().filter(u -> u.id() == id).findFirst();
        var usuariActualizado = new Usuario(idUsuario.get().id(), email, password);
        USUARIOS.removeIf(u -> u.id() == id);
        USUARIOS.add(usuariActualizado);

        return findById(id).get();


    }

    @Override
    public void deleteById(Long id) {
        USUARIOS.removeIf(u -> u.id() == id);

    }

    @Override
    public List<Usuario> findAll() {
        return new ArrayList<>(USUARIOS);
        //return USERS.stream().toList();
    }
}
