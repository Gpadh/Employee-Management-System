/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author ghana
 */
public class Loading extends javax.swing.JFrame {
    static MyHashTable hashTable;

    /**
     * Creates new form Loading
     */
    public Loading(MyHashTable hashTable) {
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

        loadFileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loadFileText = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loadFileButton.setText("Load");
        loadFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loadFileButtonMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("What File Would You Like To Load?");

        jScrollPane1.setViewportView(loadFileText);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loadFileButton)
                .addGap(88, 88, 88))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadFileButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadFileButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadFileButtonMousePressed
        // TODO add your handling code here:
        BufferedReader read;
        
        try{
            
            read = new BufferedReader(new FileReader(new File("C:/Users/ghana/Documents/" + loadFileText.getText() + ".txt")));    //create bufferedreader
            String line;
            while(!"END".equals(line = read.readLine())){  //while the line exists, keep reading

                String[] var = line.split("\\^");
                
                if(var.length == 9){
                    int empNumber = parseInt(var[0]);
                    String firstName = var[1];
                    String lastName = var[2];
                    String gender = var[3];
                    String wLocation = var[4];
                    double deductRate = parseDouble(var[5]);
                    double hourlyWage = parseDouble(var[6]);
                    int hoursPerWeek = parseInt(var[7]);
                    int weeksPerYear = parseInt(var[8]);
                    PTEmployee tempPTEmployee = new PTEmployee(empNumber, firstName, lastName, gender,  wLocation, deductRate, hourlyWage, hoursPerWeek, weeksPerYear);
                    this.hashTable.addToTable(tempPTEmployee); //add PTE
                    
                }
                if(var.length == 7){
                    int empNumber = parseInt(var[0]);
                    String firstName = var[1];
                    String lastName = var[2];
                    String gender = var[3];
                    String wLocation = var[4];
                    double deductRate = parseDouble(var[5]);
                    double annualSalary = parseDouble(var[6]);
                    FTEmployee tempFTEmployee = new FTEmployee(empNumber, firstName, lastName, gender, wLocation, deductRate, annualSalary);
                    this.hashTable.addToTable(tempFTEmployee);  //add FTE
                }
                //line = reader.readLine();
            }
            SuccessfullyLoaded message = new SuccessfullyLoaded();
            message.setVisible(true);
            message.setDefaultCloseOperation(SuccessfullySaved.DISPOSE_ON_CLOSE);
            read.close();
        }
        catch (IOException e){
        }
    
    }//GEN-LAST:event_loadFileButtonMousePressed

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading(hashTable).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadFileButton;
    private javax.swing.JTextPane loadFileText;
    // End of variables declaration//GEN-END:variables
}
