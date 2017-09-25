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

import org.mz.docgen.service.GetDocumentGenerator;
import org.mz.docgen.service.DocumentGenerator;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Payal
 */
public class MainFrame extends javax.swing.JFrame {

    String nameFiles = " ";
    File[] files;
    File path;
    DocumentGenerator documentGenerator;
    boolean flag = true, flag1 = true;
    String[] strArray = new String[10];
    DefaultListModel listModel;

    public MainFrame() {
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

        imageFileChooser = new javax.swing.JFileChooser();
        destinationPathChooser = new javax.swing.JFileChooser();
        imageBrowseBtn = new javax.swing.JButton();
        destinationPathField = new javax.swing.JTextField();
        destinationBrowseBtn = new javax.swing.JButton();
        generatePdfBtn = new javax.swing.JButton();
        generateDocBtn = new javax.swing.JButton();
        imageCounterTextFld = new javax.swing.JTextField();
        imageListScrollPane = new javax.swing.JScrollPane();
        imageList = new javax.swing.JList();
        multiFileCheckBox = new javax.swing.JCheckBox();
        imageListLbl = new java.awt.Label();
        destinationLbl = new java.awt.Label();
        menuBar = new javax.swing.JMenuBar();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        imageFileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif", "jpeg"));
        imageFileChooser.setToolTipText("");
        imageFileChooser.setMultiSelectionEnabled(true);

        destinationPathChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DocGen");
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        setResizable(false);

        imageBrowseBtn.setText("Browse");
        imageBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageBrowseBtnActionPerformed(evt);
            }
        });

        destinationPathField.setEditable(false);

        destinationBrowseBtn.setText("Browse");
        destinationBrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationBrowseBtnActionPerformed(evt);
            }
        });

        generatePdfBtn.setText("Generate Pdf");
        generatePdfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePdfBtnActionPerformed(evt);
            }
        });

        generateDocBtn.setText("Generate Doc");
        generateDocBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateDocBtnActionPerformed(evt);
            }
        });

        imageCounterTextFld.setEditable(false);

        imageList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                imageListKeyPressed(evt);
            }
        });
        imageListScrollPane.setViewportView(imageList);

        multiFileCheckBox.setText("Create Multiple Files");

        imageListLbl.setText("Choose files to generate into Pdf or Doc");

        destinationLbl.setText("Select Destination folder for Pdf or Doc files");

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imageListLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiFileCheckBox)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(generatePdfBtn)
                                    .addGap(81, 81, 81)
                                    .addComponent(generateDocBtn))
                                .addComponent(destinationPathField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destinationBrowseBtn))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(imageListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(9, 9, 9)
                            .addComponent(imageCounterTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(imageBrowseBtn))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(imageListLbl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(imageBrowseBtn)
                        .addComponent(imageCounterTextFld, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imageListScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(destinationLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(destinationPathField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(destinationBrowseBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(multiFileCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generatePdfBtn)
                    .addComponent(generateDocBtn))
                .addGap(19, 19, 19))
        );

        destinationLbl.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void generateDocBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateDocBtnActionPerformed
        documentGenerator = GetDocumentGenerator.getDocument("doc");
        if (!multiFileCheckBox.isSelected()) {
            documentGenerator.generateSingleDocument(files, path);
        } else {
            documentGenerator.generateMultipleDocument(files, path);
        }
    }//GEN-LAST:event_generateDocBtnActionPerformed

    private void imageBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageBrowseBtnActionPerformed
        listModel = new DefaultListModel();
        imageFileChooser.showOpenDialog(null);
        files = imageFileChooser.getSelectedFiles();
        for (int i = 0; i < files.length; i++) {
            nameFiles = nameFiles + " " + files[i].getPath();
            listModel.addElement(nameFiles);
        }
        imageList.setModel(listModel);
        imageCounterTextFld.setText(String.valueOf(files.length));


    }//GEN-LAST:event_imageBrowseBtnActionPerformed

    private void destinationBrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationBrowseBtnActionPerformed
        destinationPathChooser = new JFileChooser();
        destinationPathChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
         destinationPathChooser.showOpenDialog(null);
        destinationPathField.setText(destinationPathChooser.getSelectedFile().getAbsolutePath());
        path = new File(destinationPathChooser.getSelectedFile().getAbsolutePath());
        System.out.print(destinationPathChooser.getSelectedFile().canWrite());
    }//GEN-LAST:event_destinationBrowseBtnActionPerformed

    private void generatePdfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePdfBtnActionPerformed
        documentGenerator = GetDocumentGenerator.getDocument("pdf");
        if (!multiFileCheckBox.isSelected()) {
            documentGenerator.generateSingleDocument(files, path);
        } else {
           
            documentGenerator.generateMultipleDocument(files, path);
        }
    }//GEN-LAST:event_generatePdfBtnActionPerformed

    private void imageListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imageListKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            for (int i = 0; i < files.length; i++) {
                int selectedItem = imageList.getSelectedIndex();
                if (selectedItem != -1) {
                    listModel.remove(selectedItem);
                    int length = imageList.getModel().getSize();
                    imageCounterTextFld.setText(String.valueOf(length));
                }
            }

        }
    }//GEN-LAST:event_imageListKeyPressed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        new AboutFrame().setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

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
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton destinationBrowseBtn;
    private java.awt.Label destinationLbl;
    private javax.swing.JFileChooser destinationPathChooser;
    private javax.swing.JTextField destinationPathField;
    private javax.swing.JButton generateDocBtn;
    private javax.swing.JButton generatePdfBtn;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton imageBrowseBtn;
    private javax.swing.JTextField imageCounterTextFld;
    private javax.swing.JFileChooser imageFileChooser;
    private javax.swing.JList imageList;
    private java.awt.Label imageListLbl;
    private javax.swing.JScrollPane imageListScrollPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JCheckBox multiFileCheckBox;
    // End of variables declaration//GEN-END:variables
}
