/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pacote;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class TelaElevador extends javax.swing.JFrame {

    /**
     * Creates new form TelaElevador
     */
    public TelaElevador() {
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

        btnSubir = new javax.swing.JButton();
        imgAutomato = new javax.swing.JLabel();
        imgElevador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSubir.setText("jButton1");
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 100, 60));

        imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoT2.png"))); // NOI18N
        getContentPane().add(imgAutomato, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, -1, -1));

        imgElevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAberto.png"))); // NOI18N
        getContentPane().add(imgElevador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoT3.png")));
            imgElevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAbrindo.png")));
        }, 1, TimeUnit.SECONDS);

        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoT.png")));
            imgElevador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorFechado.png")));
        }, 2, TimeUnit.SECONDS);
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoUP.png")));
        }, 3, TimeUnit.SECONDS);
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/Automato1A.png")));
        }, 4, TimeUnit.SECONDS);
            

    }//GEN-LAST:event_btnSubirActionPerformed

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
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaElevador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaElevador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubir;
    private javax.swing.JLabel imgAutomato;
    private javax.swing.JLabel imgElevador;
    // End of variables declaration//GEN-END:variables
}
