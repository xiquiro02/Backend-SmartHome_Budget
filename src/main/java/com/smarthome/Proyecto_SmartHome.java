package com.smarthome;

import com.smarthome.dao.UsuarioDao;
import com.smarthome.server.Servidor;

public class Proyecto_SmartHome {
   public static void main(String[] args) {
      try {
         Servidor.iniciarServidor();
      } catch (Exception e) {
         // TODO: handle exception
         System.out.println("Error al iniciar el servidor");
      }
   }
}
