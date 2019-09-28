package ems;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghana
 */
public class SaveToFile extends javax.swing.JFrame {
    static MyHashTable hashTable;
    private String saveLocation = "C:/Users/ghana/Documents/NetBeansProjects/JavaApplication1/src/ems";

    /**
     * Creates new form SaveToFile
     * @param hashTable
     */
    public SaveToFile(MyHashTable hashTable) {
        this.hashTable = hashTable;
        initComponents();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileNameBox = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("What Would You Like The File Name To Be?");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(fileNameBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        BufferedWriter bw = null;       
        //FileWriter fw = null;
        PTEmployee tempEmployee = null;
        FTEmployee tempFTEmployee = null;
        String separator = "^";
        String data = "";
        try{
            File file = new File("C:/Users/ghana/Documents/" + fileNameBox.getText() + ".txt");       //save location
            
            /*if(!file.exists()){
               file.createNewFile();
           }*/
            FileWriter fw = new FileWriter(file);       //create filewriter
            bw = new BufferedWriter(fw);                //create bufferedwriter
            
//            System.out.println(hashTable);
//            System.out.println(hashTable.buckets);
//            System.out.println(hashTable.buckets.length);
            //bw.write("DO NOT MODIFY");
            for (int i = 0; i < hashTable.buckets.length; i++){ //go through the buckets
                if(hashTable.buckets[i] == null){
                     continue;   
                        }
                for(int j = 0; j < hashTable.buckets[i].size(); j++){   //go through the arryas within the buckets
                    if(hashTable.buckets[i].get(j) == null){
                        continue;
                    }
                    if(hashTable.buckets[i].get(j) instanceof PTEmployee){     //write the attributes of PTE
                       
                        tempEmployee = (PTEmployee)hashTable.buckets[i].get(j);
                        data = tempEmployee.getEmployeeNumber() + separator + 
                              tempEmployee.getFirstName() + separator + 
                              tempEmployee.getLastName() + separator + 
                              tempEmployee.getGender() + separator + 
                              tempEmployee.getDeductRate() + separator + 
                              tempEmployee.getWorkLocation() + separator + 
                              tempEmployee.getHourlyWage() +  separator + 
                              tempEmployee.getHoursPerWeek() + separator + 
                              tempEmployee.getWeeksPerYear() + "\r\n";
                        bw.write(data);      //write the data onto the file
                        
                   }
                    if(hashTable.buckets[i].get(j) instanceof FTEmployee){ //write the attributes of FTE
                        
                        tempFTEmployee = (FTEmployee)hashTable.buckets[i].get(j);
                        data = tempFTEmployee.getEmployeeNumber() + separator + 
                              tempFTEmployee.getFirstName() + separator + 
                              tempFTEmployee.getLastName() + separator + 
                              tempFTEmployee.getGender() + separator + 
                              tempFTEmployee.getDeductRate() + separator + 
                              tempFTEmployee.getWorkLocation() + separator + 
                              tempFTEmployee.getSalary()+ "\r\n";
                        bw.write(data);      //write the data onto the file
                        
                   }

               }
           }
                            
                                   
                   bw.write("END");

                   SuccessfullySaved message = new SuccessfullySaved();
                   message.setVisible(true);
                   message.setDefaultCloseOperation(SuccessfullySaved.DISPOSE_ON_CLOSE);
           
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        finally{
            try{
                if(bw != null){
                    bw.close();
                }
                
                /*if(fw != null){
                  fw.close();
                }*/
            }
            catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }//GEN-LAST:event_jButton1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SaveToFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaveToFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaveToFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaveToFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaveToFile(hashTable).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane fileNameBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}