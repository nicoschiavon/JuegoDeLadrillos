
package gob.ar.itse.JuegoDeLadrillos.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
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
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new FondoPanel();
        btnLla = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnLla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/lla.png"))); // NOI18N
        btnLla.setBorder(null);
        btnLla.setFocusPainted(false);
        btnLla.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnLla.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/up.png"))); // NOI18N
        btnUp.setBorder(null);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/return.png"))); // NOI18N
        btnReturn.setFocusPainted(false);
        btnReturn.setFocusable(false);
        btnReturn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReturn.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(692, 692, 692)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnReturn)
                    .addComponent(btnLla)
                    .addComponent(btnUp))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnReturn)
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnLla)
                .addGap(35, 35, 35)
                .addComponent(btnUp)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setLocationRelativeTo(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1067, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLla;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnUp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
    
    
class FondoPanel extends JPanel {
       private Image imagen;
       
       @Override
       public void paint(Graphics g) {
           imagen = new ImageIcon(getClass().getResource("/Imagen/bgItse.png")).getImage();
           
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

    public JButton getBtnReturn() {
        return btnReturn;
    }

    
}
