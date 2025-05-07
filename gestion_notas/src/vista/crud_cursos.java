/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Profesores;
import Modelo.cursos;
import Modelo.materias;
import controlador.control_profesores;
import controlador.conexion;
import controlador.control_cursos;
import controlador.control_materias;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class crud_cursos extends javax.swing.JPanel {

    control_cursos cc = new control_cursos();
    control_profesores cp = new control_profesores();
    control_materias cm = new control_materias();
    cursos c = new cursos();

    List<cursos> cursos;
    List<Profesores> profes;
    List<materias> mat;
    
    int cod_profe = 0;
    int cod_materia = 0;
    /**
     * Creates new form crud_cursos
     */
    public crud_cursos() {
        initComponents();

        this.llenar_tabla();
        this.llenar_profesores();
        this.llenar_materias();
    }

    private void llenar_tabla() {
        try {
            cursos = cc.recuperarTodas(conexion.obtener());
            DefaultTableModel tmm = (DefaultTableModel) t_cursos.getModel();
            tmm.setRowCount(0);
            for (int i = 0; i < cursos.size(); i++) {
                tmm.addRow(new Object[]{
                    this.cursos.get(i).getSalon(),
                    this.cursos.get(i).getHorario(),
                    this.cursos.get(i).getNum_grupo(),
                    this.cursos.get(i).getNombre_profesor(),
                    this.cursos.get(i).getNombre_materua()

                });
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "No se Obtuvieron registros ...");
        }
    }

    private void llenar_profesores() {

        try {
            profes = cp.recuperarTodas(conexion.obtener());
            for (int i = 0; i < profes.size(); i++) {
                if (i == 0) {
                    lista_profesores.removeAllItems();
                    lista_profesores.addItem("Selecccionar");
                }
                lista_profesores.addItem(profes.get(i).getNombre().toString() + " " + profes.get(i).getApellido().toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro al listar profesores \n" + e);
        }
    }

    private void llenar_materias() {

        try {
            mat = cm.recuperarTodas(conexion.obtener());
            for (int i = 0; i < mat.size(); i++) {
                if (i == 0) {
                    lista_materias.removeAllItems();
                    lista_materias.addItem("Seleccionar");
                }
                lista_materias.addItem(mat.get(i).getId().toString()+"_"+mat.get(i).getNombre().toString());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro al listar materias \n" + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        t_cursos = new javax.swing.JTable();
        btn_agregar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        caja_salon = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        caja_num_grupo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        lista_profesores = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        lista_materias = new javax.swing.JComboBox<>();
        jSeparator5 = new javax.swing.JSeparator();
        Lista_horarios = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        t_cursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Salon", "Horario", "Num Grupo", "profesor", "Materia"
            }
        ));
        t_cursos.setGridColor(new java.awt.Color(255, 255, 255));
        t_cursos.setSelectionBackground(new java.awt.Color(1, 204, 201));
        t_cursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cursosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_cursos);

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Salon");

        caja_salon.setBorder(null);

        jLabel2.setText("Horario");

        jLabel3.setText("Num Grupo");

        caja_num_grupo.setBorder(null);
        caja_num_grupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caja_num_grupoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja_num_grupoKeyReleased(evt);
            }
        });

        jLabel4.setText("Profesor");

        lista_profesores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lista_profesores.setBorder(null);

        jLabel5.setText("Materia");

        lista_materias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        lista_materias.setBorder(null);

        Lista_horarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Mañana", "Tarde", "Noche" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1)
                    .addComponent(caja_salon)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator2)
                    .addComponent(Lista_horarios, 0, 109, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caja_num_grupo)
                    .addComponent(jSeparator3)
                    .addComponent(lista_profesores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lista_materias, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja_num_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lista_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_profesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lista_horarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btn_agregar)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        if (validar()) {
            this.guardar();
            this.llenar_tabla();
            this.limpiar_cajas();
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos ");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed
    private void guardar() {
        cursos cur = new cursos();

        try {
            String salon = caja_salon.getText().toString();
            String horario = Lista_horarios.getSelectedItem().toString();
            int num_grupo = Integer.parseInt(caja_num_grupo.getText().toString());
            int index_prof = lista_profesores.getSelectedIndex() - 1;
            int index_mat = lista_materias.getSelectedIndex() - 1;

            cur.setSalon(salon);
            cur.setHorario(horario);
            cur.setNum_grupo(num_grupo);
            cur.setCod_profesor(this.profes.get(index_prof).getCodigo());
            cur.setCod_materia(mat.get(index_mat).getId());
            cur.setNombre_profesor(this.profes.get(index_prof).getNombre());
            cur.setApe_profesor(this.profes.get(index_prof).getApellido());
            cur.setNombre_materua(mat.get(index_mat).getNombre());

            cc.guardar(conexion.obtener(), cur);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el curso \n" + e);
        }
    }
    private void caja_num_grupoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_num_grupoKeyPressed

    }//GEN-LAST:event_caja_num_grupoKeyPressed

    private void caja_num_grupoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_num_grupoKeyReleased

    }//GEN-LAST:event_caja_num_grupoKeyReleased

    private void t_cursosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cursosMouseClicked
        int fila = t_cursos.getSelectedRow();
        caja_salon.setText(this.cursos.get(fila).getSalon());
        caja_num_grupo.setText(this.cursos.get(fila).getNum_grupo().toString());
        String horario = this.cursos.get(fila).getHorario().toString();
        cod_profe = Integer.parseInt(this.cursos.get(fila).getCod_profesor().toString());
        cod_materia = Integer.parseInt(this.cursos.get(fila).getCod_materia().toString());
        Lista_horarios.setSelectedIndex(this.buscar_horario(horario));
        lista_profesores.setSelectedIndex(this.buscar_profe(cod_profe));
        lista_materias.setSelectedIndex(this.buscar_materia(cod_materia));
        
    }//GEN-LAST:event_t_cursosMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        if (validar()) {
            this.actualizar();
            this.llenar_tabla();
            this.limpiar_cajas();
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos ");
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            cc.eliminar(conexion.obtener(), cod_profe, cod_materia);
            this.llenar_tabla();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error no se pudo eliminar el curso... \n "+e);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    private void actualizar(){
        cursos cur = new cursos();

        try {
            String salon = caja_salon.getText().toString();
            String horario = Lista_horarios.getSelectedItem().toString();
            int num_grupo = Integer.parseInt(caja_num_grupo.getText().toString());
            int index_prof = lista_profesores.getSelectedIndex() - 1;
            int index_mat = lista_materias.getSelectedIndex() - 1;

            cur.setSalon(salon);
            cur.setHorario(horario);
            cur.setNum_grupo(num_grupo);
            cur.setCod_profesor(this.profes.get(index_prof).getCodigo());
            cur.setCod_materia(mat.get(index_mat).getId());
            cur.setNombre_profesor(this.profes.get(index_prof).getNombre());
            cur.setApe_profesor(this.profes.get(index_prof).getApellido());
            cur.setNombre_materua(mat.get(index_mat).getNombre());

            cc.actualizar(conexion.obtener(), cur,cod_profe,cod_materia);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el curso \n" + e);
        }
    }
    private int buscar_profe(int parametro) {
        int index = 0;
        int codigo = 0;
        for (int i = 0; i < profes.size(); i++) {
            codigo = Integer.parseInt(profes.get(i).getCodigo().toString());
            if (codigo == parametro) {
                index = i;
                break;
            }
        }
        return index + 1;
    }

    private int buscar_horario(String jornada) {
        int indice = 0;
        switch (jornada) {
            case "Mañana":
                indice = 1;
                break;
            case "Tarde":
                indice = 2;
                break;
            case "Noche":
                indice = 3;
                break;
            default:
                throw new AssertionError();
        }
        return indice;
    }

    private int buscar_materia(int parametro) {
        int indice = 0;
        int codigo = 0;
        for (int i = 0; i < mat.size(); i++) {
            codigo = Integer.parseInt(mat.get(i).getId().toString());
            if (codigo == parametro) {
                indice = i;
                break;
            }

        }
        return indice + 1;
    }

    private boolean validar() {
        boolean bandera = false;
        String salon = caja_salon.getText();
        String horario = Lista_horarios.getSelectedItem().toString();
        String num_grupo = caja_num_grupo.getText();
        String profesor = lista_profesores.getSelectedItem().toString();
        String materia = lista_materias.getSelectedItem().toString();

        if (!salon.trim().equals("")
                && !horario.trim().equals("Seleccionar")
                && !num_grupo.trim().equals("")
                && !profesor.trim().equals("Seleccionar")
                && !materia.trim().equals("Seleccionar")) {
            bandera = true;
        } else {
            bandera = false;
        }
        return bandera;
    }

    private void limpiar_cajas() {
        caja_salon.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lista_horarios;
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JTextField caja_num_grupo;
    private javax.swing.JTextField caja_salon;
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
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> lista_materias;
    private javax.swing.JComboBox<String> lista_profesores;
    private javax.swing.JTable t_cursos;
    // End of variables declaration//GEN-END:variables
}
