/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import View.AddStudentView;
import View.WelcomeView;
//import View.EditStudentView;

/**
 *
 * @author toanc
 */
public class StudentModuleController {
    private Student m ;
    
   
    public StudentModuleController(Student m) {
        this.m = m ;
    }
    
    public void addModuleSubmit() {
        AddStudentController asc = new AddStudentController(m);
        AddStudentView view = new AddStudentView(asc);
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
