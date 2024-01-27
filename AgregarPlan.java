
package Herencia;

public class AgregarPlan extends javax.swing.JFrame {
    
    Tigo tg=new Tigo();
    
    public AgregarPlan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_tipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        pin_email = new javax.swing.JTextField();
        AgregarPlan = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("AGREGAR PLAN");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("TELEFONO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        numero.setBackground(new java.awt.Color(255, 255, 255));
        numero.setForeground(new java.awt.Color(0, 0, 0));
        numero.setBorder(null);
        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });
        jPanel2.add(numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 167, 28));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, -1));

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setBorder(null);
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 167, 28));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("PLAN:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        btn_tipo.setBackground(new java.awt.Color(255, 255, 255));
        btn_tipo.setForeground(new java.awt.Color(0, 0, 0));
        btn_tipo.setMaximumRowCount(3);
        btn_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "iPhone", "Samsung" }));
        btn_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tipoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 167, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("PIN / EMAIL");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, -1, -1));

        pin_email.setBackground(new java.awt.Color(255, 255, 255));
        pin_email.setForeground(new java.awt.Color(0, 0, 0));
        pin_email.setBorder(null);
        jPanel2.add(pin_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 167, 28));

        AgregarPlan.setBackground(new java.awt.Color(255, 255, 255));
        AgregarPlan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        AgregarPlan.setForeground(new java.awt.Color(0, 0, 0));
        AgregarPlan.setText("AGREGAR PLAN");
        AgregarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarPlanActionPerformed(evt);
            }
        });
        jPanel2.add(AgregarPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, 46));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("VOLVER");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 155, 49));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tipoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Main main= new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void AgregarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarPlanActionPerformed
        int number=Integer.valueOf(numero.getText());
        String name=nombre.getText();
        String tipo=String.valueOf(btn_tipo.getSelectedItem());
        String acceso=pin_email.getText();
        tg.agregarPlan(number, name, acceso, tipo);
    }//GEN-LAST:event_AgregarPlanActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarPlan;
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> btn_tipo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numero;
    private javax.swing.JTextField pin_email;
    // End of variables declaration//GEN-END:variables
}
