/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import View.LoginPageView;
import View.StudentModuleView;

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
        StudentModuleController smc = new StudentModuleController(stu);
        StudentModuleView smv = new StudentModuleView(smc);
    }
}
