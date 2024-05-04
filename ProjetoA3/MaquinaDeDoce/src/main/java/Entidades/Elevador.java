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


public class Elevador {
    private int andares;
     
    
    
    public void subirAndares(JButton btnChamaTerrer,JButton btnChamar1andar,JButton btnChamar2andar,JButton btnChamar3andar,
                            int andar,int andarDest, JLabel imgAutomato,JLabel imgElevador1,JLabel imgElevador2){
        int timer = 1;
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
        btnChamaTerrer.setVisible(true);
        btnChamar1andar.setVisible(true);
        btnChamar2andar.setVisible(true);
        btnChamar3andar.setVisible(true);
        }, timer, TimeUnit.SECONDS);
        timer++; 
          
    }
    public void descerAndares(JButton btnChamaTerrer,JButton btnChamar1andar,JButton btnChamar2andar,JButton btnChamar3andar,
                            int andar,int andarDest, JLabel imgAutomato,JLabel imgElevador1,JLabel imgElevador2){
        int timer = 1;
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
        for(int i = andar; i >= andarDest;i--){
            final int finalI = i;
            executor.schedule(() -> {
               imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoDW" + String.valueOf(finalI) +".png")));
            }, timer, TimeUnit.SECONDS);
            timer++;
           executor.schedule(() -> {
               // Código a ser executado após 1 segundo
               imgAutomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens2/AutomatoA"+ (finalI-1) +".png")));
               
               
            }, timer, TimeUnit.SECONDS); 
           timer++;
           if(i == andarDest){
               continue;
           }
          this.andares--;   
          System.out.println(this.andares);          
        }
        timer -= 2;
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
        btnChamaTerrer.setVisible(true);
        btnChamar1andar.setVisible(true);
        btnChamar2andar.setVisible(true);
        btnChamar3andar.setVisible(true);
        }, timer, TimeUnit.SECONDS);
        timer++; 
          
    }


      
    public int getAndares() {
        return andares;
    }

    public void setAndares(int andares) {
        this.andares = andares;
    }
    
}
