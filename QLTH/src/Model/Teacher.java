/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


import Controller.WelcomeController;
import View.WelcomeView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author toanc
 */
public class Teacher extends Person{
    
    public Teacher(String Id,String Name,String Sdt,String Dia_Chi) {
        super(Id,Name,Sdt,Dia_Chi);
    }
    
    public Teacher(){
    }
    // get the connection
   public Connection getConnection()
   {
       Connection con;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/qlth", "root","team6oop");
           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
   
    public ArrayList<Teacher> getTeachersList()
   {
       ArrayList<Teacher> TeachersList = new ArrayList<Teacher>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `giao vien` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Teacher tea;
           while(rs.next())
           {
               // tao mot object lay du lieu tu sql
               tea = new Teacher(rs.getString("Ma_Giao_Vien"),rs.getString("Ten"),rs.getString("So_Dien_Thoai"),rs.getString("Dia_Chi"));
               TeachersList.add(tea);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return TeachersList;
   }
   
}
