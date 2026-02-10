/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.smarthome.controlador;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

/**
 *
 * @author Aprendiz
 */
public class UsuarioControlador {
    public static void handler(HttpServer servidor) {
        servidor.createContext("/api/v1/usuarios", exchange -> {

        });
    }
}
