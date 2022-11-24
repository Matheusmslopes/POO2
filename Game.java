/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Random;
import java.util.Scanner;

    
public class Game { 
        String personagem = null;
        String weapon = null;
        String perso2 = null;
        String weap2 = null;
        String frase = null;
        String f2 = null;
        int escolha1 = 0;
        int es1 = 0;
        int escolha2 = 0;
        int es2 = 0;
//    Game app = new Game();
    
    public static void main(String[] args) {
        Game app = new Game();
        Mago m = new Mago();
        General g = new General();
        Soldado s = new Soldado();
        LutSumo ls = new LutSumo();
        Dragao da = new Dragao();

     app.personagem = app.escolhaPersonagem();    
     app.weapon= app.escolhaArma();    //escolhaArma();
     System.out.println("---------------------------PRINT-----------------------------");
     System.out.println("Arma: " + app.weapon);
     System.out.println("Personagem: " + app.personagem);
     //System.out.println(app.frase);
     
     app.perso2 = app.escolhaPersonagem();
     app.weap2 = app.escolhaArma();
     System.out.println("---------------------------PRINT-----------------------------");
     System.out.println("Arma: " + app.weap2);
     System.out.println("Personagem: " + app.perso2);
     //System.out.println(app.f2);

    }
    
    public String escolhaArma(){
        Game gm = new Game();
        int esc1;
//        String wp;
        System.out.println("---------------------------ARMA-----------------------------");
        System.out.println("Escolha sua arma: ");
        System.out.println("1. Faca");
        System.out.println("2. Revolver");
        System.out.println("3. Fuzil");
        System.out.println("4. Desarmado");
        System.out.println("5. Fogo");
        System.out.println("6. Magia");
        Scanner e1 = new Scanner(System.in);
       esc1 = e1.nextInt();
       
        switch (esc1) {
            case 1 -> gm.weapon = "Faca";
            case 2 -> gm.weapon = "Revolver";
            case 3 -> gm.weapon = "Fuzil";
            case 4 -> gm.weapon = "Desarmado";
            case 5 -> gm.weapon = "Fogo";
            case 6 -> gm.weapon = "Magia";
            default -> System.out.println("Erro: valor digitado não condiz com nenhuma das opções");
        } 
        return gm.weapon;
    }
    public String escolhaPersonagem(){ 
        Game game = new Game();
        int esc2;
        String fras, perso = null;
        System.out.println("--------------------------PERSONAGEM------------------------------");
        System.out.println("Escolha seu personagem: ");
        System.out.println("1. Mago");
        System.out.println("2. General");
        System.out.println("3. Soldado");
        System.out.println("4. Lutador de Sumo");
        System.out.println("5. Dragao");
        Scanner e = new Scanner(System.in);
        esc2 = e.nextInt();
       
       Mago m = new Mago();
       General g = new General();
       Soldado s = new Soldado();
       LutSumo ls = new LutSumo();
       Dragao da = new Dragao();
       switch (esc2){
           case 1 -> { 
               game.personagem = "Mago";
               fras = m.falar();
            }
           case 2 -> {
               game.personagem = "General";
               fras = g.falar();
            }
           case 3 -> {
               game.personagem = "Soldado";
               fras = s.falar();
            }
           case 4 -> {
               game.personagem = "Lutador de Sumo";
               fras = ls.falar();
            }
           case 5 -> {
               game.personagem = "Dragao";
            }
           default -> System.out.println("Erro: valor digitado não condiz com nenhuma das opções");
       }
        
       
        return game.personagem;
       
    }
//    public String escolhaPersonagem2(){
//        escolhaPersonagem1();
//        perso2 = personagem;
//        weap2 = weapon;
//        f2 = frase;
//        es2 = escolha2;
//        es1 = escolha1;
//        return null;
//    }
    
    public static int aleatorio(int minimo, int maximo){
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
    
    public int nivel1(){
//        int p1, atq, calJ1;
//        switch(es2){
//            case 1 -> p1 = m.habilidadeNO();
//            case 2 -> p1 = g.habilidadeNO();
//            case 3 -> p1 = s.habilidadeNO();
//            case 4 -> p1 = ls.habilidadeNO();    
//            case 5 -> p1 = da.habilidadeNO();
//        }
//        
//        Faca faca = new Faca();
//        Revolver rev = new Revolver();
//        Fuzil fuz = new Fuzil();
//        Desarmado desm = new Desarmado();
//        Fogo fogo = new Fogo();
//        Magia magia = new Magia();
//        
//        switch(es1){
//            case 1 -> atq = faca.ataque();
//            case 2 -> atq = rev.ataque();
//            case 3 -> atq = fuz.ataque();
//            case 4 -> atq = desm.ataque();
//            case 5 -> atq = fogo.ataque();
//            case 6 -> atq = magia.ataque();
//        } 
//        
        
        return 0;
    }
}
