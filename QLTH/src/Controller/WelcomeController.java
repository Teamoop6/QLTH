/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import Model.Teacher;
import View.LoginPageView;
import View.StudentModuleView;
import View.TeacherModuleView;

/**
 *
 * @author toanc
 */
public class WelcomeController {
    
    public WelcomeController() {
        
    }
    
    public void logOut() {
        LoginPageController lpc = new LoginPageController() ;
        LoginPageView lpv = new LoginPageView(lpc);
    }
    
    public void StudentModuleSubmit() {
        Student stu = new Student();
        StudentModuleController smc = new StudentModuleController();
        StudentModuleView smv = new StudentModuleView(smc);
    }
     public void TeacherModuleSubmit() {
        Teacher ttu = new Teacher();
        TeacherModuleController tmc = new TeacherModuleController(ttu);
        TeacherModuleView tmv = new TeacherModuleView(tmc);
    }
}
