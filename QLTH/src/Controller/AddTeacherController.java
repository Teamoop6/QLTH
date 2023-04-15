/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Controller;

import Model.Teacher;
import View.AddTeacherView;
import View.TeacherModuleView;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author toanc
 */
public class AddTeacherController {
   private Teacher t ;
//   private AddStudentView v ;
   
   // m1
   public AddTeacherController(Teacher t) {
       this.t = t ;
   }
   
    public void addSubmit(String id,String name,String sdt,String dia_chi){
      try {
     t.setId(id);
     t.setName(name);
     t.setSdt(sdt);
     t.setDia_Chi(dia_chi);
     System.out.println("Add Teacher");
     System.out.println(t.getId() + " " + t.getName());
     
     // Them vao co so du lieu
     Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/qlth","root","team6oop");
            String sql= "insert into `sinh vien` values(?,?,?,?)";
            
            PreparedStatement ptstmt= conn.prepareStatement(sql);
            ptstmt.setString(1, t.getId());
            ptstmt.setString(2, t.getName());
            ptstmt.setString(3, t.getSdt());
            ptstmt.setString(4, t.getDia_Chi());
            ptstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data stores successfully");
            conn.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void backSubmit() {
        TeacherModuleController tmc = new TeacherModuleController(t);
        TeacherModuleView tmv = new TeacherModuleView(tmc);
    }
}
