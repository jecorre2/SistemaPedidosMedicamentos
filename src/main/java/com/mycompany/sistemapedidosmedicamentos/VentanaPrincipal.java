
package com.mycompany.sistemapedidosmedicamentos;

import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {

   
    public VentanaPrincipal() {
        initComponents();
        
        GrupoProveedores.add(Cofarma);
        GrupoProveedores.add(Empsephar);
        GrupoProveedores.add(Cemefar);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoProveedores = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        NombreMedicamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TipoMedicamento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cofarma = new javax.swing.JRadioButton();
        Empsephar = new javax.swing.JRadioButton();
        Cemefar = new javax.swing.JRadioButton();
        Confirmar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SucursalPrincipal = new javax.swing.JCheckBox();
        SucursalSecundaria = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SISTEMA DE PEDIDOS A PROVEEDORES");

        NombreMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreMedicamentoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre del medicamento :");

        TipoMedicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de medicamento", "Analgésico", "Analéptico", "Anestésico", "Antiácido", "Antidepresivo", "Antibióticos" }));

        jLabel3.setText("Tipo de Medicamento :");

        jLabel4.setText("Cantidad :");

        Cantidad.setToolTipText("");
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });

        jLabel5.setText("Proveedor :");

        Cofarma.setText("Cofarma");
        Cofarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CofarmaActionPerformed(evt);
            }
        });

        Empsephar.setText("Empsephar ");

        Cemefar.setText("Cemefar");

        Confirmar.setText("Confirmar");
        Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarActionPerformed(evt);
            }
        });

        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Sucursal a enviar :");

        SucursalPrincipal.setText("Sucursal Principal");

        SucursalSecundaria.setText("Sucursal Secundaria");
        SucursalSecundaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SucursalSecundariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)
                            .addComponent(Borrar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TipoMedicamento, 0, 1, Short.MAX_VALUE)
                                    .addComponent(NombreMedicamento, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Cofarma)
                                .addComponent(Empsephar)
                                .addComponent(Cemefar)
                                .addComponent(SucursalPrincipal)
                                .addComponent(SucursalSecundaria))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Confirmar)
                                .addGap(115, 115, 115)))))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Cofarma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Empsephar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cemefar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SucursalPrincipal)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SucursalSecundaria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Borrar)
                    .addComponent(Confirmar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreMedicamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreMedicamentoActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void CofarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CofarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CofarmaActionPerformed

    private void ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarActionPerformed
        
        VentanaConfirmacion abrir = new VentanaConfirmacion();
        abrir.setVisible(true);
        this.setVisible(false);
        
        if(TipoMedicamento.getSelectedItem() == "Seleccione el tipo de medicamento"){
            
            JOptionPane.showMessageDialog(null, "Debe seleccionar un tipo de medicamento");
        }
        
        if((Integer.parseInt(Cantidad.getText()) <= 0)) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un numero positivo mayor a cero"); 
            
        }
        
        //se utilizara para el envio de el valir seleccionado
        if(Cemefar.isSelected()== true){
            VentanaConfirmacion.TxtNombreProveedor.setText(Cemefar.getText());
            
        }
        else if (Cofarma.isSelected()==true){
            VentanaConfirmacion.TxtNombreProveedor.setText(Cofarma.getText());
            
        }
        else if(Empsephar.isSelected()==true){
            VentanaConfirmacion.TxtNombreProveedor.setText(Empsephar.getText());
            
        }
        else {
            JOptionPane.showMessageDialog(null, "No seleciono ningun proveedor");            
        }
        
        if (SucursalPrincipal.isSelected()== true){
            VentanaConfirmacion.TxtDireccionSucursal.setText("Calle de la Rosa n. 28");
            VentanaConfirmacion.TxtNombreSucursal.setText(SucursalPrincipal.getText());
            
        }
        else if(SucursalSecundaria.isSelected()== true){
            VentanaConfirmacion.TxtDireccionSucursal.setText("Calle Alcazabilla n. 3");
            VentanaConfirmacion.TxtNombreSucursal.setText(SucursalSecundaria.getText());
        }
        else{
            JOptionPane.showMessageDialog(null, "No seleciono ninguna sucursal");
        }
        
        VentanaConfirmacion.TxtPedido1.setText(Cantidad.getText());
        VentanaConfirmacion.TxtPedido.setText(NombreMedicamento.getText());
        VentanaConfirmacion.TxtTipoMedi.setText((String) TipoMedicamento.getSelectedItem());
       
        
    }//GEN-LAST:event_ConfirmarActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        NombreMedicamento.setText(null);
        TipoMedicamento.setSelectedItem("Seleccione el tipo de medicamento");
        Cantidad.setText(null);
        Cemefar.setSelected(true);
        Cofarma.setSelected(true);
        Empsephar.setSelected(true);
        SucursalPrincipal.setSelected(false);
        SucursalSecundaria.setSelected(false);
        
       // TODO add your handling code here:
    }//GEN-LAST:event_BorrarActionPerformed

    private void SucursalSecundariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SucursalSecundariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SucursalSecundariaActionPerformed

    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        char c = evt.getKeyChar();
        if(c < '0' || c > '9' ){
            evt.consume();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_CantidadKeyTyped

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Borrar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JRadioButton Cemefar;
    private javax.swing.JRadioButton Cofarma;
    private javax.swing.JButton Confirmar;
    private javax.swing.JRadioButton Empsephar;
    private javax.swing.ButtonGroup GrupoProveedores;
    private javax.swing.JTextField NombreMedicamento;
    private javax.swing.JCheckBox SucursalPrincipal;
    private javax.swing.JCheckBox SucursalSecundaria;
    private javax.swing.JComboBox<String> TipoMedicamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
