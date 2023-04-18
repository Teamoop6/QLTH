/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author toanc
 */
public class BangDiem {
    private static int count = 1;
    private int id;
    private String msv ;
    private double OOP; 
    private double CNPM ;
    private double Clt;
    private double KTVXL ;
    private double DTB ;
    public BangDiem(String msv,double OOP, double CNPM, double Clt, double KTVXL){
         // Tăng biến count lên 1 mỗi khi tạo đối tượng mới
        this.id = count; // Sử dụng giá trị của biến count để xác định id của đối tượng hiện tại
        this.msv = msv ;
        this.OOP = OOP;
        this.CNPM = CNPM;
        this.Clt = Clt;
        this.KTVXL = KTVXL;
        count++;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getOOP() {
        return OOP;
    }

    public void setOOP(double OOP) {
        this.OOP = OOP;
    }

    public double getCNPM() {
        return CNPM;
    }

    public void setCNPM(double CNPM) {
        this.CNPM = CNPM;
    }

    public double getClt() {
        return Clt;
    }

    public void setClt(double Clt) {
        this.Clt = Clt;
    }

    public double getKTVXL() {
        return KTVXL;
    }

    public void setKTVXL(double KTVXL) {
        this.KTVXL = KTVXL;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        BangDiem.count = count;
    }

    public double getDTB() {
        return DTB;
    }

    public void setDTB(double DTB) {
        this.DTB = DTB;
    }
    
    
   
}