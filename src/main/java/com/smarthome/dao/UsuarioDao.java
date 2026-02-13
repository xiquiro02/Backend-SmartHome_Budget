package com.smarthome.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.smarthome.basedatos.ClaseConexion;

public class UsuarioDao {
    // Consulta para buscar y listar a todos los usuarios de la tabla usuario.
    // language=sql
    private static String sql_select = """
            SELECT * FROM usuario ;
            """;

    // Este método se encarga de pedir los datos y mostrarlos en la consola
    public static void usuario() {
        // El 'try' intenta abrir la conexión y preparar la consulta SQL
        try (Connection conn = ClaseConexion.MetodoConectar();
                PreparedStatement pstmt = conn.prepareStatement(sql_select)) {
            // Ejecuta la consulta y guarda todos los resultados en la variable 'rs' (como
            // una tabla temporal)
            ResultSet rs = pstmt.executeQuery();

            // Este ciclo 'while' recorre los resultados uno por uno (fila por fila)
            while (rs.next()) {
                // Saca el texto de la columna "NombreUsuario" y lo imprime
                String user = rs.getString("NombreUsuario");
                System.out.println(user);
                // Saca el texto de la columna "PrimerApellido" y lo imprime
                String lastname = rs.getString("PrimerApellido");
                System.out.println(lastname);
                // Saca el texto de la columna "Correo" y lo imprime
                String correo = rs.getString("Correo");
                System.out.println(correo);
                // Saca el texto de la columna "Telefono" y lo imprime
                String telefono = rs.getString("Telefono");
                System.out.println(telefono);
                // Saca el texto de la columna "ContrasenaUsuario" y lo imprime
                String password = rs.getString("ContrasenaUsuario");
                System.out.println(password);
            }
        } catch (SQLException e) {
            // TODO: handle exception
            // Si hay un error en la consulta (por ejemplo, si la tabla no existe), avisa
            // aquí 
            System.err.println(e);
        }
    }
}