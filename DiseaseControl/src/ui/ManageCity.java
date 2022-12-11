/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import dao.CityDao;
import static dao.CityDao.isExisted;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.City;

/**
 *
 * @author yanyanchen
 */
public class ManageCity extends javax.swing.JFrame {

    /**
     * Creates new form ManageCity
     */
    public ManageCity(String name) {
        initComponents();
        btnSave.setEnabled(false);
        lblUsername.setText(name);
        lblHint.setVisible(false);
    }
    
    public void validateFields(){
        String name=txtName.getText();
        if(!name.equals("")&&!CityDao.isExisted(name))
            btnSave.setEnabled(true);
        else
            btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblHint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 87, 1046, 259));

        txtName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 476, 237, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 479, -1, -1));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Add new City");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 391, -1, -1));

        btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 569, -1, -1));

        btnSave.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 569, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        jLabel1.setText("Manage Network");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 25, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1152, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Hello,");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, -1, -1));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblUsername.setText("--");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

        lblHint.setText("This city has already existed!");
        getContentPane().add(lblHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String userName=lblUsername.getText();
        int index = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        String id = model.getValueAt(index,0).toString();
        String name = model.getValueAt(index,1).toString();
        int a = JOptionPane.showConfirmDialog(null,"Do you want to delete this city?","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            CityDao.delete(id);
            setVisible(false);
            new ManageCity(userName).setVisible(true);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
        String cityName=txtName.getText();
        validateFields();
        if(CityDao.isExisted(cityName)){
            lblHint.setVisible(true);
        }else{
            lblHint.setVisible(false);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        String userName=lblUsername.getText();
        setVisible(false);
        new ManageCity(userName).setVisible(true);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String userName=lblUsername.getText();

        City city = new City();
        city.setName(txtName.getText());
        CityDao.save(city);
        setVisible(false);
        new ManageCity(userName).setVisible(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String userName=lblUsername.getText();
        this.dispose();
        SystemAdminPage in=new SystemAdminPage(userName);
        in.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        ArrayList<City> list = CityDao.getAllRecords();
        Iterator<City> itr = list.iterator();
        while(itr.hasNext()){
            City cityObj = itr.next();
            dtm.addRow(new Object[]{cityObj.getId(),cityObj.getName()});
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblHint;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
