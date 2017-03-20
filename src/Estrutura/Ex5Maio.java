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
public class Ex5Maio {
    public static void main(String[] args) {
        int vetor[] = new int[15];
        int maior = 0;//variavel para fazer comporação 
        int segMaior = 0;
        
        //variavel que faz a leitura do teclado
        Scanner entrada = new Scanner(System.in);
        
        //Condição que vai garantir uma comparação
       
        //aqui preenche o vetor
        for (int dig = 0; dig < vetor.length; dig++) {
            System.out.println("Digite 15 numeros "+(dig+1)+"º");
            vetor[dig] = entrada.nextInt();
        }
         if (vetor[0]>vetor[1]) {
            maior = vetor[0];
            segMaior = vetor[1];
        }else{
          
            segMaior = vetor[0];
            maior = vetor[1];
           
        }
        
        //aqui fazer a comparação
        for (int i = 2; i < vetor.length; i++) {
            if (vetor[i]>maior) {
                segMaior = maior;
                maior = vetor[i];
            }else{
                if (vetor[i]> segMaior) {
                    segMaior = vetor[i];
                }
            }
        }
        System.out.println("Maior = "+maior+"\nSegundoMaior = "+segMaior);
    }
}
