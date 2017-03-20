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
public class Ex8Matriz {
    public static void main(String[] args) {
        //entrada via teclado
        Scanner entrada = new Scanner(System.in);
        int lin = 0, colun = 0;
        //Informa quantas linhas tem a matriz
        System.out.println("Digite quantidade de linha da Matriz");
        lin = entrada.nextInt();
        //Informa quantas colunas tem a matriz
        System.out.println("Digite quantidade de coluna da Matriz");
        colun = entrada.nextInt();
        //cria a matriz a e b
        int a[][] = new int[lin][colun];
        int b[][] = new int[lin][colun+1];         
        
        //preenche a matriz
        //percorre a linha da matriz
        for (int row = 0; row < a.length; row++) {
           int mult = 1;
            for (int column = 0; column < a[row].length; column++) {
                System.out.println("Digite o valor da "+row+"º linha "+column+"º coluna ");
                a[row][column] = entrada.nextInt();
                b[row][column] = a[row][column];
                mult *= a[row][column];                
                b[row][column+1] = mult;
            }
        }
        System.out.println();
        System.out.println("Matriz A");
        //mostra a matriz A
        //percorre as linhas da matriz
        for (int row = 0; row < a.length; row++) {
            //percorre as colunas da linha atual
            for (int column = 0; column < a[row].length; column++) 
                System.out.printf("[%d]  ",a[row][column]);                
              
            System.out.println();//inicia uma nova linha de saida            
        }
          
          System.out.println("Matriz B");
        //mostra a matriz B
        //percorre as linhas da matriz
        for (int row = 0; row < b.length; row++) {
            //percorre as colunas da linha atual
            for (int column = 0; column < b[row].length; column++) 
                System.out.printf("[%d]  ",b[row][column]);                
              
            System.out.println();//inicia uma nova linha de saida
            
        }
    }
}
