//trabalhando com matriz
package Estrutura;
import java.util.Random;

/**
 *
 * @author Evandro
 */
public class Ex9Capitais {
    public static void main(String[] args) {
        //Matriz que representa a população dos 10 Municipios
        //E os 26 Estados
        int popuMuniEsta[][] = new int[26][10];
        int maior = 0, linha=0,coluna=0;
        double media = 0;
        
        //gerador Randomico
        Random aleatorio = new Random();
        
        //loop que percorrerá toda a matriz
        for (int row = 0; row < popuMuniEsta.length; row++) {
            for (int column = 0; column < popuMuniEsta[row].length; column++) {
                popuMuniEsta[row][column] = aleatorio.nextInt(999999-999);               
                
            }
        }
        
        if (popuMuniEsta[0][0]>popuMuniEsta[0][1] ) {
            maior = popuMuniEsta[0][0];            
        }else{
            maior = popuMuniEsta[0][1];
        }
        for (int row = 0; row < popuMuniEsta.length; row++) {
            for (int column = 0; column < popuMuniEsta[row].length; column++){
                if (popuMuniEsta[row][column] > maior) {
                    maior = popuMuniEsta[row][column];
                    coluna = row;
                    linha = column;
                }
            }
                media += popuMuniEsta[row][0];                    
        }
        media /= 26; 
        System.out.printf("O numero do Estado = [%d] \nO numero do Municipio = [%d] ",coluna,linha);               
        System.out.println();
        System.out.printf("maior = [%d]  ",maior);
        System.out.println();
        System.out.printf("A media das capitais = [%.3f] ",media);
        System.out.println();
        System.out.println("Os 10 Municipio mais populosos dos 26 Estados");
        //loop que mostra a matriz
        for (int row = 0; row < popuMuniEsta.length; row++) {
            for (int column = 0; column < popuMuniEsta[row].length; column++) 
                System.out.printf("[%d,%d] [%d] ",row,column,popuMuniEsta[row][column]);
                
            System.out.println();//inicia uma nova linha
           
        }
            System.out.println();
    }
}
