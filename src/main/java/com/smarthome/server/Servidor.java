package com.smarthome.server;

import com.smarthome.controlador.UsuarioControlador;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;

// Esta clase se encarga de encender y configurar el servidor web
public class Servidor {
    // Puerto en el que se ejecutara el servidor por donde escuchara las peticiones
    private static final int PUERTO = 8080;

    // Este es nuestro "control remoto" para poder encender o apagar el servidor más
    // adelante.
    // Creamos una etiqueta llamada "servidor" para referirnos a nuestro sitio web
    // en todo el código.
    private static HttpServer servidor;

    // Este método se encarga de encender el servidor
    public static void iniciarServidor() throws IOException {
        // Creamos el servidor en la dirección IP y le decimos en qué puerto debe
        // trabajar (8080)
        servidor = HttpServer.create(new InetSocketAddress(PUERTO), 0); // El 0 le dice a la computadora que ella decida
                                                                        // cuántas personas pueden esperar en fila si el
                                                                        // servidor está muy ocupado.
        // Registramos el controlador de usuarios
        // Esto le dice al servidor qué hacer cuando alguien pida datos de usuarios.
        UsuarioControlador.handler(servidor);
        // Iniciamos el servidor
        servidor.start();
        // Imprimimos un mensaje en la consola para indicar que el servidor se ha
        // iniciado correctamente
        System.out.println("Servidor corriendo en el puerto " + PUERTO);
    }
}
