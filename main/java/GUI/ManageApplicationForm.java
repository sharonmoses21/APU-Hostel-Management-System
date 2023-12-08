package GUI;

import Classes.Application;
import Classes.MainClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.Scanner;

import static Classes.MainClass.*;
import Classes.Room;
import Classes.Student;

public class ManageApplicationForm extends javax.swing.JFrame {


    public ManageApplicationForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private static Scanner x;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        backBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        appIdTxt = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        applicationUpdateBtn = new javax.swing.JButton();
        roomIdTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        approvalCombo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        appIdSearchBtn = new javax.swing.JButton();
        stuIdTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        backBtn1.setBackground(new java.awt.Color(0, 102, 102));
        backBtn1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        backBtn1.setText("Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Application ID:");

        jLabel2.setText("Student ID");

        resetBtn.setBackground(new java.awt.Color(0, 102, 102));
        resetBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        applicationUpdateBtn.setBackground(new java.awt.Color(0, 102, 102));
        applicationUpdateBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        applicationUpdateBtn.setText("Update ");
        applicationUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationUpdateBtnActionPerformed(evt);
            }
        });

        roomIdTxt.setEditable(false);

        jLabel8.setText("Room Number");

        jLabel3.setText("Approval");

        approvalCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Approve", "Reject", "Pending"}));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Manage Hostel Applications");

        appIdSearchBtn.setBackground(new java.awt.Color(0, 102, 102));
        appIdSearchBtn.setText("Search");
        appIdSearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appIdSearchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 47, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addComponent(applicationUpdateBtn)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(backBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(jLabel1)
                                                        .addGap(34, 34, 34)
                                                        .addComponent(appIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(appIdSearchBtn)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel8)
                                                                .addGap(34, 34, 34)
                                                                .addComponent(roomIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(approvalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(stuIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(92, 92, 92)))
                                .addGap(71, 71, 71))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel4)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(appIdSearchBtn)
                                        .addComponent(appIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(stuIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(approvalCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(roomIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backBtn1)
                                        .addComponent(resetBtn)
                                        .addComponent(applicationUpdateBtn))
                                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appIdSearchBtnActionPerformed(ActionEvent evt) {
        String appId = appIdTxt.getText();
        for (int i = 0; i < application.size(); i++) {
            Application lc = application.get(i);
            if (lc.getApplicationId().equals(appId)) {
                application_info = lc;
                break;
            }
        }
        if (application_info != null) {
            try {
                stuIdTxt.setEditable(false);
                roomIdTxt.setEditable(false);
                stuIdTxt.setText(application_info.getStudentId());
                approvalCombo.setSelectedItem(application_info.getIsApproved());
                roomIdTxt.setText(application_info.getRoomNumber());
                application_info = null;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Application cannot be found!");
                application_info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Application Number is invalid, please enter again!");
            application_info = null;
        }
    }

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        this.dispose();
        adminMenu.setVisible(true);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        appIdTxt.setText(null);
        stuIdTxt.setFocusable(true);
        roomIdTxt.setText(null);
        approvalCombo.setSelectedIndex(-1);
    }//GEN-LAST:event_resetBtnActionPerformed

    private void applicationUpdateBtnActionPerformed(ActionEvent evt) {//GEN-FIRST:event_applicationUpdateBtnActionPerformed
        String studId = stuIdTxt.getText();
        String roomId = roomIdTxt.getText();
        for (int i = 0; i < application.size(); i++) {
            Application ac = application.get(i);
            for (int x = 0; x < student.size(); x++) {
                Student ac1 = student.get(x);
                for (int y = 0; y < room.size(); y++) {
                    Room ac2 = room.get(y);
                    if (studId.equals(ac1.getStudentId()) && roomId.equals(ac2.getRoomNumber())) {
                        application_info = ac;
                        student_info = ac1;
                        room_info = ac2;
                        break;
                    }
                }
            }


            if (application_info != null) {
                try {
                    if (appIdTxt.getText() != null) {
                        application_info.setApplicationId(appIdTxt.getText());
                    }
                    if (stuIdTxt.getText() != null) {
                        application_info.setStudentId(stuIdTxt.getText());
                    }
                    if (approvalCombo.getSelectedItem() != null) {
                        application_info.setIsApproved((String) approvalCombo.getSelectedItem());
                    }
                    if (roomIdTxt.getText() != null) {
                        application_info.setRoomNumber(roomIdTxt.getText());
                    }

                    String tempFile = "src/main/java/Database/applicationTemp1.txt";
                    File oldFile = new File("src/main/java/Database/application.txt");
                    File newFile = new File(tempFile);
                    try {
                        FileWriter fw = new FileWriter(tempFile, true);
                        PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
                        x = new Scanner(new File("src/main/java/Database/application.txt"));

                        while (x.hasNextLine()) {
                            String app_Id = x.nextLine();
                            String stu_id = x.nextLine();
                            String approval = x.nextLine();
                            String room_no = x.nextLine();
                            x.nextLine();

                            if (app_Id.equals(application_info.getApplicationId())) {
                                pw.println(app_Id);
                                pw.println(application_info.getStudentId());
                                pw.println(application_info.getIsApproved());
                                pw.println(application_info.getRoomNumber());
                                pw.println();
                            } else {
                                pw.println(app_Id);
                                pw.println(stu_id);
                                pw.println(approval);
                                pw.println(room_no);
                                pw.println();
                            }
                        }
                        x.close();
                        pw.flush();
                        pw.close();
                        oldFile.delete();
                        File dump = new File("src/main/java/Database/application.txt");
                        newFile.renameTo(dump);

                        if (approvalCombo.getSelectedItem().toString().equals("Approve")) {
                            if (room_info != null) {
                                try {
                                    room_info.setIsAvailable("No");
                                    String tempFile2 = "src/main/java/Database/roomTemp1.txt";

                                    File oldFile2 = new File("src/main/java/Database/room.txt");
                                    File newFile2 = new File(tempFile2);
                                    try {
                                        FileWriter fw2 = new FileWriter(tempFile2, true);
                                        PrintWriter pw2 = new PrintWriter(new BufferedWriter(fw2));
                                        Scanner x = new Scanner(new File(
                                                "src/main/java/Database/room.txt"));

                                        while (x.hasNextLine()) {
                                            String room_Id = x.nextLine();
                                            String room_type = x.nextLine();
                                            String room_price = x.nextLine();
                                            String room_availability = x.nextLine();
                                            x.nextLine();

                                            if (room_Id.equals(room_info.getRoomNumber())) {
                                                pw2.println(room_Id);
                                                pw2.println(room_info.getType());
                                                pw2.println(room_info.getPrice());
                                                pw2.println(room_info.getIsIsAvailable());
                                                pw2.println();
                                            } else {
                                                pw2.println(room_Id);
                                                pw2.println(room_type);
                                                pw2.println(room_price);
                                                pw2.println(room_availability);
                                                pw2.println();
                                            }
                                        }
                                        x.close();
                                        pw2.flush();
                                        pw2.close();
                                        oldFile2.delete();
                                        File dump2 = new File("src/main/java/Database/room.txt");
                                        newFile2.renameTo(dump2);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            if (student_info != null) {
                                try {
                                    student_info.setStatus("Approved");
                                    String tempFile3 = "src/main/java/Database/stuTemp1.txt";

                                    File oldFile3 = new File("src/main/java/Database/student.txt");
                                    File newFile3 = new File(tempFile3);
                                    try {
                                        FileWriter fw3 = new FileWriter(tempFile3, true);
                                        PrintWriter pw3 = new PrintWriter(new BufferedWriter(fw3));
                                        Scanner x = new Scanner(new File(
                                                "src/main/java/Database/student.txt"));

                                        while (x.hasNextLine()) {
                                            String stu_Id = x.nextLine();
                                            String stu_Name = x.nextLine();
                                            String stu_Username = x.nextLine();
                                            String stuPassword = x.nextLine();
                                            String stuEmail = x.nextLine();
                                            String stuGender = x.nextLine();
                                            String stuRoomNumber = x.nextLine();
                                            String stuStatus = x.nextLine();
                                            String stuPayment = x.nextLine();
                                            x.nextLine();

                                            if (stu_Id.equals(student_info.getStudentId())) {
                                                pw3.println(stu_Id);
                                                pw3.println(student_info.getnName());
                                                pw3.println(student_info.getUsername());
                                                pw3.println(student_info.getPassword());
                                                pw3.println(student_info.getEmail());
                                                pw3.println(student_info.getGender());
                                                pw3.println(roomId);
                                                pw3.println(student_info.getStatus());
                                                pw3.println(student_info.getPaymentStatus());
                                                pw3.println();
                                            } else {
                                                pw3.println(stu_Id);
                                                pw3.println(stu_Name);
                                                pw3.println(stu_Username);
                                                pw3.println(stuPassword);
                                                pw3.println(stuEmail);
                                                pw3.println(stuGender);
                                                pw3.println(stuRoomNumber);
                                                pw3.println(stuStatus);
                                                pw3.println(stuPayment);
                                                pw3.println();
                                            }
                                        }
                                        x.close();
                                        pw3.flush();
                                        pw3.close();
                                        oldFile3.delete();
                                        File dump3 = new File("src/main/java/Database/student.txt");
                                        newFile3.renameTo(dump3);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        } else if(approvalCombo.getSelectedItem().toString().equals("Reject")) {
                            if (room_info != null) {
                                try {
                                    room_info.setIsAvailable("Yes");
                                    String tempFile2 = "src/main/java/Database/roomTemp1.txt";

                                    File oldFile2 = new File("src/main/java/Database/room.txt");
                                    File newFile2 = new File(tempFile2);
                                    try {
                                        FileWriter fw2 = new FileWriter(tempFile2, true);
                                        PrintWriter pw2 = new PrintWriter(new BufferedWriter(fw2));
                                        Scanner x = new Scanner(new File(
                                                "src/main/java/Database/room.txt"));

                                        while (x.hasNextLine()) {
                                            String room_Id = x.nextLine();
                                            String room_type = x.nextLine();
                                            String room_price = x.nextLine();
                                            String room_availability = x.nextLine();
                                            x.nextLine();

                                            if (room_Id.equals(room_info.getRoomNumber())) {
                                                pw2.println(room_Id);
                                                pw2.println(room_info.getType());
                                                pw2.println(room_info.getPrice());
                                                pw2.println(room_info.getIsIsAvailable());
                                                pw2.println();
                                            } else {
                                                pw2.println(room_Id);
                                                pw2.println(room_type);
                                                pw2.println(room_price);
                                                pw2.println(room_availability);
                                                pw2.println();
                                            }
                                        }
                                        x.close();
                                        pw2.flush();
                                        pw2.close();
                                        oldFile2.delete();
                                        File dump2 = new File("src/main/java/Database/room.txt");
                                        newFile2.renameTo(dump2);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                            if (student_info != null) {
                                try {
                                    student_info.setStatus("Rejected");
                                    String tempFile3 = "src/main/java/Database/stuTemp1.txt";

                                    File oldFile3 = new File("src/main/java/Database/student.txt");
                                    File newFile3 = new File(tempFile3);
                                    try {
                                        FileWriter fw3 = new FileWriter(tempFile3, true);
                                        PrintWriter pw3 = new PrintWriter(new BufferedWriter(fw3));
                                        Scanner x = new Scanner(new File(
                                                "src/main/java/Database/student.txt"));

                                        while (x.hasNextLine()) {
                                            String stu_Id = x.nextLine();
                                            String stu_Name = x.nextLine();
                                            String stu_Username = x.nextLine();
                                            String stuPassword = x.nextLine();
                                            String stuEmail = x.nextLine();
                                            String stuGender = x.nextLine();
                                            String stuRoomNumber = x.nextLine();
                                            String stuStatus = x.nextLine();
                                            String stuPayment = x.nextLine();
                                            x.nextLine();

                                            if (stu_Id.equals(student_info.getStudentId())) {
                                                pw3.println(stu_Id);
                                                pw3.println(student_info.getnName());
                                                pw3.println(student_info.getUsername());
                                                pw3.println(student_info.getPassword());
                                                pw3.println(student_info.getEmail());
                                                pw3.println(student_info.getGender());
                                                pw3.println(student_info.getRoomNumber());
                                                pw3.println(student_info.getStatus());
                                                pw3.println(student_info.getPaymentStatus());
                                                pw3.println();
                                            } else {
                                                pw3.println(stu_Id);
                                                pw3.println(stu_Name);
                                                pw3.println(stu_Username);
                                                pw3.println(stuPassword);
                                                pw3.println(stuEmail);
                                                pw3.println(stuGender);
                                                pw3.println(stuRoomNumber);
                                                pw3.println(stuStatus);
                                                pw3.println(stuPayment);
                                                pw3.println();
                                            }
                                        }
                                        x.close();
                                        pw3.flush();
                                        pw3.close();
                                        oldFile3.delete();
                                        File dump3 = new File("src/main/java/Database/student.txt");
                                        newFile3.renameTo(dump3);
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Application updated!");
                    application_info = null;

                } catch (HeadlessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        // Variables declaration - do not modify
        javax.swing.JButton appIdSearchBtn;
        private javax.swing.JTextField appIdTxt;
        private javax.swing.JButton applicationUpdateBtn;
        private javax.swing.JComboBox<String> approvalCombo;
        private javax.swing.JButton backBtn1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JButton resetBtn;
        private javax.swing.JTextField roomIdTxt;
        private javax.swing.JTextField stuIdTxt;
        // End of variables declaration
}
