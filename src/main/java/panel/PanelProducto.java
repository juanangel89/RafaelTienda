/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package panel;
import controller.ProductoController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Producto;
public class PanelProducto extends javax.swing.JFrame {
    int cond =0;


    public PanelProducto() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        productoTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        leerButton = new javax.swing.JButton();
        crearButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        solicitudTextArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        precioField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        categoriaField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mostrarTextArea = new javax.swing.JTextField();
        aceptarButton = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productoTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Categoria"
            }
        ));
        jScrollPane1.setViewportView(productoTable1);

        jLabel1.setText("PRODUCTO");

        jLabel2.setText("¿Qué desea hacer?");

        leerButton.setText("Leer");
        leerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerButtonActionPerformed(evt);
            }
        });

        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        actualizarButton.setText("Actualizar");
        actualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Solicitud");

        jLabel4.setText("ID Producto");

        jLabel5.setText("Nombre Prodcuto");

        jLabel6.setText("Precio");

        jLabel7.setText("Categoria");

        jLabel8.setText("Resultado");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        atrasButton.setText("<Atras");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(atrasButton)
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(crearButton)
                        .addGap(18, 18, 18)
                        .addComponent(leerButton)
                        .addGap(18, 18, 18)
                        .addComponent(actualizarButton)
                        .addGap(18, 18, 18)
                        .addComponent(eliminarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel2)))
                        .addGap(0, 280, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(categoriaField, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(aceptarButton))
                            .addComponent(mostrarTextArea)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(solicitudTextArea))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(atrasButton))
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leerButton)
                    .addComponent(crearButton)
                    .addComponent(actualizarButton)
                    .addComponent(eliminarButton))
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solicitudTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(precioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton))
                .addGap(28, 28, 28)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearButtonActionPerformed
        // TODO add your handling code here:
             condicion1();
    }//GEN-LAST:event_crearButtonActionPerformed

    private void leerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leerButtonActionPerformed
        // TODO add your handling code here:
                leerProducto();
        

        mostrarTextArea.setText("Solicitud aceptada");
    }//GEN-LAST:event_leerButtonActionPerformed

    private void actualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarButtonActionPerformed
        // TODO add your handling code here:
         condicion2();
    }//GEN-LAST:event_actualizarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        // TODO add your handling code here:
         condicion3();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
         condicionFinal(cond);
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        // TODO add your handling code here:
        PanelInicio newFrame = new PanelInicio();
        newFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void condicionFinal(int cond){

                do {
            switch (cond) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    actualizarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
         
        }while (cond == 0);
    
    }
    public int condicion1(){
                cond =1;
        solicitudTextArea.setText("Por favor escriba en Nombre del producto, precio, ID categoria  a crear y despues aprete el boton ACEPTAR");
        return cond;
    }
    public int  condicion2(){
        cond =2;
        leerProducto();
        solicitudTextArea.setText("Por favor escriba la ID, el Nombre del producto, precio, ID categoria y despues aprete el boton ACPETAR");
        return cond;
    }
        public int condicion3(){
        cond =3;
        leerProducto();
        solicitudTextArea.setText("Por favor escriba la ID y despues aprete el boton ACEPTAR");
        return cond;
    }
    
    
    
         
    public void crearProducto(){
        ProductoController producto = new ProductoController();
        producto.crearProductoButton(nombreField.getText(),Double.parseDouble(precioField.getText()),Integer.parseInt(categoriaField.getText()));
        mostrarTextArea.setText("Proveedor "+nombreField.getText()+" creado exitosamente ");
        
    }
    
    public void leerProducto(){
                DefaultTableModel model = (DefaultTableModel) productoTable1.getModel();//instanciar la tabla
        model.setRowCount(0);//resetea la tabla
        ArrayList<Producto> productos = new ArrayList();//intanciar una lista arreglo
        ProductoController producto = new ProductoController ();//insanciando e controller
        List<Producto> leer = producto.leerProductosButton();//consultado los datos y asignandolos
        productos.addAll(leer);//asignar a la lista arreglo la lista para que la tabla acepte los datos
        
        Object columnas[] = new Object[4];//crea una array c
        for(Producto c : productos){
            columnas[0]=c.getId();
            columnas[1]=c.getNombre();
            columnas[2]=c.getPrecio();
            columnas[3]=c.getCategoria();
            model.addRow(columnas);
        }
        
    }
    
    public void actualizarProducto(){
        ProductoController producto = new ProductoController();
        producto.actualizarProductoButton(Integer.parseInt(idField.getText()),nombreField.getText(),Double.parseDouble(precioField.getText()),Integer.parseInt(categoriaField.getText()) );
        mostrarTextArea.setText("Producto "+idField.getText()+". "+nombreField.getText()+" actualizado exitosamente ");
    }
    
    public void eliminarProducto(){
        ProductoController producto = new ProductoController();
        producto.eliminarProductoButton(Integer.parseInt(idField.getText()));
        mostrarTextArea.setText("Producto "+idField.getText()+" eliminado exitosamente ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JTextField categoriaField;
    private javax.swing.JButton crearButton;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leerButton;
    private javax.swing.JTextField mostrarTextArea;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField precioField;
    private javax.swing.JTable productoTable1;
    private javax.swing.JTextField solicitudTextArea;
    // End of variables declaration//GEN-END:variables
}
