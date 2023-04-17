/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Student;
import Model.Teacher;
import View.BangDiemModuleView;
import View.BookModuleView;
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
        StudentModuleController smc = new StudentModuleController();
        StudentModuleView smv = new StudentModuleView(smc);
    }
     public void TeacherModuleSubmit() {
        TeacherModuleController tmc = new TeacherModuleController();
        TeacherModuleView tmv = new TeacherModuleView(tmc);
    }
     
    public void BookModuleSubmit() {
        BookModuleController bmc = new BookModuleController();
        BookModuleView bmv = new  BookModuleView(bmc);
    }
    
    public void BangDiemModuleSubmit() {
        BangDiemModuleController bdm = new BangDiemModuleController();
        BangDiemModuleView bmv = new  BangDiemModuleView(bdm);
    }
}
