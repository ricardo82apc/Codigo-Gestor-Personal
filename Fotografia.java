
package foto;

import gestorpersonal.Ingresar;
import static gestorpersonal.Ingresar.jLabel5;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.Buffer;
import javax.media.CannotRealizeException;
import javax.media.CaptureDeviceInfo;
import javax.media.CaptureDeviceManager;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.NoPlayerException;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
import javax.media.util.BufferToImage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Fotografia extends javax.swing.JFrame {

    public Player player;
    public Image imag;
    FileInputStream entrada;
    FileOutputStream salida;
    
    
    
    public Fotografia() {
        
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPWebCam = new javax.swing.JPanel();
        Bcapturar = new javax.swing.JButton();
        Bsalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPWebCam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPWebCam.setLayout(new java.awt.BorderLayout());

        Bcapturar.setText("Capturar");
        Bcapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcapturarActionPerformed(evt);
            }
        });

        Bsalir.setText("Salir");
        Bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Bcapturar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPWebCam, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bcapturar)
                    .addComponent(Bsalir))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BcapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcapturarActionPerformed
        jLabel5.setText(null);
        setImage(jLabel5);            
    }//GEN-LAST:event_BcapturarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        player.stop();
        player.close();
    }//GEN-LAST:event_formWindowClosed

    private void BsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsalirActionPerformed
        int r = JOptionPane.showConfirmDialog(null, "¿Esta Seguro de Capturar Foto?", "Alerta!", JOptionPane.YES_NO_OPTION);       
        if(r != 1){
            dispose();
            Ingresar.Bfoto.setEnabled(false);
        }
        jLabel5.setText(null);
        setImage(jLabel5);
    }//GEN-LAST:event_BsalirActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fotografia().setVisible(true);
            }
        });
    }
    
    public void MuestraWebCam(JPanel panelCam,String dispositivo,String FormatoColor){
        if(player != null)
            return;
        
        CaptureDeviceInfo dev = CaptureDeviceManager.getDevice(dispositivo);
        MediaLocator loc = dev.getLocator();
            try {
                player = Manager.createRealizedPlayer(loc);
            } catch (IOException ex) {
                Logger.getLogger(Foto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoPlayerException ex) {
                Logger.getLogger(Foto.class.getName()).log(Level.SEVERE, null, ex);
            } catch (CannotRealizeException ex) {
                Logger.getLogger(Foto.class.getName()).log(Level.SEVERE, null, ex);
            }
        player.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Foto.class.getName()).log(Level.SEVERE, null, ex);
        }
        Component comp;
        if ((comp = player.getVisualComponent())!= null)
        {         
          panelCam.add(comp,BorderLayout.CENTER);
          pack();
        }
    }

    public void CapturarImagen(){
        FrameGrabbingControl ControlFG = (FrameGrabbingControl) player.getControl("javax.media.control.FrameGrabbingControl");
        Buffer buffer = ControlFG.grabFrame();
        // creamos la imagen awt
       BufferToImage img = new BufferToImage((VideoFormat)buffer.getFormat());
       imag = img.createImage(buffer);
    }

    public void setImage(JLabel lb){
        CapturarImagen();        
        lb.setIcon( new javax.swing.ImageIcon( imag ) );
        System.out.println("ancho= " + imag.getWidth(null));
        System.out.println("alto= " + imag.getHeight(null));
        
    }
      
    public byte[] AbrirImagen(File archivo){
        byte[] bytesImg = new byte[320*240];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
        }
        return bytesImg;
    } 
    
    public void GuardarFoto(File archivo){
        if (imag != null){
            String imagen = archivo.getAbsolutePath();
            File imagenArch = new File(imagen);
            String formato = "JPEG";
            try{
                ImageIO.write((RenderedImage) imag,formato,imagenArch);
            }catch (IOException ioe){}
        }
        else
        {
           System.out.println("No hay imagen");
        }
     }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcapturar;
    private javax.swing.JButton Bsalir;
    public javax.swing.JPanel jPWebCam;
    // End of variables declaration//GEN-END:variables
}
