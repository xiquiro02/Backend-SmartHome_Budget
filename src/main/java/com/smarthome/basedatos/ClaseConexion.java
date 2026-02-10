package com.smarthome.basedatos;

import java.sql.*;

public class ClaseConexion {
    
     static String BD ="jdbc:mysql://localhost:3306/SmartHome_BudgetBD";
     static String usuario = "root";
     static String password = "#Aprendiz2024";

    public static Connection MetodoConectar(){
        try 
        {          
            if (BD.isEmpty() && usuario.isEmpty() && password.isEmpty())
            {
                System.out.println("Los datos estan vacios");
            }
                Connection conn = DriverManager.getConnection(BD, usuario, password);
                System.out.println("Conexion establecida");
                return conn;
        }
        catch (SQLException error)
        {
            System.err.println(error);
            return null;
        }
    }
} 

