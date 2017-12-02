
package gestorpersonal;

import foto.Fotografia;
import java.io.File;
import javax.swing.JOptionPane;
import mysql.Sentencias;


public class Ingresar extends javax.swing.JInternalFrame {
        Sentencias s;
        Fotografia foto = new Fotografia();
       
    public Ingresar() {
        s = new Sentencias();        
        initComponents();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bfoto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Blimpiar = new javax.swing.JButton();
        Bguardar = new javax.swing.JButton();
        txtdepartamento = new javax.swing.JComboBox<>();
        txtdireccion = new javax.swing.JTextField();
        txtafp = new javax.swing.JTextField();
        txtsalud = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ingresar Trabajador");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_go.png"))); // NOI18N

        Bfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camera_add.png"))); // NOI18N
        Bfoto.setText("Hacer Foto");
        Bfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BfotoActionPerformed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("FOTO");
        jLabel5.setToolTipText("");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Rut");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Direccion");

        jLabel6.setText("Cargo");

        jLabel7.setText("Departamento");

        jLabel8.setText("Sueldo Base");

        txtsueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsueldoKeyTyped(evt);
            }
        });

        jLabel9.setText("AFP (%)");

        jLabel10.setText("Salud (%)");

        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/page.png"))); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        Bguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/database_save.png"))); // NOI18N
        Bguardar.setText("Guardar");
        Bguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BguardarActionPerformed(evt);
            }
        });

        txtdepartamento.setBackground(java.awt.SystemColor.info);
        txtdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrativo", "Financiero", "Personal" }));
        txtdepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdepartamentoActionPerformed(evt);
            }
        });

        txtafp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtafpKeyTyped(evt);
            }
        });

        txtsalud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsaludKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcargo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(txtapellido)
                                    .addComponent(txtrut)
                                    .addComponent(txtnombre)
                                    .addComponent(txtdireccion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdepartamento, 0, 139, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtsueldo))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(277, 277, 277)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(Bfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jLabel9)))
                        .addGap(18, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtafp, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtsalud))))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Blimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(Bguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bfoto)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtafp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bguardar)
                    .addComponent(Blimpiar))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void BfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BfotoActionPerformed
        foto.MuestraWebCam(foto.jPWebCam,"vfw:Microsoft WDM Image Capture (Win32):0","yuv");     
        foto.setVisible(true);
        foto.player.start();
    }//GEN-LAST:event_BfotoActionPerformed
    
    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        txtrut.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txtcargo.setText("");    
        txtdepartamento.setSelectedItem("Seleccionar");    
        txtsueldo.setText(""); 
        txtafp.setText("");
        txtsalud.setText("");
        jLabel5.setText("foto");
    }//GEN-LAST:event_BlimpiarActionPerformed
      
    private void BguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BguardarActionPerformed
        //C:\Users\RPEREZ\Documents\NetBeansProjects\GestorPersonal\src\foto\imagenes
        File archivo=new File("C:\\Users\\RPEREZ\\Documents\\NetBeansProjects\\GestorPersonal\\src\\foto\\imagenes\\"+txtrut.getText()+".jpg");       
        s.updateEliminado(txtrut.getText());
        String reg=(s.dato[0]);
              
        if(txtrut.getText().equals("") || txtnombre.getText().equals("") || txtapellido.getText().equals("") || txtdireccion.getText().equals("") || txtcargo.getText().equals("") || txtdepartamento.getSelectedItem().equals("Seleccionar") || txtsueldo.getText().equals("") || txtafp.getText().equals("") || txtsalud.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Falta Ingresar datos" );
        }else if (reg!=null && reg.equals(txtrut.getText())){
            int r = JOptionPane.showConfirmDialog(null, "¿Trabajador esta Eliminado, Desea Reincorporar?", "Alerta!", JOptionPane.YES_NO_OPTION); 
            if(r != 1){
                String [] datos=new String[9];
                datos[0]=txtrut.getText();       
                datos[1]=txtnombre.getText();       
                datos[2]=txtapellido.getText();       
                datos[3]=txtdireccion.getText();       
                datos[4]=txtcargo.getText();       
                datos[5]=(String) txtdepartamento.getSelectedItem();        
                datos[6]=txtsueldo.getText();
                datos[7]=String.valueOf(afp());
                datos[8]=String.valueOf(salud());
                s.NuevoTrabajador(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7],datos[8]);            
                txtrut.setText("");
                txtnombre.setText("");
                txtapellido.setText("");
                txtdireccion.setText("");
                txtcargo.setText("");    
                txtdepartamento.setSelectedItem("Seleccionar");    
                txtsueldo.setText(""); 
                txtafp.setText("");
                txtsalud.setText("");
                jLabel5.setText("foto");
                foto.GuardarFoto(archivo);
                dispose();
            }
        }    
    }//GEN-LAST:event_BguardarActionPerformed

    private void txtdepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdepartamentoActionPerformed

    private void txtsueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsueldoKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep();                
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Solo Numeros ");               
          } 
    }//GEN-LAST:event_txtsueldoKeyTyped

    private void txtafpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtafpKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep();                
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Solo Numeros ");               
          } 
    }//GEN-LAST:event_txtafpKeyTyped

    private void txtsaludKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsaludKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep();                
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Solo Numeros ");               
          } 
    }//GEN-LAST:event_txtsaludKeyTyped
    
    public double afp(){
        double afp=0;
        if(txtafp.getText()!=("")){
            double afpInt=Double.parseDouble(txtafp.getText());
            afp =(afpInt/100);
        }    
        return afp;
    }
    
    public double salud(){
        double salud=0;
        if(txtsalud.getText()!=("")){
            double saludInt=Double.parseDouble(txtsalud.getText());
            salud =(saludInt/100);
        }
        return salud;
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Bfoto;
    private javax.swing.JButton Bguardar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtafp;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JComboBox<String> txtdepartamento;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtrut;
    private javax.swing.JTextField txtsalud;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
}
