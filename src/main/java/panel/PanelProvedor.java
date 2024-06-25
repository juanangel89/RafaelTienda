
package panel;
import controller.ProvedorController;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;
import model.Provedor;

public class PanelProvedor extends javax.swing.JFrame {
    int cond =0;


    public PanelProvedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        provedorTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        crearButton = new javax.swing.JButton();
        leerButton = new javax.swing.JButton();
        actualizarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        solicitudTextArea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        direccionField = new javax.swing.JTextField();
        telefonoField = new javax.swing.JTextField();
        aceptarButton = new javax.swing.JButton();
        mostrarTextArea = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        provedorTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID proveedor", "Nombre", "Direccion", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(provedorTable1);

        jLabel1.setText("PROVEEDOR");

        jLabel2.setText("¿Qué desea hacer?");

        crearButton.setText("Crear");
        crearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearButtonActionPerformed(evt);
            }
        });

        leerButton.setText("Leer");
        leerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leerButtonActionPerformed(evt);
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

        jLabel4.setText("ID Proveedor");

        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Resultado");

        jLabel6.setText("Nombre");

        jLabel7.setText("Direccion");

        jLabel8.setText("Telefono");

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solicitudTextArea, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mostrarTextArea)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                        .addComponent(aceptarButton)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(crearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(leerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(actualizarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarButton)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atrasButton)
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(atrasButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearButton)
                    .addComponent(leerButton)
                    .addComponent(actualizarButton)
                    .addComponent(eliminarButton))
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(solicitudTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aceptarButton)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostrarTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        leerProvedor();
        

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
                    crearProvedor();
                    break;
                case 2:
                    actualizarProvedor();
                    break;
                case 3:
                    eliminarProvedor();
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
        solicitudTextArea.setText("Por favor escriba en Nombre del proveedor, dirección, telefono  a crear y despues aprete el boton CREAR");
        return cond;
    }
    public int  condicion2(){
        cond =2;
        leerProvedor();
        solicitudTextArea.setText("Por favor escriba la ID, el Nombre del provedor, dirección, telefono y despues aprete el boton ACTUALIZAR");
        return cond;
    }
        public int condicion3(){
        cond =3;
        leerProvedor();
        solicitudTextArea.setText("Por favor escriba la ID y despues aprete el boton ELIMINAR");
        return cond;
    }
    
    
    
         
    public void crearProvedor(){
        ProvedorController provedor = new ProvedorController();
        provedor.crearProvedorButton(nombreField.getText(), direccionField.getText(),telefonoField.getText());
        mostrarTextArea.setText("Proveedor "+nombreField.getText()+" creado exitosamente ");
    }
    
    public void leerProvedor(){
                DefaultTableModel model = (DefaultTableModel) provedorTable1.getModel();//instanciar la tabla
        model.setRowCount(0);//resetea la tabla
        ArrayList<Provedor> provedores = new ArrayList();//intanciar una lista arreglo
        ProvedorController provedor = new ProvedorController ();//insanciando e controller
        List<Provedor> leer = provedor.leerProvedoresButton();//consultado los datos y asignandolos
        provedores.addAll(leer);//asignar a la lista arreglo la lista para que la tabla acepte los datos
        
        Object columnas[] = new Object[4];//crea una array c
        for(Provedor c : provedores){
            columnas[0]=c.getIdProvedor();
            columnas[1]=c.getNombreProvedor();
            columnas[2]=c.getDireccion();
            columnas[3]=c.getTelefono();
            model.addRow(columnas);
        }
        
    }
    
    public void actualizarProvedor(){
        ProvedorController provedor = new ProvedorController();
        provedor.actualizarProvedorButton(Integer.parseInt(idField.getText()),nombreField.getText(),direccionField.getText(),telefonoField.getText() );
        mostrarTextArea.setText("Proveedor "+idField.getText()+". "+nombreField.getText()+" actualizado exitosamente ");
    }
    
    public void eliminarProvedor(){
        ProvedorController provedor = new ProvedorController();
        provedor.eliminarProvedorButton(Integer.parseInt(idField.getText()));
        mostrarTextArea.setText("Ciente "+idField.getText()+" eliminado exitosamente ");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarButton;
    private javax.swing.JButton actualizarButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton crearButton;
    private javax.swing.JTextField direccionField;
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
    private javax.swing.JTable provedorTable1;
    private javax.swing.JTextField solicitudTextArea;
    private javax.swing.JTextField telefonoField;
    // End of variables declaration//GEN-END:variables
}
