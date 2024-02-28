/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inicio;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jluis
 */
public class Ordenes extends javax.swing.JFrame {

    /**
     * Creates new form Ordenes
     */
    public Ordenes() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
        }
        initComponents();
        setLocationRelativeTo(null);
        String texto1 = "<html><center><body>NUEVA ORDEN<br>PARA LLEVAR</body></center></html>";
        nueva.setText(texto1);
        /* String texto2 = "<html><center><body>BEBIDAS<br>SIN LICOR</body></center></html>";
        T3.setText(texto2);*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NEWORDER = new ClassAngels.PanelRound();
        nueva = new javax.swing.JLabel();
        MESAS = new ClassAngels.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        ADMINISTRAR = new ClassAngels.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        NUEVAPARALLEVAR = new ClassAngels.PanelRound();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1060, 643));

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1060, 643));

        NEWORDER.setBackground(new java.awt.Color(153, 255, 153));
        NEWORDER.setRoundBottomLeft(20);
        NEWORDER.setRoundBottomRight(20);
        NEWORDER.setRoundTopLeft(20);
        NEWORDER.setRoundTopRight(20);

        nueva.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nueva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nueva.setText("NUEVA ORDEN");
        nueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nuevaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NEWORDERLayout = new javax.swing.GroupLayout(NEWORDER);
        NEWORDER.setLayout(NEWORDERLayout);
        NEWORDERLayout.setHorizontalGroup(
            NEWORDERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nueva, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        NEWORDERLayout.setVerticalGroup(
            NEWORDERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nueva, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        MESAS.setBackground(new java.awt.Color(153, 255, 153));
        MESAS.setPreferredSize(new java.awt.Dimension(201, 83));
        MESAS.setRoundBottomLeft(20);
        MESAS.setRoundBottomRight(20);
        MESAS.setRoundTopLeft(20);
        MESAS.setRoundTopRight(20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MESAS");

        javax.swing.GroupLayout MESASLayout = new javax.swing.GroupLayout(MESAS);
        MESAS.setLayout(MESASLayout);
        MESASLayout.setHorizontalGroup(
            MESASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        MESASLayout.setVerticalGroup(
            MESASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        ADMINISTRAR.setBackground(new java.awt.Color(153, 255, 153));
        ADMINISTRAR.setPreferredSize(new java.awt.Dimension(201, 83));
        ADMINISTRAR.setRoundBottomLeft(20);
        ADMINISTRAR.setRoundBottomRight(20);
        ADMINISTRAR.setRoundTopLeft(20);
        ADMINISTRAR.setRoundTopRight(20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRAR");

        javax.swing.GroupLayout ADMINISTRARLayout = new javax.swing.GroupLayout(ADMINISTRAR);
        ADMINISTRAR.setLayout(ADMINISTRARLayout);
        ADMINISTRARLayout.setHorizontalGroup(
            ADMINISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        ADMINISTRARLayout.setVerticalGroup(
            ADMINISTRARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        NUEVAPARALLEVAR.setBackground(new java.awt.Color(153, 255, 153));
        NUEVAPARALLEVAR.setPreferredSize(new java.awt.Dimension(201, 83));
        NUEVAPARALLEVAR.setRoundBottomLeft(20);
        NUEVAPARALLEVAR.setRoundBottomRight(20);
        NUEVAPARALLEVAR.setRoundTopLeft(20);
        NUEVAPARALLEVAR.setRoundTopRight(20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVA ORDEN");

        javax.swing.GroupLayout NUEVAPARALLEVARLayout = new javax.swing.GroupLayout(NUEVAPARALLEVAR);
        NUEVAPARALLEVAR.setLayout(NUEVAPARALLEVARLayout);
        NUEVAPARALLEVARLayout.setHorizontalGroup(
            NUEVAPARALLEVARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
        );
        NUEVAPARALLEVARLayout.setVerticalGroup(
            NUEVAPARALLEVARLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NUEVAPARALLEVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADMINISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NEWORDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MESAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(844, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(NEWORDER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MESAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(NUEVAPARALLEVAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 212, Short.MAX_VALUE)
                .addComponent(ADMINISTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nuevaMouseClicked
        Mesas F = new Mesas();
        F.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_nuevaMouseClicked

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
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ClassAngels.PanelRound ADMINISTRAR;
    private ClassAngels.PanelRound MESAS;
    private ClassAngels.PanelRound NEWORDER;
    private ClassAngels.PanelRound NUEVAPARALLEVAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nueva;
    // End of variables declaration//GEN-END:variables
}