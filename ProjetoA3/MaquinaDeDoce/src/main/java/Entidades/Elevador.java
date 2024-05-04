/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Elevador {
    private int andares;
     
    
     
    public void subirAndares(boolean chamada,JPanel Princi,JPanel Andares,JLabel Tsub1,JLabel Tsub2,JLabel Tsub3,JLabel Tsub4,JLabel ind0,JLabel ind1,JLabel ind2,JLabel ind3,
            JLabel imgPredio,JButton btnChamaTerrer,JButton btnChamar1andar,JButton btnChamar2andar,JButton btnChamar3andar,
                            int andar,int andarDest, JLabel imgAutomato,JLabel imgElevador1,JLabel imgElevador2){
        int timer = 1;
        Tsub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TSub.png")));
        Tsub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TSub.png")));
        Tsub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TSub.png")));
        Tsub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TSub.png")));
        Tsub1.setVisible(true);
        Tsub2.setVisible(true);
        Tsub3.setVisible(true);
        Tsub4.setVisible(true);
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            System.out.println("/Imagens2/AutomatoA" +andar + "3.png");
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +andar + "3.png")));
            System.out.println("/Imagens2/ElevadorAbrindo.png");
            imgElevador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAbrindo.png")));
        }, timer, TimeUnit.SECONDS);
        timer++;
        executor.schedule(() -> {
            System.out.println("/Imagens2/AutomatoA" +andar + ".png");
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +andar + ".png")));
            System.out.println("/Imagens2/ElevadorFechado.png");
            imgElevador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorFechado.png")));
        }, timer, TimeUnit.SECONDS);
        timer++;
        for(int i = andar; i < andarDest;i++){ 
            final int finalI = i;
            executor.schedule(() -> {
                System.out.println("/Imagens2/AutomatoUP" + String.valueOf(finalI) +".png");
               imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoUP" + String.valueOf(finalI+1) +".png")));
            }, timer, TimeUnit.SECONDS);
            timer++;
           executor.schedule(() -> {
               System.out.println("/Imagens2/AutomatoA"+ finalI +".png");
               imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA"+ (finalI+1) +".png")));
               ind0.setText(String.valueOf(finalI+1));
                ind1.setText(String.valueOf(finalI+1));
                ind2.setText(String.valueOf(finalI+1));
                ind3.setText(String.valueOf(finalI+1));                                              
            }, timer, TimeUnit.SECONDS); 
           timer++;
           if(i == andarDest){
               continue;
           }
          this.andares++;
          
          System.out.println(this.andares);   
        }
        
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +this.andares + "1.png")));
            imgElevador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAbrindo.png")));
        }, timer, TimeUnit.SECONDS);
        timer++;
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +this.andares + "2.png")));
            imgElevador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAberto.png")));
            imgPredio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/imgPredio.png")));
        btnChamaTerrer.setVisible(true);
        btnChamar1andar.setVisible(true);
        btnChamar2andar.setVisible(true);
        btnChamar3andar.setVisible(true);
        Tsub1.setVisible(false);
        Tsub2.setVisible(false);
        Tsub3.setVisible(false);
        Tsub4.setVisible(false);
        
        }, timer, TimeUnit.SECONDS);
        timer++; 
        if(chamada){
            executor.schedule(() -> {
            Andares.setVisible(true);
            Princi.setVisible(false);    
            }, timer, TimeUnit.SECONDS);
              
        }
        timer++;
    }
    public void descerAndares(boolean chamada,JPanel Princi,JPanel Andares,JLabel Tsub1,JLabel Tsub2,JLabel Tsub3,JLabel Tsub4,JLabel ind0,JLabel ind1,JLabel ind2,JLabel ind3,JLabel imgPredio, 
                    JButton btnChamaTerrer,JButton btnChamar1andar,JButton btnChamar2andar,JButton btnChamar3andar,
                            int andar,int andarDest, JLabel imgAutomato,JLabel imgElevador1,JLabel imgElevador2){
        int timer = 1;
        Tsub1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TDesc.png")));
        Tsub2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TDesc.png")));
        Tsub3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TDesc.png")));
        Tsub4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/TDesc.png")));
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            System.out.println("/Imagens2/AutomatoA" +andar + "3.png");
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +andar + "3.png")));
            
            imgElevador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAbrindo.png")));
        }, timer, TimeUnit.SECONDS);
        timer++;
        executor.schedule(() -> {
            System.out.println("/Imagens2/AutomatoA" +andar + ".png");
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +andar + ".png")));
            
            imgElevador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorFechado.png")));
        }, timer, TimeUnit.SECONDS);
        timer++;
        for(int i = andar; i > andarDest;i--){
            final int finalI = i;
            executor.schedule(() -> {
               imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoDW" + String.valueOf(finalI) +".png")));
            }, timer, TimeUnit.SECONDS);
            timer++;
           executor.schedule(() -> {
               // Código a ser executado após 1 segundo
               imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA"+ (finalI-1) +".png")));
               ind0.setText(String.valueOf(finalI-1));
               ind1.setText(String.valueOf(finalI-1));
                ind2.setText(String.valueOf(finalI-1));
                ind3.setText(String.valueOf(finalI-1));
               
            }, timer, TimeUnit.SECONDS); 
           timer++;
           if(i == andarDest){
               continue;
           }
          this.andares--;
          
          System.out.println(this.andares);          
        }
        
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +this.andares + "1.png")));
            imgElevador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAbrindo.png")));
        }, timer, TimeUnit.SECONDS);
        timer++;
        executor.schedule(() -> {
            // Código a ser executado após 1 segundo
            imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA" +this.andares + "2.png")));
            imgElevador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/ElevadorAberto.png")));
            imgPredio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/imgPredio.png")));
        btnChamaTerrer.setVisible(true);
        btnChamar1andar.setVisible(true);
        btnChamar2andar.setVisible(true);
        btnChamar3andar.setVisible(true);
        Tsub1.setVisible(false);
        Tsub2.setVisible(false);
        Tsub3.setVisible(false);
        Tsub4.setVisible(false);

        }, timer, TimeUnit.SECONDS);
        timer++;
        if(chamada){
            executor.schedule(() -> {
            Andares.setVisible(true);
            Princi.setVisible(false);    
            }, timer, TimeUnit.SECONDS);
              
        }
        timer++;
    }


      
    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }
    
}
