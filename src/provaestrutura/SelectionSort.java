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

public class SelectionSort {

    int y, u, j;
    int aux;
    int contador = 1;

    public void algoritmoSelectionSort(int vetor[]) {

        for (y = 0; y < vetor.length - 1; y++) {
            //Considera como o valor no indice atual do lool, o valor inserido no indice que o loop esta.
            aux = y;
            //Ele ira pegar o elemento seguinte ao atual.
            for (u = aux + 1; u < vetor.length; u++) {
                //Inicia a comparação.
                if (vetor[u] < vetor[aux]) {
                    aux = u;
                }
            }
            //Realiza a troca dos elementos.
            if (aux != y) {
                j = vetor[y];
                vetor[y] = vetor[aux];
                vetor[aux] = j;
            }
        }

        if (contador == 1) {
            System.out.println("Selection Sort");
            contador++;
        }
        System.out.print("[");
        for (y = 0; y < vetor.length; ++y) {
            System.out.print(" " + vetor[y] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        SelectionSort execute = new SelectionSort();

        int vetor1[] = {3, 7, 1, 8, 2, 6};
        int vetor2[] = {4, 5, 6, 3, 1, 8};

        execute.algoritmoSelectionSort(vetor1); //Ficaria -> [1, 2, 3, 6, 7, 8]
        execute.algoritmoSelectionSort(vetor2); //Ficaria -> [1, 3, 4, 5, 6, 8]   
    }
} 
