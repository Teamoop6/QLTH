/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Book;
import Model.Student;
import Model.Svms;
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
   private ArrayList<Book> bookList = new ArrayList<Book>() ;
   private ArrayList<Student> stuList ;
   private ArrayList<Svms> svmsList = new ArrayList<Svms>();
   private StudentModuleController smc ;
    public BookModuleController() {
    }
    
    public BookModuleController(StudentModuleController smc) {
        this.smc = smc ; 
        this.stuList = smc.getStudentsList(); 
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
   
   // Update Array BangDiem
   public void UpdateArrayBook() {
       // mảng bangdiem = list
        bookList = getBooksList() ;
   }
   
   public void UpdateArraySvmsBook() {
       svmsList = getSvmsList();
   }
   // Display Data In JTable
   public void HienThi_Sach(DefaultTableModel tb,JTable JTable1)
   {
       DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < bookList.size(); i++)
       {
           row[0] = bookList.get(i).getId();
           row[1] = bookList.get(i).getName();
           row[2] = bookList.get(i).getTac_gia();
           row[3] = bookList.get(i).getGia();
           model.addRow(row);
       }
        tb = model ;
    }
   
   public void HienThi_SVms(DefaultTableModel tb1,JTable JTable2)
   {
       DefaultTableModel model = (DefaultTableModel) JTable2.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < svmsList.size(); i++)
       {
           for(Book bk : bookList) {
               if(bk.getId().equals(svmsList.get(i).getMa_sach())) {      
                 row[0] = bk.getName();
           }
           }
           for(Student stu : stuList) {
               if(stu.getId().equals(svmsList.get(i).getMa_sv())) {
                 row[1] = stu.getName();
           }
           }
           row[2] = svmsList.get(i).getNgay_muon();
           row[3] = svmsList.get(i).getNgay_tra();
           model.addRow(row);
       }
        tb1 = model ;
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
   
   public void executeSQlQuery2(DefaultTableModel tb1,JTable JTable2,String query, String message)
   {
       Connection con = getConnection();
       Statement st;
       try{
           st = con.createStatement();
           
           // thực thi câu lệnh truy vấn
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               tb1.setRowCount(0);
               HienThi_SVms(tb1,JTable2);
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
   }
   
   public void addBook(DefaultTableModel tb,JTable JTable1,String ma_sach ,String name,String tac_gia ,String gia) {
        Book bk = new Book(ma_sach,name,tac_gia,Integer.parseInt(gia));
        bookList.add(bk);
        String query = "INSERT INTO `sach`(`Ma_Sach`, `Ten`, `Tac_Gia`, `Gia` ) VALUES ('"+ma_sach+"','"+name+"','"+tac_gia+"','"+gia+"')";
        executeSQlQuery(tb,JTable1,query, "Inserted");
    }
   
   public void editBook(DefaultTableModel tb,JTable JTable1,String ma_sach ,String name,String tac_gia ,String gia) {
        for(Book bk : bookList) {
            if(ma_sach.equals(bk.getId())) {
              bk.setName(name);
              bk.setTac_gia(tac_gia);
              bk.setGia(Integer.parseInt(gia));
              String query = "UPDATE `sach` SET `Ten`='"+bk.getName()+"',`Tac_Gia`='"+bk.getTac_gia()+"',`Gia`='"+bk.getGia()+"' WHERE Ma_Sach = '"+bk.getId()+"'";
              executeSQlQuery(tb,JTable1,query, "Updated");
              break;
            }
        }
    }
   
   public void deleteBook(DefaultTableModel tb,JTable JTable1,String ma_sach ,String name,String tac_gia ,String gia) {
        for(Book bk : bookList) {
            if(ma_sach.equals(bk.getId())) {
              bookList.remove(bk);
              String query = "DELETE FROM `sach` WHERE Ma_Sach = '"+ma_sach+"'";  
              executeSQlQuery(tb,JTable1,query, "Deleted"); 
              break;
            }
        } 
        
    }
   
   //
   public String showMs(int id) {
     return svmsList.get(id).getMa_sach();
   }
   public String showMsv(int id) {
     return svmsList.get(id).getMa_sv();
   }
   public void addSvmsBook(DefaultTableModel tb1,JTable JTable2,String ma_sv ,String ma_sach,String ngay_muon ,String ngay_tra) {
        Svms svm = new Svms(ma_sv,ma_sach,ngay_muon,ngay_tra);
        String query = "INSERT INTO `SV MUON SACH`(`Ma_Sinh_Vien`, `Ma_Sach`, `Ngay_Muon`, `Ngay_Tra` ) VALUES ('"+ma_sv+"','"+ma_sach+"','"+ngay_muon+"','"+ngay_tra+"')";
        executeSQlQuery2(tb1,JTable2,query, "Inserted");
    }
   
   public void editSvmsBook(DefaultTableModel tb1,JTable JTable2,String ma_sv ,String ma_sach,String ngay_muon ,String ngay_tra) {
        for(Svms svms : svmsList) {
            if(ma_sv.equals(svms.getMa_sv()) && ma_sach.equals(svms.getMa_sach())) {
              svms.setNgay_muon(ngay_muon);
              svms.setNgay_tra(ngay_tra);
              String query = "UPDATE `SV MUON SACH` SET `Ngay_Muon`='"+ngay_muon+"',`Ngay_Tra`='"+ngay_tra+"' WHERE Ma_Sinh_Vien = '"+ma_sv+"' AND Ma_Sach = '"+ma_sach+"'";
              executeSQlQuery2(tb1,JTable2,query, "Updated");
              break;
            }
        }
    }
   
    public void deleteSvmsBook(DefaultTableModel tb1,JTable JTable2,String ma_sv ,String ma_sach,String ngay_muon ,String ngay_tra) {
        for(Svms svms : svmsList) {
            if(ma_sv.equals(svms.getMa_sv()) && ma_sach.equals(svms.getMa_sach())) {
              svmsList.remove(svms);
              String query = "DELETE FROM `SV MUON SACH` WHERE Ma_Sach = '"+svms.getMa_sach()+"' AND Ma_Sinh_Vien = '"+svms.getMa_sv()+"'"; 
              executeSQlQuery2(tb1,JTable2,query, "Deleted"); 
              break;
            }
        }   
    }
   
    public void backSubmit() {
        WelcomeController wc = new WelcomeController(smc);
        WelcomeView wv = new WelcomeView(wc);
    }
}
