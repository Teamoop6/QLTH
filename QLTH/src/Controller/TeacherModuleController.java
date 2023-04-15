/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Teacher;
import View.AddTeacherView;
import View.WelcomeView;
//import View.EditStudentView;

/**
 *
 * @author toanc
 */
public class TeacherModuleController {
    private Teacher t ;
    
   
    public TeacherModuleController(Teacher t) {
        this.t = t ;
    }
    
    public void addModuleSubmit() {
        AddTeacherController atc = new AddTeacherController(t);
        AddTeacherView atv = new AddTeacherView(atc);
    }
    
//    public void editModuleSubmit() {
//        EditStudentController esc = new EditStudentController(m);
//        EditStudentView view = new EditStudentView(esc);
//    }
    public void backSubmit() {
        WelcomeController wc = new WelcomeController();
        WelcomeView wv = new WelcomeView(wc);
    }
}
