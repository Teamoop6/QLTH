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
public class LoginPageController {
    
    private LoginPageView lpv;
    public LoginPageController(LoginPageView lpv) {
      this.lpv = lpv ;
      this.lpv.SubmitLoginPage();
      this.lpv.SubmitSecret();
    }
}
