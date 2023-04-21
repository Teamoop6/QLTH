/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import View.StudentModuleView;
import java.util.ArrayList;

//import View.EditStudentView;

/**
 *
 * @author toanc
 */
public class StudentModuleController {
   
   private ArrayList<Student> stuList = new ArrayList<Student>() ;
   private Student st ;
   private StudentModuleView smv ;
   public StudentModuleController(Student st,StudentModuleView smv) {
        this.st = st ;
        this.smv = smv ;
        this.layVaHienThiDuLieu();
        this.thaoTacStudent();
    }
   
   private void layVaHienThiDuLieu() {
       stuList = st.getStudentsList();
       smv.Show_Users_In_JTable(stuList);
   }
   
   private void thaoTacStudent() {
       smv.addStudentView(stuList);
       smv.editStudentView(stuList);
       smv.deleteStudentView(stuList);
    }
}
