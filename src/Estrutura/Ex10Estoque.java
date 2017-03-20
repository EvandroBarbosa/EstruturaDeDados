//trabalhando com Matriz
package Estrutura;

import java.util.Scanner;

/**
 *
 * @author Evandro
 */
public class Ex10Estoque {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int armazem, produto;
        System.out.println("Informe o quantidade de Armazem");
        armazem = ent.nextInt();
        System.out.println("Informe quantos tipos de produto");
        produto = ent.nextInt();
        int valor;
        System.out.println("Digite o tamanho do vetor de acordo com a quantidade de tipos de produto");
        valor = ent.nextInt();
        float custo[] = new float[valor];
        int estoque[][] = new int[armazem][produto];
        //variaveis que somara a quantidade de produto em cada armaze
        int somaProduto = 0;
        float custoTotal = 0;
        int maior = 0;

        //preenche a matriz estoque
        for (int row = 0; row < estoque.length; row++) {
            for (int column = 0; column < estoque[row].length; column++) {
                System.out.printf("Informe a quantidade de produto %d  armazem %d = ", (column + 1), (row + 1));
                estoque[row][column] = ent.nextInt();
            }
        }        
        
        System.out.println();
        //Pega o preço dos produtos
        System.out.println("Informe o valor de cada produto");
        for (int i = 0; i < custo.length; i++) {
            System.out.printf("Informe o valor Produto %d = ", (i + 1));
            custo[i] = ent.nextFloat();
        }
        
        //aqui soma a quantidade de produto em cada armazem
        System.out.println();
        for (int row = 0; row < estoque.length; row++) {
            somaProduto = 0;
            for (int column = 0; column < estoque[row].length; column++) {
                somaProduto += estoque[row][column];
            }
            System.out.printf("Qantidade produto Armazem %d = %d \n", (row + 1), somaProduto);
        }
        
        //aqui soma o custo total dos produtos em cada armazem
        System.out.println();
        for (int row = 0; row < estoque.length; row++) {
            custoTotal = 0;
            for (int column = 0; column < estoque[row].length; column++) {
                custoTotal += estoque[row][column] * custo[column];
            }
            System.out.printf("Custol Total de produto Armazem %d = R$:%.2f \n", (row + 1), custoTotal);
        }
        System.out.println();
        
        //aqui soma custo total de cada produto em cada armazem
        for (int i = 0; i < custo.length; i++) {
            custoTotal = 0;
            for (int column = 0; column < estoque[i].length; column++) {
                custoTotal = estoque[i][column] * custo[column];
                System.out.printf("Valor do Produto %d no Armazem %d = R$: %.2f\n", (column + 1), (i + 1), custoTotal);
            }
        }
        System.out.println();
        
        //aqui soma custo total de cada produto em todos os armazem
        for (int row = 0; row < custo.length; row++) {
            custoTotal = 0;
            somaProduto = 0;
            for (int column = 0; column < estoque[row].length; column++) {
                custoTotal += estoque[row][column] * custo[column];
            }
//            somaProduto += custoTotal;
            System.out.printf("Valor de cada Produto em todos os Armazem = R$: %.2f\n",custoTotal);
        }
        
        System.out.println();    
        
//        //aqui a maior quantidade de produto 2 nos armazem
//        for (int row = 0; row < estoque.length; row++) {            
//            for (int column = 0; column < estoque[row].length; column++) {
//                if (estoque[row][column] > maior) {
//                    maior = estoque[row][column];
//                }
//            }
//            
//            System.out.printf("A maior quantidade de Produto2 esta no Armazem %d = %d  ",(row + 1),maior);
//        }     
//       
//        System.out.println();
        System.out.println("Estoque ");
        //mostra a matriz estoque
        for (int row = 0; row < estoque.length; row++) {
            for (int column = 0; column < estoque[row].length; column++) {
                System.out.printf("| %d | ", estoque[row][column]);
            }

            System.out.println();

        }
        System.out.println();

    }
}
