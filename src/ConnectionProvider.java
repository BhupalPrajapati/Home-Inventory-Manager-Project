/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Bhupal Prajapati
// */
public class ConnectionProvider {
    public static Connection getcon()
    {
      try
      {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root","Bhupal@12345");
       return con;
      }
      catch(Exception e)
      {
          return null;
      }
    }
}
