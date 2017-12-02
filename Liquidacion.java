
package gestorpersonal;

import FormatosImpresion.FormatoLiquidacion;
import calculos.Descuentos;
import calculos.Imponible;
import calculos.NoImponible;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import mysql.Sentencias;

public class Liquidacion extends javax.swing.JInternalFrame {
    
    Sentencias s;

    public Liquidacion() {
        
        s=new Sentencias();
        initComponents();
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rut = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        he = new javax.swing.JTextField();
        Blimpiar = new javax.swing.JButton();
        Bcalcular = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        fecha = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        vdt = new javax.swing.JTextField();
        g = new javax.swing.JTextField();
        the = new javax.swing.JTextField();
        sumaimponible = new javax.swing.JTextField();
        sb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        movilizacion = new javax.swing.JTextField();
        colacion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sumanoimponible = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtafp = new javax.swing.JTextField();
        isapre = new javax.swing.JTextField();
        sumadescuento = new javax.swing.JTextField();
        jpanel10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        totalpagar = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        valorpagartxt = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Liquidacion");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/directory_listing.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingrese Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel1.setText("Ingresar Rut");

        jLabel3.setText("Dias Trabajados");

        jLabel4.setText("Horas Extras");

        dt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtKeyTyped(evt);
            }
        });

        he.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heKeyTyped(evt);
            }
        });

        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/page.png"))); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Bcalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/money_dollar.png"))); // NOI18N
        Bcalcular.setText("Calcular");
        Bcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcalcularActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha");

        txtfecha.setEditable(false);

        fecha.setBackground(java.awt.SystemColor.info);
        fecha.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel6.setText("Cambiar Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(he, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Blimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bcalcular)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(rut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Blimpiar)
                    .addComponent(Bcalcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(he, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Imponible", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel9.setText("Valor Dias Trabajados");

        jLabel10.setText("Gratificacion 25%");

        jLabel11.setText("Horas Extras");

        jLabel12.setText("Total Imponible");

        vdt.setEditable(false);
        vdt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        g.setEditable(false);
        g.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        the.setEditable(false);
        the.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        sumaimponible.setEditable(false);
        sumaimponible.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        sb.setEditable(false);
        sb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        sb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbActionPerformed(evt);
            }
        });

        jLabel2.setText("Sueldo Base");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(g, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(vdt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(the))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sumaimponible, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(sb))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(vdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(the, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumaimponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "No Imponible", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(865, 160));

        jLabel13.setText("Movilizacion");

        jLabel14.setText("Colacion");

        movilizacion.setEditable(false);
        movilizacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        colacion.setEditable(false);
        colacion.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel16.setText("Total No Imponible");

        sumanoimponible.setEditable(false);
        sumanoimponible.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(colacion, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(movilizacion))
                .addGap(90, 90, 90)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumanoimponible, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(movilizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(colacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumanoimponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Descuentos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel17.setText("AFP");

        jLabel18.setText("Salud");

        jLabel19.setText("Total Descuento");

        txtafp.setEditable(false);
        txtafp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        isapre.setEditable(false);
        isapre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        sumadescuento.setEditable(false);
        sumadescuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(81, 81, 81)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtafp, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(isapre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sumadescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtafp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(isapre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sumadescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Total a Pagar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel20.setText("Total a Pagar");

        totalpagar.setEditable(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/printer.png"))); // NOI18N
        jButton3.setText("Imprimir");
        jButton3.setToolTipText("");
        jButton3.setActionCommand("Generar\nLiquidacion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanel10Layout = new javax.swing.GroupLayout(jpanel10);
        jpanel10.setLayout(jpanel10Layout);
        jpanel10Layout.setHorizontalGroup(
            jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(42, 42, 42)
                .addGroup(jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanel10Layout.createSequentialGroup()
                        .addGroup(jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpanel10Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(valorpagartxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpanel10Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(165, 165, 165))
                    .addGroup(jpanel10Layout.createSequentialGroup()
                        .addComponent(totalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(85, 85, 85))))
        );
        jpanel10Layout.setVerticalGroup(
            jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(totalpagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(valorpagartxt))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcalcularActionPerformed
        Calendar date=new GregorianCalendar();
        String c=dt.getText(); 
             
         
          
        int año=date.get(Calendar.YEAR);
        String r=(rut.getText());
        String d=(dt.getText());
        int ditr=Integer.parseInt(dt.getText()); 
        String h=(he.getText());
        if(fecha.getSelectedItem()=="-----"){
            txtfecha.setText(Fecha()); 
        }else{
            txtfecha.setText((String) fecha.getSelectedItem()+" / "+año);
            fecha.setSelectedItem("-----");
        }
        if(r.equals("") || d.equals("") || h.equals("")){    
            JOptionPane.showMessageDialog(null, "Faltan Datos");            
        }else if(ditr > 30){
            JOptionPane.showMessageDialog(null, "Valor supera los 30 dias trabajados");
                rut.setText("");
                dt.setText("");
                he.setText("");
        }else{
            s.update(rut.getText());
            String reg=(s.datos[9]);
            
        if (reg!=null && reg.equals(rut.getText())){
                Calcular();
            }else{
                JOptionPane.showMessageDialog(null,"Trabajador no existe ");
                rut.setText("");
                dt.setText("");
                he.setText("");               
            }
        }
    }//GEN-LAST:event_BcalcularActionPerformed
         
    public void Calcular(){
   
        String run=(rut.getText());
        s.update(run);
        sb.setText(s.datos[6]);
        int sba=Integer.parseInt(sb.getText());
        double afp=Double.parseDouble(s.datos[7]);
        double salud=Double.parseDouble(s.datos[8]);
        int ditr=Integer.parseInt(dt.getText()); 
        int ex=Integer.parseInt(he.getText());
        
        Imponible i=new Imponible(ditr,ex,sba); 
        
        vdt.setText(String.valueOf(i.vdiastrabajados()));
        g.setText(String.valueOf(i.gratificacion()));
        the.setText(String.valueOf(i.vhorasextras()));
        sumaimponible.setText(String.valueOf(i.sumaImponible()));
        
        NoImponible ni=new NoImponible(i.sumaImponible(),ditr);       
        colacion.setText(String.valueOf(ni.colacion()));
        movilizacion.setText(String.valueOf(ni.movilizacion()));
        sumanoimponible.setText(String.valueOf(ni.sumanoImponible()));
        
        Descuentos d=new Descuentos(i.sumaImponible(),afp,salud);       
        txtafp.setText(String.valueOf(d.afp()));
        isapre.setText(String.valueOf(d.isapre()));
        sumadescuento.setText(String.valueOf(d.sumadescuento()));
        int pagar=i.sumaImponible()+ni.sumanoImponible()-d.sumadescuento(); 
        totalpagar.setText(String.valueOf(pagar));       
    }
    
    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        rut.setText("");
        dt.setText("");
        he.setText("");   
        colacion.setText("");   
        g.setText("");  
        isapre.setText("");   
        movilizacion.setText("");    
        sb.setText("");
        sumadescuento.setText("");
        sumaimponible.setText("");
        sumanoimponible.setText("");
        the.setText("");
        totalpagar.setText("");
        txtafp.setText("");
        vdt.setText("");       
    }//GEN-LAST:event_BlimpiarActionPerformed

    private void sbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sbActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FormatoLiquidacion fl = new FormatoLiquidacion();
        String run=(rut.getText());
        s.update(run);
        fl.txtnombre.setText(s.datos[1]);
        fl.txtapellido.setText(s.datos[2]);
        fl.txtcargo.setText(s.datos[4]);
        fl.txtdepto.setText(s.datos[5]);
        fl.rut.setText(rut.getText());
        fl.dt.setText(dt.getText());           
        fl.colacion.setText(colacion.getText());        
        fl.g.setText(g.getText());          
        fl.isapre.setText(isapre.getText());       
        fl.movilizacion.setText(movilizacion.getText());        
        fl.sb.setText(sb.getText());       
        fl.sumadescuento.setText(sumadescuento.getText());       
        fl.sumaimponible.setText(sumaimponible.getText());        
        fl.sumanoimponible.setText(sumanoimponible.getText());      
        fl.the.setText(the.getText());       
        fl.totalpagar.setText(totalpagar.getText());       
        fl.txtafp.setText(txtafp.getText());
        fl.txtfecha.setText(txtfecha.getText());
        dispose();
        fl.imprimir();
        s.NuevaLiquidacion(rut.getText(),s.datos[1],s.datos[2],s.datos[4],s.datos[5],dt.getText(),he.getText(),sb.getText(),txtfecha.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep();                
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Solo Numeros ");               
          } 
    }//GEN-LAST:event_dtKeyTyped

    private void heKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep();                
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Solo Numeros ");               
          } 
    }//GEN-LAST:event_heKeyTyped

    public String Fecha(){
        String fecha="", fecha1;
        Calendar date=new GregorianCalendar();        
        int mes=date.get(Calendar.MONTH);
        int año=date.get(Calendar.YEAR);       
        fecha1 =(mes+1)+" / "+año;
        if(mes+1==1){
            fecha=("Enero / "+año);
        }else if(mes+1==2){
            fecha=("Febrero / "+año);
        }else if(mes+1==3){
            fecha=("Marzo / "+año);
        }else if(mes+1==4){
            fecha=("Abril / "+año);
        }else if(mes+1==5){
            fecha=("Mayo / "+año);
        }else if(mes+1==6){
            fecha=("Junio / "+año);
        }else if(mes+1==7){
            fecha=("Julio / "+año);
        }else if(mes+1==8){
            fecha=("Agosto / "+año);
        }else if(mes+1==9){
            fecha=("Septiembre / "+año);
        }else if(mes+1==10){
            fecha=("Octubre / "+año);
        }else if(mes+1==11){
            fecha=("Noviembre / "+año);
        }else if(mes+1==12){
            fecha=("Diciembre / "+año);
        }
        return fecha;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcalcular;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JTextField colacion;
    private javax.swing.JTextField dt;
    private javax.swing.JComboBox<String> fecha;
    private javax.swing.JTextField g;
    private javax.swing.JTextField he;
    private javax.swing.JTextField isapre;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jpanel10;
    private javax.swing.JTextField movilizacion;
    public javax.swing.JTextField rut;
    private javax.swing.JTextField sb;
    private javax.swing.JTextField sumadescuento;
    private javax.swing.JTextField sumaimponible;
    private javax.swing.JTextField sumanoimponible;
    private javax.swing.JTextField the;
    private javax.swing.JTextField totalpagar;
    private javax.swing.JTextField txtafp;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JLabel valorpagartxt;
    private javax.swing.JTextField vdt;
    // End of variables declaration//GEN-END:variables
}
