package GUI;


import javax.swing.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

import static Classes.MainClass.*;
import Classes.Room;

public class ManageRoomForm extends javax.swing.JFrame {

    public ManageRoomForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private static Scanner x;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        searchRoomTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        typeTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        roomIDText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        availabilityCombo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        searchRoomTxt.setToolTipText("ROOM000");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Type");

        jLabel6.setText("Room ID");

        jLabel7.setText("Price");

        jLabel8.setText("Availability");

        resetBtn.setBackground(new java.awt.Color(0, 102, 102));
        resetBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 102, 102));
        backBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(0, 102, 102));
        addBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 102, 102));
        updateBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        deleteBtn.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Manage Room Information");

        availabilityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resetBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backBtn)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(priceTxt)
                                    .addComponent(availabilityCombo, 0, 177, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(roomIDText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(searchRoomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchBtn)))
                        .addGap(113, 113, 113))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchRoomTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomIDText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(typeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(availabilityCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn)
                    .addComponent(resetBtn)
                    .addComponent(backBtn))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String roomId = searchRoomTxt.getText();
        for (int i = 0; i < room.size(); i++) {
            Room lc = room.get(i);
            if (lc.getRoomNumber().equals(roomId)) {
                room_info = lc;
                break;
            }
        }
        if (room_info != null) {
            try {
                roomIDText.setEditable(false);
                roomIDText.setText(room_info.getRoomNumber());
                typeTxt.setText(room_info.getType());
                priceTxt.setText(room_info.getPrice());
                availabilityCombo.setSelectedItem(room_info.getIsIsAvailable().toString());
                room_info = null;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error, Room cannot be found!");
                room_info = null;
            }
        } else {
            JOptionPane.showMessageDialog(this, "Room Number is invalid, please enter again!");
            room_info = null;
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        removeText();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        this.dispose();
        adminMenu.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String roomId = roomIDText.getText();
        for (int i = 0; i < room.size(); i++) {
            Room lc = room.get(i);
            if (lc.getRoomNumber().equals(roomId)) {
                room_info = lc;
                break;
            }
        }

        if (room_info == null) {
            String room_type = typeTxt.getText();
            String room_price = priceTxt.getText();
            String room_availability = availabilityCombo.getSelectedItem().toString();

            Room ac = new Room(roomId, room_type, room_price, room_availability);
            room.add(ac);

            try {
                try (PrintWriter pRoom = new PrintWriter(
                    "src/main/java/Database/room.txt")) {
                room.forEach(c -> {
                    pRoom.println(c.getRoomNumber());
                    pRoom.println(c.getType());
                    pRoom.println(c.getPrice());
                    pRoom.println(c.getIsIsAvailable());
                    pRoom.println();
                });
            }
            JOptionPane.showMessageDialog(this, "Room successfully added!");
            removeText();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error, Room cannot be added!");
        }
        } else {
            JOptionPane.showMessageDialog(this, "Room ID is repeated, please enter again!");
            room_info = null;
            roomIDText.setText(null);
            roomIDText.requestFocus();
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void removeText(){
        roomIDText.setEditable(true);
        searchRoomTxt.setText(null);
        priceTxt.setText(null);
        roomIDText.setText(null);
        availabilityCombo.setSelectedIndex(0);
        typeTxt.setText(null);
        roomIDText.setFocusable(true);
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String roomId = roomIDText.getText();
        for (int i = 0; i < room.size(); i++) {
            Room lc = room.get(i);
            if (lc.getRoomNumber().equals(roomId)) {
                room_info = lc;
                break;
            }
        }

        if (room_info != null) {
            try {
                roomIDText.setEditable(false);

                if (typeTxt.getText() != null) {
                    room_info.setType(typeTxt.getText());
                }
                if (priceTxt.getText() != null) {
                    room_info.setPrice(priceTxt.getText());
                }
                if (availabilityCombo.getSelectedItem().toString() != null) {
                    room_info.setIsAvailable(availabilityCombo.getSelectedItem().toString());
                }

                String tempFile = "src/main/java/Database/trainerTemp1.txt";

                File oldFile = new File("src/main/java/Database/room.txt");
                File newFile = new File(tempFile);
                try {
                    FileWriter fw = new FileWriter(tempFile, true);
                    PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
                    Scanner x = new Scanner(new File(
                        "src/main/java/Database/room.txt"));

                while (x.hasNextLine()) {
                    String room_Id = x.nextLine();
                    String room_type = x.nextLine();
                    String room_price = x.nextLine();
                    String room_availability = x.nextLine();
                    x.nextLine();

                    if (room_Id.equals(room_info.getRoomNumber())) {
                        pw.println(room_Id);
                        pw.println(room_info.getType());
                        pw.println(room_info.getPrice());
                        pw.println(room_info.getIsIsAvailable());
                        pw.println();
                    } else {
                        pw.println(room_Id);
                        pw.println(room_type);
                        pw.println(room_price);
                        pw.println(room_availability);
                        pw.println();
                    }
                }
                x.close();
                pw.flush();
                pw.close();
                oldFile.delete();
                File dump = new File("src/main/java/Database/room.txt");
                newFile.renameTo(dump);

                JOptionPane.showMessageDialog(this, "Room Details successfully updated!");
                room_info = null;
                removeText();

            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error, Room Details cannot be updated!");
                room_info = null;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error, Room Details cannot be updated!");
            room_info = null;
        }
        } else {
            JOptionPane.showMessageDialog(this, "Room ID is invalid, please enter again!");
            room_info = null;
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        String roomId = roomIDText.getText();
        for(int i = 0; i < room.size(); i++){
            Room ac = room.get(i);
            if(ac.getRoomNumber().equals(roomId)){
                room_info = ac;
                room.remove(ac);
                break;
            }
        }

        if(room_info != null){
            try{
                roomIDText.setEditable(false);
                String tempFile = "src/main/java/Database/trainerTemp2.txt";
                File oldFile = new File("src/main/java/Database/room.txt");
                File newFile = new File(tempFile);

                try{
                    FileWriter fw = new FileWriter(tempFile,true);
                    PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
                    x = new Scanner(new File("src/main/java/Database/room.txt"));

                    while(x.hasNextLine()){
                        String room_ID = x.nextLine();
                        String room_type = x.nextLine();
                        String room_price = x.nextLine();
                        String room_availability = x.nextLine();
                        x.nextLine();

                        if(!room_ID.equals(room_info.getRoomNumber())){
                            pw.println(room_ID);
                            pw.println(room_type);
                            pw.println(room_price);
                            pw.println(room_availability);
                            pw.println();
                        }
                    }
                    x.close();
                    pw.flush();
                    pw.close();
                    oldFile.delete();
                    File dump = new File("src/main/java/Database/room.txt");
                    newFile.renameTo(dump);

                    JOptionPane.showMessageDialog(null, "Room deleted successfully!");
                    room_info = null;
                    removeText();
                }
                catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error, Room cannot be deleted!");
                    room_info = null;
                }
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error, Room cannot be deleted!");
                room_info = null;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Room Not Found!");
            roomIDText.setText("");
            roomIDText.requestFocus();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JComboBox<String> availabilityCombo;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField roomIDText;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchRoomTxt;
    private javax.swing.JTextField typeTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
