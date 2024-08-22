package GUI;

import Controlador.ArchivoVehiculo;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import ventavehiculo1.Vehiculo;

public class Venta_Vehiculo extends javax.swing.JFrame {

    private ArrayList<Vehiculo> listaVehiculo;
    private ArchivoVehiculo guardarVehiculo;

    public Venta_Vehiculo() {
        this.listaVehiculo = new ArrayList<>();
        this.guardarVehiculo = new ArchivoVehiculo("vehiculo.txt");

        initComponents();

        cargarDesdeArchivo();

        Tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                if (!event.getValueIsAdjusting()) {
                    int selectedRow = Tabla.getSelectedRow();
                    if (selectedRow != -1) {
                        mostrarDatosVehiculoSelecionado(selectedRow);
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtEjes = new javax.swing.JTextField();
        txtCilindrada = new javax.swing.JTextField();
        txtAño = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnMarca = new javax.swing.JButton();
        btnCilindrada = new javax.swing.JButton();
        btnVehiculo = new javax.swing.JButton();
        btnAño = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnDisminuir = new javax.swing.JButton();
        btnAntiguo = new javax.swing.JButton();
        btnPotente = new javax.swing.JButton();
        btnEconomico = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Venta de Vehiculo"));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/vaporwave-aesthetic-car-wallpaper-scaled.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 480));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setText("Modelo:");

        jLabel3.setText("Marca:");

        jLabel4.setText("Tipo:");

        jLabel5.setText("Año:");

        jLabel6.setText("Cilindraje:");

        jLabel7.setText("Ejes:");

        jLabel8.setText("Valor:");

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                            .addComponent(txtMarca)
                            .addComponent(txtTipo)
                            .addComponent(txtAño)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCilindrada))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtValor))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEjes)))
                .addGap(11, 11, 11))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEjes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 260, 310));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenamientos"));

        btnMarca.setBackground(new java.awt.Color(204, 255, 255));
        btnMarca.setText("Por Marca");
        btnMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcaActionPerformed(evt);
            }
        });

        btnCilindrada.setBackground(new java.awt.Color(204, 255, 255));
        btnCilindrada.setText("Por Cilindrada");
        btnCilindrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCilindradaActionPerformed(evt);
            }
        });

        btnVehiculo.setBackground(new java.awt.Color(204, 255, 255));
        btnVehiculo.setText("Buscar");
        btnVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculoActionPerformed(evt);
            }
        });

        btnAño.setBackground(new java.awt.Color(204, 255, 255));
        btnAño.setText("Por Año");
        btnAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAño, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCilindrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAño, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 260, 160));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta - Operaciones"));

        btnAgregar.setBackground(new java.awt.Color(204, 255, 255));
        btnAgregar.setText("Agregar Vehículo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnDisminuir.setBackground(new java.awt.Color(204, 255, 255));
        btnDisminuir.setText("Disminuir Precio");
        btnDisminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisminuirActionPerformed(evt);
            }
        });

        btnAntiguo.setBackground(new java.awt.Color(204, 255, 255));
        btnAntiguo.setText("Más Antiguo");
        btnAntiguo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAntiguoActionPerformed(evt);
            }
        });

        btnPotente.setBackground(new java.awt.Color(204, 255, 255));
        btnPotente.setText("Más Potente");
        btnPotente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenteActionPerformed(evt);
            }
        });

        btnEconomico.setBackground(new java.awt.Color(204, 255, 255));
        btnEconomico.setText("Más Economico");
        btnEconomico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEconomicoActionPerformed(evt);
            }
        });

        btnComprar.setBackground(new java.awt.Color(204, 255, 255));
        btnComprar.setText("Comprar Vehículo");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDisminuir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAntiguo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEconomico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPotente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPotente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEconomico, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAntiguo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDisminuir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 190, 310));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntos de Extension"));

        btnLimpiar.setBackground(new java.awt.Color(204, 255, 255));
        btnLimpiar.setText("Limpiar Datos ");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 190, 160));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Marca", "Tipo", "Año", "Cilindraje", "Ejes", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 390, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1065, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcaActionPerformed
        ordenarPorMarca();
    }//GEN-LAST:event_btnMarcaActionPerformed

    private void btnCilindradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCilindradaActionPerformed
        ordenarPorCilindrada();
    }//GEN-LAST:event_btnCilindradaActionPerformed

    private void btnVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculoActionPerformed
        buscarPorMarcaModeloAño();
    }//GEN-LAST:event_btnVehiculoActionPerformed

    private void btnAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñoActionPerformed
        ordenarPorAño();
    }//GEN-LAST:event_btnAñoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String tipo = txtTipo.getText();
        int año = Integer.parseInt(txtAño.getText());
        int cilindrada = Integer.parseInt(txtCilindrada.getText());
        int ejes = Integer.parseInt(txtEjes.getText());
        int valor = Integer.parseInt(txtValor.getText());

        Vehiculo vehiculo = new Vehiculo(marca, modelo, tipo, año, cilindrada, ejes, valor);
        listaVehiculo.add(vehiculo);

        LimpiarCampo();
        guardarVehiculo.guardarVehiculo(listaVehiculo);
        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.addRow(new Object[]{vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getTipo(), vehiculo.getAño(), vehiculo.getCilindrada(), vehiculo.getEjes(), vehiculo.getValor()});
        model.fireTableDataChanged();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void LimpiarCampo() {
        txtMarca.setText("");
        txtModelo.setText("");
        txtTipo.setText("");
        txtAño.setText("");
        txtCilindrada.setText("");
        txtEjes.setText("");
        txtValor.setText("");
    }

    private void btnDisminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisminuirActionPerformed
        disminuirPrecio();
    }//GEN-LAST:event_btnDisminuirActionPerformed

    private void btnAntiguoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAntiguoActionPerformed
        vehiculoMasAntiguo();
    }//GEN-LAST:event_btnAntiguoActionPerformed

    private void btnPotenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenteActionPerformed
        vehiculoMasPotente();
    }//GEN-LAST:event_btnPotenteActionPerformed

    private void btnEconomicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEconomicoActionPerformed
        vehiculoMasEconomico();
    }//GEN-LAST:event_btnEconomicoActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        int filaSeleccionada = Tabla.getSelectedRow();

        // Verificar si se ha seleccionado una fila
        if (filaSeleccionada != -1) {
            // Obtener el vehículo correspondiente a la fila seleccionada
            Vehiculo vehiculo = listaVehiculo.get(filaSeleccionada);

            listaVehiculo.remove(vehiculo);

            guardarVehiculo.guardarVehiculo(listaVehiculo);

            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
            model.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(this, "Vehículo comprado con éxito.", "Comprar", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCampo();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void cargarDesdeArchivo() {

        try {
            guardarVehiculo.cargarVehiculos(listaVehiculo);
            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
            for (Vehiculo vehiculo : listaVehiculo) {
                model.addRow(new Object[]{
                    vehiculo.getModelo(),
                    vehiculo.getMarca(),
                    vehiculo.getTipo(),
                    vehiculo.getAño(),
                    vehiculo.getCilindrada(),
                    vehiculo.getEjes(),
                    vehiculo.getValor(),});
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar los datos desde el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarDatosVehiculoSelecionado(int rowIndex) {
        if (rowIndex >= 0 && rowIndex < listaVehiculo.size()) {
            Vehiculo vehiculo = listaVehiculo.get(rowIndex);
            txtMarca.setText(vehiculo.getMarca());
            txtModelo.setText(vehiculo.getModelo());
            txtTipo.setText(vehiculo.getTipo());
            txtAño.setText(String.valueOf(vehiculo.getAño()));
            txtCilindrada.setText(String.valueOf(vehiculo.getCilindrada()));
            txtEjes.setText(String.valueOf(vehiculo.getEjes()));
            txtValor.setText(String.valueOf(vehiculo.getValor()));
        } else {
            LimpiarCampo();
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Venta_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta_Vehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta_Vehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAntiguo;
    private javax.swing.JButton btnAño;
    private javax.swing.JButton btnCilindrada;
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnDisminuir;
    private javax.swing.JButton btnEconomico;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMarca;
    private javax.swing.JButton btnPotente;
    private javax.swing.JButton btnVehiculo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCilindrada;
    private javax.swing.JTextField txtEjes;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void vehiculoMasAntiguo() {
        if (!listaVehiculo.isEmpty()) {
            Vehiculo vehiculoMasAntiguo = listaVehiculo.get(0);
            for (Vehiculo vehiculo : listaVehiculo) {
                if (vehiculo.getAño() < vehiculoMasAntiguo.getAño()) {
                    vehiculoMasAntiguo = vehiculo;
                }
            }

            String mensaje = "Vehículo más antiguo:\n"
                    + "Marca: " + vehiculoMasAntiguo.getMarca() + "\n"
                    + "Modelo: " + vehiculoMasAntiguo.getModelo() + "\n"
                    + "Tipo: " + vehiculoMasAntiguo.getTipo() + "\n"
                    + "Año: " + vehiculoMasAntiguo.getAño() + "\n"
                    + "Cilindrada: " + vehiculoMasAntiguo.getCilindrada() + "\n"
                    + "Ejes: " + vehiculoMasAntiguo.getEjes() + "\n"
                    + "Valor: " + vehiculoMasAntiguo.getValor();

            JOptionPane.showMessageDialog(this, mensaje, "Vehículo más antiguo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No hay vehículos en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void vehiculoMasPotente() {
        if (!listaVehiculo.isEmpty()) {
            Vehiculo vehiculoMasPotente = listaVehiculo.get(0);
            for (Vehiculo vehiculo : listaVehiculo) {
                if (vehiculo.getCilindrada() > vehiculoMasPotente.getCilindrada()) {
                    vehiculoMasPotente = vehiculo;
                }
            }

            String mensaje = "Vehículo más potente:\n"
                    + "Marca: " + vehiculoMasPotente.getMarca() + "\n"
                    + "Modelo: " + vehiculoMasPotente.getModelo() + "\n"
                    + "Tipo: " + vehiculoMasPotente.getTipo() + "\n"
                    + "Año: " + vehiculoMasPotente.getAño() + "\n"
                    + "Cilindrada: " + vehiculoMasPotente.getCilindrada() + "\n"
                    + "Ejes: " + vehiculoMasPotente.getEjes() + "\n"
                    + "Valor: " + vehiculoMasPotente.getValor();

            JOptionPane.showMessageDialog(this, mensaje, "Vehículo más potente", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No hay vehículos en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void vehiculoMasEconomico() {
        if (!listaVehiculo.isEmpty()) {
            Vehiculo vehiculoMasEconomico = listaVehiculo.get(0);
            for (Vehiculo vehiculo : listaVehiculo) {
                if (vehiculo.getValor() < vehiculoMasEconomico.getValor()) {
                    vehiculoMasEconomico = vehiculo;
                }
            }

            String mensaje = "Vehículo más económico:\n"
                    + "Marca: " + vehiculoMasEconomico.getMarca() + "\n"
                    + "Modelo: " + vehiculoMasEconomico.getModelo() + "\n"
                    + "Tipo: " + vehiculoMasEconomico.getTipo() + "\n"
                    + "Año: " + vehiculoMasEconomico.getAño() + "\n"
                    + "Cilindrada: " + vehiculoMasEconomico.getCilindrada() + "\n"
                    + "Ejes: " + vehiculoMasEconomico.getEjes() + "\n"
                    + "Valor: " + vehiculoMasEconomico.getValor();

            JOptionPane.showMessageDialog(this, mensaje, "Vehículo más económico", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No hay vehículos en la lista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ordenarPorMarca() {
        Collections.sort(listaVehiculo, (v1, v2) -> v1.getMarca().compareTo(v2.getMarca()));

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.setRowCount(0);

        for (Vehiculo vehiculo : listaVehiculo) {
            model.addRow(new Object[]{
                vehiculo.getModelo(),
                vehiculo.getMarca(),
                vehiculo.getTipo(),
                vehiculo.getAño(),
                vehiculo.getCilindrada(),
                vehiculo.getEjes(),
                vehiculo.getValor()
            });
        }

        JOptionPane.showMessageDialog(this, "Vehículos ordenados por marca.", "Ordenar por Marca", JOptionPane.INFORMATION_MESSAGE);
    }

    private void ordenarPorCilindrada() {
        Collections.sort(listaVehiculo, (v1, v2) -> Integer.compare(v2.getCilindrada(), v1.getCilindrada()));

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.setRowCount(0);

        for (Vehiculo vehiculo : listaVehiculo) {
            model.addRow(new Object[]{
                vehiculo.getModelo(),
                vehiculo.getMarca(),
                vehiculo.getTipo(),
                vehiculo.getAño(),
                vehiculo.getCilindrada(),
                vehiculo.getEjes(),
                vehiculo.getValor()
            });
        }

        JOptionPane.showMessageDialog(this, "Vehículos ordenados por cilindrada.", "Ordenar por Cilindrada", JOptionPane.INFORMATION_MESSAGE);
    }

    private void ordenarPorAño() {
        Collections.sort(listaVehiculo, (v1, v2) -> Integer.compare(v2.getAño(), v1.getAño()));

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.setRowCount(0);

        for (Vehiculo vehiculo : listaVehiculo) {
            model.addRow(new Object[]{
                vehiculo.getModelo(),
                vehiculo.getMarca(),
                vehiculo.getTipo(),
                vehiculo.getAño(),
                vehiculo.getCilindrada(),
                vehiculo.getEjes(),
                vehiculo.getValor()
            });
        }

        JOptionPane.showMessageDialog(this, "Vehículos ordenados por año.", "Ordenar por Año", JOptionPane.INFORMATION_MESSAGE);
    }

    private void buscarPorMarcaModeloAño() {
        String busqueda = JOptionPane.showInputDialog(this, "Ingrese la marca, modelo o año a buscar:", "Buscar Vehículo", JOptionPane.QUESTION_MESSAGE);

        ArrayList<Vehiculo> vehiculosEncontrados = new ArrayList<>();
        for (Vehiculo vehiculo : listaVehiculo) {
            if (vehiculo.getMarca().equalsIgnoreCase(busqueda) || vehiculo.getModelo().equalsIgnoreCase(busqueda) || String.valueOf(vehiculo.getAño()).equalsIgnoreCase(busqueda)) {
                vehiculosEncontrados.add(vehiculo);
            }
        }

        DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
        model.setRowCount(0);

        for (Vehiculo vehiculo : vehiculosEncontrados) {
            model.addRow(new Object[]{
                vehiculo.getModelo(),
                vehiculo.getMarca(),
                vehiculo.getTipo(),
                vehiculo.getAño(),
                vehiculo.getCilindrada(),
                vehiculo.getEjes(),
                vehiculo.getValor()
            });
        }

        if (vehiculosEncontrados.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron vehículos que coincidan con la búsqueda.", "Buscar Vehículo", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void disminuirPrecio() {
        int filaSeleccionada = Tabla.getSelectedRow();

        if (filaSeleccionada != -1) {
            Vehiculo vehiculo = listaVehiculo.get(filaSeleccionada);

            int nuevoValor = (int) (vehiculo.getValor() * 0.95);

            vehiculo.setValor(nuevoValor);

            // Modificar el valor del vehículo en el archivo
            try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("vehiculo.txt")))) {
                for (Vehiculo v : listaVehiculo) {
                    writer.println(v);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
            model.setValueAt(nuevoValor, filaSeleccionada, 6);

            JOptionPane.showMessageDialog(this, "El valor del vehículo seleccionado se ha disminuido en un 5%.", "Disminuir Valor", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un vehículo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
