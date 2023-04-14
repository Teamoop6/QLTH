/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.LoginPageView;

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
    
}
