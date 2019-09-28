/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ems;

/**
 *
 * @author 559544
 */
public class Continued extends javax.swing.JFrame {
    static MyHashTable hashTable;

    /**
     * Creates new form Continue
     */
    public Continued() {
        hashTable = new MyHashTable(12);
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

        jColorChooser1 = new javax.swing.JColorChooser();
        chooseAnActionTitle = new javax.swing.JTextField();
        removeEmployeeButton = new javax.swing.JButton();
        searchEmployeeButton = new javax.swing.JButton();
        editEmployeeButton = new javax.swing.JButton();
        addEmployeeButton = new javax.swing.JButton();
        listEmployeesButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        loadToFileButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chooseAnActionTitle.setFont(new java.awt.Font("Mongolian Baiti", 0, 24)); // NOI18N
        chooseAnActionTitle.setText("Choose An Action");
        chooseAnActionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseAnActionTitleActionPerformed(evt);
            }
        });

        removeEmployeeButton.setText("Remove Employee");
        removeEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                removeEmployeeButtonMousePressed(evt);
            }
        });

        searchEmployeeButton.setText("Search Employee");
        searchEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                searchEmployeeButtonMousePressed(evt);
            }
        });
        searchEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeButtonActionPerformed(evt);
            }
        });

        editEmployeeButton.setText("Edit Employee");
        editEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                editEmployeeButtonMousePressed(evt);
            }
        });

        addEmployeeButton.setText("Add Employee");
        addEmployeeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addEmployeeButtonMousePressed(evt);
            }
        });
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        listEmployeesButton.setText("List All Employees");
        listEmployeesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listEmployeesButtonMousePressed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                helpButtonMousePressed(evt);
            }
        });

        saveButton.setText("Save To File");
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveButtonMousePressed(evt);
            }
        });
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadToFileButton.setText("Load To File");
        loadToFileButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loadToFileButtonMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(chooseAnActionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listEmployeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(loadToFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(editEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chooseAnActionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listEmployeesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadToFileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseAnActionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseAnActionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseAnActionTitleActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void addEmployeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addEmployeeButtonMousePressed
        // TODO add your handling code here:
        AddEmployee addEmp = new AddEmployee(hashTable);
        addEmp.setVisible(true);
        addEmp.setDefaultCloseOperation(AddEmployee.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addEmployeeButtonMousePressed

    private void removeEmployeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeEmployeeButtonMousePressed
        // TODO add your handling code here:
        RemoveEmployee removeEmp = new RemoveEmployee(hashTable);
        removeEmp.setVisible(true);
        removeEmp.setDefaultCloseOperation(RemoveEmployee.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_removeEmployeeButtonMousePressed

    private void searchEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchEmployeeButtonActionPerformed

    private void searchEmployeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchEmployeeButtonMousePressed
        // TODO add your handling code here:
        SearchEmployee searchEmp = new SearchEmployee(hashTable);
        searchEmp.setVisible(true);
        searchEmp.setDefaultCloseOperation(SearchEmployee.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_searchEmployeeButtonMousePressed

    private void editEmployeeButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editEmployeeButtonMousePressed
        // TODO add your handling code here:
        EditEmployee editEmp = new EditEmployee(hashTable);
        editEmp.setVisible(true);
        editEmp.setDefaultCloseOperation(EditEmployee.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_editEmployeeButtonMousePressed

    private void listEmployeesButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listEmployeesButtonMousePressed
        // TODO add your handling code here:
        ListAllEmployees allEmp = new ListAllEmployees(hashTable);
        allEmp.setVisible(true);
        allEmp.setDefaultCloseOperation(ListAllEmployees.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_listEmployeesButtonMousePressed

    private void helpButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMousePressed
        // TODO add your handling code here:
        Help helpEmp = new Help();
        helpEmp.setVisible(true);
        helpEmp.setDefaultCloseOperation(Help.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_helpButtonMousePressed

    private void saveButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMousePressed
        // TODO add your handling code here:
        SaveToFile saveFile = new SaveToFile(hashTable);
        saveFile.setVisible(true);
        saveFile.setDefaultCloseOperation(Help.DISPOSE_ON_CLOSE);
        
        
        
    }//GEN-LAST:event_saveButtonMousePressed

    private void loadToFileButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadToFileButtonMousePressed
        // TODO add your handling code here:
        Loading loadToFile = new Loading(hashTable);
        loadToFile.setVisible(true);
        loadToFile.setDefaultCloseOperation(Help.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_loadToFileButtonMousePressed

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
            java.util.logging.Logger.getLogger(Continued.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Continued.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Continued.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Continued.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Continued().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JTextField chooseAnActionTitle;
    private javax.swing.JButton editEmployeeButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JButton listEmployeesButton;
    private javax.swing.JButton loadToFileButton;
    private javax.swing.JButton removeEmployeeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchEmployeeButton;
    // End of variables declaration//GEN-END:variables
}
