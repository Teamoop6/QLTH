/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BangDiem;
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
public class BangDiemModuleController {
   private ArrayList<BangDiem> bdList = new ArrayList<BangDiem>() ;
   private ArrayList<Student> stuList ;
   private StudentModuleController smc ;
    public BangDiemModuleController() {
    }
    public BangDiemModuleController(StudentModuleController smc) {
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
   public ArrayList<BangDiem> getBangDiemtsList()
   {
       ArrayList<BangDiem> BangDiemsList = new ArrayList<BangDiem>();
       Connection connection = getConnection();
       
       String query = "SELECT * FROM  `bang diem` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           BangDiem bd;
           while(rs.next())
           {
               // tao mot object lay du lieu tu sql
               bd = new BangDiem(rs.getString("Ma_Sinh_Vien"),rs.getDouble("OOP"),rs.getDouble("CNPM"),rs.getDouble("C++"),rs.getDouble("KTVXL"));
               BangDiemsList.add(bd);
           }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       return BangDiemsList;
   }
   
   // Update Array Student
   public void UpdateArrayBangDiem() {
       // mảng student = list
        bdList = getBangDiemtsList() ;
        for(Student stu1 : stuList) {
            System.out.println(stu1.getId());
        }
   }
   // Display Data In JTable
   public void Show_Users_In_JTable(DefaultTableModel tb,JTable JTable1)
   {
       DefaultTableModel model = (DefaultTableModel) JTable1.getModel();
       Object[] row = new Object[6];
       for(int i = 0; i < bdList.size(); i++)
       {
           
           row[0] = bdList.get(i).getId();
           System.out.println("row " + row[0]);
           for(Student stu : stuList) {
               if(stu.getId().equals(bdList.get(i).getMsv())) {
                 row[1] = stuList.get(i).getName();
           }
           }
           row[2] = bdList.get(i).getOOP();
           row[3] = bdList.get(i).getCNPM();
           row[4] = bdList.get(i).getClt();
           row[5] = bdList.get(i).getKTVXL();
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
               Show_Users_In_JTable(tb,JTable1);
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
   }
   
   // hien msv tu hang
   public String showRows(String id) {
//       for(Student stu : stuList) {
//           System.out.println(stu.getName() + input_msv);
//               if(stu.getName().equals(input_msv)) {
//                 System.out.println("Tim thay");
//                 return stu.getId();
//           }
//      }
     return bdList.get(Integer.parseInt(id)-1).getMsv();
   }
    public void addBangDiem(DefaultTableModel tb,JTable JTable1,String msv,String OOP,String CNPM,String Clt,String KTVXL) {
        BangDiem bd = new BangDiem(msv,Double.parseDouble(OOP),Double.parseDouble(CNPM),Double.parseDouble(Clt),Double.parseDouble(KTVXL));
        bdList.add(bd);
        String query = "INSERT INTO `bang diem`(`Ma_Sinh_Vien`, `OOP`, `CNPM`, `C++`, `KTVXL` ) VALUES ('"+msv+"','"+bd.getOOP()+"','"+bd.getCNPM()+"','"+bd.getClt()+"','"+bd.getKTVXL()+"')";
        executeSQlQuery(tb,JTable1,query, "Inserted");
    }
    
//    public void editStudent(DefaultTableModel tb,JTable JTable1,String msv,String OOP,String CNPM,String Clt,String KTVXL) {
//        for(BangDiem stu : bdList) {
//            if(id.equals(stu.getId())) {
//              stu.setName(name);
//              stu.setSdt(phone);
//              stu.setDia_Chi(address);
//              String query = "UPDATE `sinh vien` SET `Ten`='"+stu.getName()+"',`So_Dien_Thoai`='"+stu.getSdt()+"',`Dia_Chi`='"+stu.getDia_Chi()+"' WHERE Ma_Sinh_Vien = '"+stu.getId()+"'";
//              executeSQlQuery(tb,JTable1,query, "Updated");
//              break;
//            }
//        }
//        UpdateArrayBangDiem();
//        
//    }
    
//    public void deleteStudent(DefaultTableModel tb,JTable JTable1,String id ,String name,String phone,String address) {
//        for(Student stu : stuList) {
//            if(id.equals(stu.getId())) {
//              String query = "DELETE FROM `sinh vien` WHERE Ma_Sinh_Vien = '"+stu.getId()+"'";      
//              executeSQlQuery(tb,JTable1,query, "Deleted");
//              stuList.remove(stu);
//              break;
//            }
//        } 
//        UpdateArrayBangDiem();
//        
//    }
   
   
    public void backSubmit() {
        WelcomeController wc = new WelcomeController(smc);
        WelcomeView wv = new WelcomeView(wc);
    }
}
