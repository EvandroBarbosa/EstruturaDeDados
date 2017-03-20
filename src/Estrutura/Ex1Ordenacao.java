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
public class Ex1Ordenacao {
    public static void main(String[] args) {
        //programa para ordenação de numeros
        int n1,n2,n3, aux;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite tres numero");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        n3 = entrada.nextInt();
        
        if (n1 > n2) {
            aux = n2;
            n2 = n1;
            n1 = aux;       
            
        }
        if (n1 > n3) {
            aux = n3;
            n3 = n1;
            n1 = aux;
        }
        if (n2 > n3) {
            aux = n3;
            n3 = n2;
            n2 = aux;
        }
        System.out.println("Ordem: "+n1+" "+n2+ " "+n3);
    }
}
