/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

/**
 *
 * @author Evandro
 */
public class Ex6Asterisco {
    public static void main(String[] args) {
        System.out.println("Letra A");
        //aqui vamos mostras os asterisco começando de 1 a 10
        //É uma matris 10x10 na primeira linha será impresso 1 asterico
        //dá direita pra esquerda
        //E na decima linha será impresso 10 asterisco
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        //aqui vamos mostras os asterisco começando de 1 a 10
        //É uma matris 10x10 na primeira linha será impresso 10 asterico
        //dá direita pra esquerda
        //E na decima linha será impresso 1 asterisco
        System.out.println("Letra B");
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
                System.out.println();
        }
        //aqui vamos mostras os asterisco começando de 1 a 10
        //É uma matris 10x10 na primeira linha será impresso 10 asterico
        //dá esquerda pra direita
        //E na decima linha será impresso 1 asterisco
        System.out.println("Letra C");
        for (int i = 0; i < 10; i++) {
            for (int l = 0; l < i; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= 9-i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
        //aqui vamos mostras os asterisco começando de 1 a 10
        //É uma matris 10x10 na primeira linha será impresso 1 asterico
        //dá esquerda pra direita
        //E na decima linha será impresso 10 asterisco
        System.out.println("Letra D");
        for (int i = 0; i < 10; i++) {
            for (int l = 10; l > i; l--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
            
