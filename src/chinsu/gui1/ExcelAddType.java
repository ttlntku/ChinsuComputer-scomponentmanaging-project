/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinsu.gui1;

import chinsu.Utilities.ReadFromExcel;
import chinsu.object.distributor.DistributorObject;
import chinsu.object.type.TypeImpl;
import chinsu.object.type.TypeObject;
import chinsu.object.type.Type;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kieun
 */
public class ExcelAddType extends javax.swing.JFrame {

    /**
     * Creates new form ExcelAddType
     */
    String col[] = {"Tên loại", "Mã đơn vị"};

    DefaultTableModel tableModel = new DefaultTableModel(col, 0);
    JTable table = new JTable(tableModel);
    Vector<TypeObject> tobj = null;
    TypeImpl t = new TypeImpl();
    public ExcelAddType(){
        tableModel.setRowCount(0);
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

        btadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListExcel = new javax.swing.JTable();
        btexit = new javax.swing.JButton();
        btfromexcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btadd.setText("Thêm");
        btadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddActionPerformed(evt);
            }
        });

        tblListExcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblListExcel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(tblListExcel);

        btexit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btexit.setText("Thoát");
        btexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexitActionPerformed(evt);
            }
        });

        btfromexcel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btfromexcel.setText("Chọn file excel");
        btfromexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btfromexcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btexit)
                        .addGap(80, 80, 80)
                        .addComponent(btfromexcel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btexit)
                            .addComponent(btfromexcel))
                        .addGap(34, 34, 34)
                        .addComponent(btadd, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddActionPerformed
        // TODO add your handling code here:
        int reply = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn thêm?", "anhhungchinsu", JOptionPane.YES_NO_OPTION);
        int flag = 0;
        if (reply == JOptionPane.YES_OPTION) {
            for(TypeObject type : tobj) {
                if(!t.addType(type)){
                    flag++;
                }
            }
            tobj = null;
            JOptionPane.showMessageDialog(null, "Có " + flag + "bản ghi bị lỗi");
        } else {
            JOptionPane.showMessageDialog(null, "GOODBYE");
        }
    }//GEN-LAST:event_btaddActionPerformed

    private void btexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexitActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_btexitActionPerformed

    private void btfromexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btfromexcelActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Chọn excel");
        chooser.showOpenDialog(null);
        if (JFileChooser.APPROVE_OPTION == 0) {
           try {
                File selectedFile = chooser.getSelectedFile();
                String url = selectedFile.getPath();           
                tobj = ReadFromExcel.readTypeFromExcel(url);
                for (TypeObject u : tobj) {
                    Vector record = new Vector();
                    record.add(u.getType_name());
                    record.add(u.getType_distributor_id());
                    tableModel.addRow(record);
                }
                tblListExcel.setModel(tableModel);
           } catch (IOException ex) {
                Logger.getLogger(ExcelAddType.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }
    }//GEN-LAST:event_btfromexcelActionPerformed

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
            java.util.logging.Logger.getLogger(ExcelAddType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExcelAddType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExcelAddType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExcelAddType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExcelAddType().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btadd;
    private javax.swing.JButton btexit;
    private javax.swing.JButton btfromexcel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListExcel;
    // End of variables declaration//GEN-END:variables
}