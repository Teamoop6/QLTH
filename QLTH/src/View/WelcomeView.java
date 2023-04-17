/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.WelcomeController;

/**
 *
 * @author dell
 */
public class WelcomeView extends javax.swing.JFrame {

    /**
     * Creates new form welcome
     */
    
    private WelcomeController wc ;
    public WelcomeView(WelcomeController wc) {
        this.wc = wc ;
        initComponents();
        this.setVisible(true);
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
        bt_ts = new javax.swing.JButton();
        bt_teacher = new javax.swing.JButton();
        button_logout = new javax.swing.JLabel();
        bt_st = new javax.swing.JButton();
        bt_book = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Menu Page");

        bt_ts.setText("STUDENT TRANSCRIPT'S MODULE");
        bt_ts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tsActionPerformed(evt);
            }
        });

        bt_teacher.setText("TEACHER'S MODULE");
        bt_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_teacherActionPerformed(evt);
            }
        });

        button_logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        button_logout.setForeground(new java.awt.Color(255, 0, 0));
        button_logout.setText("LOGOUT");
        button_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_logoutMouseClicked(evt);
            }
        });

        bt_st.setText("STUDENT'S MODULE");
        bt_st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_stActionPerformed(evt);
            }
        });

        bt_book.setText("BOOK'S MODULE");
        bt_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_bookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button_logout)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_st, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_ts)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_teacher)
                        .addGap(37, 37, 37)))
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(button_logout)
                .addGap(1, 1, 1)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_teacher, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_st, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_ts, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_book, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_bookActionPerformed
        // TODO add your handling code here:
        wc.BookModuleSubmit();
        dispose();
    }//GEN-LAST:event_bt_bookActionPerformed

    private void bt_tsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tsActionPerformed
        // TODO add your handling code here:
        wc.BangDiemModuleSubmit();
        dispose();
    }//GEN-LAST:event_bt_tsActionPerformed

    private void bt_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_teacherActionPerformed
        // TODO add your handling code here:
         wc.TeacherModuleSubmit();
        dispose();
    }//GEN-LAST:event_bt_teacherActionPerformed

    private void button_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_logoutMouseClicked
        // TODO add your handling code here:
        wc.logOut();
        // thoat chuong trinh dang hien
        dispose();
    }//GEN-LAST:event_button_logoutMouseClicked

    // hiển thị giao diện student module
    private void bt_stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_stActionPerformed
        // TODO add your handling code here:
        wc.StudentModuleSubmit();
        dispose();
    }//GEN-LAST:event_bt_stActionPerformed
     
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_book;
    private javax.swing.JButton bt_st;
    private javax.swing.JButton bt_teacher;
    private javax.swing.JButton bt_ts;
    private javax.swing.JLabel button_logout;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
