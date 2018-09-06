package pkg1clase;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class inter extends javax.swing.JFrame {
 
    personas pe= new personas();
    
    
    public inter() {
        initComponents();
    }
    
    public void llenar(){
        DefaultTableModel tmodelo=new DefaultTableModel();
            tabla.setModel(tmodelo);
           
           tmodelo.addColumn("CI");
            tmodelo.addColumn("Nombre");
            tmodelo.addColumn("Paterno");
            tmodelo.addColumn("Materno");
            tmodelo.addColumn("Fecha de Nacimiento");
            tmodelo.addColumn("Lugar de Nacimiento");
            Object obj[]= new Object[6];
            for(personas lista:pe.perso){ 
                obj[0]=lista.getci();
                obj[1]=lista.getnombre();
                obj[2]=lista.getapp();
                obj[3]=lista.getapm();
                obj[4]=lista.getfechan();
                obj[5]=lista.getlugarn();
                tmodelo.addRow(obj);
            }
    }
    
    public void vaciar(){
        tci.setText(null);
        tnombre.setText(null);
        tappaterno.setText(null);
        tapmaterno.setText(null);
        tlugar.setToolTipText(null);
        tfecha.setText(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tci = new javax.swing.JTextField();
        tnombre = new javax.swing.JTextField();
        tappaterno = new javax.swing.JTextField();
        tapmaterno = new javax.swing.JTextField();
        insertar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tlugar = new javax.swing.JComboBox<>();
        tfecha = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CI");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("PATERNO");

        jLabel4.setText("MATERNO");

        insertar.setText("INSERTAR");
        insertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertarMouseClicked(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarMouseClicked(evt);
            }
        });

        editar.setText("EDITAR");
        editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarMouseClicked(evt);
            }
        });

        buscar.setText("BUSCAR");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabla);

        jLabel5.setText("FECHA DE NACIMIENTO");

        jLabel6.setText("LUGAR DE NACIMIENTO");

        tlugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHUQUISACA", "LA PAZ", "COCHABAMBA", "TARIJA", "ORURO", "POTOSI", "BENI", "PANDO", "SANTA CRUZ" }));

        try {
            tfecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(insertar)
                            .addGap(28, 28, 28)
                            .addComponent(eliminar)
                            .addGap(27, 27, 27)
                            .addComponent(buscar)
                            .addGap(18, 18, 18)
                            .addComponent(editar))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(tfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(tlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tci)
                            .addComponent(tnombre)
                            .addComponent(tappaterno)
                            .addComponent(tapmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1)
                            .addComponent(tci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tappaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tapmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tlugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertar)
                    .addComponent(eliminar)
                    .addComponent(editar)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void insertarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertarMouseClicked
        // TODO add your handling code here:
        String sci=tci.getText();
        String snombre=tnombre.getText();
        String sapp=tappaterno.getText();
        String sapm=tapmaterno.getText();
        String sfecha=tfecha.getText();
        String slugar=tlugar.getSelectedItem().toString();
        try{
            pe.insertar(new personas (sci,snombre,sapp,sapm,sfecha,slugar));        
            JOptionPane.showMessageDialog(null, "Todo ok");
            vaciar();
            llenar();
            
       }
        catch(Exception e){
        System.out.println("nada ok");
        }
        
    }//GEN-LAST:event_insertarMouseClicked

    private void eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseClicked
        // TODO add your handling code here:
        String sci=tci.getText();
        try{
        pe.eliminar(sci);
        JOptionPane.showMessageDialog(null, "Se elimino el usuario= "+sci);
        llenar();
        vaciar();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo eliminar");
        }
    }//GEN-LAST:event_eliminarMouseClicked

    private void editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarMouseClicked
        // TODO add your handling code here:
        String sci=tci.getText();
        String snombre=tnombre.getText();
        String sapp=tappaterno.getText();
        String sapm=tapmaterno.getText();
        String sfecha=tfecha.getText();
        String slugar=tlugar.getSelectedItem().toString();
        pe.editar(new personas(sci,snombre,sapp,sapm,sfecha,slugar));
        llenar();
        vaciar();
    }//GEN-LAST:event_editarMouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:
        String sci=tci.getText();
        personas res=pe.buscar(sci);
        tnombre.setText(res.getnombre());
        tappaterno.setText(res.getapp());
        tapmaterno.setText(res.getapm());
        tfecha.setText(res.getfechan());
        tlugar.setSelectedItem(res.getlugarn());
    }//GEN-LAST:event_buscarMouseClicked

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
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tapmaterno;
    private javax.swing.JTextField tappaterno;
    private javax.swing.JTextField tci;
    private javax.swing.JFormattedTextField tfecha;
    private javax.swing.JComboBox<String> tlugar;
    private javax.swing.JTextField tnombre;
    // End of variables declaration//GEN-END:variables
}
