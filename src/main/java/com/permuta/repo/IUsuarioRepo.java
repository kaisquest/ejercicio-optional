package com.permuta.repo;

import java.util.List;
import java.util.Optional;

import com.permuta.model.entity.Usuario;

public interface IUsuarioRepo {


    /**
     * Busca un usuario por su id. Si no lo encuentra devuelve un Optional vacío.
     * @param id
     * @return
     */
    Optional<Usuario> findById(Long id);
    /**
     * Busca un usuario por su email. Si no lo encuentra devuelve un Optional vacío.
     * @param email
     * @return
     */

    Optional<Usuario> findByEmail(String email);


    /**
     * Guarda un usuario. Si el id esta vacio, lo crea.
     * Si el id no esta vacio, lo actualiza.
     * @param email
     * @param password
     * @param id
     * @return
     */
    Usuario save(String email, String password, Optional<Long> id);

    /**
     * Elimina un usuario por su id.
     */

    void deleteById(Long id);

    /**
     * Busca todos los usuarios.
     * ¿Por que devuelve una lista en lugar de un Optional?
     * @return
     */
    List<Usuario> findAll();

}
