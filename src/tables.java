/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhupal Prajapati
 */
public class tables {
    public static void main(String[] args)
    {
      Connection con=null;
        Statement st = null;    
        try
      {
       
      con = ConnectionProvider.getcon();
      st=con.createStatement();
      st.executeUpdate("create table Home(Item varchar(300), Location varchar(30), Marked varchar(10), Serial varchar(30), Price varchar(20), PDate Date, Store varchar(20),Note varchar(20) , image varchar(5000))");
         JOptionPane.showMessageDialog(null,"Table Created Successfully");        
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {}
        }
    }
}
     
        
    

