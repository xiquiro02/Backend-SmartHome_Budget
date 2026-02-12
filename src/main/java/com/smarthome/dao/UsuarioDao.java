package com.smarthome.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.smarthome.basedatos.ClaseConexion;

public class UsuarioDao {
    // language=sql
    private static String sql_select = """
            SELECT * FROM usuario ;
            """;

    public static void usuario() {
        try (Connection conn = ClaseConexion.MetodoConectar();
                PreparedStatement pstmt = conn.prepareStatement(sql_select)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String user = rs.getString("NombreUsuario");
                System.out.println(user);
                String lastname = rs.getString("PrimerApellido");
                System.out.println(lastname);
                String correo = rs.getString("Correo");
                System.out.println(correo);
                String telefono = rs.getString("Telefono");
                System.out.println(telefono);
                String password = rs.getString("ContrasenaUsuario");
                System.out.println(password);
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}