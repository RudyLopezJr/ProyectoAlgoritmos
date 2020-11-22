package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metodos.Invertir;
import metodos.ObtenerArray;
import metodos.Escribir;

public class AlgoritmoR4 extends javax.swing.JFrame {

   
    public AlgoritmoR4() {
        initComponents();
        this.setLocationRelativeTo(null);
        salir.setFocusable(false);
    }
    @Override
    public Image getIconImage(){
	Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/unicaribeIcono.gif"));
	return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salir = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        tittle1 = new javax.swing.JLabel();
        soloNumeroMaximo = new javax.swing.JLabel();
        ingresarButton = new javax.swing.JButton();
        numMax = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        tiempoDeEjecucionText = new javax.swing.JLabel();
        tiempoDeEjecucion = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salir.setBackground(new java.awt.Color(51, 153, 255));
        salir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/image.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        tittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setText("Invierte el orden de los numeros en un arreglo");
        getContentPane().add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        tittle1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tittle1.setForeground(new java.awt.Color(255, 255, 255));
        tittle1.setText("Algoritmo Recursivo 4");
        getContentPane().add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        soloNumeroMaximo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        soloNumeroMaximo.setForeground(new java.awt.Color(255, 255, 255));
        soloNumeroMaximo.setText("Ingrese cada numero");
        getContentPane().add(soloNumeroMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        ingresarButton.setText("Ingresar");
        ingresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ingresarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, -1, -1));

        numMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numMaxActionPerformed(evt);
            }
        });
        getContentPane().add(numMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 260, -1));

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 560, 210));

        tiempoDeEjecucionText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempoDeEjecucionText.setForeground(new java.awt.Color(255, 255, 255));
        tiempoDeEjecucionText.setText("Tiempo de ejecucion:");
        getContentPane().add(tiempoDeEjecucionText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        tiempoDeEjecucion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tiempoDeEjecucion.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tiempoDeEjecucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void numMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numMaxActionPerformed

    private void ingresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarButtonActionPerformed
        
        Escribir texto = new Escribir(numMax.getText());
        
        long startTime = System.currentTimeMillis();
       
        Invertir algoritmo = new Invertir(texto.getArray());
        
        long endTime = System.currentTimeMillis() - startTime;
        //endTime*=10000;
        txtArea.setText(algoritmo.getOutput());
        tiempoDeEjecucion.setText(Long.toString(endTime)+" milisegundos");
        
    }//GEN-LAST:event_ingresarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AlgoritmoR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgoritmoR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgoritmoR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgoritmoR4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgoritmoR4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ingresarButton;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField numMax;
    private javax.swing.JButton salir;
    private javax.swing.JLabel soloNumeroMaximo;
    private javax.swing.JLabel tiempoDeEjecucion;
    private javax.swing.JLabel tiempoDeEjecucionText;
    private javax.swing.JLabel tittle;
    private javax.swing.JLabel tittle1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
