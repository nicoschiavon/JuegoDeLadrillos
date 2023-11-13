
package gob.ar.itse.JuegoDeLadrillos.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author nico_
 */
public class RankingView extends javax.swing.JFrame {

    /**
     * Creates new form RankingvView
     */
    public RankingView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new FondoPanel();
        btnReturn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRanking = new javax.swing.JTable();
        txtTitulo = new javax.swing.JLabel();
        cmbxRanking = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniArchivo = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/return.png"))); // NOI18N
        btnReturn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanel1.add(btnReturn, gridBagConstraints);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(tblRanking);
        jScrollPane1.setOpaque(false);

        tblRanking.setBackground(new java.awt.Color(204, 204, 255));
        tblRanking.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        tblRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Puntos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblRanking.setOpaque(false);
        tblRanking.setRowHeight(40);
        tblRanking.setTableHeader(null);
        jScrollPane1.setViewportView(tblRanking);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 394;
        gridBagConstraints.ipady = 705;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 179, 0, 263);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        txtTitulo.setBackground(new java.awt.Color(204, 255, 204));
        txtTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(51, 102, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gob/ar/itse/JuegoDeLadrillos/view/ranking2.png"))); // NOI18N
        txtTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 158, 0, 0);
        jPanel1.add(txtTitulo, gridBagConstraints);

        cmbxRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ultimos Jugadores", "Top 10", "Top 100", "Top 1000" }));
        cmbxRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxRankingActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 70, 0, 0);
        jPanel1.add(cmbxRanking, gridBagConstraints);

        mniArchivo.setText("Archivo");

        mniSalir.setText("Salir");
        mniArchivo.add(mniSalir);

        jMenuBar1.add(mniArchivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbxRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxRankingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxRankingActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbxRanking;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu mniArchivo;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JTable tblRanking;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables

    public JMenuItem getMniSalir() {
        return mniSalir;
    }

    public JTable getTblRanking() {
        return tblRanking;
    }

    public JLabel getTxtTitulo() {
        return txtTitulo;
    }

    public JButton getBtnReturn() {
        return btnReturn;
    }

    public JComboBox<String> getCmbxRanking() {
        return cmbxRanking;
    }
    
    

    class FondoPanel extends JPanel {
       private Image imagen;
       
       @Override
       public void paint(Graphics g) {
           imagen = new ImageIcon(getClass().getResource("/Imagen/background.png")).getImage();
           
           g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           
           setOpaque(false);
           super.paint(g);
       }
    }




}
