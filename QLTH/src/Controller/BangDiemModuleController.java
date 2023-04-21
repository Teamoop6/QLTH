/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.BangDiem;
import Model.Student;
import View.BangDiemModuleView;
import java.util.ArrayList;
//import View.EditStudentView;

/**
 *
 * @author toanc
 */
public class BangDiemModuleController {
   private ArrayList<BangDiem> bdList = new ArrayList<BangDiem>() ;
   private ArrayList<Student> stuList ;
   private BangDiem bd ;
   private BangDiemModuleView bmv ;
    public BangDiemModuleController(BangDiem bd,BangDiemModuleView bmv) {
        this.bd = bd; 
        this.bmv = bmv;
        this.layVaHienThiDuLieu();
        this.thaoTacBangDiem();
    }
   private void layVaHienThiDuLieu() {
       stuList = new Student().getStudentsList();
       bdList = bd.getBangDiemtsList();
       bmv.Show_Users_In_JTable(bdList,stuList);
   }
   
   private void thaoTacBangDiem() {
       bmv.addBangDiem(bdList,stuList);
       bmv.editBangDiem(bdList,stuList);
       bmv.deleteBangDiem(bdList,stuList);
       bmv.chonHang(bdList);
    }
}
