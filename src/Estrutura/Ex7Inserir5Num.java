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
public class Ex7Inserir5Num {

    public static void main(String[] args) {
        int array[] = new int[5];
        int numero = 0;
        Scanner entrada = new Scanner(System.in);
        int aux= 0;
       
        for (int i = 0; i < array.length; i++) {
            do{
                aux = 0;
            System.out.println("Digite 5 numero entre 10 e 100 " + (i + 1) + "º");
            numero = entrada.nextInt();
           
            if (numero >= 10 && numero <= 100) {
                
                for (int j = 0; j < array.length; j++) {
                    if (numero == array[j]) {
                        System.out.println("Numero já existe");
                        aux = 1;

                    }
                }
                if (aux == 0) {
                    array[i] = numero;
                }
            }else{
               System.out.println("Numero invalido");
            }
           
 
                  
        }while (numero < 10 || numero > 100 || aux == 1) ;
        }      
         

        //Saida
        for (int cont = 0; cont < array.length; cont++) {
            System.out.println("Array[" + (cont + 1) + "] = " + array[cont]);

        }
        

    }
}
