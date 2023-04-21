/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author toanc
 */
public class Svms extends ms{
    private ArrayList<Svms> svmsList ;
    private String ma_sv ;
    public Svms(String ma_sv,String ma_sach,String ngay_muon,String ngay_tra) {
        super(ma_sach,ngay_muon,ngay_tra);
        this.ma_sv = ma_sv ;
    }
    public Svms(){
        
    }

    public String getMa_sv() {
        return ma_sv;
    }

    public void setMa_sv(String ma_sv) {
        this.ma_sv = ma_sv;
    }
    
    public ArrayList<Svms> getSvmsList()
   {
       ArrayList<Svms> svmsList = new ArrayList<Svms>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `SV MUON SACH` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Svms svm;
           while(rs.next())
           {
               // tao mot object lay du lieu tu sql
               svm = new Svms(rs.getString("Ma_Sinh_Vien"),rs.getString("Ma_Sach"),rs.getString("Ngay_Muon"),rs.getString("Ngay_Tra"));
               svmsList.add(svm);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return svmsList;
   }
    
   public void UpdateArraySvmsBook() {
       svmsList = getSvmsList();
   }
    
}
