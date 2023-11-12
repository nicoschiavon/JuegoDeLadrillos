
package gob.ar.itse.JuegoDeLadrillos.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author nico_
 */
public class JugadoresView extends javax.swing.JFrame {

    /**
     * Creates new form JugadoresView
     */
    public JugadoresView() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new FondoPanel();
        btnLla = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnLla.setIcon(new javax.swing.ImageIcon("C:\\Users\\nico_\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\JuegoDeLadrillosV4\\JuegoDeLadrillos\\resources\\Imagen\\lla.png")); // NOI18N
        btnLla.setFocusPainted(false);
        btnLla.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLla.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnUp.setIcon(new javax.swing.ImageIcon("C:\\Users\\nico_\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\JuegoDeLadrillosV4\\JuegoDeLadrillos\\resources\\Imagen\\up.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(btnLla)
                .addGap(139, 139, 139)
                .addComponent(btnUp)
                .addContainerGap(239, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLla)
                    .addComponent(btnUp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        setLocationRelativeTo(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 991, 442);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLla;
    private javax.swing.JButton btnUp;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
    
    
class FondoPanel extends JPanel {
       private Image imagen;
       
       @Override
       public void paint(Graphics g) {
           imagen = new ImageIcon(getClass().getResource("/Imagen/bg3.png")).getImage();
           
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           
           setOpaque(false);
           super.paint(g);
       }
    }

    public JButton getBtnLla() {
        return btnLla;
    }

    public JButton getBtnUp() {
        return btnUp;
    }

}
