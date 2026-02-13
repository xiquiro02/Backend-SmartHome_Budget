package com.smarthome.basedatos;

import java.sql.*;

/* Clase encargada de gestionar la conexión física entre la aplicación Java y el motor de base de datos MySQL. */
public class ClaseConexion {
    // Configuración de la cadena de conexión (URL de la base de datos local)
    static String BD = "jdbc:mysql://localhost:3306/SmartHome_BudgetBD";
    // Credenciales de acceso al servidor de base de datos
    static String usuario = "root";
    static String password = "Sali20302002";

    /*
     * Establece una conexión con la base de datos MySQL utilizando los parámetro
     * definidos en los atributos de la clase.
     */
    public static Connection MetodoConectar() {
        try {
            // Validación preventiva, Verifica si las variables de configuración están
            // inicializadas
            if (BD.isEmpty() && usuario.isEmpty() && password.isEmpty()) {
                System.out.println("Los datos están vacíos");
            }

            // Intenta establecer la conexión con la base de datos usando los datos de
            // acceso definidos arriba
            Connection conexion = DriverManager.getConnection(BD, usuario, password);
            // Confirmación por consola de conexión exitosa
            System.out.println("Conexión establecida correctamente");
            // Retorna la conexión activa para poder usarla en el resto del proyecto
            return conexion;

        } catch (SQLException error) {
            // Captura de excepciones específicas de SQL (Ej: error de contraseña, BD
            // inexistente)
            System.err.println("Error al conectar a la base de datos");
            return null;
        }
    }
}
