package com.smarthome.modelo;

import java.time.LocalDate;

// En esta clase definimos qué datos vamos a guardar de cada usuario en el sistema.
public class Usuario {
    // Lista de datos que necesitamos para identificar y registrar a cada usuario.
    // Variables para guardar la información personal del usuario.
    private int id;
    private String nombre;
    private int idRol;
    private String primerApellido;
    private String segundoApellido;
    private String correo;
    private int telefonos;
    private String contrasena;
    private LocalDate fecha; // Guarda la fecha actual en la que se registra el usuario

    // Este es el "Constructor" se usa para crear un usuario nuevo con todos sus
    // datos y asignarle sus datos por primera vez.
    public Usuario(int id, String nombre, int idRol, String primerApellido, String segundoApellido, String correo,
            int telefonos, String contrasena, LocalDate fecha) {
        this.id = id;
        this.nombre = nombre;
        this.idRol = idRol;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefonos = telefonos;
        this.contrasena = contrasena;
        this.fecha = fecha.now();
    }

    // --- GETTERS Estos métodos sirven para LEER, consultar o ver los datos del
    // usuario ---
    public int getId() {
        return id; // Retorna el identificador del usuario
    }

    public String getNombre() {
        return nombre; // Retorna el nombre del usuario
    }

    public int getIdRol() {
        return idRol; // Retorna el identificador del rol del usuario
    }

    public String getPrimerApellido() {
        return primerApellido; // Retorna el primer apellido del usuario
    }

    public String getSegundoApellido() {
        return segundoApellido; // Retorna el segundo apellido del usuario
    }

    public String getCorreo() {
        return correo; // Retorna el correo del usuario
    }

    public int getTelefonos() {
        return telefonos; // Retorna el teléfono del usuario
    }

    public String getContrasena() {
        return contrasena; // Retorna la contraseña del usuario
    }

    public LocalDate getFecha() {
        return fecha; // Retorna la fecha de registro del usuario
    }

    // --- SETTERS Estos métodos sirven para MODIFICAR, cambiar o actualizar los
    // datos del usuario ---

    public void setId(int id) {
        this.id = id; // Modifica el identificador del usuario
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Modifica el nombre del usuario
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol; // Modifica el identificador del rol del usuario
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido; // Modifica el primer apellido del usuario
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido; // Modifica el segundo apellido del usuario
    }

    public void setCorreo(String correo) {
        this.correo = correo; // Modifica el correo del usuario
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos; // Modifica el teléfono del usuario
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena; // Modifica la contraseña del usuario
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha; // Modifica la fecha de registro del usuario
    }
}
