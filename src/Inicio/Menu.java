/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import SubPaneles.BebidasSinAlcohol;
import SubPaneles.Botellas;
import SubPaneles.CaldosAntojos;
import SubPaneles.Ceviches;
import SubPaneles.ConAlcohol;
import SubPaneles.Hamburguesas;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author jluis
 */
public class Menu extends javax.swing.JFrame {
     int noorden;
     int nomesa;
    /**
     * Creates new form Menu
     * @param a
     * @param b
     */
    public Menu(int a,int b) {
        initComponents();
        setLocationRelativeTo(null);
        this.nomesa = a;
        this.noorden = b;
        
        Ordentxt.setText(String.valueOf(b));
        mesatxt.setText(String.valueOf(a));
        
        String texto1 = "<html><center><body>HAMBURGUEZAS<br>Y<br>FUERA DEL MAR</body></center></html>";
        Titulo2.setText(texto1);
        String texto2 = "<html><center><body>AMANTES DEL CEVICHE<br>Y<br>SABORES DEL MAR</body></center></html>";
        Titulo3.setText(texto2);
        String texto3 = "<html><center><body>BEBIDAS SIN<br>ALCOHOL</body></center></html>";
        Titulo4.setText(texto3);
        String texto4 = "<html><center><body>BEBIDAS CON<br>ALCOHOL</body></center></html>";
        Titulo5.setText(texto4);
        String texto5 = "<html><center><body>BOTELLAS</body></center></html>";
        Titulo6.setText(texto5);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Menu1 = new ClassAngels.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        Menu2 = new ClassAngels.PanelRound();
        Titulo2 = new javax.swing.JLabel();
        Menu3 = new ClassAngels.PanelRound();
        Titulo3 = new javax.swing.JLabel();
        Menu4 = new ClassAngels.PanelRound();
        Titulo4 = new javax.swing.JLabel();
        Menu5 = new ClassAngels.PanelRound();
        Titulo5 = new javax.swing.JLabel();
        Menu6 = new ClassAngels.PanelRound();
        Titulo6 = new javax.swing.JLabel();
        Menu7 = new ClassAngels.PanelRound();
        Titulo7 = new javax.swing.JLabel();
        PanelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ordentxt = new javax.swing.JTextField();
        mesatxt = new javax.swing.JTextField();
        panelRound1 = new ClassAngels.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 643));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu1.setBackground(new java.awt.Color(255, 204, 153));
        Menu1.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu1.setRoundTopLeft(20);
        Menu1.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALDOS / PAL ANTOJO");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu1Layout = new javax.swing.GroupLayout(Menu1);
        Menu1.setLayout(Menu1Layout);
        Menu1Layout.setHorizontalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Menu1Layout.setVerticalGroup(
            Menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu2.setBackground(new java.awt.Color(204, 204, 255));
        Menu2.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu2.setRoundTopLeft(20);
        Menu2.setRoundTopRight(20);

        Titulo2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo2.setText("Hamburguesas / Feura Mar");
        Titulo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu2Layout = new javax.swing.GroupLayout(Menu2);
        Menu2.setLayout(Menu2Layout);
        Menu2Layout.setHorizontalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Menu2Layout.setVerticalGroup(
            Menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu3.setBackground(new java.awt.Color(0, 204, 204));
        Menu3.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu3.setRoundTopLeft(20);
        Menu3.setRoundTopRight(20);

        Titulo3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo3.setText("CEVICHES");
        Titulo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu3Layout = new javax.swing.GroupLayout(Menu3);
        Menu3.setLayout(Menu3Layout);
        Menu3Layout.setHorizontalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Menu3Layout.setVerticalGroup(
            Menu3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu4.setBackground(new java.awt.Color(153, 255, 204));
        Menu4.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu4.setRoundTopLeft(20);
        Menu4.setRoundTopRight(20);

        Titulo4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo4.setText("SIN ALCOHOL");
        Titulo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu4Layout = new javax.swing.GroupLayout(Menu4);
        Menu4.setLayout(Menu4Layout);
        Menu4Layout.setHorizontalGroup(
            Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Menu4Layout.setVerticalGroup(
            Menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu5.setBackground(new java.awt.Color(204, 204, 204));
        Menu5.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu5.setRoundTopLeft(20);
        Menu5.setRoundTopRight(20);

        Titulo5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo5.setText("CON ALCOHOL");
        Titulo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu5Layout = new javax.swing.GroupLayout(Menu5);
        Menu5.setLayout(Menu5Layout);
        Menu5Layout.setHorizontalGroup(
            Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Menu5Layout.setVerticalGroup(
            Menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu6.setBackground(new java.awt.Color(51, 153, 255));
        Menu6.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu6.setRoundTopLeft(20);
        Menu6.setRoundTopRight(20);

        Titulo6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo6.setText("BOTELLAS");
        Titulo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Titulo6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Menu6Layout = new javax.swing.GroupLayout(Menu6);
        Menu6.setLayout(Menu6Layout);
        Menu6Layout.setHorizontalGroup(
            Menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Menu6Layout.setVerticalGroup(
            Menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Menu7.setBackground(new java.awt.Color(153, 204, 255));
        Menu7.setPreferredSize(new java.awt.Dimension(145, 50));
        Menu7.setRoundTopLeft(20);
        Menu7.setRoundTopRight(20);

        Titulo7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Titulo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo7.setText("jLabel9");

        javax.swing.GroupLayout Menu7Layout = new javax.swing.GroupLayout(Menu7);
        Menu7.setLayout(Menu7Layout);
        Menu7Layout.setHorizontalGroup(
            Menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo7, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );
        Menu7Layout.setVerticalGroup(
            Menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        PanelMenu.setPreferredSize(new java.awt.Dimension(697, 587));

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1060, 410));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cantidad", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 700, 190));

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("NO. ORDEN");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("NO. MESA");
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 56, -1, 30));
        jPanel6.add(Ordentxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 17, 90, -1));
        jPanel6.add(mesatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 90, -1));

        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("GENERAR ORDEN");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        jPanel6.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("TOTAL");
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 177, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 360, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
    CaldosAntojos op1 = new CaldosAntojos();
    op1.setSize(1060, 410);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    //CambiarBodes();
    //P1.setBorder(BorderFactory.createMatteBorder(0, 0, 10, 0, Color.red));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void Titulo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo2MouseClicked
    Hamburguesas op1 = new Hamburguesas();
    op1.setSize(1060, 410);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo2MouseClicked

    private void Titulo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo3MouseClicked
    Ceviches op1 = new Ceviches();
    op1.setSize(1060, 410);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo3MouseClicked

    private void Titulo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo4MouseClicked
    BebidasSinAlcohol op1 = new BebidasSinAlcohol();
    op1.setSize(1060, 410);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo4MouseClicked

    private void Titulo5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo5MouseClicked
    ConAlcohol op1 = new ConAlcohol();
    op1.setSize(1060, 410);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo5MouseClicked

    private void Titulo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Titulo6MouseClicked
    Botellas op1 = new Botellas();
    op1.setSize(1060, 410);
    op1.setLocation(0, 0);
    PanelMenu.removeAll();
    PanelMenu.add(op1,BorderLayout.CENTER);
    PanelMenu.revalidate();
    PanelMenu.repaint();
    }//GEN-LAST:event_Titulo6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new MenuSeguimiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound Menu1;
    private ClassAngels.PanelRound Menu2;
    private ClassAngels.PanelRound Menu3;
    private ClassAngels.PanelRound Menu4;
    private ClassAngels.PanelRound Menu5;
    private ClassAngels.PanelRound Menu6;
    private ClassAngels.PanelRound Menu7;
    private javax.swing.JTextField Ordentxt;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Titulo3;
    private javax.swing.JLabel Titulo4;
    private javax.swing.JLabel Titulo5;
    private javax.swing.JLabel Titulo6;
    private javax.swing.JLabel Titulo7;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField mesatxt;
    private ClassAngels.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
