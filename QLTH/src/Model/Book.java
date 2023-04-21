/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author toanc
 */
public class Book extends User{
    private ArrayList<Book> bookList ;
    private String tac_gia ;
    private int gia ;
    
    public Book(String id,String name,String tac_gia,int gia) {
        super(id,name);
        this.tac_gia = tac_gia ;
        this.gia = gia ;
    }
    
    public Book() {
        
    }

    public String getTac_gia() {
        return tac_gia;
    }

    public void setTac_gia(String tac_gia) {
        this.tac_gia = tac_gia;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
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
  
   // get a list of users from mysql database
   public ArrayList<Book> getBooksList()
   {
       ArrayList<Book> BooksList = new ArrayList<Book>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `sach` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Book bk;
           while(rs.next())
           {
               // tao mot object lay du lieu tu sql
               bk = new Book(rs.getString("Ma_Sach"),rs.getString("Ten"),rs.getString("Tac_Gia"),rs.getInt("Gia"));
               BooksList.add(bk);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return BooksList;
   }
   
     // Update Array Book
   public void UpdateArrayBook() {
       // mảng bangdiem = list
        bookList = getBooksList() ;
   }
}
