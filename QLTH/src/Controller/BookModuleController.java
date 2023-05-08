/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Book;
import Model.Gvms;
import Model.Student;
import Model.Svms;
import Model.Teacher;
import View.BookModuleView;
import java.util.ArrayList;

/**
 *
 * @author toanc
 */
public class BookModuleController {
   private ArrayList<Book> bookList = new ArrayList<Book>() ;
   private ArrayList<Student> stuList ;
   private ArrayList<Teacher> teaList ;
   private ArrayList<Svms> svmsList = new ArrayList<Svms>();
   private ArrayList<Gvms> gvmsList = new ArrayList<Gvms>();
   private Book bk ;
   private BookModuleView bmv ;
    public BookModuleController(Book bk,BookModuleView bmv) {
        this.bk = bk;
        this.bmv = bmv ;
        this.layVaHienThiDuLieu();
        this.thaoTacBook();
        this.thaoTacMsBook();
    }
    
    private void layVaHienThiDuLieu() {
       bookList = bk.getBooksList();
       
       // Sinh vien
       svmsList = new Svms().getSvmsList();
       stuList = new Student().getStudentsList();
       
       
       // Giao vien
       gvmsList = new Gvms().getGvmsList();
       teaList = new Teacher().getTeachersList();
       
      // hien thi
      bmv.HienThi_Sach(bookList);
      bmv.HienThi_SVms(svmsList, bookList, stuList); 
   }
   
   private void thaoTacBook() {
       bmv.addBook(bookList);
       bmv.editBook(bookList);
       bmv.deleteBook(bookList);
    } 
   
   private void thaoTacMsBook() {
      bmv.doi_bangms(svmsList,gvmsList,stuList,teaList,bookList);
      bmv.chonHangMs(svmsList, gvmsList);
      bmv.addMsBook(svmsList,gvmsList,stuList,teaList,bookList);
      bmv.editMsBook(svmsList,gvmsList,stuList,teaList,bookList);
      bmv.deleteMsBook(svmsList,gvmsList,stuList,teaList,bookList);
   }
}
