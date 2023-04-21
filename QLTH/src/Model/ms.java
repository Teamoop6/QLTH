/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author toanc
 */
public class ms {
    private String ma_sach ;
    private String ngay_muon ;
    private String ngay_tra ;

    public ms() {
    }
    public ms(String ma_sach,String ngay_muon,String ngay_tra) {
        this.ma_sach = ma_sach ;
        this.ngay_muon = ngay_muon ;
        this.ngay_tra = ngay_tra ;
    }

    public String getMa_sach() {
        return ma_sach;
    }

    public void setMa_sach(String ma_sach) {
        this.ma_sach = ma_sach;
    }


    public String getNgay_muon() {
        return ngay_muon;
    }

    public void setNgay_muon(String ngay_muon) {
        this.ngay_muon = ngay_muon;
    }

    public String getNgay_tra() {
        return ngay_tra;
    }

    public void setNgay_tra(String ngay_tra) {
        this.ngay_tra = ngay_tra;
    }
    
   // get the connection
   public Connection getConnection()
   {
       Connection con;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost/qlth", "root","team6oop");
           return con;
       } catch (Exception e) {
           e.printStackTrace();
           return null;
       }
   }
   
   
}
