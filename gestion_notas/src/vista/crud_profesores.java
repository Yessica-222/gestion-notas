/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Profesores;
import controlador.conexion;
import controlador.control_profesores;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class crud_profesores extends javax.swing.JPanel {
    control_profesores cp =  new control_profesores();
    Profesores p =  new Profesores();
    List<Profesores> profes; 
    int cod_prof = 0;
    
    public crud_profesores() {
        initComponents();
        this.llenar_tabla();
    }

    private void llenar_tabla(){
        try {
            profes = cp.recuperarTodas(conexion.obtener());
            DefaultTableModel tmm = (DefaultTableModel) T_profesores.getModel();
            tmm.setRowCount(0);
            for (int i = 0; i < profes.size(); i++) {
                tmm.addRow(new Object[]{
                    this.profes.get(i).getCodigo(),
                    this.profes.get(i).getNombre(),
                    this.profes.get(i).getApellido(),
                    this.profes.get(i).getEspecializacion()
                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se Obtuvieron registros ...\n"+ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        T_profesores = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        caja_cod_p = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        caja_nom_p = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        caja_ape_p = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        caja_esp_p = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Profesores");

        T_profesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Especializacion"
            }
        ));
        T_profesores.setGridColor(new java.awt.Color(255, 255, 255));
        T_profesores.setSelectionBackground(new java.awt.Color(1, 204, 201));
        T_profesores.setSelectionForeground(new java.awt.Color(255, 255, 255));
        T_profesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_profesoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(T_profesores);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Codigo:");

        caja_cod_p.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Nombre:");

        caja_nom_p.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Apellido:");

        caja_ape_p.setBorder(null);

        jLabel5.setText("Especializacion:");

        caja_esp_p.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(caja_cod_p, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addComponent(jSeparator1))
                    .addComponent(jLabel3)
                    .addComponent(caja_nom_p, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(caja_ape_p)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel5)
                    .addComponent(caja_esp_p, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(caja_cod_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_ape_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caja_nom_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(caja_esp_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_agregar.setText("Agregar");
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_agregar)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void T_profesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_profesoresMouseClicked
       int fila = T_profesores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        } else {
            cod_prof = Integer.parseInt((String) T_profesores.getValueAt(fila, 0).toString());
            String nombre = T_profesores.getValueAt(fila, 1).toString();
            String apellido = T_profesores.getValueAt(fila, 2).toString();
            String especializaion = T_profesores.getValueAt(fila, 3).toString();
            
            caja_cod_p.setText(""+cod_prof);
            caja_nom_p.setText(nombre);
            caja_ape_p.setText(apellido);
            caja_esp_p.setText(especializaion);
        }
    }//GEN-LAST:event_T_profesoresMouseClicked

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if(this.validar()){
            this.guardar();
            this.llenar_tabla();
            this.limpiar_cajas();
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       Profesores p2 = new Profesores();
        try {
            int codigo = Integer.parseInt(caja_cod_p.getText().toString());
            String nombre = caja_nom_p.getText().toString();
            String apellido = caja_ape_p.getText().toString();
            String especializacion = caja_esp_p.getText().toString();

            p2.setCodigo(codigo);
            p2.setNombre(nombre);
            p2.setApellido(apellido);
            p2.setEspecializacion(especializacion);

            cp.actualizar(conexion.obtener(), p2,cod_prof);
            this.llenar_tabla();
            this.limpiar_cajas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar Datos\n" + e);
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            cp.eliminar(conexion.obtener(), cod_prof);
            this.llenar_tabla();
            this.limpiar_cajas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Eliminar Datos\n" + e);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    
    private boolean validar(){
        boolean bandera = false;
        
        String codigo = caja_cod_p.getText();
        String nombre = caja_nom_p.getText();
        String apellido = caja_ape_p.getText();
        String especializacion = caja_esp_p.getText();
        
        if(!codigo.trim().equals("") && !nombre.trim().equals("")&& !apellido.trim().equals("") && !especializacion.trim().equals("")){
            bandera =  true;
        }else{
            bandera = false;
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }
        
        return bandera;
    }
    
    private void guardar() {
        Profesores p1 = new Profesores();
        try {
            int codigo = Integer.parseInt(caja_cod_p.getText().toString());
            String nombre = caja_nom_p.getText().toString();
            String apellido = caja_ape_p.getText().toString();
            String especializacion = caja_esp_p.getText().toString();

            p1.setCodigo(codigo);
            p1.setNombre(nombre);
            p1.setApellido(apellido);
            p1.setEspecializacion(especializacion);

            cp.guardar(conexion.obtener(), p1);
            this.llenar_tabla();
            this.limpiar_cajas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar Datos\n" + e);
        }

    }
    
    private void limpiar_cajas(){
        caja_cod_p.setText("");
            caja_nom_p.setText("");
            caja_ape_p.setText("");
            caja_esp_p.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T_profesores;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField caja_ape_p;
    private javax.swing.JTextField caja_cod_p;
    private javax.swing.JTextField caja_esp_p;
    private javax.swing.JTextField caja_nom_p;
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
    // End of variables declaration//GEN-END:variables
}
