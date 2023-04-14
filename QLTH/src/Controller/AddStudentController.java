/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import Model.Student;
import View.AddStudentView;
import View.StudentModuleView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author toanc
 */
public class AddStudentController {
   private Student m ;
//   private AddStudentView v ;
   
   // m1
   public AddStudentController(Student m) {
       this.m = m ;
   }
   
    public void addSubmit(String id,String name,String sdt,String dia_chi){
      try {
     m.setId(id);
     m.setName(name);
     m.setSdt(sdt);
     m.setDia_Chi(dia_chi);
     System.out.println("Add student");
     System.out.println(m.getId() + " " + m.getName());
     
     // Them vao co so du lieu
     Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/qlth","root","team6oop");
            String sql= "insert into `sinh vien` values(?,?,?,?)";
            
            PreparedStatement ptstmt= conn.prepareStatement(sql);
            ptstmt.setString(1, m.getId());
            ptstmt.setString(2, m.getName());
            ptstmt.setString(3, m.getSdt());
            ptstmt.setString(4, m.getDia_Chi());
            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data stores successfully");
            conn.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void backSubmit() {
        StudentModuleController smc = new StudentModuleController(m);
        StudentModuleView view = new StudentModuleView(smc);
    }
}
