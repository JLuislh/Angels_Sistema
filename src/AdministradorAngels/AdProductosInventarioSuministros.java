/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AdministradorAngels;

import BDclass.BDConexion;
import ClassAngels.InsertarProducto;
import ClassAngels.TextAreaRenderer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author jluis
 */
public class AdProductosInventarioSuministros extends javax.swing.JPanel {

    /**
     * Creates new form ProductosInventario
     */
    public AdProductosInventarioSuministros() {
        initComponents();
        ListarProductosInventario();
    }
    
    private void imprimir(){
      BDConexion con= new BDConexion();
         Connection conexion= con.getConexion();
        try {
            JasperReport jasperReport=(JasperReport)JRLoader.loadObjectFromFile("C:\\Reportes\\ANGELS\\InventarioSuministros.jasper");
            Map parametros= new HashMap();
            //parametros.put("ID_ORDEN", Integer.parseInt(Orden.getText()));
            JasperPrint print = JasperFillManager.fillReport(jasperReport,parametros, conexion);
            JasperPrintManager.printReport(print, true);
        } catch (Exception e) {System.out.println("F"+e);
           JOptionPane.showMessageDialog(null, "ERROR EJECUTAR REPORTES =  "+e);
        }
    }
    
    
    private void ListarProductosInventario(){
     
        ArrayList<InsertarProducto> result = BDIngresos.BDIngresosProductosInventarioSuministros();
        RecargarTabla(result);  
    }
     private void RecargarTabla(ArrayList<InsertarProducto> list) {
         DecimalFormat df = new DecimalFormat("#.00");
              Object[][] datos = new Object[list.size()][4];
              int i = 0;
              for(InsertarProducto t : list)
              {
                  datos[i][0] = t.getIdregresoPedido();
                  datos[i][1] = t.getDescripcion();
                  datos[i][2] = t.getCantidad();
                  datos[i][3] = df.format(t.getPrecio());
                  i++;
              }    
             ProInventario.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                "CODIGO","DESCRIPCION","CANTIDAD","PRECIO"
             })
             {  
                 @Override
                 public boolean isCellEditable(int row, int column){
                 return false;

             }
             });
             ProInventario.getColumnModel().getColumn(1).setCellRenderer(new TextAreaRenderer());
             TableColumn columna1 = ProInventario.getColumn("CODIGO");
             columna1.setPreferredWidth(-20);
             TableColumn columna2 = ProInventario.getColumn("DESCRIPCION");
             columna2.setPreferredWidth(275);
             TableColumn columna3 = ProInventario.getColumn("CANTIDAD");
             columna3.setPreferredWidth(35);
             TableColumn columna4 = ProInventario.getColumn("PRECIO");
             columna4.setPreferredWidth(35);
             
     }
     
     
     
     public void GuardarProducto(){
    
     try {
            
            InsertarProducto p = new InsertarProducto();
            
            p.setIdregreso(Integer.parseInt(Codigo.getText()));
            p.setCantidad(Integer.parseInt(cantidadin.getText()));
            p.setPrecio(Double.parseDouble(costo.getText()));
            BDProductos.InsertarProductoIngresoInventario(p);
            JOptionPane.showMessageDialog(null, "Ingreso Agregado...");
            ActualizarCantidad();
            limpíar();
            ListarProductosInventario();
        } catch (Exception ex) {
            //Logger.getLogger(ConsultaPedidos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
    }

     public void ActualizarCantidad(){
     BDConexion conecta = new BDConexion();
        Connection con = conecta.getConexion();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement("{call IngresoInventario("+Codigo.getText()+","+cantidadin.getText()+")}"); //,"+fecha.getDateFormatString()+"
            sm.executeUpdate();
        con.close();
        sm.close();
        } catch (SQLException ex) {
            System.out.println("ERROR ="+ex);
        }}
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ProInventario = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Descri = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cantidadin = new javax.swing.JTextField();
        Cargar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        costo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 635));

        ProInventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "CANTIDAD"
            }
        ));
        ProInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProInventario);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("CODIGO");

        Codigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Codigo.setForeground(new java.awt.Color(51, 102, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("DESCRIPCION");

        Descri.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Descri.setForeground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Descri)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 148, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Descri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CANTIDAD DE INGRESO");

        cantidadin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadinActionPerformed(evt);
            }
        });

        Cargar.setText("CARGAR");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("COSTO");

        costo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantidadin)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(costo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(Cargar)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidadin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Cargar)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jButton1.setText("IMPRIMIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ProInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProInventarioMouseClicked
        
      Codigo.setText(String.valueOf(ProInventario.getModel().getValueAt(ProInventario.getSelectedRow(), 0)));
      Descri.setText(String.valueOf(ProInventario.getModel().getValueAt(ProInventario.getSelectedRow(), 1)));
      cantidadin.requestFocus();
        
        
    }//GEN-LAST:event_ProInventarioMouseClicked

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        GuardarProducto();
    }//GEN-LAST:event_CargarActionPerformed

    private void cantidadinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadinActionPerformed
        costo.requestFocus();
    }//GEN-LAST:event_cantidadinActionPerformed

    private void costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costoActionPerformed
       Cargar.requestFocus();
    }//GEN-LAST:event_costoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        imprimir();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cargar;
    private javax.swing.JTextField Codigo;
    private javax.swing.JTextField Descri;
    private javax.swing.JTable ProInventario;
    private javax.swing.JTextField cantidadin;
    private javax.swing.JTextField costo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void limpíar() {
        Codigo.setText("");
        Descri.setText("");
        cantidadin.setText("");
        costo.setText("");
    }
}
