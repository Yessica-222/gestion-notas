/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Matricula;
import Modelo.cursos;
import Modelo.estudiantes;
import controlador.Control_estudiantes;
import controlador.Control_matriculas;
import controlador.conexion;
import controlador.control_cursos;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class Crud_matricula extends javax.swing.JPanel {

    Control_matriculas cmatriculas = new Control_matriculas();
    Control_estudiantes ce =  new Control_estudiantes();
    control_cursos cc = new control_cursos();
    
    Matricula m = new Matricula();
    estudiantes es =  new estudiantes();
    cursos cursillos = new cursos();

    List<Matricula> matriculas;
    List<estudiantes> estudiantes;
    List<cursos> curs;
    
    int cod_materia = 0;
    int cod_estudiante = 0;
    int cod_profesor = 0;
    

    public Crud_matricula() {
        initComponents();
        this.llenar_tabla();
        this.llenar_estudiantes();
        this.llenar_cursos();
    }

    private void llenar_tabla() {
        try {
            matriculas = cmatriculas.recuperarTodas(conexion.obtener());
            DefaultTableModel tm = (DefaultTableModel) tabla_matricula.getModel();
            tm.setRowCount(0);
            for (int i = 0; i < matriculas.size(); i++) {
                tm.addRow(new Object[]{
                    this.matriculas.get(i).getNom_estudiante() + " " + this.matriculas.get(i).getApe_estudiante(),
                    this.matriculas.get(i).getNom_profesor() + " - "+this.matriculas.get(i).getNom_materia()+" - "+matriculas.get(i).getHorario(),
                    this.matriculas.get(i).getObservacion()

                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se Obtuvieron registros ...\n"+ex);
        }
    }
    
    private void llenar_estudiantes(){
        try {
            estudiantes = ce.recuperarTodas(conexion.obtener());
            for (int i = 0; i <estudiantes.size(); i++) {
                if (i == 0) {
                    lista_estudiantes.removeAllItems();
                    lista_estudiantes.addItem("Seleccionar");
                }
                lista_estudiantes.addItem(estudiantes.get(i).getNombre_estudiante()+" "+estudiantes.get(i).getApellido_estudiante());
            }
        } catch (Exception e) {
        }
    }
    private void llenar_cursos(){
        try {
            curs = cc.recuperarTodas(conexion.obtener());
            for (int i = 0; i <curs.size(); i++) {
                if (i == 0) {
                    Lista_cursos.removeAllItems();
                    Lista_cursos.addItem("Seleccionar");
                }
                Lista_cursos.addItem(curs.get(i).getNombre_profesor()+" - "+curs.get(i).getNombre_materua()+" - "+curs.get(i).getHorario());
            }
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_matricula = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lista_estudiantes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Lista_cursos = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        caja_observacion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));

        tabla_matricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estudiante", "Curso", "Observacion"
            }
        ));
        tabla_matricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_matriculaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_matricula);

        jLabel2.setText("Estudiante:");

        lista_estudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Curso:");

        Lista_cursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Observacion:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(lista_estudiantes, 0, 306, Short.MAX_VALUE)
                        .addComponent(Lista_cursos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(caja_observacion, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lista_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lista_cursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(caja_observacion, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Matricula");

        btn_guardar.setText("Agregar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseClicked(evt);
            }
        });
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btn_guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_actualizar)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        if (this.validar()) {
            this.guardar();
            this.llenar_tabla();
            this.limpiar_cajas();
        }else{
            JOptionPane.showMessageDialog(null, "Debe elegirun estudiante y un curso");
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_actualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseClicked
  
    }//GEN-LAST:event_btn_actualizarMouseClicked

    private void tabla_matriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_matriculaMouseClicked
        int fila =  tabla_matricula.getSelectedRow();
        
        cod_estudiante = matriculas.get(fila).getCod_estudiante();
        int indice_est = this.hayar_estudiante(cod_estudiante);
        lista_estudiantes.setSelectedIndex(indice_est);
        
        cod_materia = matriculas.get(fila).getCod_materia();
        cod_profesor = matriculas.get(fila).getCod_profesor();
        
        int indice_curso = this.hayar_curso(cod_materia,cod_profesor);
        Lista_cursos.setSelectedIndex(indice_curso);
        
        caja_observacion.setText(matriculas.get(fila).getObservacion());
        
        
    }//GEN-LAST:event_tabla_matriculaMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
       if (this.validar()) {
            this.actualizar();
            this.llenar_tabla();
            this.limpiar_cajas();
        }else{
            JOptionPane.showMessageDialog(null, "Debe elegir una matricula");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            cmatriculas.eliminar(conexion.obtener(), cod_profesor, cod_materia, cod_estudiante);
            this.llenar_tabla();
            this.limpiar_cajas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La matricula de este alumno no se puede Eliminar\n Ya tiene Notas Registradas...");
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private void limpiar_cajas(){
        lista_estudiantes.setSelectedIndex(0);
        Lista_cursos.setSelectedIndex(0);
        caja_observacion.setText("");
    }
    private int hayar_estudiante(int cod_estudiante){
        int indice = 0;
        for (int i = 0; i <estudiantes.size(); i++) {
            if (estudiantes.get(i).getCodigo_estudiante() == cod_estudiante) {
                indice = i;
                break;
            }
        }
        return indice+1;
    }
    private int hayar_curso(int materia,int profe){
        int indice =0;
        int cod_mat = 0;
        int cod_profe = 0;
        for (int i = 0; i <curs.size(); i++) {
            cod_mat = curs.get(i).getCod_materia();
            cod_profe =curs.get(i).getCod_profesor();
            if (cod_mat == materia && cod_profe == profe) {
                indice = i;
                break;
            }
   
        }
    
        return indice+1;
    }
    private boolean validar(){
        boolean bandera = false;
        String estudiante = lista_estudiantes.getSelectedItem().toString();
        String curso = Lista_cursos.getSelectedItem().toString();
        
        
        if(!estudiante.trim().equals("Seleccione") && !curso.trim().equals("Seleccione")) {
            bandera =  true;
        }
        return bandera;
    }
    private void guardar(){
        try {
        Matricula matr = new Matricula();
        int indice_es = lista_estudiantes.getSelectedIndex()-1;
        int indice_cur = Lista_cursos.getSelectedIndex()-1;
            System.out.println("indice est: "+indice_es+"\nindice curso: "+indice_cur);
        
        matr.setCod_estudiante(estudiantes.get(indice_es).getCodigo_estudiante());
        matr.setNom_estudiante(estudiantes.get(indice_es).getNombre_estudiante());
        matr.setApe_estudiante(estudiantes.get(indice_es).getApellido_estudiante());
        matr.setCod_profesor(curs.get(indice_cur).getCod_profesor());
        matr.setNom_profesor(curs.get(indice_cur).getNombre_profesor());
        matr.setApe_profesor(curs.get(indice_cur).getApe_profesor());
        matr.setCod_materia(curs.get(indice_cur).getCod_materia());
        matr.setNom_materia(curs.get(indice_cur).getNombre_materua());
        matr.setObservacion(caja_observacion.getText());
        
        cmatriculas.guardar(conexion.obtener(), matr);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Matricular estudiante...\n"+e);
        }
        
    }
    private void actualizar(){
        try {
        Matricula matr1 = new Matricula();
        int indice_es = lista_estudiantes.getSelectedIndex()-1;
        int indice_cur = Lista_cursos.getSelectedIndex()-1;
            System.out.println("Actualizando \ncod_est: "+cod_estudiante+"\ncod_profesor: "+cod_profesor+"\ncod_materia: "+cod_materia);
        
        matr1.setCod_estudiante(estudiantes.get(indice_es).getCodigo_estudiante());
        matr1.setNom_estudiante(estudiantes.get(indice_es).getNombre_estudiante());
        matr1.setApe_estudiante(estudiantes.get(indice_es).getApellido_estudiante());
        matr1.setCod_profesor(curs.get(indice_cur).getCod_profesor());
        matr1.setNom_profesor(curs.get(indice_cur).getNombre_profesor());
        matr1.setApe_profesor(curs.get(indice_cur).getApe_profesor());
        matr1.setCod_materia(curs.get(indice_cur).getCod_materia());
        matr1.setNom_materia(curs.get(indice_cur).getNombre_materua());
        matr1.setObservacion(caja_observacion.getText());
        
        cmatriculas.actualizar(conexion.obtener(), matr1, cod_profesor, cod_materia, cod_estudiante);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Actulizar Matricula...\nEste Estudiante ya tiene Notas Registradas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lista_cursos;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField caja_observacion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lista_estudiantes;
    private javax.swing.JTable tabla_matricula;
    // End of variables declaration//GEN-END:variables
}
