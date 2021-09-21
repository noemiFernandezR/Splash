package Demo1;

import Aplica.AplicaMaximo;
import Aplica.AplicaMinimo;
import Aplica.AplicaPotencia;
import Aplica.AplicaRaizCuadrada;
import Aplica.AplicaRedondeo;

public class CAplica_Portada extends javax.swing.JFrame {

    public CAplica_Portada() {
        initComponents();
        formulario();
    }

    private void formulario() {
        this.setLocationRelativeTo(this);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrinciapl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCamisas = new javax.swing.JButton();
        btnCuadernos = new javax.swing.JButton();
        btnEstudiantes = new javax.swing.JButton();
        btnMax = new javax.swing.JButton();
        btnMin = new javax.swing.JButton();
        btnPot = new javax.swing.JButton();
        btnRed = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelPrinciapl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gif-boton-mano2.gif"))); // NOI18N
        PanelPrinciapl.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 220, 200));

        btnCamisas.setText("Ventas de Camisas");
        btnCamisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCamisasActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnCamisas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 220, 30));

        btnCuadernos.setText("Venta de cuadernos");
        btnCuadernos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuadernosActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnCuadernos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 220, 30));

        btnEstudiantes.setText("Pension de Estudiantes");
        btnEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiantesActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnEstudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 220, 30));

        btnMax.setText("Max");
        btnMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, -1, -1));

        btnMin.setText("Min");
        btnMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, -1));

        btnPot.setText("Pot");
        btnPot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnPot, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        btnRed.setText("Redon");
        btnRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnRed, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        btnRaiz.setText("Raiz");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        PanelPrinciapl.add(btnRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portada.png"))); // NOI18N
        PanelPrinciapl.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PanelPrinciapl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCamisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCamisasActionPerformed
        // TODO add your handling code here:
        Caso01 caso=new Caso01();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCamisasActionPerformed

    private void btnCuadernosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuadernosActionPerformed
        // TODO add your handling code here:
        Caso02 caso=new Caso02();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCuadernosActionPerformed

    private void btnEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiantesActionPerformed
        // TODO add your handling code here:
        Caso_3 caso=new Caso_3();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEstudiantesActionPerformed

    private void btnMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinActionPerformed
        // TODO add your handling code here:
        AplicaMinimo caso=new AplicaMinimo();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMinActionPerformed

    private void btnMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxActionPerformed
        // TODO add your handling code here:
        AplicaMaximo caso=new AplicaMaximo();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMaxActionPerformed

    private void btnPotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotActionPerformed
        // TODO add your handling code here:
        AplicaPotencia caso=new AplicaPotencia();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPotActionPerformed

    private void btnRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedActionPerformed
        // TODO add your handling code here:
        AplicaRedondeo caso=new AplicaRedondeo ();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRedActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        // TODO add your handling code here:
        AplicaRaizCuadrada caso=new AplicaRaizCuadrada  ();
        caso.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRaizActionPerformed

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
            java.util.logging.Logger.getLogger(CAplica_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAplica_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAplica_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAplica_Portada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAplica_Portada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrinciapl;
    private javax.swing.JButton btnCamisas;
    private javax.swing.JButton btnCuadernos;
    private javax.swing.JButton btnEstudiantes;
    private javax.swing.JButton btnMax;
    private javax.swing.JButton btnMin;
    private javax.swing.JButton btnPot;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnRed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
