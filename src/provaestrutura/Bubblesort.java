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


public class Bubblesort {

    int x, y;
    int aux;
    int contador = 1;

    public void algoritmoBubbleSort(int vetor[]) {
        //Processo vai ser repetido baseado no tamanho do vetor
        for (y = 0; y < vetor.length; ++y) {
             //Analiza os 2 vetores
            for (x = 0; x < (vetor.length - 1); ++x) {
                //Fara a comparação e ira verificar se um determinado membro é maior que o outro
                if (vetor[x] > vetor[x + 1]) {
                    aux = vetor[x];
                    vetor[x] = vetor[x + 1];
                    vetor[x + 1] = aux;
                }
            }
        }

        if (contador == 1) {
            System.out.println("Bubble Sort");
            contador++;
        }
        System.out.print("[");
        for (y = 0; y < vetor.length; ++y) {
            System.out.print(" " + vetor[y] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        Bubblesort execute = new Bubblesort();

        int vetor1[] = {5, 8, 6, 4, 7, 9};
        int vetor2[] = {6, 1, 5, 2, 3, 4};

        execute.algoritmoBubbleSort(vetor1); //Ficaria -> [4, 5, 6, 7, 8, 9]
        execute.algoritmoBubbleSort(vetor2); //Ficaria -> [1, 2, 3, 4, 5, 6]
    }

}

