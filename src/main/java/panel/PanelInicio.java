
package panel;


public class PanelInicio extends javax.swing.JFrame {


    public PanelInicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        productoBoton = new javax.swing.JButton();
        clienteBoton = new javax.swing.JButton();
        categoriaBoton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TIENDA");

        productoBoton.setText("PRODUCTO");
        productoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoBotonActionPerformed(evt);
            }
        });

        clienteBoton.setText("CLIENTE");
        clienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteBotonActionPerformed(evt);
            }
        });

        categoriaBoton.setText("CATEGORIA");
        categoriaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaBotonActionPerformed(evt);
            }
        });

        jButton1.setText("PROVEEDOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(categoriaBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(productoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clienteBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(productoBoton)
                    .addComponent(clienteBoton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoriaBoton)
                    .addComponent(jButton1))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoBotonActionPerformed
        // TODO add your handling code here:
        PanelProducto newFrame = new PanelProducto();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_productoBotonActionPerformed

    private void categoriaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaBotonActionPerformed
        // TODO add your handling code here:
        PanelCategoria newFrame = new PanelCategoria();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_categoriaBotonActionPerformed

    private void clienteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteBotonActionPerformed
        // TODO add your handling code here:
        PanelCliente newFrame = new PanelCliente();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clienteBotonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PanelProvedor newFrame = new PanelProvedor();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoriaBoton;
    private javax.swing.JButton clienteBoton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton productoBoton;
    // End of variables declaration//GEN-END:variables
}
