/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Book;
import Model.Student;
import Model.Svms;
import View.BookModuleView;
import java.util.ArrayList;

/**
 *
 * @author toanc
 */
public class BookModuleController {
   private ArrayList<Book> bookList = new ArrayList<Book>() ;
   private ArrayList<Student> stuList ;
   private ArrayList<Svms> svmsList = new ArrayList<Svms>();
   private Book bk ;
   private BookModuleView bmv ;
    public BookModuleController(Book bk,BookModuleView bmv) {
        this.bk = bk;
        this.bmv = bmv ;
        this.layVaHienThiDuLieu();
        this.thaoTacBook();
        this.thaoTacSvmsBook();
    }
    
    private void layVaHienThiDuLieu() {
       bookList = bk.getBooksList();
       svmsList = new Svms().getSvmsList();
       stuList = new Student().getStudentsList();
       bmv.HienThi_Sach(bookList);
       bmv.HienThi_SVms(svmsList, bookList, stuList);
   }
   
   private void thaoTacBook() {
       bmv.addBook(bookList);
       bmv.editBook(bookList);
       bmv.deleteBook(bookList);
    } 
   
   private void thaoTacSvmsBook() {
      bmv.addSvmsBook(svmsList, bookList, stuList);
      bmv.editSvmsBook(svmsList, bookList, stuList);
      bmv.deleteSvmsBook(svmsList, bookList, stuList);
      bmv.chonHang(svmsList);
      bmv.doi_bangms(svmsList, bookList, stuList);
   }
}
