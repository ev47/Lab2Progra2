package Herencia;

import javax.swing.JOptionPane;

public class AgregarAmigo extends javax.swing.JFrame {
  Tigo tg=new Tigo();
    public AgregarAmigo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pin_ = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setDoubleBuffered(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Agregar Amigo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefono:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, 40));

        phone.setBackground(new java.awt.Color(255, 255, 255));
        phone.setForeground(new java.awt.Color(0, 0, 0));
        phone.setBorder(null);
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 220, 40));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Pin:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        pin_.setBackground(new java.awt.Color(255, 255, 255));
        pin_.setForeground(new java.awt.Color(0, 0, 0));
        pin_.setBorder(null);
        jPanel2.add(pin_, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 220, 40));

        Agregar.setBackground(new java.awt.Color(255, 255, 255));
        Agregar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        Agregar.setForeground(new java.awt.Color(0, 0, 0));
        Agregar.setText("Agregar Amigo");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel2.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 240, 48));

        back.setBackground(new java.awt.Color(255, 255, 255));
        back.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        back.setForeground(new java.awt.Color(0, 0, 0));
        back.setText("Volver");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 360, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed

        int phonito = Integer.valueOf(phone.getText());
        String pin = pin_.getText();
        
       
        PlanSamsung samsungPlan = tg.buscar_numero(phonito, pin);
        if (samsungPlan != null) {
            tg.agregarAmigo(phonito, pin);
            JOptionPane.showMessageDialog(null, "Amigo agregado exitosamente");
        } else {
         
            JOptionPane.showMessageDialog(null, "El número de teléfono no es de Samsung. No se pueden agregar amigos.");
        }
    


     
    }//GEN-LAST:event_AgregarActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField pin_;
    // End of variables declaration//GEN-END:variables
}
