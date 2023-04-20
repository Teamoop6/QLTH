/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author toanc
 */
public class Svms extends ms{
    
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
    
    
}
