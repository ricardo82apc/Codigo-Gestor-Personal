
package gestorpersonal;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Principal extends javax.swing.JFrame {
        Ingresar ing = new Ingresar();
        Modificar mod = new Modificar();
        Eliminar eli = new Eliminar();
        Liquidacion liq = new Liquidacion();
        Buscar Bus = new Buscar();
        BuscarEliminados BusE = new BuscarEliminados();
        Credencial c = new Credencial();
        Liquidacion2 liq2 = new Liquidacion2();
        CambiarFoto cf = new CambiarFoto();
    public Principal() {
        initComponents();
         
        Image icon = new ImageIcon(getClass().getResource("/iconos/iconoGPv2.png")).getImage();
        this.setIconImage(icon); 
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        Pprincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuIngresar = new javax.swing.JMenuItem();
        MenuModificar = new javax.swing.JMenuItem();
        MenuEliminar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuLiquidacion = new javax.swing.JMenuItem();
        MenuCredencial = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuBuscar = new javax.swing.JMenuItem();
        MenuBuscarEliminados = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GP Principal");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/logoGPv2.png"))); // NOI18N

        javax.swing.GroupLayout PprincipalLayout = new javax.swing.GroupLayout(Pprincipal);
        Pprincipal.setLayout(PprincipalLayout);
        PprincipalLayout.setHorizontalGroup(
            PprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PprincipalLayout.createSequentialGroup()
                .addContainerGap(547, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        PprincipalLayout.setVerticalGroup(
            PprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PprincipalLayout.createSequentialGroup()
                .addContainerGap(238, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Administrar         ");

        MenuIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_go.png"))); // NOI18N
        MenuIngresar.setText("Ingresar");
        MenuIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuIngresar);

        MenuModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_edit.png"))); // NOI18N
        MenuModificar.setText("Modificar");
        MenuModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModificarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuModificar);

        MenuEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_delete.png"))); // NOI18N
        MenuEliminar.setText("Eliminar");
        MenuEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(MenuEliminar);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/camera_add.png"))); // NOI18N
        jMenuItem2.setText("Cambiar Foto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Imprimir            ");

        MenuLiquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/directory_listing.png"))); // NOI18N
        MenuLiquidacion.setText("Liquidacion");
        MenuLiquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLiquidacionActionPerformed(evt);
            }
        });
        jMenu2.add(MenuLiquidacion);

        MenuCredencial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/card_ipod.png"))); // NOI18N
        MenuCredencial.setText("Credencial");
        MenuCredencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCredencialActionPerformed(evt);
            }
        });
        jMenu2.add(MenuCredencial);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestion             ");

        MenuBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/status_online.png"))); // NOI18N
        MenuBuscar.setText("Buscar");
        MenuBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarActionPerformed(evt);
            }
        });
        jMenu3.add(MenuBuscar);

        MenuBuscarEliminados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/status_busy.png"))); // NOI18N
        MenuBuscarEliminados.setText("Buscar Eliminados");
        MenuBuscarEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarEliminadosActionPerformed(evt);
            }
        });
        jMenu3.add(MenuBuscarEliminados);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/directory_listing.png"))); // NOI18N
        jMenuItem1.setText("Buscar Liquidacion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Pprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngresarActionPerformed
        
        Pprincipal.add(ing);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = ing.getSize();
        ing.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        ing.show();
        mod.dispose();
        eli.dispose();
        liq.dispose();
        Bus.dispose();
        BusE.dispose();
        c.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuIngresarActionPerformed

    private void MenuModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModificarActionPerformed
        
        Pprincipal.add(mod);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = mod.getSize();
        mod.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        mod.show();
        ing.dispose();
        eli.dispose();
        liq.dispose();
        Bus.dispose();
        BusE.dispose();
        c.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuModificarActionPerformed

    private void MenuEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliminarActionPerformed
        
        Pprincipal.add(eli);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = eli.getSize();
        eli.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        eli.show();
        ing.dispose();
        mod.dispose();
        liq.dispose();
        Bus.dispose();
        BusE.dispose();
        c.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuEliminarActionPerformed

    private void MenuLiquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLiquidacionActionPerformed
       
        Pprincipal.add(liq);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = liq.getSize();
        liq.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        liq.show();
        ing.dispose();
        mod.dispose();
        eli.dispose();
        Bus.dispose();
        BusE.dispose();
        c.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuLiquidacionActionPerformed

    private void MenuBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarActionPerformed
        
        Pprincipal.add(Bus);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = Bus.getSize();
        Bus.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        Bus.show();
        ing.dispose();
        mod.dispose();
        eli.dispose();
        liq.dispose();
        BusE.dispose();
        c.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuBuscarActionPerformed

    private void MenuBuscarEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarEliminadosActionPerformed
        
        Pprincipal.add(BusE);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = BusE.getSize();
        BusE.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        BusE.show();
        ing.dispose();
        mod.dispose();
        eli.dispose();
        liq.dispose();
        Bus.dispose();
        c.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuBuscarEliminadosActionPerformed

    private void MenuCredencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCredencialActionPerformed
        
        Pprincipal.add(c);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = c.getSize();
        c.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        c.show();
        ing.dispose();
        mod.dispose();
        eli.dispose();
        liq.dispose();
        Bus.dispose();
        BusE.dispose();
        liq2.dispose();
        cf.dispose();
    }//GEN-LAST:event_MenuCredencialActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        Pprincipal.add(liq2);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = liq2.getSize();
        liq2.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        liq2.show();
        ing.dispose();
        mod.dispose();
        eli.dispose();
        liq.dispose();
        Bus.dispose();
        BusE.dispose();
        c.dispose();
        cf.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        Pprincipal.add(cf);
        //ajustar al centro pantalla
        Dimension desktopSize = Pprincipal.getSize();
        Dimension FrameSize = cf.getSize();
        cf.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        cf.show();
        ing.dispose();
        mod.dispose();
        eli.dispose();
        liq.dispose();
        Bus.dispose();
        BusE.dispose();
        c.dispose();
        liq2.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuBuscar;
    private javax.swing.JMenuItem MenuBuscarEliminados;
    private javax.swing.JMenuItem MenuCredencial;
    private javax.swing.JMenuItem MenuEliminar;
    private javax.swing.JMenuItem MenuIngresar;
    public javax.swing.JMenuItem MenuLiquidacion;
    private javax.swing.JMenuItem MenuModificar;
    private javax.swing.JPanel Pprincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}
