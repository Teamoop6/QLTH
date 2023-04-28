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
public class Gvms extends ms{
    private String ma_gv ;
    public Gvms(String ma_gv,String ma_sach,String ngay_muon,String ngay_tra) {
        super(ma_sach,ngay_muon,ngay_tra);
        this.ma_gv = ma_gv ;
    }
    public Gvms(){
        
    }

    public String getMa_gv() {
        return ma_gv;
    }

    public void setMa_gv(String ma_gv) {
        this.ma_gv = ma_gv;
    }
    
   
    public ArrayList<Gvms> getGvmsList()
   {
       ArrayList<Gvms> gvmsList = new ArrayList<Gvms>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `GV MUON SACH` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Gvms gvm;
           while(rs.next())
           {
               // tao mot object lay du lieu tu sql
               gvm = new Gvms(rs.getString("Ma_Giao_Vien"),rs.getString("Ma_Sach"),rs.getString("Ngay_Muon"),rs.getString("Ngay_Tra"));
               gvmsList.add(gvm);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return gvmsList;
   }
}
