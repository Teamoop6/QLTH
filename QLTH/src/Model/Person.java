/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author toanc
 */
public class Person extends User{
    private String Sdt ;
    private String Dia_Chi;
    public Person() {
        
    }
    public Person(String Id,String Name,String Sdt,String Dia_Chi) {
        super(Id,Name);
        this.Sdt = Sdt ;
        this.Dia_Chi = Dia_Chi ;
    }
    
    public String getSdt() {
        return Sdt;
    }


    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getDia_Chi() {
        return Dia_Chi;
    }

    public void setDia_Chi(String Dia_Chi) {
        this.Dia_Chi = Dia_Chi;
    }
}
