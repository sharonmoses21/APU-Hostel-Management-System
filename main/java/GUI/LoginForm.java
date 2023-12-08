package GUI;

import Classes.LogTime;
import Classes.MainClass;
import Classes.Admin;
import Classes.Student;

import javax.swing.*;
import java.io.PrintWriter;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        adminLoginBtn = new javax.swing.JButton();
        passwordTxt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        studentLoginBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        showPasswordCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText(" User Login");

        usernameTxt.setBackground(java.awt.Color.lightGray);
        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });

        adminLoginBtn.setBackground(new java.awt.Color(0, 102, 102));
        adminLoginBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        adminLoginBtn.setText("Login as Admin");
        adminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBtnActionPerformed(evt);
            }
        });

        passwordTxt.setBackground(java.awt.Color.lightGray);
        passwordTxt.setToolTipText("");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("AppleMyungjo", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("APU Hostel Centre Management ");

        studentLoginBtn.setBackground(new java.awt.Color(0, 102, 102));
        studentLoginBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        studentLoginBtn.setText("Login as Student");
        studentLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(0, 102, 102));
        resetBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        showPasswordCheckBox.setText("Show Password");
        showPasswordCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(adminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(studentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(passwordTxt)
                            .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showPasswordCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(116, 116, 116))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPasswordCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

    private void adminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBtnActionPerformed
        String adminID = usernameTxt.getText();
        for(int i = 0; i < MainClass.admin.size(); i++){
            Admin ac = MainClass.admin.get(i);
            if(ac.getUsername().equals(adminID)){
                MainClass.admin_Login = ac;
                break;
            }
        }
        if(MainClass.admin_Login != null){
            String adminPassword = passwordTxt.getText();
            if(adminPassword.equals(MainClass.admin_Login.getPassword())){
                LogTime log = new LogTime(MainClass.admin_Login.getUsername());
                MainClass.userLogs.add(log.logIn());
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
                    JOptionPane.showMessageDialog(null,"Login Time error!");
                }
                this.setVisible(false);
                MainClass.adminMenu.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Password!");
                MainClass.admin_Login = null;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Admin not found!");
        }
    }//GEN-LAST:event_adminLoginBtnActionPerformed

    private void studentLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginBtnActionPerformed
        String studentID = usernameTxt.getText();
        for(int i = 0; i < MainClass.student.size(); i++){
            Student ac = MainClass.student.get(i);
            if(ac.getUsername().equals(studentID)){
                MainClass.student_Login = ac;
                break;
            }
        }
        if(MainClass.student_Login != null){
            String adminPassword = passwordTxt.getText();
            if(adminPassword.equals(MainClass.student_Login.getPassword())){
                LogTime log = new LogTime(MainClass.student_Login.getUsername());
                MainClass.userLogs.add(log.logIn());
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
                    JOptionPane.showMessageDialog(null,"Login Time error!");
                }
                MainClass.login.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong Password!");
                MainClass.student_Login = null;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Student not found!");
        }
    }//GEN-LAST:event_studentLoginBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        usernameTxt.setText(null);
        passwordTxt.setText(null);
        usernameTxt.setFocusable(true);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void showPasswordCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordCheckBoxActionPerformed
        if (showPasswordCheckBox.isSelected()) {
            passwordTxt.setEchoChar((char) 0);
        } else {
            passwordTxt.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_showPasswordCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JCheckBox showPasswordCheckBox;
    private javax.swing.JButton studentLoginBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}