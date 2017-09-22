/*
 * Copyright (C) 2017 Metazone Infotech Pvt Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mz.docgen.gui;

import org.mz.docgen.service.getDocumentGenerator;
import org.mz.docgen.service.DocumentGenerator;
import java.awt.event.KeyEvent;
import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Payal
 */
public class MainFrame extends javax.swing.JFrame {

    JFileChooser fileChooser, fileChooser1;
    String nameFiles = " ";
    File[] file;
    File path;
    // ButtonGroup buttonGroup=new ButtonGroup();
    DocumentGenerator dc;
    boolean flag = true, flag1 = true;
    String[] strArray = new String[10];
    DefaultListModel listModel;

    public MainFrame() {
        initComponents();
        String userhome = System.getProperty("user.home");
        fileChooser = new JFileChooser(userhome + "\\Documents\\Images");
        nameField2.setEditable(false);
        nameField1.setEditable(false);
        checkBox.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        browseBtn = new javax.swing.JButton();
        nameField1 = new javax.swing.JTextField();
        browseBtn1 = new javax.swing.JButton();
        pdfBtn = new javax.swing.JButton();
        docBtn = new javax.swing.JButton();
        nameField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileChooserJList = new javax.swing.JList();
        checkBox = new javax.swing.JCheckBox();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        nameField1.setEditable(false);

        browseBtn1.setText("Browse");
        browseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtn1ActionPerformed(evt);
            }
        });

        pdfBtn.setText("Generate Pdf");
        pdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfBtnActionPerformed(evt);
            }
        });

        docBtn.setText("Generate Doc");
        docBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docBtnActionPerformed(evt);
            }
        });

        nameField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameField2ActionPerformed(evt);
            }
        });

        fileChooserJList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fileChooserJListKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(fileChooserJList);

        checkBox.setText("Create Multiple Documents");

        label1.setText("Choose files to generate into Pdf or Doc");

        label2.setText("Select Destination folder where you want to generate Pdf or Doc files");

        jMenu1.setText("Help");

        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBox)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pdfBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(docBtn))
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nameField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE))
                                .addGap(52, 52, 52)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(nameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(browseBtn))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(browseBtn1))))
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(browseBtn)
                        .addComponent(nameField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseBtn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pdfBtn)
                    .addComponent(docBtn))
                .addGap(85, 85, 85))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void docBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docBtnActionPerformed
        dc = getDocumentGenerator.getDocument("doc");
        if (!checkBox.isSelected()) {
            dc.generateSingleDocument(file, path);
        } else {
            dc.generateMultipleDocument(file, path);
        }
    }//GEN-LAST:event_docBtnActionPerformed

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        listModel = new DefaultListModel();
        nameField2.setText(" ");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.resetChoosableFileFilters();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif"));
        fileChooser.setMultiSelectionEnabled(true);
        fileChooser.showOpenDialog(null);
        file = fileChooser.getSelectedFiles();
        for (int i = 0; i < file.length; i++) {
            nameFiles = nameFiles + " " + file[i].getPath();
            listModel.addElement(nameFiles);
        }
        fileChooserJList.setModel(listModel);
        nameField2.setText(String.valueOf(file.length));


    }//GEN-LAST:event_browseBtnActionPerformed

    private void browseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtn1ActionPerformed
        fileChooser1 = new JFileChooser();
        fileChooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fileChooser1.showOpenDialog(null);
        nameField1.setText(fileChooser1.getSelectedFile().getAbsolutePath());
        path = new File(fileChooser1.getSelectedFile().getAbsolutePath());
        System.out.print(fileChooser1.getSelectedFile().canWrite());
    }//GEN-LAST:event_browseBtn1ActionPerformed

    private void pdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfBtnActionPerformed
        dc = getDocumentGenerator.getDocument("pdf");
        if (!checkBox.isSelected()) {
            dc.generateSingleDocument(file, path);
        } else {
           
            dc.generateMultipleDocument(file, path);
             System.out.print("multiple");
        }
    }//GEN-LAST:event_pdfBtnActionPerformed

    private void fileChooserJListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fileChooserJListKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            // TODO add your handling code here:
            for (int i = 0; i < file.length; i++) {
                int selectedItem = fileChooserJList.getSelectedIndex();
                if (selectedItem != -1) {
                    listModel.remove(selectedItem);
                    int length = fileChooserJList.getModel().getSize();
                    nameField2.setText(String.valueOf(length));
                }
            }

        }
    }//GEN-LAST:event_fileChooserJListKeyPressed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        AboutFrame aboutFrame = new AboutFrame();
        aboutFrame.setSize(500, 500);
        aboutFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void nameField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn;
    private javax.swing.JButton browseBtn1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBox;
    private javax.swing.JButton docBtn;
    private javax.swing.JList fileChooserJList;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JTextField nameField1;
    private javax.swing.JTextField nameField2;
    private javax.swing.JButton pdfBtn;
    // End of variables declaration//GEN-END:variables
}
