
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
public class PrincipalView extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalView
     */
    public PrincipalView() {
        
        FondoPanel fondo = new FondoPanel();
    
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new FondoPanel();
        jButton1 = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnRanking = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(8);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/exit.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(242, 242, 242));
        btnIniciar.setForeground(new java.awt.Color(242, 242, 242));
        btnIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Start.png"))); // NOI18N
        btnIniciar.setBorder(null);
        btnIniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIniciar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnRanking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Ranking.png"))); // NOI18N
        btnRanking.setBorder(null);
        btnRanking.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRanking.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlPrincipalLayout = new javax.swing.GroupLayout(pnlPrincipal);
        pnlPrincipal.setLayout(pnlPrincipalLayout);
        pnlPrincipalLayout.setHorizontalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addGroup(pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar)
                    .addComponent(jButton1)
                    .addComponent(btnRanking))
                .addGap(892, 892, 892))
        );
        pnlPrincipalLayout.setVerticalGroup(
            pnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrincipalLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(124, 124, 124)
                .addComponent(btnIniciar)
                .addGap(112, 112, 112)
                .addComponent(btnRanking)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        btnIniciar.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1192, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRanking;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
       private Image imagen;
       
       @Override
       public void paint(Graphics g) {
           imagen = new ImageIcon(getClass().getResource("/Imagen/bgprinc.jpg")).getImage();
           
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           
           setOpaque(false);
           super.paint(g);
       }
    }

    public JButton getBtnIniciar() {
        return btnIniciar;
    }

    public JButton getBtnRanking() {
        return btnRanking;
    }

    public JPanel getPnlPrincipal() {
        return pnlPrincipal;
    }

    public JButton getBtnSalir() {
        return jButton1;
    }

   
    
}
