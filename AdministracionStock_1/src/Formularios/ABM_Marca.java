/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import ClasesJava.Marca;
import DaoInterfaces.DaoMarca;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class ABM_Marca extends javax.swing.JFrame {
    
     private ArrayList<Marca> Marcas = new ArrayList();
     
     public ABM_Marca() {
        initComponents();
        this.setSize(600, 380);
        
        Marca paux = new Marca("1", "Marvel");
        Marcas.add(paux);
        paux = new Marca("2", "Comics");
        Marcas.add(paux);
        paux = new Marca("3","Alternativo1");
        Marcas.add(paux);
        
        /*
        DaoMarca auxDaoMarca = new DaoMarca();
        Marcas= auxDaoMarca.ConsultarTodasLasMarcas();
        */
        
        BotonMostrarMarcaActionPerformed(null);

    }

    /**
     * Creates new form ABM_Marca
     */
  /*  public ABM_Marca() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtCodigoMarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtDescMarca = new javax.swing.JTextField();
        BotonAltaMarca = new javax.swing.JButton();
        BotonBajaMarca = new javax.swing.JButton();
        BotonModifMarca = new javax.swing.JButton();
        BotonSalirMarca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaMarca = new javax.swing.JList<>();
        BotonMostrarMarca = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta, baja y modificaciones Marca");

        jLabel1.setText("Codigo");

        TxtCodigoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoMarcaActionPerformed(evt);
            }
        });

        jLabel2.setText("Descripcion");

        TxtDescMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDescMarcaActionPerformed(evt);
            }
        });

        BotonAltaMarca.setText("ALTA");
        BotonAltaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaMarcaActionPerformed(evt);
            }
        });

        BotonBajaMarca.setText("BAJA");
        BotonBajaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajaMarcaActionPerformed(evt);
            }
        });

        BotonModifMarca.setText("MODIFICACION");
        BotonModifMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonModifMarcaActionPerformed(evt);
            }
        });

        BotonSalirMarca.setText("SALIR");
        BotonSalirMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirMarcaActionPerformed(evt);
            }
        });

        jLabel3.setText("Marcas Ingresadas");

        ListaMarca.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListaMarca);

        BotonMostrarMarca.setText("MOSTRAR");
        BotonMostrarMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMostrarMarcaActionPerformed(evt);
            }
        });

        BotonGuardar.setText("GUARDAR");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonAltaMarca)
                .addGap(18, 18, 18)
                .addComponent(BotonBajaMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonModifMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonSalirMarca))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtDescMarca))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(TxtCodigoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonMostrarMarca)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TxtCodigoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonMostrarMarca)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtDescMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAltaMarca)
                    .addComponent(BotonBajaMarca)
                    .addComponent(BotonModifMarca)
                    .addComponent(BotonSalirMarca)
                    .addComponent(BotonGuardar))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtDescMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDescMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDescMarcaActionPerformed

    private void TxtCodigoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoMarcaActionPerformed

    
    //Alta De Marcas
    private void BotonAltaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaMarcaActionPerformed
        // TODO add your handling code here:
         Marca unMarca = new Marca();
       //lo hacemos de una la asignacion
       
       String codigo = TxtCodigoMarca.getText();
       unMarca.setCodigo(codigo);
       
     //  unMarca.setCodigo(TxtCodigoMarca.getText());
       //lo hacemos en dos pasos la asignacion
       String descripcion = TxtDescMarca.getText();
       unMarca.setDescripcion(descripcion);

       
       
       unMarca.Imprimir();
       /// ACA DEFINO SI AGREGO AL FINAL (modo ingresar)
       ///          O SI REEMLAZO el OBJETO del ARRAY or UnPaciente actual 
       if (!modoModificar){
           Marcas.add(unMarca);
           //DaoPaciente.insertar(unPaciente);
       } else {
          
           Marcas.set(idseleccionado, unMarca);
           BotonMostrarMarcaActionPerformed(null);
        
           //DaoPaciente.editar(unPaciente);
       }
       
       //JOptionPane.showMessageDialog(this, "El Paciente se guardó con éxito");
       TxtCodigoMarca.setText("");
       TxtDescMarca.setText("");
       
       BotonMostrarMarcaActionPerformed(null);
       
       
        
        
    }//GEN-LAST:event_BotonAltaMarcaActionPerformed

    private void BotonBajaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajaMarcaActionPerformed
        // TODO add your handling code here:
           idseleccionado=ListaMarca.getSelectedIndex();
        String mensaje = "Esta seguro que quiere borrar a : " + 
                Marcas.get(idseleccionado).getCodigo() + " " + 
                Marcas.get(idseleccionado).getDescripcion();
        int opcion = JOptionPane.showConfirmDialog(null, mensaje);
        if ( opcion ==0 ) {
            Marcas.remove(idseleccionado);
            BotonMostrarMarcaActionPerformed(null) ;
     
    }//GEN-LAST:event_BotonBajaMarcaActionPerformed
    }
    private void BotonModifMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonModifMarcaActionPerformed
        // TODO add your handling code here
        
        modoModificar = true;
        idseleccionado = ListaMarca.getSelectedIndex();
        
        Marca UnMarcaAux = Marcas.get(idseleccionado);
        
        TxtCodigoMarca.setText(UnMarcaAux.getCodigo());
        TxtDescMarca.setText(UnMarcaAux.getDescripcion());
        
        
                                                     
    }//GEN-LAST:event_BotonModifMarcaActionPerformed

    
    //Mostrar Marcas
    private void BotonMostrarMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMostrarMarcaActionPerformed
        // TODO add your handling code here:
     //    this.setSize(600, 550);
        
         
       DefaultListModel Listado = new DefaultListModel();
       ListaMarca.setModel(Listado);
        String linea="";
        for (int i =0; i<Marcas.size();i++){
            linea = Marcas.get(i).toString();
            Listado.add(i, linea);            
           
        }  
    }//GEN-LAST:event_BotonMostrarMarcaActionPerformed

    private void BotonSalirMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirMarcaActionPerformed
        // TODO add your handling code here:
        JFrame unframe = new Menu();
        unframe.setVisible(true);
        
        
    }//GEN-LAST:event_BotonSalirMarcaActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed


        // TODO add your handling code here:
        
        BotonAltaMarcaActionPerformed(null);
    }//GEN-LAST:event_BotonGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    
      private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                           
      
    }                                 
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
            java.util.logging.Logger.getLogger(ABM_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ABM_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ABM_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ABM_Marca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ABM_Marca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAltaMarca;
    private javax.swing.JButton BotonBajaMarca;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonModifMarca;
    private javax.swing.JButton BotonMostrarMarca;
    private javax.swing.JButton BotonSalirMarca;
    private javax.swing.JList<String> ListaMarca;
    private javax.swing.JTextField TxtCodigoMarca;
    private javax.swing.JTextField TxtDescMarca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

   // private static class Marcas {

     //   public Marcas() {
       // }
 //   }
    
    private boolean modoModificar = false;
    private int idseleccionado;
}
