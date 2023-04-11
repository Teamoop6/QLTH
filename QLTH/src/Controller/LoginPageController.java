/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.LoginPageView;
import View.WelcomeView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author toanc
 */
public class LoginPageController {
    
    public LoginPageController() {

    }
    
    public void SubmitLoginPage(String name,String pass) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/qlth","root","team6oop");
            Statement st= (Statement)conn.createStatement();
            String sql= "select * from user_login";
            
            ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
            String username= rs.getString("username");
            String Password= rs.getString("password");
            
            if(name.equals(username) && pass.equals(Password)){
            new WelcomeView().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect!");
            }
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error while establishing connection");
        }
         }
    public void SubmitSecret(String secret) {
        if(secret.equals("admin@123")){
              JOptionPane.showMessageDialog(null, "The username and password is 'admin'");
        }
    }
}
