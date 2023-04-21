/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import View.TeacherModuleView;
import View.WelcomeView;

/**
 *
 * @author toanc
 */
public class WelcomeController {
   private WelcomeView wv ;
   private WelcomeController wc ;
   public WelcomeController(WelcomeView wv) {
       this.wv = wv ;
       this.wv.StudentModuleView();
       this.wv.BangDiemModuleView();
       this.wv.BookModuleView();
    }

     public void TeacherModuleSubmit() {
        TeacherModuleController tmc = new TeacherModuleController();
        TeacherModuleView tmv = new TeacherModuleView(tmc);
    }
    
}
