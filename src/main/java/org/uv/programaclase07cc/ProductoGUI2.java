/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.programaclase07cc;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.uv.programaclase07cc.percistence.DAOVenta;
import org.uv.programaclase07cc.percistence.DetalleVenta;
import org.uv.programaclase07cc.percistence.Venta;

/**
 *
 * @author fermin
 */
public class ProductoGUI2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form ProductoGUI2
     */
    DefaultTableModel dtm;
    DAOVenta dao=new DAOVenta();
    List<DetalleVenta> productos=new ArrayList<>();
    public ProductoGUI2() {
        initComponents();
        dtm=new DefaultTableModel();
        String [] titulo= new String[]{"ID","Cantidad ","Descripcion ","Precio ","Subtotal","IdVenta"};
        dtm.setColumnIdentifiers(titulo);
        tblProds.setModel(dtm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdVenta = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        txtCant = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnShowVent = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProds = new javax.swing.JTable();
        btnAddProd = new javax.swing.JButton();
        btnEditProd = new javax.swing.JButton();
        bntBorrarVnt = new javax.swing.JButton();
        btnAddVenta = new javax.swing.JButton();
        btnShowProd = new javax.swing.JButton();
        btnBusVent = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGen = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Catalogo Productos");

        jLabel1.setText("Id venta: ");

        jLabel2.setText("Descripcion: ");

        jLabel3.setText("Cantidad: ");

        jLabel4.setText("Precio: ");

        btnShowVent.setText("Mostrar Ventas");
        btnShowVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowVentActionPerformed(evt);
            }
        });

        tblProds.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblProds.setEnabled(false);
        jScrollPane2.setViewportView(tblProds);

        btnAddProd.setText("Agregar Producto");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnEditProd.setText("Editar Producto");
        btnEditProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProdActionPerformed(evt);
            }
        });

        bntBorrarVnt.setText("Borrar Venta");
        bntBorrarVnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBorrarVntActionPerformed(evt);
            }
        });

        btnAddVenta.setText("Agregar Venta");
        btnAddVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVentaActionPerformed(evt);
            }
        });

        btnShowProd.setText("Mostrar Productos");
        btnShowProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowProdActionPerformed(evt);
            }
        });

        btnBusVent.setText("Buscar Venta");
        btnBusVent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusVentActionPerformed(evt);
            }
        });

        jLabel5.setText("Productos de la Venta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(txtDesc)
                    .addComponent(txtCant)
                    .addComponent(txtPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntBorrarVnt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnShowVent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnShowProd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBusVent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel5)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBorrarVnt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditProd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddVenta))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowVent)
                    .addComponent(btnShowProd)
                    .addComponent(btnBusVent))
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Productos", jPanel1);

        tblGen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblGen.setEnabled(false);
        jScrollPane1.setViewportView(tblGen);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mostrar", jPanel2);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowVentActionPerformed
        dtm= new DefaultTableModel();
        String [] titulo= new String[]{"Id Venta","Fecha","Monto"};
        dtm.setColumnIdentifiers(titulo);
        tblGen.setModel(dtm);
        List<Venta> ventas=dao.findAll();
        for (Venta venta : ventas) {
            dtm.addRow(new Object[]{
                String.valueOf(venta.getIdVenta()),String.valueOf(venta.getFecha()),String.valueOf(venta.getMonto())
            });
        }
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnShowVentActionPerformed

    private void btnShowProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowProdActionPerformed
        dtm= new DefaultTableModel();
        String [] titulo= new String[]{"ID","Cantidad","Descripcion","Precio","subtotal","IdVenta"};
        dtm.setColumnIdentifiers(titulo);
        tblGen.setModel(dtm);
        List<Venta> ventas=dao.findAll();
        for (Venta venta : ventas) {
            for (DetalleVenta p : venta.getDetalle()) {
                dtm.addRow(new Object[]{
                    String.valueOf(p.getIdProducto()),String.valueOf(p.getCantidad()),String.valueOf(p.getDescripcion()),String.valueOf(p.getPrecio()),String.valueOf(p.getSubtotal()),String.valueOf(venta.getIdVenta())
                });
            }
        }
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnShowProdActionPerformed

    private void bntBorrarVntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBorrarVntActionPerformed
        if(txtIdVenta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Escribar el id de la venta!!");
        }
        else{
            int id= Integer.parseInt(txtIdVenta.getText());
            if(dao.delete(id)){
                JOptionPane.showMessageDialog(null, "Se ha borrado la venta");
                this.txtIdVenta.setText("");
                this.txtCant.setText("");
                this.txtDesc.setText("");
                this.txtPrecio.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe la venta");
            }
        }
    }//GEN-LAST:event_bntBorrarVntActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
        if(txtCant.getText().isEmpty()||txtDesc.getText().isEmpty()||txtPrecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Algun campo esta vacio!!!");
        }
        else{
            if (dtm.getRowCount() > 0) {
                for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                    dtm.removeRow(i);
                }
            }
            double cant=Double.parseDouble(txtCant.getText());
            double prec= Double.parseDouble(txtPrecio.getText());
            double subtotal=cant*prec;
            DetalleVenta det= new DetalleVenta();
            det.setCantidad(cant);
            det.setDescripcion(txtDesc.getText());
            det.setPrecio(prec);
            det.setSubtotal(subtotal);  
            dtm.addRow(new Object[]{"",txtCant.getText(),txtDesc.getText(),txtPrecio.getText(),String.valueOf(subtotal),""});
            productos.add(det);
            this.txtCant.setText("");
            this.txtDesc.setText("");
            this.txtPrecio.setText("");
        }
    }//GEN-LAST:event_btnAddProdActionPerformed

    private void btnAddVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVentaActionPerformed
        Venta vent;
        Date fecha= Date.from(Instant.now());
        if(productos!=null){
            vent = new Venta();
            vent.setFecha(new java.sql.Date(fecha.getTime()));
            double monto = 0;
            for (DetalleVenta producto : productos) {
                producto.setVenta(vent);
                monto = monto + producto.getSubtotal();
                vent.getDetalle().add(producto);
            }
            vent.setMonto(monto);
            if (dao.create(vent) != null) {
                for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                    dtm.removeRow(i);
                }
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
                this.txtCant.setText("");
                this.txtDesc.setText("");
                this.txtPrecio.setText("");
                for (DetalleVenta p : vent.getDetalle()) {
                    dtm.addRow(new Object[]{
                        String.valueOf(p.getIdProducto()), String.valueOf(p.getCantidad()), String.valueOf(p.getDescripcion()), String.valueOf(p.getPrecio()), String.valueOf(p.getSubtotal()), String.valueOf(vent.getIdVenta())
                    });
                }
                productos=null;
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "No existen productos para la venta!!");
        }
    }//GEN-LAST:event_btnAddVentaActionPerformed

    private void btnBusVentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusVentActionPerformed
        if(txtIdVenta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Escriba el ID de la venta!!");
        }
        else{
            int id = Integer.parseInt(txtIdVenta.getText());
            Venta venta = dao.findById(id);
            if(venta!=null){
                dtm = new DefaultTableModel();
                String[] titulo = new String[]{"ID venta", "Descripcion", "Cantidad", "Precio", "subtotal"};
                dtm.setColumnIdentifiers(titulo);
                tblGen.setModel(dtm);
                for (DetalleVenta p : venta.getDetalle()) {
                    dtm.addRow(new Object[]{
                        String.valueOf(venta.getIdVenta()), p.getDescripcion(), String.valueOf(p.getCantidad()), String.valueOf(p.getPrecio()), String.valueOf(p.getSubtotal())
                    });
                }
                txtIdVenta.setText("");
                jTabbedPane1.setSelectedIndex(1);
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe la Venta!!");
            }
        }
    }//GEN-LAST:event_btnBusVentActionPerformed

    private void btnEditProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProdActionPerformed
        Venta vent;
        Date fecha= Date.from(Instant.now());
        
        if(txtIdVenta.getText().isEmpty()||productos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Campos Vacios!!");
        }
        else{
            int id = Integer.parseInt(txtIdVenta.getText());
            vent = new Venta();
            vent.setFecha(new java.sql.Date(fecha.getTime()));
            double monto = 0;
            for (DetalleVenta producto : productos) {
                producto.setVenta(vent);
                monto = monto + producto.getSubtotal();
                vent.getDetalle().add(producto);
            }
            vent.setMonto(monto);
            if (dao.update(id, vent) != null) {
                for (int i = dtm.getRowCount() - 1; i > -1; i--) {
                    dtm.removeRow(i);
                }
                JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
                this.txtIdVenta.setText("");
                for (DetalleVenta p : vent.getDetalle()) {
                    dtm.addRow(new Object[]{
                        String.valueOf(p.getIdProducto()), String.valueOf(p.getCantidad()), String.valueOf(p.getDescripcion()), String.valueOf(p.getPrecio()), String.valueOf(p.getSubtotal()), txtIdVenta.getText()
                    });
                }
                productos = null;
            } else {
                JOptionPane.showMessageDialog(null, "Error al agregar");
            }
        }
    }//GEN-LAST:event_btnEditProdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBorrarVnt;
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnAddVenta;
    private javax.swing.JButton btnBusVent;
    private javax.swing.JButton btnEditProd;
    private javax.swing.JButton btnShowProd;
    private javax.swing.JButton btnShowVent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblGen;
    private javax.swing.JTable tblProds;
    private javax.swing.JTextField txtCant;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtIdVenta;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
