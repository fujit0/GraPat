package main.java.quak.http;

import java.io.PrintWriter;
import java.sql.*;


public class ConnectionManager {

   static Connection con;
   static String url;
         
   public static Connection getConnection(PrintWriter logger)
   {
     
      try
      {
    	 String host = "localhost";
    	 String port = "3306";
    	 String database = "grapat_logins";
    	 String db = "jdbc:mysql://" + host + ":" + port + "/?characterSetResults=UTF-8&characterEncoding=UTF-8&useUnicode=yes&" + database;

         Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         
         try
         {            	
            con = DriverManager.getConnection(db,"grapat_user_auth","donaldduckisteineenteausentenhausen");
         }
         
         catch (SQLException ex)
         {
            logger.println(ex.getStackTrace());
            logger.flush();
         }
      }

      catch(ClassNotFoundException e)
      {
         System.out.println(e);
      }

      return con;
   }
}
