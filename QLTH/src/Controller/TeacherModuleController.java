/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Teacher;
import View.TeacherModuleView;
import java.util.ArrayList;

//import View.EditTeacherView;

/**
 *
 * @author toanc
 */
public class TeacherModuleController {
   
   private ArrayList<Teacher> teaList = new ArrayList<Teacher>() ;
   private Teacher tt ;
   private TeacherModuleView tmv ;
   public TeacherModuleController(Teacher tt,TeacherModuleView tmv) {
        this.tt = tt ;
        this.tmv = tmv ;
        this.layVaHienThiDuLieu();
        this.thaoTacTeacher();
    }
   
   private void layVaHienThiDuLieu() {
       teaList = tt.getTeachersList();
       tmv.Show_Users_In_JTable(teaList);
   }
   
   private void thaoTacTeacher() {
       tmv.addTeacherView(teaList);
       tmv.editTeacherView(teaList);
       tmv.deleteTeacherView(teaList);
    }
}
