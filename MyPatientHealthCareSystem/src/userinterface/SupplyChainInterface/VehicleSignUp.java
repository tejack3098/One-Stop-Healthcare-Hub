/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SupplyChainInterface;

/**
 *
 * @author adity
 */
public class VehicleSignUp extends javax.swing.JPanel {

    /**
     * Creates new form VehicleSignUp
     */
    public VehicleSignUp() {
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

        lblVehicleName = new javax.swing.JLabel();
        txtVehicleNumber = new javax.swing.JTextField();
        lblVehicleType = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        lblVehicleNumber = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtVehicleName = new javax.swing.JTextField();
        txtVehicleType = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();

        lblVehicleName.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVehicleName.setText("Vehicle Name");

        lblVehicleType.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVehicleType.setText("Vehicle Type");

        btnSignUp.setText("Sign Up");

        lblVehicleNumber.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblVehicleNumber.setText("Vehicle Number");

        lblDescription.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblDescription.setText("Description");

        txtVehicleType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleTypeActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Vehicle");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVehicleName)
                            .addComponent(lblVehicleType)
                            .addComponent(lblDescription)
                            .addComponent(lblVehicleNumber))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 178, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addGap(304, 304, 304))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleName)
                    .addComponent(txtVehicleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehicleType)
                    .addComponent(txtVehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVehicleNumber)
                    .addComponent(txtVehicleNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSignUp)
                .addContainerGap(239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtVehicleTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehicleName;
    private javax.swing.JLabel lblVehicleNumber;
    private javax.swing.JLabel lblVehicleType;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtVehicleName;
    private javax.swing.JTextField txtVehicleNumber;
    private javax.swing.JTextField txtVehicleType;
    // End of variables declaration//GEN-END:variables
}
