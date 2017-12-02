
package gestorpersonal;

import javax.swing.JOptionPane;
import mysql.Sentencias;

public class Modificar extends javax.swing.JInternalFrame {
        Sentencias s;
        
    public Modificar() {
        s = new Sentencias();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtrut1 = new javax.swing.JTextField();
        txtdepartamento = new javax.swing.JComboBox<>();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcargo = new javax.swing.JTextField();
        txtafp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtsalud = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtrut = new javax.swing.JTextField();
        Bbuscar = new javax.swing.JButton();
        Blimpiar = new javax.swing.JButton();
        Bmodificar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modificar Trabajador");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_edit.png"))); // NOI18N

        txtrut1.setEditable(false);

        txtdepartamento.setBackground(java.awt.SystemColor.info);
        txtdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrativo", "Financiero", "Personal" }));

        txtafp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtafpKeyTyped(evt);
            }
        });

        jLabel7.setText("Departamento");

        txtsalud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsaludKeyTyped(evt);
            }
        });

        jLabel8.setText("Sueldo Base");

        txtsueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsueldoKeyTyped(evt);
            }
        });

        jLabel9.setText("AFP (%)");

        jLabel10.setText("Salud (%)");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Direccion");

        jLabel6.setText("Cargo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Seleccione Trabajador"));

        jLabel1.setText("Seleccionar Rut");

        Bbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/magnifier.png"))); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });

        Blimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/page.png"))); // NOI18N
        Blimpiar.setText("Limpiar");
        Blimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Blimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(Bbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Bbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Blimpiar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Bmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_edit.png"))); // NOI18N
        Bmodificar.setText("Modificar");
        Bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmodificarActionPerformed(evt);
            }
        });

        jLabel5.setText("Rut");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtafp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtrut1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtcargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtsalud)
                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrut1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtcargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtafp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtsalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Bmodificar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        s.update(txtrut.getText());
        String reg=(s.datos[9]);
        if(reg!=null && reg.equals(txtrut.getText())){
                txtrut1.setText(s.datos[0]);
                txtnombre.setText(s.datos[1]);
                txtapellido.setText(s.datos[2]);
                txtdireccion.setText(s.datos[3]);
                txtcargo.setText(s.datos[4]);   
                txtdepartamento.setSelectedItem(s.datos[5]);    
                txtsueldo.setText(s.datos[6]);
                txtafp.setText(String.valueOf(afp()));
                txtsalud.setText(String.valueOf(salud()));               
        }else{
            JOptionPane.showMessageDialog(null,"Trabajador no existe ");
        }       txtrut.setText("");     
         
    }//GEN-LAST:event_BbuscarActionPerformed

    private void BmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmodificarActionPerformed
        if(txtrut1.getText().equals("") || txtnombre.getText().equals("") || txtapellido.getText().equals("") || txtdireccion.getText().equals("") || txtcargo.getText().equals("") || txtdepartamento.getSelectedItem().equals("Seleccionar") || txtsueldo.getText().equals("") || txtafp.getText().equals("") || txtsalud.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Faltan datos" );
        }else{ 
            String [] datos=new String[9];
            datos[0]=txtrut1.getText();       
            datos[1]=txtnombre.getText();       
            datos[2]=txtapellido.getText();       
            datos[3]=txtdireccion.getText();       
            datos[4]=txtcargo.getText();       
            datos[5]=(String) txtdepartamento.getSelectedItem();        
            datos[6]=txtsueldo.getText();
            datos[7]=String.valueOf(afp2());
            datos[8]=String.valueOf(salud2());       
            s.ModificarTrabajador(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7],datos[8]);
            dispose();
        }
    }//GEN-LAST:event_BmodificarActionPerformed

    public double afp(){
        double afp;            
        double afpInt=Double.parseDouble(s.datos[7]);
            afp =(afpInt*100);
        return afp;
    }
    
    public double salud(){
        double salud;
        double saludInt=Double.parseDouble(s.datos[8]);
            salud =(saludInt*100);
        return salud;
    }    
    
    public double afp2(){
        double afp;            
        double afpInt=Double.parseDouble(txtafp.getText());
            afp =(afpInt/100);
        return afp;
    }
    
    public double salud2(){
        double salud;
        double saludInt=Double.parseDouble(txtsalud.getText());
            salud =(saludInt/100);
        return salud;
    }  
    
    private void BlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimpiarActionPerformed
        txtrut.setText("");
        txtrut1.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txtdireccion.setText("");
        txtcargo.setText("");    
        txtdepartamento.setSelectedItem("Seleccionar");    
        txtsueldo.setText(""); 
        txtafp.setText("");
        txtsalud.setText("");
    }//GEN-LAST:event_BlimpiarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Blimpiar;
    private javax.swing.JButton Bmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtafp;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcargo;
    private javax.swing.JComboBox<String> txtdepartamento;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtrut;
    private javax.swing.JTextField txtrut1;
    private javax.swing.JTextField txtsalud;
    private javax.swing.JTextField txtsueldo;
    // End of variables declaration//GEN-END:variables
}
