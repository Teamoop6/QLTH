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
public class Student extends Person{
    
    public Student(String Id,String Name,String Sdt,String Dia_Chi) {
        super(Id,Name,Sdt,Dia_Chi);
    }
    
    public Student(){
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
   
    public ArrayList<Student> getStudentsList()
   {
       ArrayList<Student> StudentsList = new ArrayList<Student>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `sinh vien` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Student stu;
           while(rs.next())
           {
               // tao mot object lay du lieu tu sql
               stu = new Student(rs.getString("Ma_Sinh_Vien"),rs.getString("Ten"),rs.getString("So_Dien_Thoai"),rs.getString("Dia_Chi"));
               StudentsList.add(stu);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return StudentsList;
   }
   
}
