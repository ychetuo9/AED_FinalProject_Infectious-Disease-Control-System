/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CommunityRequestDao;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Request;

/**
 *
 * @author yanyanchen
 */
public class DoctorWorkArea extends javax.swing.JFrame {

    /**
     * Creates new form DoctorWorkArea
     */
    public DoctorWorkArea() {
        initComponents();
    }
    
    public DoctorWorkArea(String name) {
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

        jLabel8 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPatientNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblVictim = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblRequestObject = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Hello,");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 0, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Date", "Name", "Patient Num", "Victim", "Location", "Description", "Request Object", "Status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 1296, 238));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Doctor Work Area");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 0, -1, -1));

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        getContentPane().add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, -1));

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        getContentPane().add(btnReject, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, -1, -1));

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 560, -1, -1));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 560, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Patient Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("# of Potentially infected");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Location");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 420, -1, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Description");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setText("Current Request Object");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 500, -1, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setText("Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));

        lblPatientNumber.setText("--");
        getContentPane().add(lblPatientNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, -1, -1));

        lblName.setText("--");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        lblDate.setText("--");
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        lblVictim.setText("--");
        getContentPane().add(lblVictim, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, -1, -1));

        lblLocation.setText("--");
        getContentPane().add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 420, -1, -1));

        lblDescription.setText("--");
        getContentPane().add(lblDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 460, -1, -1));

        lblRequestObject.setText("--");
        getContentPane().add(lblRequestObject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 500, -1, -1));

        jLabel12.setText("Request Log ID");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        lblId.setText("--");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

    }//GEN-LAST:event_jTable1MouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String name=lblUsername.getText();
        
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<Request> requestList = CommunityRequestDao.getAssociatedRecords(name);
        Iterator<Request> itrRequest = requestList.iterator();
        while(itrRequest.hasNext()){
            Request requestObj = itrRequest.next();
            dtm.addRow(new Object[]{requestObj.getId(),requestObj.getName(),requestObj.getDate(),requestObj.getPatientNumber(),requestObj.getVictim(),requestObj.getLocation(),requestObj.getDescription(),requestObj.getRequestObject(),requestObj.getStatus()});
        }
    }//GEN-LAST:event_formComponentShown

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to accept this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"accept",name);
                setVisible(false);
                new CarAdminWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"reject",name);
                setVisible(false);
                new CarAdminWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"process",name);
                setVisible(false);
                new CarAdminWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        String id=lblId.getText();
        String name = lblUsername.getText();

        Request request = CommunityRequestDao.getDetailInfo(id);
        String status=request.getStatus();

        if(status.contains("reject")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Rejected</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("accept")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Accepted</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("process")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Processing</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else if(status.contains("complete")){
            JOptionPane.showMessageDialog(null, "<html><b style=\"color:red\">The Task Has Already Been Completed</b></html>","Message",JOptionPane.ERROR_MESSAGE);
        }else{
            int a =JOptionPane.showConfirmDialog(null,"Do you want to reject this request?","Select",JOptionPane.YES_NO_OPTION);
            if(a==0){
                CommunityRequestDao.changeStatus(id,"complete",name);
                setVisible(false);
                new CarAdminWorkArea(name).setVisible(true);
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DoctorWorkArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DoctorWorkArea().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientNumber;
    private javax.swing.JLabel lblRequestObject;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVictim;
    // End of variables declaration//GEN-END:variables
}
