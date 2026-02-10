package com.smarthome.server;

import com.smarthome.controlador.UsuarioControlador;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

public class Servidor {
    private static final int PUERTO = 8080;
    private static HttpServer servidor;

    public static void serverMain() throws IOException 
    {
        servidor = HttpServer.create(new InetSocketAddress(PUERTO), 0);
        
        UsuarioControlador.handler(servidor);

        servidor.start();
    }
}
