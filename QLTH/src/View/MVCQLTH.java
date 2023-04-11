/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.LoginPageController;

/**
 *
 * @author toanc
 */
public class MVCQLTH {
    public static void main(String[] args) {
    // creat view and add view to controller of 
    // loginpage controller
    LoginPageController lgc = new LoginPageController() ;
    LoginPageView view = new LoginPageView(lgc) ;
    }
}
