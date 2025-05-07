/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.estudiantes;
import controlador.Control_estudiantes;
import controlador.conexion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class crud_estudiantes extends javax.swing.JPanel {
    Control_estudiantes ce =  new Control_estudiantes();
    estudiantes es =  new estudiantes();
    List<estudiantes> estudiantes;
    int cod_estudiante = 0;
    /**
     * Creates new form crud_estudiantes
     */
    public crud_estudiantes() {
        initComponents();
        this.llenar_tabla();
    }

    private void llenar_tabla(){
        try {
            estudiantes = ce.recuperarTodas(conexion.obtener());
            DefaultTableModel tmm = (DefaultTableModel) t_estudiantes.getModel();
            tmm.setRowCount(0);
            for (int i = 0; i < estudiantes.size(); i++) {
                tmm.addRow(new Object[]{
                    this.estudiantes.get(i).getCodigo_estudiante(),
                    this.estudiantes.get(i).getNombre_estudiante(),
                    this.estudiantes.get(i).getApellido_estudiante(),
                    this.estudiantes.get(i).getTelefono()

                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos... \n"+e);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_estudiantes = new javax.swing.JTable();
        btn_actualizar = new javax.swing.JButton();
        javax.swing.JButton btn_eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        caja_codigo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        caja_nombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        caja_apellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        caja_telefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_guardar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Estudiantes");

        t_estudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Telefono"
            }
        ));
        t_estudiantes.setGridColor(new java.awt.Color(255, 255, 255));
        t_estudiantes.setSelectionBackground(new java.awt.Color(1, 204, 201));
        t_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_estudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_estudiantes);

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Codigo:");
        jLabel2.setToolTipText("");

        caja_codigo.setToolTipText("");
        caja_codigo.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        caja_nombre.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Apellido:");

        caja_apellido.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Telefono:");

        caja_telefono.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(caja_codigo, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(jLabel3)
                    .addComponent(caja_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jSeparator2))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(caja_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel5)
                    .addComponent(caja_telefono)
                    .addComponent(jSeparator4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caja_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btn_guardar.setText("Agregar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 324, Short.MAX_VALUE)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(btn_guardar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void t_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_estudiantesMouseClicked
        int fila = t_estudiantes.getSelectedRow();
        cod_estudiante = Integer.parseInt(t_estudiantes.getValueAt(fila, 0).toString());
        
        caja_codigo.setText(""+cod_estudiante);
        caja_nombre.setText(t_estudiantes.getValueAt(fila, 1).toString());
        caja_apellido.setText(t_estudiantes.getValueAt(fila, 2).toString());
        caja_telefono.setText(t_estudiantes.getValueAt(fila, 3).toString());
        
    }//GEN-LAST:event_t_estudiantesMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (this.validar()) {
            this.guardar();
            this.limpiar_cajas();
            this.llenar_tabla();
        }else{
            JOptionPane.showMessageDialog(null, "Verifique que todo esta correctamente");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (this.validar()) {
            this.actualizar();
            this.limpiar_cajas();
            this.llenar_tabla();
        }else{
            JOptionPane.showMessageDialog(null, "Verifique que todo esta correctamente");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            ce.eliminar(conexion.obtener(), cod_estudiante);
            this.limpiar_cajas();
            this.llenar_tabla();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique que todo esta Correctamente");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private boolean validar() {
        boolean bandera = false;
        String codigo = caja_codigo.getText().toString();
        String nombre = caja_nombre.getText().toString();
        String apellido = caja_apellido.getText().toString();
        String telefono = caja_telefono.getText().toString();

        if (!codigo.trim().equals("")&& !nombre.trim().equals("")&&!apellido.trim().equals("")&&!telefono.trim().equals("")) {
            bandera = true;
        }else{
            bandera = false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
        return bandera;
    }
    
    private void guardar() {
        estudiantes es1 = new estudiantes();

        try {
            es1.setCodigo_estudiante(Integer.parseInt(caja_codigo.getText().toString()));
            es1.setNombre_estudiante(caja_nombre.getText().toString());
            es1.setApellido_estudiante(caja_apellido.getText().toString());
            es1.setTelefono(caja_telefono.getText().toString());

            ce.guardar(conexion.obtener(), es1);
            this.llenar_tabla();
            this.limpiar_cajas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Registrar Estudiante");
        }
    }
    private void actualizar(){
        estudiantes es2 = new estudiantes();
        
        try {
            es2.setCodigo_estudiante(Integer.parseInt(caja_codigo.getText().toString()));
            es2.setNombre_estudiante(caja_nombre.getText().toString());
            es2.setApellido_estudiante(caja_apellido.getText().toString());
            es2.setTelefono(caja_telefono.getText().toString());

            ce.actualizar(conexion.obtener(), es2,cod_estudiante);
            this.llenar_tabla();
            this.limpiar_cajas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar Estudiante");
        }
    }
    private void limpiar_cajas(){
        caja_codigo.setText("");
        caja_nombre.setText("");
        caja_apellido.setText("");
        caja_telefono.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField caja_apellido;
    private javax.swing.JTextField caja_codigo;
    private javax.swing.JTextField caja_nombre;
    private javax.swing.JTextField caja_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable t_estudiantes;
    // End of variables declaration//GEN-END:variables
}
