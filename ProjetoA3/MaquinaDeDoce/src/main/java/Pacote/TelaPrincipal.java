/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pacote;

import Entidades.Maquina;
import java.awt.Color;
import java.awt.Font;
import javax.sound.sampled.*;
/**
 *
 * @author andre
 */
public class TelaPrincipal extends javax.swing.JFrame {
   Maquina mac = new Maquina(0,0);
   int contCookie = 0;
   int contChocolate = 0;
   int contGummy = 0;
    public TelaPrincipal() {
        super("CandyShop");
        initComponents();
        setLocationRelativeTo(null);
        btnGummy.setBackground(new Color(0,0,0,0));
        btnChocolate.setBackground(new Color(0,0,0,0));
        btnCookie.setBackground(new Color(0,0,0,0));
        btn1real.setBackground(new Color(0,0,0,0));
        btn5reais.setBackground(new Color(0,0,0,0));
        btn2reais.setBackground(new Color(0,0,0,0));
        btnPegar.setBackground(new Color(0,0,0,0));
        OutGummy1.setVisible(false);
        OutChoco1.setVisible(false);
        OutChoco2.setVisible(false);
        OutCookie1.setVisible(false);
        OutCookie2.setVisible(false);
        btnPegar.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saldo = new javax.swing.JLabel();
        OutGummy1 = new javax.swing.JLabel();
        OutCookie2 = new javax.swing.JLabel();
        OutChoco1 = new javax.swing.JLabel();
        btnPegar = new javax.swing.JButton();
        OutChoco2 = new javax.swing.JLabel();
        OutCookie1 = new javax.swing.JLabel();
        imgChoco1 = new javax.swing.JLabel();
        imgChoco3 = new javax.swing.JLabel();
        btn1real = new javax.swing.JButton();
        imgChoco4 = new javax.swing.JLabel();
        imgChoco5 = new javax.swing.JLabel();
        imgChoco6 = new javax.swing.JLabel();
        btn5reais = new javax.swing.JButton();
        imgGummy1 = new javax.swing.JLabel();
        btn2reais = new javax.swing.JButton();
        imgCookie1 = new javax.swing.JLabel();
        imgCookie2 = new javax.swing.JLabel();
        imgGummy2 = new javax.swing.JLabel();
        imgChoco2 = new javax.swing.JLabel();
        imgGummy3 = new javax.swing.JLabel();
        btnGummy = new javax.swing.JButton();
        btnChocolate = new javax.swing.JButton();
        btnCookie = new javax.swing.JButton();
        imgMaquina = new javax.swing.JLabel();
        imgManual = new javax.swing.JLabel();
        imgAutomato = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saldo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Saldo.setText("R$ 0,00");
        getContentPane().add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 197, 90, 30));

        OutGummy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/OutGummy.png"))); // NOI18N
        getContentPane().add(OutGummy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 653, -1, -1));

        OutCookie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Outcookie2.png"))); // NOI18N
        getContentPane().add(OutCookie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 653, -1, -1));

        OutChoco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Outchoco1.png"))); // NOI18N
        getContentPane().add(OutChoco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 653, -1, -1));

        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnPegar1.png"))); // NOI18N
        btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPegarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPegarMouseExited(evt);
            }
        });
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPegar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1019, 649, 140, -1));

        OutChoco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Outchoco2.png"))); // NOI18N
        getContentPane().add(OutChoco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 653, -1, -1));

        OutCookie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Outcookie1.png"))); // NOI18N
        getContentPane().add(OutCookie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 653, -1, -1));

        imgChoco1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/choco2.png"))); // NOI18N
        getContentPane().add(imgChoco1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        imgChoco3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/choco1.png"))); // NOI18N
        getContentPane().add(imgChoco3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 400, -1, -1));

        btn1real.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1real.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn1realMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn1realMouseExited(evt);
            }
        });
        btn1real.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1realActionPerformed(evt);
            }
        });
        getContentPane().add(btn1real, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, 120, 110));

        imgChoco4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/choco2.png"))); // NOI18N
        getContentPane().add(imgChoco4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, -1, -1));

        imgChoco5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/choco1.png"))); // NOI18N
        getContentPane().add(imgChoco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 400, -1, -1));

        imgChoco6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/choco2.png"))); // NOI18N
        getContentPane().add(imgChoco6, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 400, -1, -1));

        btn5reais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5reais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn5reaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn5reaisMouseExited(evt);
            }
        });
        btn5reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5reaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn5reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 680, 240, 110));

        imgGummy1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imgGummy.png"))); // NOI18N
        getContentPane().add(imgGummy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 310, -1, -1));

        btn2reais.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2reais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn2reaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn2reaisMouseExited(evt);
            }
        });
        btn2reais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2reaisActionPerformed(evt);
            }
        });
        getContentPane().add(btn2reais, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 230, 110));

        imgCookie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cookie2.png"))); // NOI18N
        getContentPane().add(imgCookie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 524, -1, -1));

        imgCookie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cookie1.png"))); // NOI18N
        getContentPane().add(imgCookie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 514, -1, -1));

        imgGummy2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imgGummy.png"))); // NOI18N
        getContentPane().add(imgGummy2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 310, -1, -1));

        imgChoco2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/choco1.png"))); // NOI18N
        getContentPane().add(imgChoco2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        imgGummy3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imgGummy.png"))); // NOI18N
        getContentPane().add(imgGummy3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        btnGummy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnGummy1.png"))); // NOI18N
        btnGummy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGummy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGummyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGummyMouseExited(evt);
            }
        });
        btnGummy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGummyActionPerformed(evt);
            }
        });
        getContentPane().add(btnGummy, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 282, 130, 40));

        btnChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnChocolate1.png"))); // NOI18N
        btnChocolate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChocolate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnChocolateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnChocolateMouseExited(evt);
            }
        });
        btnChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChocolateActionPerformed(evt);
            }
        });
        getContentPane().add(btnChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 130, 40));

        btnCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCookie1.png"))); // NOI18N
        btnCookie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCookie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCookieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCookieMouseExited(evt);
            }
        });
        btnCookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCookieActionPerformed(evt);
            }
        });
        getContentPane().add(btnCookie, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 360, 130, 40));

        imgMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaquinaFechada.png"))); // NOI18N
        imgMaquina.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(imgMaquina, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina.png"))); // NOI18N
        getContentPane().add(imgManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        imgAutomato.setBackground(new java.awt.Color(255, 255, 255));
        imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AutomatoQ0.png"))); // NOI18N
        getContentPane().add(imgAutomato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 290, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, -1, 750));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/FundoBranco.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 50, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGummyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGummyMouseEntered
        btnGummy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnGummy2.png")));
    }//GEN-LAST:event_btnGummyMouseEntered

    private void btnGummyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGummyActionPerformed
        try {
            // Carregando o arquivo de áudio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/SomBotao.wav"));

            // Obtendo o formato de áudio do arquivo
            AudioFormat format = audioInputStream.getFormat();

            // Configurando o clip de áudio
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Abrindo o clip de áudio
            clip.open(audioInputStream);

            // Reproduzindo o áudio
            clip.start();
            
            // Aguardando a reprodução terminar
            while (!clip.isRunning()){
                Thread.sleep(10);
            }
            while (clip.isRunning()){
                Thread.sleep(10);
            }

            // Fechando o stream e o clip
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        contGummy ++;
        if(contGummy <4){
            imgMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaquinaAbertaC.png")));
        }
        if(contGummy == 0){
            imgGummy1.setVisible(true);
            imgGummy2.setVisible(true);
            OutGummy1.setVisible(true);
        }
        else if(contGummy == 1){
            imgGummy1.setVisible(false);
            OutGummy1.setVisible(true);
        }
        else if(contGummy == 2){
            imgGummy2.setVisible(false);
            OutGummy1.setVisible(true);
        }
        else if(contGummy == 3){
            imgGummy3.setVisible(false);
            OutGummy1.setVisible(true);
        }
        else{
           Font fonte = new Font("Arial", Font.PLAIN, 20);

           Saldo.setFont(fonte);
           Saldo.setText("Esgotado");
           
        }
        btnGummy.setVisible(false);
        btnChocolate.setVisible(false);
        btnCookie.setVisible(false);
        btn1real.setVisible(false);
        btn5reais.setVisible(false);
        btn2reais.setVisible(false);
        btnPegar.setVisible(true);
       
   
    }//GEN-LAST:event_btnGummyActionPerformed

    private void btnChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChocolateActionPerformed
        try {
            // Carregando o arquivo de áudio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/SomBotao.wav"));

            // Obtendo o formato de áudio do arquivo
            AudioFormat format = audioInputStream.getFormat();

            // Configurando o clip de áudio
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Abrindo o clip de áudio
            clip.open(audioInputStream);

            // Reproduzindo o áudio
            clip.start();
            
            // Aguardando a reprodução terminar
            while (!clip.isRunning()){
                Thread.sleep(10);
            }
            while (clip.isRunning()){
                Thread.sleep(10);
            }

            // Fechando o stream e o clip
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        contChocolate ++;
        if(contChocolate <7){
            imgMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaquinaAbertaC.png")));
        }
 
        if(contChocolate == 0){
            imgChoco2.setVisible(true);
            imgChoco1.setVisible(true);
        }
        else if(contChocolate == 3){
            imgChoco2.setVisible(false);
            OutChoco1.setVisible(true);
        }
        else if(contChocolate == 4){
            imgChoco1.setVisible(false);
            OutChoco2.setVisible(true);
        }
        else if(contChocolate == 2){
            imgChoco3.setVisible(false);
            OutChoco1.setVisible(true);
        }
        else if(contChocolate == 1){
            imgChoco4.setVisible(false);
            OutChoco2.setVisible(true);
        }
        else if(contChocolate == 6){
            imgChoco5.setVisible(false);
            OutChoco1.setVisible(true);
        }
        else if(contChocolate == 5){
            imgChoco6.setVisible(false);
            OutChoco2.setVisible(true);
        }
        else{
           Font fonte = new Font("Arial", Font.PLAIN, 20);

           Saldo.setFont(fonte);
           Saldo.setText("Esgotado");
           
        }
        btnGummy.setVisible(false);
        btnChocolate.setVisible(false);
        btnCookie.setVisible(false);
        btn1real.setVisible(false);
        btn5reais.setVisible(false);
        btn2reais.setVisible(false);
        btnPegar.setVisible(true);
        
    }//GEN-LAST:event_btnChocolateActionPerformed

    private void btnCookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCookieActionPerformed
        try {
            // Carregando o arquivo de áudio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/SomBotao.wav"));

            // Obtendo o formato de áudio do arquivo
            AudioFormat format = audioInputStream.getFormat();

            // Configurando o clip de áudio
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Abrindo o clip de áudio
            clip.open(audioInputStream);

            // Reproduzindo o áudio
            clip.start();
            
            // Aguardando a reprodução terminar
            while (!clip.isRunning()){
                Thread.sleep(10);
            }
            while (clip.isRunning()){
                Thread.sleep(10);
            }

            // Fechando o stream e o clip
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        contCookie ++;
        if(contCookie <3){
            imgMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaquinaAbertaC.png")));
        }
        if(contCookie == 0){
            imgCookie2.setVisible(true);
            imgCookie1.setVisible(true);
        }
        else if(contCookie == 1){
            imgCookie2.setVisible(false);
            OutCookie1.setVisible(true);
        }
        else if(contCookie == 2){
            imgCookie1.setVisible(false);
            OutCookie2.setVisible(true);
        }
        else{
           Font fonte = new Font("Arial", Font.PLAIN, 20);

           Saldo.setFont(fonte);
           Saldo.setText("Esgotado");
           
        }
       
        btnGummy.setVisible(false);
        btnChocolate.setVisible(false);
        btnCookie.setVisible(false);
        btn1real.setVisible(false);
        btn5reais.setVisible(false);
        btn2reais.setVisible(false);
        btnPegar.setVisible(true);
        
       
    }//GEN-LAST:event_btnCookieActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        OutGummy1.setVisible(false);
        OutChoco1.setVisible(false);
        OutChoco2.setVisible(false);
        OutCookie1.setVisible(false);
        OutCookie2.setVisible(false);
        imgMaquina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/MaquinaFechada.png")));
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnPegar1.png")));
        btnGummy.setVisible(true);
        btnChocolate.setVisible(true);
        btnCookie.setVisible(true);
        btn1real.setVisible(true);
        btn5reais.setVisible(true);
        btn2reais.setVisible(true);
        btnPegar.setVisible(false);
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnPegarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPegarMouseEntered
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnPegar2.png")));
    }//GEN-LAST:event_btnPegarMouseEntered

    private void btnPegarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPegarMouseExited
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnPegar1.png")));
    }//GEN-LAST:event_btnPegarMouseExited

    private void btn1realMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1realMouseEntered
        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina1real.png")));
// TODO add your handling code here:
    }//GEN-LAST:event_btn1realMouseEntered

    private void btn1realMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1realMouseExited
        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina.png")));
    }//GEN-LAST:event_btn1realMouseExited

    private void btn2reaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2reaisMouseEntered
        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina2reais.png")));
    }//GEN-LAST:event_btn2reaisMouseEntered

    private void btn2reaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2reaisMouseExited
        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina.png")));
    }//GEN-LAST:event_btn2reaisMouseExited

    private void btn5reaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5reaisMouseEntered
        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina5reais.png")));
    }//GEN-LAST:event_btn5reaisMouseEntered

    private void btn5reaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5reaisMouseExited
        imgManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ManualMaquina.png")));
    }//GEN-LAST:event_btn5reaisMouseExited

    private void btnGummyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGummyMouseExited
        btnGummy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnGummy1.png")));
    }//GEN-LAST:event_btnGummyMouseExited

    private void btnChocolateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChocolateMouseEntered
         btnChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnChocolate2.png")));
    }//GEN-LAST:event_btnChocolateMouseEntered

    private void btnChocolateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChocolateMouseExited
        btnChocolate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnChocolate1.png")));
    }//GEN-LAST:event_btnChocolateMouseExited

    private void btnCookieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCookieMouseEntered
        btnCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCookie2.png")));
    }//GEN-LAST:event_btnCookieMouseEntered

    private void btnCookieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCookieMouseExited
        btnCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/btnCookie1.png")));
    }//GEN-LAST:event_btnCookieMouseExited

    private void btn1realActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1realActionPerformed
        if(mac.getSaldo() < 10){
            try {
                // Carregando o arquivo de áudio
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/SomDinheiro.wav"));

                // Obtendo o formato de áudio do arquivo
                AudioFormat format = audioInputStream.getFormat();

                // Configurando o clip de áudio
                DataLine.Info info = new DataLine.Info(Clip.class, format);
                Clip clip = (Clip) AudioSystem.getLine(info);

                // Abrindo o clip de áudio
                clip.open(audioInputStream);

                // Reproduzindo o áudio
                clip.start();

                // Aguardando a reprodução terminar
                while (!clip.isRunning()){
                    Thread.sleep(10);
                }
                while (clip.isRunning()){
                    Thread.sleep(10);
                }

                // Fechando o stream e o clip
                clip.close();
                audioInputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            mac.somar(1);
            Saldo.setText("R$"+String.valueOf(mac.getSaldo())+",00");
            mac.MudaEstado(1);
            String foto = String.valueOf(mac.getEstado());
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AutomatoQ" + foto +".png")));
        }else{
            System.out.println("Limite Atingido");
            btn1real.setVisible(false);

        }
    }//GEN-LAST:event_btn1realActionPerformed

    private void btn2reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2reaisActionPerformed
        if(mac.getSaldo() < 9){
            try {
                // Carregando o arquivo de áudio
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/SomDinheiro.wav"));

                // Obtendo o formato de áudio do arquivo
                AudioFormat format = audioInputStream.getFormat();

                // Configurando o clip de áudio
                DataLine.Info info = new DataLine.Info(Clip.class, format);
                Clip clip = (Clip) AudioSystem.getLine(info);

                // Abrindo o clip de áudio
                clip.open(audioInputStream);

                // Reproduzindo o áudio
                clip.start();

                // Aguardando a reprodução terminar
                while (!clip.isRunning()) Thread.sleep(10);
                while (clip.isRunning()) Thread.sleep(10);

                // Fechando o stream e o clip
                clip.close();
                audioInputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            mac.somar(2);
            Saldo.setText("R$"+String.valueOf(mac.getSaldo())+",00");
            mac.MudaEstado(2);
            String foto = String.valueOf(mac.getEstado());
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AutomatoQ" + foto +".png")));
        }else{
            System.out.println("LimiteAtingido");
            btn2reais.setVisible(false);
        }
    }//GEN-LAST:event_btn2reaisActionPerformed

    private void btn5reaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5reaisActionPerformed
        if(mac.getSaldo() < 6){
            try {
                // Carregando o arquivo de áudio
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/SomDinheiro.wav"));

                // Obtendo o formato de áudio do arquivo
                AudioFormat format = audioInputStream.getFormat();

                // Configurando o clip de áudio
                DataLine.Info info = new DataLine.Info(Clip.class, format);
                Clip clip = (Clip) AudioSystem.getLine(info);

                // Abrindo o clip de áudio
                clip.open(audioInputStream);

                // Reproduzindo o áudio
                clip.start();

                // Aguardando a reprodução terminar
                while (!clip.isRunning()) Thread.sleep(10);
                while (clip.isRunning()) Thread.sleep(10);

                // Fechando o stream e o clip
                clip.close();
                audioInputStream.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            mac.somar(5);
            Saldo.setText("R$"+String.valueOf(mac.getSaldo())+",00");
            mac.MudaEstado(5);
            String foto = String.valueOf(mac.getEstado());
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/AutomatoQ" + foto +".png")));
        }else{
                System.out.println("LimiteAtigido");
                btn5reais.setVisible(false);
        }
    }//GEN-LAST:event_btn5reaisActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
                
            }
        });
        try {
            // Carregando o arquivo de áudio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(TelaPrincipal.class.getResourceAsStream("/Audios/CandyShop.wav"));

            // Obtendo o formato de áudio do arquivo
            AudioFormat format = audioInputStream.getFormat();

            // Configurando o clip de áudio
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);

            // Abrindo o clip de áudio
            clip.open(audioInputStream);

            // Reproduzindo o áudio
            clip.start();
            
            // Aguardando a reprodução terminar
            while (!clip.isRunning()){
                Thread.sleep(10);
            }
            while (clip.isRunning()){
                Thread.sleep(10);
            }

            // Fechando o stream e o clip
            clip.close();
            audioInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel OutChoco1;
    private javax.swing.JLabel OutChoco2;
    private javax.swing.JLabel OutCookie1;
    private javax.swing.JLabel OutCookie2;
    private javax.swing.JLabel OutGummy1;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton btn1real;
    private javax.swing.JButton btn2reais;
    private javax.swing.JButton btn5reais;
    private javax.swing.JButton btnChocolate;
    private javax.swing.JButton btnCookie;
    private javax.swing.JButton btnGummy;
    private javax.swing.JButton btnPegar;
    private javax.swing.JLabel imgAutomato;
    private javax.swing.JLabel imgChoco1;
    private javax.swing.JLabel imgChoco2;
    private javax.swing.JLabel imgChoco3;
    private javax.swing.JLabel imgChoco4;
    private javax.swing.JLabel imgChoco5;
    private javax.swing.JLabel imgChoco6;
    private javax.swing.JLabel imgCookie1;
    private javax.swing.JLabel imgCookie2;
    private javax.swing.JLabel imgGummy1;
    private javax.swing.JLabel imgGummy2;
    private javax.swing.JLabel imgGummy3;
    private javax.swing.JLabel imgManual;
    private javax.swing.JLabel imgMaquina;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
