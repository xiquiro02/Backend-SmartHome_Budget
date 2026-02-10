package com.smarthome.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.smarthome.basedatos.ClaseConexion;

public class UsuarioDao 
{
    //language=sql
    private static String sql_select = """
            SELECT * FROM usuario ;
            """;

    public static void usuario()
    {
        try (Connection conn = ClaseConexion.MetodoConectar();
            PreparedStatement pstmt = conn.prepareStatement(sql_select)) 
        {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) 
            {
                String user = rs.getString("NombreUsuario");
                System.out.println(user);
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println(e);
        }
    }
}