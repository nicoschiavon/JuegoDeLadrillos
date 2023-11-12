
package gob.ar.itse.JuegoDeLadrillos.view;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new FondoPanel();
        txtTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRanking = new javax.swing.JTable();
        btnReturn = new javax.swing.JButton();
        cmbxRanking = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        mniArchivo = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtTitulo.setBackground(new java.awt.Color(204, 255, 204));
        txtTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(51, 102, 255));
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitulo.setIcon(new javax.swing.ImageIcon("C:\\Users\\nico_\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\JuegoDeLadrillosV4\\JuegoDeLadrillos\\resources\\Imagen\\ranking2.png")); // NOI18N
        txtTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setColumnHeaderView(tblRanking);
        jScrollPane1.setOpaque(false);

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

        btnReturn.setIcon(new javax.swing.ImageIcon("C:\\Users\\nico_\\OneDrive\\Documentos\\NetBeansProjects\\New Folder\\JuegoDeLadrillosV4\\JuegoDeLadrillos\\resources\\Imagen\\return.png")); // NOI18N

        cmbxRanking.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ultimos Jugadores", "Top 10", "Top 100", "Top 1000" }));
        cmbxRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxRankingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addGap(283, 283, 283)
                        .addComponent(txtTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cmbxRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitulo)
                    .addComponent(btnReturn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbxRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
