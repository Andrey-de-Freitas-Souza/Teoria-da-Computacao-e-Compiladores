/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pacote;
import Entidades.KeyWords;
import Entidades.Verify;

import java.awt.Color;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author andre
 */
public class TelaAnalisadorLexico extends javax.swing.JFrame {
    String espacado = "";
    List<String> palavrasChaves = new ArrayList<>();
    public TelaAnalisadorLexico() {
        super("Analisador Léxico");  
        initComponents();

        setLocationRelativeTo(null);
        btnArquivo.setBackground(new Color(0,0,0,0));
        btnValidar.setBackground(new Color(0,0,0,0));
        pnlCodigo.setOpaque(false); // Tornando o JScrollPane transparente
        pnlCodigo.getViewport().setOpaque(false); // Tornando a JViewport transparente
        pnlCodigo.setBackground(new Color(0, 0, 0, 0));
        pnlCodigo.setForeground(new Color(0, 0, 0, 0));
        pnlTokens.setOpaque(false); // Tornando o JScrollPane transparente
        pnlTokens.getViewport().setOpaque(false); // Tornando a JViewport transparente
        pnlTokens.setBackground(new Color(0, 0, 0, 0));
        pnlTokens.setForeground(new Color(0, 0, 0, 0));
        btnPesq.setBackground(new Color(0,0,0,0));
        btnDoc.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDoc = new javax.swing.JButton();
        btnPesq = new javax.swing.JButton();
        btnValidar = new javax.swing.JButton();
        pnlTokens = new javax.swing.JScrollPane();
        txtTokens = new javax.swing.JLabel();
        pnlCodigo = new javax.swing.JScrollPane();
        txtCodigo = new javax.swing.JLabel();
        btnArquivo = new javax.swing.JButton();
        txtFile = new javax.swing.JLabel();
        imgFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnDoc.png"))); // NOI18N
        btnDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDocMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDocMouseExited(evt);
            }
        });
        getContentPane().add(btnDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 636, 210, 70));

        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnPesq.png"))); // NOI18N
        btnPesq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesqMouseExited(evt);
            }
        });
        getContentPane().add(btnPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 636, 210, 70));

        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnValidar.png"))); // NOI18N
        btnValidar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnValidarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnValidarMouseExited(evt);
            }
        });
        btnValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarActionPerformed(evt);
            }
        });
        getContentPane().add(btnValidar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 636, 210, 70));

        pnlTokens.setBackground(new java.awt.Color(0, 0, 0));
        pnlTokens.setBorder(null);
        pnlTokens.setToolTipText("");
        pnlTokens.setEnabled(false);
        pnlTokens.setFocusable(false);
        pnlTokens.setOpaque(false);
        pnlTokens.setRequestFocusEnabled(false);
        pnlTokens.setVerifyInputWhenFocusTarget(false);

        txtTokens.setBackground(new java.awt.Color(255, 255, 255));
        txtTokens.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtTokens.setForeground(new java.awt.Color(255, 255, 255));
        pnlTokens.setViewportView(txtTokens);

        getContentPane().add(pnlTokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(669, 252, 575, 360));

        pnlCodigo.setBackground(new java.awt.Color(0, 0, 0));
        pnlCodigo.setBorder(null);
        pnlCodigo.setToolTipText("");
        pnlCodigo.setEnabled(false);
        pnlCodigo.setFocusable(false);
        pnlCodigo.setOpaque(false);
        pnlCodigo.setRequestFocusEnabled(false);
        pnlCodigo.setVerifyInputWhenFocusTarget(false);

        txtCodigo.setBackground(new java.awt.Color(255, 255, 255));
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        pnlCodigo.setViewportView(txtCodigo);

        getContentPane().add(pnlCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 252, 575, 360));

        btnArquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArquivoActionPerformed(evt);
            }
        });
        getContentPane().add(btnArquivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 580, 50));

        txtFile.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtFile.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 144, 520, 40));

        imgFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/imgAnalisador.png"))); // NOI18N
        getContentPane().add(imgFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArquivoActionPerformed
        JFileChooser expArquivos = new JFileChooser();
        expArquivos.setDialogTitle("Explorador");
        expArquivos.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Texto", "txt");
        expArquivos.setFileFilter(filter);
        int retorno = expArquivos.showOpenDialog(this);
        
        KeyWords[] keywords = KeyWords.values();
        if (retorno == JFileChooser.APPROVE_OPTION) {
            StringBuilder codigo = new StringBuilder(); 
            try {
                File file = expArquivos.getSelectedFile();
                Path path = file.toPath();
                txtFile.setText(path.toString());
                List<String> linhas = Files.readAllLines(path);
                for (String linha : linhas) {
                    codigo.append(" ").append(linha).append(" \n");
                }
                
            String codigoHtml = codigo.toString();

            codigoHtml = codigoHtml.replaceAll("\\<", "&lt");
            codigoHtml = codigoHtml.replaceAll("\\>", "&gt");
            codigoHtml = codigoHtml.replaceAll("\\=", "&#61");
            codigoHtml = codigoHtml.replaceAll("\\!", "&#33");
            codigoHtml = codigoHtml.replaceAll("\\;", "&#59");
            codigoHtml = codigoHtml.replaceAll("\\,", "&#44");
            codigoHtml = codigoHtml.replaceAll("\\(", "&#40");
            codigoHtml = codigoHtml.replaceAll("\\)", "&#41");
            codigoHtml = codigoHtml.replaceAll("\\[", "&#91");
            codigoHtml = codigoHtml.replaceAll("\\]", "&#93");
            codigoHtml = codigoHtml.replaceAll("\\{", "&#123");
            codigoHtml = codigoHtml.replaceAll("\\}", "&#125");
            codigoHtml = codigoHtml.replaceAll("\\*", "&#42");
            codigoHtml = codigoHtml.replaceAll("\\/", "&#47");
            codigoHtml = codigoHtml.replaceAll("\\+", "&#43");
            codigoHtml = codigoHtml.replaceAll("\\-", "&#45");
            codigoHtml = codigoHtml.replaceAll("&&", "&amp&amp");
            codigoHtml = codigoHtml.replace("||", "&#124&#124");
            codigoHtml = codigoHtml.replaceAll('"'+"", "&_AsD");
            codigoHtml = codigoHtml.replaceAll("'", "&_AsS");
            espacado = codigoHtml;

            for (KeyWords kw : keywords) {
                System.out.println(kw.getNome());
                palavrasChaves.add(kw.getLexema().replaceAll("\\s", ""));
                boolean check1 = codigoHtml.contains(" "+kw.getLexema()+"&#40")||codigoHtml.contains(" "+kw.getLexema()+"&#91")||
                        codigoHtml.contains(" "+kw.getLexema()+"&#123")|| codigoHtml.contains(" "+kw.getLexema()+" ") || 
                        kw.isPrecisaEspaco() == false; //|| codigoHtml.contains(" "+kw.getLexema()+"<");;
                boolean check2 = kw.isPrecisaEspaco();
                boolean check3 = check1 && check2;
                if(codigoHtml.contains(" "+kw.getLexema()+" ")){
                    codigoHtml = codigoHtml.replaceAll(" "+kw.getLexema()+" "," <font color='"+ kw.getHtml()+"'>"+kw.getLexema()+"</font> ");
                }
                if(check3){
                    List<String> caracteres = new ArrayList();
                    caracteres.add(" ");
                    caracteres.add("&#59");
                    caracteres.add("&#44");
                    caracteres.add("&#40");
                    caracteres.add("&#41");
                    caracteres.add("&#91");
                    caracteres.add("&#93");
                    caracteres.add("&#123");
                    caracteres.add("&#125");
                    for(String simbolos: caracteres){
                        for(String simbolo: caracteres){
                            codigoHtml = codigoHtml.replaceAll(simbolos+kw.getLexema()+simbolo,"<font color='"+ kw.getHtml()+"'>"+
                                    simbolos+kw.getLexema()+"</font>"+simbolo);
    
                        }
                    }                    
                    espacado = espacado.replaceAll(" "+kw.getLexema()+" "," " + kw.getLexema()+" ");
                    espacado = espacado.replaceAll(" "+kw.getLexema()+"&#40"," " + kw.getLexema()+" &#40");
                    espacado = espacado.replaceAll(" "+kw.getLexema()+"&#91"," " + kw.getLexema()+" &#91");
                    espacado = espacado.replaceAll(" "+kw.getLexema()+"&#123"," " + kw.getLexema()+" &#123");        
                }
                
                else{
                    codigoHtml = codigoHtml.replaceAll(kw.getLexema(),"<font color='"+ kw.getHtml()+"'>"+kw.getLexema()+"</font>");
                    espacado = espacado.replaceAll(kw.getLexema(),kw.getEspacado());
                }
           
            }
           
            while (codigoHtml.contains("&_AsD")) {
                int InicComent = codigoHtml.indexOf("&_AsD");
                int FimComent = codigoHtml.indexOf("&_AsD",InicComent+5);
                if(FimComent>InicComent){  
 
                    String part1 = codigoHtml.substring(0, InicComent+5);
                    String part2 = codigoHtml.substring(InicComent+5, FimComent+5);
                    String part3 = codigoHtml.substring(FimComent+5);                

                    for(KeyWords kw: keywords){
                    part2 = part2.replace("<font color='"+kw.getHtml()+"'>","");                        
                    }
                    part2 = part2.replace("</font>","");

                    if(part1.contains("&_AsD ")){
                        part1 = part1.replaceAll("&_AsD ", "<font color='#3fca3c'>&quot ");
                    }
                    else{
                        part1 = part1.replaceAll("&_AsD", "<font color='#3fca3c'>&quot;");
                    }
                    part2 = part2.replace("&_AsD","&quot</font>");
                    codigoHtml = part1+part2+part3;

                }
                else{
                    String part1 = codigoHtml.substring(0, InicComent+5);
                    String part2 = codigoHtml.substring(InicComent+5);               

                    for(KeyWords kw: keywords){
                    part2 = part2.replace("<font color='"+kw.getHtml()+"'>","");                        
                    }
                    part2 = part2.replace("</font>","");

                    if(part1.contains("&_AsD ")){
                        part1 = part1.replaceAll("&_AsD ", "<font color='#3fca3c'>&quot ");
                    }
                    else{
                        part1 = part1.replaceAll("&_AsD", "<font color='#3fca3c'>&quot;");
                    }
                    codigoHtml = part1+part2+"</font>";
                }                
            }
             while (codigoHtml.contains("<font color='ff79c6'>&#47</font><font color='ff79c6'>&#42</font>")) {
                int InicComent = codigoHtml.indexOf("<font color='ff79c6'>&#47</font><font color='ff79c6'>&#42</font>");
                int FimComent = codigoHtml.indexOf("<font color='ff79c6'>&#42</font><font color='ff79c6'>&#47</font>");
                          
                    String part1 = codigoHtml.substring(0, InicComent);
                    String part2 = codigoHtml.substring(InicComent, FimComent+64);
                    String part3 = codigoHtml.substring(FimComent+64);

                    for(KeyWords kw: keywords){
                    part2 = part2.replace("<font color='"+kw.getHtml()+"'>","");                        
                    }
                    part2 = part2.replace("</font>","");
                    codigoHtml = part1+"<font color='#808080'>"+part2+"</font>"+part3;                
            }
            codigoHtml = "<html><pre>"+codigoHtml+"<html></pre>";
            txtCodigo.setText(codigoHtml);            
    } catch (IOException ex) {
        Logger.getLogger(TelaAnalisadorLexico.class.getName()).log(Level.SEVERE, null, ex);
    }
}
        
    }//GEN-LAST:event_btnArquivoActionPerformed

    private void btnValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarActionPerformed
        KeyWords[] keywords = KeyWords.values();
         
        Verify compilador = new Verify();
        String tokens = compilador.compilar(espacado, keywords,palavrasChaves);
           
        txtTokens.setText(tokens);
    }//GEN-LAST:event_btnValidarActionPerformed

    private void btnValidarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseEntered
        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnValidar2.png")));
    }//GEN-LAST:event_btnValidarMouseEntered

    private void btnValidarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValidarMouseExited
        btnValidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnValidar.png")));
    }//GEN-LAST:event_btnValidarMouseExited

    private void btnPesqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqMouseEntered
        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnPesq2.png")));
    }//GEN-LAST:event_btnPesqMouseEntered

    private void btnPesqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesqMouseExited
        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnPesq.png")));
    }//GEN-LAST:event_btnPesqMouseExited

    private void btnDocMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocMouseEntered
        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnDoc2.png")));
    }//GEN-LAST:event_btnDocMouseEntered

    private void btnDocMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDocMouseExited
        btnDoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens3/btnDoc.png")));
    }//GEN-LAST:event_btnDocMouseExited

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
            java.util.logging.Logger.getLogger(TelaAnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnalisadorLexico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAnalisadorLexico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnValidar;
    private javax.swing.JLabel imgFundo;
    private javax.swing.JScrollPane pnlCodigo;
    private javax.swing.JScrollPane pnlTokens;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JLabel txtFile;
    private javax.swing.JLabel txtTokens;
    // End of variables declaration//GEN-END:variables
}
