/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Book;
import Model.Student;
import View.WelcomeView;
import java.sql.Statement ;
import java.sql.ResultSet ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//import View.EditStudentView;

/**
 *
 * @author toanc
 */
public class BookModuleController {
   
    public BookModuleController() {
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
   
   // Display Data In JTable
   public void HienThi_Sach(DefaultTableModel tb,JTable JTable1)
   {
       ArrayList<Book> list = getBooksList();
       DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < list.size(); i++)
       {
           row[0] = list.get(i).getId();
           row[1] = list.get(i).getName();
           row[2] = list.get(i).getTac_gia();
           row[3] = list.get(i).getGia();
           model.addRow(row);
       }
        tb = model ;
    }
   
   
   // Execute The Insert Update And Delete Querys
   public void executeSQlQuery(DefaultTableModel tb,JTable JTable1,String query, String message)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
           
           // thực thi câu lệnh truy vấn
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               tb.setRowCount(0);
               HienThi_Sach(tb,JTable1);
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
   }
    public void backSubmit() {
        WelcomeController wc = new WelcomeController();
        WelcomeView wv = new WelcomeView(wc);
    }
}
