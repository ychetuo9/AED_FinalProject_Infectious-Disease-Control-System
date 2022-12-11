/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;

/**
 *
 * @author yanyanchen
 */
public class SystemAdminPage extends javax.swing.JFrame {

    /**
     * Creates new form SystemAdminPage
     */
    
    public SystemAdminPage(String name) {
        initComponents();
        lblUsername.setText(name);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCityManage = new javax.swing.JButton();
        btnEnterpriseManage = new javax.swing.JButton();
        btnUserManage = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnReportingModule = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCityManage.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnCityManage.setText("Manage City");
        btnCityManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCityManageActionPerformed(evt);
            }
        });
        getContentPane().add(btnCityManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 61, 353, 76));

        btnEnterpriseManage.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnEnterpriseManage.setText("Manage Enterprise");
        btnEnterpriseManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterpriseManageActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnterpriseManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 198, 353, 76));

        btnUserManage.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnUserManage.setText("Manage User");
        btnUserManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManageActionPerformed(evt);
            }
        });
        getContentPane().add(btnUserManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 335, 353, 76));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Hello,");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 61, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 61, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, -1, -1));

        btnReportingModule.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnReportingModule.setText("Reporting Module");
        btnReportingModule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportingModuleActionPerformed(evt);
            }
        });
        getContentPane().add(btnReportingModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 340, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCityManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCityManageActionPerformed
        // TODO add your handling code here:
        String name=lblUsername.getText();
        this.dispose();
        ManageCity in =new ManageCity(name);
        in.setVisible(true);
    }//GEN-LAST:event_btnCityManageActionPerformed

    private void btnEnterpriseManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterpriseManageActionPerformed
        // TODO add your handling code here:
        String name=lblUsername.getText();
        this.dispose();
        setVisible(false);
        new ManageEnterprise(name).setVisible(true);
    }//GEN-LAST:event_btnEnterpriseManageActionPerformed

    private void btnUserManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManageActionPerformed
        // TODO add your handling code here:
        String name=lblUsername.getText();
        setVisible(false);
        new ManageUser(name).setVisible(true);
    }//GEN-LAST:event_btnUserManageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int a =JOptionPane.showConfirmDialog(null,"Do you want to exit this page ?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            this.dispose();
            Login in=new Login();
            in.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReportingModuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportingModuleActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ReportingModule in =new ReportingModule();
        in.setVisible(true);
        
    }//GEN-LAST:event_btnReportingModuleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCityManage;
    private javax.swing.JButton btnEnterpriseManage;
    private javax.swing.JButton btnReportingModule;
    private javax.swing.JButton btnUserManage;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblUsername;
    // End of variables declaration//GEN-END:variables
}
