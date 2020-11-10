package ventanas;

import java.awt.Image;
import java.awt.Toolkit;

public class AlgoritmosRecursivos extends javax.swing.JFrame {

   
    public AlgoritmosRecursivos() {
        initComponents();
        this.setLocationRelativeTo(null);
        salir.setFocusable(false);
        algoritmo1.setFocusable(false);
        algoritmo2.setFocusable(false);
        algoritmo3.setFocusable(false);
        algoritmo4.setFocusable(false);
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
        algoritmo1 = new javax.swing.JButton();
        algoritmoTitulo1 = new javax.swing.JLabel();
        algoritmo2 = new javax.swing.JButton();
        algoritmoTitulo2 = new javax.swing.JLabel();
        algoritmoTitulo3 = new javax.swing.JLabel();
        algoritmo3 = new javax.swing.JButton();
        algoritmo4 = new javax.swing.JButton();
        algoritmoTitulo4 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, 40));

        algoritmo1.setBackground(new java.awt.Color(153, 153, 255));
        algoritmo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmo1.setText("Algoritmo 1");
        getContentPane().add(algoritmo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 220, 80));

        algoritmoTitulo1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmoTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        algoritmoTitulo1.setText("Algoritmo 1");
        getContentPane().add(algoritmoTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        algoritmo2.setBackground(new java.awt.Color(153, 153, 255));
        algoritmo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmo2.setText("Algoritmo 2");
        getContentPane().add(algoritmo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 220, 80));

        algoritmoTitulo2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmoTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        algoritmoTitulo2.setText("Algoritmo 2");
        getContentPane().add(algoritmoTitulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, -1, -1));

        algoritmoTitulo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmoTitulo3.setForeground(new java.awt.Color(255, 255, 255));
        algoritmoTitulo3.setText("Algoritmo 3");
        getContentPane().add(algoritmoTitulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        algoritmo3.setBackground(new java.awt.Color(153, 153, 255));
        algoritmo3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmo3.setText("Algoritmo 3");
        algoritmo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                algoritmo3ActionPerformed(evt);
            }
        });
        getContentPane().add(algoritmo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 230, 80));

        algoritmo4.setBackground(new java.awt.Color(153, 153, 255));
        algoritmo4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmo4.setText("Algoritmo 4");
        getContentPane().add(algoritmo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 220, 80));

        algoritmoTitulo4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        algoritmoTitulo4.setForeground(new java.awt.Color(255, 255, 255));
        algoritmoTitulo4.setText("Algoritmo 4");
        getContentPane().add(algoritmoTitulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        tittle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setText("Algoritmos recursivos");
        getContentPane().add(tittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void algoritmo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_algoritmo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_algoritmo3ActionPerformed

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
            java.util.logging.Logger.getLogger(AlgoritmosRecursivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgoritmosRecursivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgoritmosRecursivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgoritmosRecursivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgoritmosRecursivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton algoritmo1;
    private javax.swing.JButton algoritmo2;
    private javax.swing.JButton algoritmo3;
    private javax.swing.JButton algoritmo4;
    private javax.swing.JLabel algoritmoTitulo1;
    private javax.swing.JLabel algoritmoTitulo2;
    private javax.swing.JLabel algoritmoTitulo3;
    private javax.swing.JLabel algoritmoTitulo4;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel logo;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}