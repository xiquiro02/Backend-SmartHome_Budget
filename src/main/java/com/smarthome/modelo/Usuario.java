package com.smarthome.modelo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario 
{
    private int id;
    private String nombre;
    private int idRol;
    private String primerApellido; 
    private String segundoApellido;
    private String correo;
    private int telefonos;
    private String contrasena;
    private LocalDate fecha;

    public Usuario(int id, String nombre, int idRol, String primerApellido, String segundoApellido, String correo, int telefonos, String contrasena, LocalDate fecha) {
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

    // Get 
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getIdRol() {
        return idRol;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    // Set

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
