package com.permuta;

import java.util.Scanner;

import com.permuta.controller.IUsuarioController;

/**
 * Hello world!
 */
public final class App {

    enum Opcion {
        CREAR(1), BUSCAR(2), LISTAR(3), ELIMINAR(4), ACTUALIZAR(5), SALIR(6);

        private final int codigo;

        Opcion(int codigo) {
            this.codigo = codigo;
        }

        public static Opcion fromCodigo(int codigo) {
            for (Opcion o : values()) {
                if (o.codigo == codigo) {
                    return o;
                }
            }
            return null;
        }
    }

    private App() {
    }

    /**
     * rellena el main usando el controller y creando un menu que permita al usuario
     * elegir entre las diferentes opciones
     * del programa.
     * opciones:
     * 1. Crear un nuevo usuario
     * 2. Buscar un usuario por su email
     * 3. Listar todos los usuarios
     * 4. Eliminar un usuario por su email
     * 5. Actualizar un usuario por su id
     * 6. Salir del programa
     */
    public static void main(String[] args) {
        IUsuarioController controller /* = new UsuarioController() */;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                mostrarMenu();
                int opcion = sc.nextInt();
                Opcion op = Opcion.fromCodigo(opcion);

                if (op == null) {
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
                } else {
                    switch (op) {
                        case CREAR:

                            break;
                        case BUSCAR:

                            break;
                        case LISTAR:

                            break;
                        case ELIMINAR:

                            break;
                        case ACTUALIZAR:

                            break;
                        case SALIR:

                            return;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

    }

    public static void mostrarMenu() {
        System.out.println("1. Crear un nuevo usuario");
        System.out.println("2. Buscar un usuario por su email");
        System.out.println("3. Listar todos los usuarios");
        System.out.println("4. Eliminar un usuario por su email");
        System.out.println("5. Actualizar un usuario por su id");
        System.out.println("6. Salir del programa");
    }

}
