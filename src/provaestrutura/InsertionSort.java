/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaestrutura;

/**
 *
 * @author Edson
 */

public class InsertionSort {

    int y, u;
    int aux;
    int contador = 1;

    public void algoritmoInsertionSort(int vetor[]) {
        
        //Fara o armazenamento de uma variavel para assim fazer a comparação. 
        //assim iniciara a partir da segunda pasição.
        for (y = 1; y < vetor.length; y++) {
            //A variavel recebe o elemento da segunda posição.
            aux = vetor[y];
            //inicia a comparação
            u = y - 1;
            //Pegara todos os elementos anteriores a aux menores que ele.
            //Enquanto algum elemento anterior for maior que o valor armazenada em aux.
            while ((u >= 0) && vetor[u] > aux) {
                //O próximo elemento recebe a atual variavel j.
                vetor[u + 1] = vetor[u];
                u = u - 1;
            }
            vetor[u + 1] = aux;
        }

        if (contador == 1) {
            System.out.println("Insertion Sort");
            contador++;
        }
        System.out.print("[");
        for (y = 0; y < vetor.length; ++y) {
            System.out.print(" " + vetor[y] + " ");
        }
        System.out.println("]; ");
    }

    public static void main(String[] args) {

        InsertionSort execute = new InsertionSort();

        int vetor1[] = {9, 5, 2, 7, 6, 1};
        int vetor2[] = {3, 5, 4, 9, 7, 1};

        execute.algoritmoInsertionSort(vetor1); //Ficaria -> [1, 2, 5, 6, 7, 9]
        execute.algoritmoInsertionSort(vetor2); //Ficaria -> [1, 3, 4, 5, 7, 9] 
    }
}  

