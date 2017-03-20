/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrutura;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Ex2Notas {
    public static void main(String[] args) {
        //calcular o intervalo de frequencia das notas
        int notas = 20;
        //intervalo de 0-100
        int intervalo[] = new int[11];
        //variavel que pegará informações via teclado
        Scanner entrada = new Scanner(System.in);
        
        //laço que contará a quantidade de vezes que será digitado a nota
        for (int cont = 0; cont <= notas; cont++) {
            System.out.println("Digite a "+(cont+1)+"º nota");
            notas = entrada.nextInt();
            while(notas<0 || notas >100){
                System.out.println("Nota invalida");
                System.out.println("Digite a "+(cont+1)+"º nota");
                notas = entrada.nextInt();
            }
            intervalo[notas/10]++;
        }
        
        System.out.println("Grade distribuition: ");
        
        //Onde sera imprimido o resultado
        for (int i = 0; i < intervalo.length; i++) {
            if (i == 10) {
                System.out.printf("%5d: ", 100);
                
            }else{
                System.out.printf("%02d-%02d: ", i*10, i*10+9);
                
            }
            for (int j = 0; j < intervalo[i]; j++) 
                System.out.print("*");
            
           System.out.println();
        }
        
    }
}
