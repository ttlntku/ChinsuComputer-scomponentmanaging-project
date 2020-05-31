/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chinsu.gui1;

import chinsu.id3.Attribute;
import chinsu.id3.DecisionTreeID3;
import chinsu.id3.ReadTxt;
import chinsu.id3.TreeNode;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Windows 10
 */
public class ID3Jpanel extends javax.swing.JPanel {

    /**
     * Creates new form ID3Jpanel
     */
    
    List<Attribute> attributes = new ArrayList<>();
    DecisionTreeID3 DTI3;
    List<List<String>> examples = new ArrayList<List<String>>();
    int height, width = 0;
    DefaultTableModel tableModel = null;
    JTable table = null;
    int hei, wid = 0;
    Graphics g = null;
    
    public ID3Jpanel() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtArea = new javax.swing.JTextArea();
        jpnTree = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblData = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 153));

        jtxtArea.setColumns(20);
        jtxtArea.setRows(5);
        jScrollPane2.setViewportView(jtxtArea);

        jpnTree.setBackground(new java.awt.Color(233, 232, 232));

        javax.swing.GroupLayout jpnTreeLayout = new javax.swing.GroupLayout(jpnTree);
        jpnTree.setLayout(jpnTreeLayout);
        jpnTreeLayout.setHorizontalGroup(
            jpnTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );
        jpnTreeLayout.setVerticalGroup(
            jpnTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jtblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtblData);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Tải dữ liệu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Học");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton2))
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addGap(466, 466, 466))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void paintTree(TreeNode tree, int x, int y, Graphics g) {

        int xStart = x;
        x = (tree.numberLabel * 100 + 2 * x) / 2 - 50;

        if (!tree.attributes.name.equalsIgnoreCase("")) {
            g.setColor(Color.BLUE);
            g.fillRect(x + 25, y, 40, 40);
            g.setColor(Color.WHITE);
            g.drawString(tree.attributes.name, x + 35, y + 16);
        } else {
            g.setColor(Color.RED);
            g.fillRect(x + 25, y, 40, 40);
            g.setColor(Color.WHITE);
            g.drawString(tree.attributes.label, x + 30, y + 20);
        }
        int xEnda;
        for (int i = 0; i < tree.attributes.values.size(); i++) {
            xEnda = tree.childs[i].numberLabel * 100 + xStart;
            int XA = (xStart + xEnda) / 2 - 50;
            g.setColor(Color.BLACK);
            g.drawLine(x + 50, y + 30, XA + 50, y + 100);
            g.setColor(Color.RED);
            g.fillRect(XA, y + 100, 70, 40);
            g.setColor(Color.WHITE);
            g.drawString(tree.attributes.values.get(i), XA + 5, y + 120);
            g.setColor(Color.BLACK);
            g.drawLine(XA + 50, y + 130, XA + 50, y + 200);
            paintTree(tree.childs[i], xStart, y + 200, g);
            xStart = xEnda;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();

        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            String path = file.getPath();

            List<String> data = ReadTxt.data(path);
            String[] title = data.get(0).split(" ");
            tableModel = new DefaultTableModel(title, 0);
            table = new JTable(tableModel);
            for (int i = 1; i < data.size(); i++) {
                tableModel.addRow(data.get(i).split(" "));
            }
            jtblData.setModel(tableModel);

            for (int i = 0; i < title.length - 1; i++) {
                Attribute temp = new Attribute();
                temp.name = title[i];
                attributes.add(temp);
            }

            for (int i = 0; i < tableModel.getRowCount(); i++) {
                for (int j = 0; j < tableModel.getColumnCount() - 1; j++) {
                    attributes.get(j).addValue(tableModel.getValueAt(i, j).toString().toLowerCase());
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            List<String> example = new ArrayList<>();
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                example.add(tableModel.getValueAt(i, j).toString().toLowerCase());
            }
            examples.add(example);
        }

        List<Attribute> at = new ArrayList<>();
        for (int i = 0; i < attributes.size(); i++) {
            at.add(attributes.get(i));
        }
        DTI3 = new DecisionTreeID3(examples, at);
        DTI3.takeTree();
        jtxtArea.setText(DTI3.solution);
        hei = DTI3.depth * 200;
        wid = DTI3.tree.numberLabel * 100;
        g = jpnTree.getGraphics();
        paintTree(DTI3.tree, 0, 50, g);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jpnTree;
    private javax.swing.JTable jtblData;
    private javax.swing.JTextArea jtxtArea;
    // End of variables declaration//GEN-END:variables
}
