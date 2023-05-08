/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.WelcomeController;
import Model.Teacher;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dell
 */
public class TeacherModuleView extends javax.swing.JFrame {

    /**
     * Creates new form Teachersmodule
     */
    private DefaultTableModel tb  ;
    public TeacherModuleView() {
        initComponents();
        this.setVisible(true);     
        // hiển thị dữ liệu giao vien ra bảng
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input_id = new javax.swing.JTextField();
        input_name = new javax.swing.JTextField();
        input_phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        input_address = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 35)); // NOI18N
        jLabel1.setText("TEACHER'S MODULE");

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn_back.setForeground(new java.awt.Color(0, 0, 204));
        btn_back.setText("BACK");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registation"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel4.setText("Phone :");

        input_id.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        input_id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        input_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_idActionPerformed(evt);
            }
        });

        input_name.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        input_phone.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel5.setText("Address :");

        input_address.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_add.setText("Add");

        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_edit.setText("Edit");

        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_delete.setText("Delete");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(input_id, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(input_name)
                            .addComponent(input_phone)
                            .addComponent(input_address))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)
                        .addGap(10, 10, 10))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_edit)
                    .addComponent(btn_delete))
                .addGap(29, 29, 29))
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Phone", "Address"
            }
        ));
        jTable1.setRequestFocusEnabled(false);
        jTable1.setRowHeight(35);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(140);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_back)
                .addGap(3, 3, 3)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   // get the connection
   private Connection getConnection()
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

   // Execute The Insert Update And Delete Querys
   private void executeSQlQuery(ArrayList<Teacher> stuList,String query, String message)
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
               Show_Users_In_JTable(stuList);
               
               JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
       }
   } 
    // Display Data In JTable
   public void Show_Users_In_JTable(ArrayList<Teacher> teaList)
   {
       tb = (DefaultTableModel) jTable1.getModel();
       Object[] row = new Object[4];
       for(int i = 0; i < teaList.size(); i++)
       {
           row[0] = teaList.get(i).getId();
           row[1] = teaList.get(i).getName();
           row[2] = teaList.get(i).getSdt();
           row[3] = teaList.get(i).getDia_Chi();
           tb.addRow(row);
       }
    }
   

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
       WelcomeView wv = new WelcomeView();
       WelcomeController wc = new WelcomeController(wv);
       dispose();
    }//GEN-LAST:event_btn_backMouseClicked
    
    public void addTeacherView(ArrayList<Teacher> teaList) {
        btn_add.addActionListener((e) -> {
        Teacher tea = new Teacher(input_id.getText(), input_name.getText(), input_phone.getText(), input_address.getText());
        teaList.add(tea);
        // lay du lieu de hien thi
        String query = "INSERT INTO `giao vien`(`Ma_Giao_Vien`, `Ten`, `So_Dien_Thoai`, `Dia_Chi` ) VALUES ('"+tea.getId()+"','"+tea.getName()+"','"+tea.getSdt()+"','"+tea.getDia_Chi()+"')";
        executeSQlQuery(teaList,query, "Inserted");
        });
        
    }
    
    public void editTeacherView(ArrayList<Teacher> teaList) {
        btn_edit.addActionListener((e) -> {
        for(Teacher tea : teaList) {
            if(input_id.getText().equals(tea.getId())) {
              if(input_name.getText().equals(tea.getName()) && input_phone.getText().equals(tea.getSdt()) && input_address.getText().equals(tea.getDia_Chi())) {
                  this.resetText();
                  JOptionPane.showMessageDialog(null, "Xin vui lòng nhập dữ liệu mới để hệ thống cập nhật .");
                  return ;
              }
              tea.setName(input_name.getText());
              tea.setSdt(input_phone.getText());
              tea.setDia_Chi(input_address.getText());
              this.resetText();
              String query = "UPDATE `giao vien` SET `Ten`='"+tea.getName()+"',`So_Dien_Thoai`='"+tea.getSdt()+"',`Dia_Chi`='"+tea.getDia_Chi()+"' WHERE Ma_Giao_Vien = '"+tea.getId()+"'";
              executeSQlQuery(teaList,query, "Updated");
              break;
            }
        }
        });  
    }
    
    public void deleteTeacherView(ArrayList<Teacher> teaList) {
        btn_delete.addActionListener((e) -> {
        for(Teacher tea : teaList) {
            if(input_id.getText().equals(tea.getId())) {
              teaList.remove(tea);
              this.resetText();
              String query = "DELETE FROM `giao vien` WHERE Ma_Giao_Vien = '"+tea.getId()+"'";      
              executeSQlQuery(teaList,query, "Deleted"); 
              break;
            }
        }
        });  
    }
    
    private void resetText() {
        input_id.setText("");
        input_name.setText("");
        input_phone.setText("");
        input_address.setText("");
    }
    private void input_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_idActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        // Get The Index Of The Slected Row
        int i = jTable1.getSelectedRow();

        TableModel model = jTable1.getModel();

        // Display Slected Row In JTexteFields
        input_id.setText(model.getValueAt(i,0).toString());

        input_name.setText(model.getValueAt(i,1).toString());

        input_phone.setText(model.getValueAt(i,2).toString());

        input_address.setText(model.getValueAt(i,3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JLabel btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JTextField input_address;
    private javax.swing.JTextField input_id;
    private javax.swing.JTextField input_name;
    private javax.swing.JTextField input_phone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
