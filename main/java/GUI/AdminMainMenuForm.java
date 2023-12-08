package GUI;

import Classes.LogTime;
import Classes.MainClass;

import javax.swing.*;
import java.io.PrintWriter;

import static Classes.MainClass.vasf;
import static Classes.MainClass.varf;

public class AdminMainMenuForm extends javax.swing.JFrame {

    public AdminMainMenuForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        viewRoomBtn = new javax.swing.JButton();
        hostel_applicationBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        vewTrainerBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        manageRoomBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        viewRoomBtn.setBackground(new java.awt.Color(0, 102, 102));
        viewRoomBtn.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        viewRoomBtn.setText("View Room");
        viewRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRoomBtnActionPerformed(evt);
            }
        });

        hostel_applicationBtn.setBackground(new java.awt.Color(0, 102, 102));
        hostel_applicationBtn.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        hostel_applicationBtn.setText("Manage Application");
        hostel_applicationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostel_applicationBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(0, 102, 102));
        logoutBtn.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        vewTrainerBtn.setBackground(new java.awt.Color(0, 102, 102));
        vewTrainerBtn.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        vewTrainerBtn.setText("View Students");
        vewTrainerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vewTrainerBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Admin Main Menu");

        manageRoomBtn.setBackground(new java.awt.Color(0, 102, 102));
        manageRoomBtn.setFont(new java.awt.Font("SansSerif", 2, 14)); // NOI18N
        manageRoomBtn.setText("Manage Room");
        manageRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hostel_applicationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(manageRoomBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vewTrainerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(viewRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewRoomBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hostel_applicationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(vewTrainerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRoomBtnActionPerformed
        this.dispose();
        new ViewAllRoomsForm().setVisible(true);
    }//GEN-LAST:event_viewRoomBtnActionPerformed

    private void manageRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomBtnActionPerformed
        this.dispose();
        new ManageRoomForm().setVisible(true);
    }//GEN-LAST:event_manageRoomBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        LogTime log = new LogTime(MainClass.admin_Login.getUsername());
        MainClass.userLogs.add(log.logOut());
        try{
            PrintWriter pLogin = new PrintWriter("src/main/java/Database/logs.txt");
            for(int i = 0; i < MainClass.userLogs.size(); i++){
                String loginTime = MainClass.userLogs.get(i);
                pLogin.println(loginTime);
                pLogin.println();
            }
            pLogin.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Logout Time error!");
        }
        MainClass.adminMenu.setVisible(false);
        MainClass.login.setVisible(true);
        MainClass.admin_Login = null;
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void vewTrainerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vewTrainerBtnActionPerformed
        this.dispose();
        vasf.setVisible(true);
    }//GEN-LAST:event_vewTrainerBtnActionPerformed

    private void hostel_applicationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostel_applicationBtnActionPerformed
        this.dispose();
        new ManageApplicationForm().setVisible(true);
    }//GEN-LAST:event_hostel_applicationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hostel_applicationBtn;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton manageRoomBtn;
    private javax.swing.JButton vewTrainerBtn;
    private javax.swing.JButton viewRoomBtn;
    // End of variables declaration//GEN-END:variables
}
