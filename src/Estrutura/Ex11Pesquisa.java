//trabalhando matriz
package Estrutura;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Ex11Pesquisa {

    public static void main(String[] args) {
        String nome[] = new String[2];
        int pesquisa[][] = new int[2][5];
        Scanner t = new Scanner(System.in);
        int nota = 0;
        int soma[] = new int[5];
        int aux = 0;

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Informe seu nome: ");
            nome[i] = t.next();
            System.out.println("Responda as 10 questões sendo 5 opções cada questão, de 1 a 5 ");

            for (int row = 0; row < pesquisa[i].length; row++) {

                System.out.printf("Informe a nota da [%d]º questão = ", (row + 1));
                nota = t.nextInt();
                while (nota < 1 || nota > 5) {
                    System.out.println("Opções invalida apenas  de 1 a 5");
                    System.out.printf("Informe a nota da [%d]º questão = ", (row + 1));
                    nota = t.nextInt();
                }
                pesquisa[i][row] = nota;
                for (int j = 0; j < nome.length; j++) {
                    soma[j] = pesquisa[row].length;
                }
            }
        }

        System.out.println();
        System.out.println("Resutado da Pesquisa");
        System.out.println();
        //mostra o resultado
        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nota: " + nome[i]);
            for (int row = 0; row < pesquisa[i].length; row++) {
                System.out.printf("Questões [%d]º Nota = [%d]\n ", (row + 1), pesquisa[i][row]);
            }

        }
        System.out.println();

//        System.out.println();
        //mostra a quantidade de pessoa que deu aquela nota
        for (int i = 0; i < soma.length; i++) {
            System.out.printf("Quantos pessoas digitaram a opção [%d] = %d\n ", (i + 1), soma[i]);
        }

        System.out.println();
    }
}
