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
public class Ex4Pesquisa {
    public static void main(String[] args) {
        //vetor que armazena as notas de avaliação de qualidade 
        int pesquisa[] = new int[10];
        int frequencia[] = new int[6]; //array que armazena a ocorrencia de determinada nota
        
        Scanner entrada = new Scanner(System.in);//variavel que pega as informações via teclado
        //aqui vamos contar 
        for (int i = 0; i < pesquisa.length; i++) {
            System.out.println("Digite sua nota de 1 a 5");
            pesquisa[i] = entrada.nextInt();
            while (pesquisa[i] < 0 || pesquisa[i] > 5) {                
                System.out.println("Nota invalida");
                System.out.println("Digite sua "+(i+1)+"º nota de 1 a 5");
                pesquisa[i] = entrada.nextInt();
            }
            frequencia[pesquisa[i]]++;    
        }
        
        System.out.println();
        //aqui mostra quantidade de nota em um mesmo valor
        for (int cont = 1; cont < frequencia.length; cont++){ 
            System.out.println("Frequencia "+cont+" = "+frequencia[cont]);
        }
        //aqui mostra porcentagem que ocorreu a nota 4 e 5
        for (int percent = 4; percent < pesquisa.length; percent++){ 
            System.out.println("porcentagem das nos 4 e 5: "+percent+" = "
                    +((100.0*frequencia[percent])/pesquisa.length)+"%");
        }
    }
}
