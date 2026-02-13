package com.smarthome.controlador;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

public class UsuarioControlador {
    public static void handler(HttpServer servidor) {
        servidor.createContext("/api/v1/usuarios", exchange -> {

        });
    }
}
