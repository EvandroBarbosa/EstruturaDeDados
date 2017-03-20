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
public class Ex3Transporte {
    public static void main(String[] args) {
        //arrys de numeros inteiro
        int vetor[] = new int[50];
        //array que será preenchido com os numeros primos
        int array[] = new int[25];
        int aux = 0;
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i+1;            
            boolean ePrimo =true;
            for (int j = 2; j <= Math.sqrt(vetor[i]) && ePrimo; j++) {
                if (vetor[i]%j == 0) {
                    ePrimo = false;
                }
            }
            if (ePrimo) {
                array[aux] = vetor[i];  
                aux++;        
            }                
        }
                      
        
        //Mostra o conteudo de vetor
        System.out.println("Vetor de 1 a 50");
        for (int m = 0; m < vetor.length; m++){ 
            System.out.println("Vetor ["+m+"] = "+vetor[m]);
        }
        System.out.println();
        System.out.println("Quantidade de primos: "+aux);
        //saida dos primos
        System.out.println("Vetor de Primos");
        for (int i = 0; i < aux; i++) {
            System.out.println("array ["+i+"] = "+array[i]);
            
        }
        
    }
}
