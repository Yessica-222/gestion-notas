/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.estudiantes;
import Modelo.Matricula;
import Modelo.Nota;
import controlador.Control_estudiantes;
import controlador.conexion;
import controlador.control_notas;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yessica_Alexandra_Conejo_Munoz
 */
public class crud_notas extends javax.swing.JPanel {
    Control_estudiantes ce =  new Control_estudiantes();
    control_notas cnotas =  new control_notas();
    
    estudiantes es =  new estudiantes();
    Nota n =  new Nota();
    
    List<estudiantes> list_est;
    List<Nota> list_matr_notas;
    
    int cod_estudiante = 0;
    int cod_materia = 0;
    int cod_profesro = 0;
  
    public crud_notas() {
        initComponents();
        this.llenar_lista_estudiantes();
    }

    private void llenar_lista_estudiantes(){
        try {
            list_est = ce.recuperarTodas(conexion.obtener());
            for (int i = 0; i < list_est.size(); i++) {
                if (i == 0) {
                    lista_estudiantes.removeAllItems();
                    lista_estudiantes.addItem("Seleccionar");
                }
                lista_estudiantes.addItem(list_est.get(i).getNombre_estudiante()+" "+list_est.get(i).getApellido_estudiante());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Consultar los Estudiantes...\n"+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_matriculadas = new javax.swing.JTable();
        lista_estudiantes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_curso = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        caja_nota2 = new javax.swing.JTextField();
        caja_nota3 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        caja_nota_final = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        caja_nota1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        tabla_matriculadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Curso", "Nota 1", "Nota 2", "Nota 3", "Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_matriculadas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla_matriculadas.getTableHeader().setReorderingAllowed(false);
        tabla_matriculadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_matriculadasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_matriculadas);
        if (tabla_matriculadas.getColumnModel().getColumnCount() > 0) {
            tabla_matriculadas.getColumnModel().getColumn(0).setPreferredWidth(240);
            tabla_matriculadas.getColumnModel().getColumn(1).setPreferredWidth(30);
            tabla_matriculadas.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabla_matriculadas.getColumnModel().getColumn(3).setPreferredWidth(30);
            tabla_matriculadas.getColumnModel().getColumn(4).setPreferredWidth(30);
        }

        lista_estudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Estudiante:");

        btn_buscar.setText("Buscar cursos Matriculados");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });

        jLabel2.setText("Curso:");

        jLabel3.setText("Nota 1:");

        jLabel4.setText("Nota 2:");

        jLabel5.setText("Nota 3:");

        caja_nota2.setBorder(null);

        caja_nota3.setBorder(null);

        jLabel6.setText("Nota final:");

        caja_nota_final.setBorder(null);

        btn_guardar.setText("Guardar Notas");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar Notas");

        caja_nota1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(label_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(caja_nota2)
                            .addComponent(jSeparator2))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(caja_nota3)
                            .addComponent(jLabel5)
                            .addComponent(jSeparator3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(caja_nota_final)
                            .addComponent(jSeparator4))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_curso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(caja_nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(caja_nota_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guardar)
                            .addComponent(caja_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lista_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lista_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
        int indice = lista_estudiantes.getSelectedIndex();
        indice =  indice -1;
        int codigo = list_est.get(indice).getCodigo_estudiante();
        this.llenar_tabla(codigo);
    }//GEN-LAST:event_btn_buscarMouseClicked

    private void tabla_matriculadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_matriculadasMouseClicked
        int fila = tabla_matriculadas.getSelectedRow();
        
        System.out.println("fila: "+fila);
        label_curso.setText(tabla_matriculadas.getValueAt(fila, 0).toString());
        caja_nota1.setText(list_matr_notas.get(fila).getNota_1().toString());
        caja_nota2.setText(list_matr_notas.get(fila).getNota_2().toString());
        caja_nota3.setText(list_matr_notas.get(fila).getNota_3().toString());
        caja_nota_final.setText(list_matr_notas.get(fila).getNota_final().toString());
        
        cod_estudiante =  Integer.parseInt(list_matr_notas.get(fila).getCod_estudiante().toString());
        cod_materia = Integer.parseInt(list_matr_notas.get(fila).getCod_materia().toString());
        cod_profesro = Integer.parseInt(list_matr_notas.get(fila).getCod_profesor().toString());
    }//GEN-LAST:event_tabla_matriculadasMouseClicked

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        int nota1 = Integer.parseInt(caja_nota1.getText());
        int nota2 = Integer.parseInt(caja_nota2.getText());
        int nota3 = Integer.parseInt(caja_nota3.getText());
        int nota_final = Integer.parseInt(caja_nota_final.getText());
        
        
    }//GEN-LAST:event_btn_guardarActionPerformed
    private void llenar_tabla(int cod_estudiante){
        try {
            list_matr_notas = cnotas.buscar_por_estudiante(conexion.obtener(), cod_estudiante);
            DefaultTableModel tmm = (DefaultTableModel) tabla_matriculadas.getModel();
            tmm.setRowCount(0);
            for (int i = 0; i < list_matr_notas.size(); i++) {
                tmm.addRow(new Object[]{
                    this.list_matr_notas.get(i).getNom_profesor() + " - "
                    + this.list_matr_notas.get(i).getNom_materia() + " - "
                    + this.list_matr_notas.get(i).getHorario(),
                    this.list_matr_notas.get(i).getNota_1(),
                    this.list_matr_notas.get(i).getNota_2(),
                    this.list_matr_notas.get(i).getNota_3(),
                    this.list_matr_notas.get(i).getNota_final()

                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al Consultar Matriculas...\n"+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField caja_nota1;
    private javax.swing.JTextField caja_nota2;
    private javax.swing.JTextField caja_nota3;
    private javax.swing.JTextField caja_nota_final;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel label_curso;
    private javax.swing.JComboBox<String> lista_estudiantes;
    private javax.swing.JTable tabla_matriculadas;
    // End of variables declaration//GEN-END:variables
}
