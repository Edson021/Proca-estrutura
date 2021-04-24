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


public class QuickSort {
// Método para a ordenação de um vetor de inteiros.
    public void algoritmoQuickSort(int vetor[]) {
        quickSort(vetor, 0, vetor.length - 1);
    }

    /*Um método para dividir um vetor em três vetores de conceitos. Na verdade,
     *o vetor intermediário só começa como o elemento pivô retornado pelo 
     *método de divisão.
     *
     * vetor - Vetor de inteiros que passara pelo Quick Sort. inicio - Indice
     * inicial do vetor que sera considerado no Quick Sort. fim - Indice final
     * do vetor que sera considerado no Quick Sort.
     */
    private void quickSort(int[] vetor, int inicio, int fim) {

        if (fim > inicio) {
            //Rotina que ira dividir o vetor em 3 partes.
            int indexPivo = dividir(vetor, inicio, fim);
            //Redivisao do vetor de elementos menores que o pivô.
            quickSort(vetor, inicio, indexPivo - 1);
            //Redivisao do vetor de elementos maiores que o pivô.
            quickSort(vetor, indexPivo + 1, fim);
        }

    }

    /**
     *Método que ira dividir o vetor e encontrar o indice do pivô. Vetor de 
     *inteiros inicio - Indice inicial do vetor. fim - Indice final do
     *vetor. O indice do pivo.
     */
    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, pontEsq, pontDir = fim;
        pontEsq = inicio + 1;
        pivo = vetor[inicio];

        while (pontEsq <= pontDir) {
            //Ira correr o vetor ate que ultrapasse o outro ponteiro.
            while (pontEsq <= pontDir && vetor[pontEsq] <= pivo) {
                pontEsq++;
            }

            /*Ira correr o vetor ate que ultrapasse o outro ponteiro.
            *que o elemento em questão seja maior que o pivô. */
            while (pontDir >= pontEsq && vetor[pontDir] > pivo) {
                pontDir--;
            }

            /* Caso os ponteiros ainda nao tenham se cruzado, significa que 
            *valores menores e maiores que o pivô foram localizados em ambos 
            *os lados.
            */
            if (pontEsq < pontDir) {
                trocar(vetor, pontDir, pontEsq);
                pontEsq++;
                pontDir--;
            }
        }
        trocar(vetor, inicio, pontDir);
        return pontDir;
    }
    
   /* Método para trocar dois elementos de um vetor.
   *
   * Vetor de inteiros que tera seus elementos trocados.
   * Y - Indice do elemento que sera trocado.
   * x - Indice do elemento que sera trocado.
   */
    private void trocar(int[] vetor, int y, int x) {
        int temp = vetor[y];
        vetor[y] = vetor[x];
        vetor[x] = temp;
    }

    private static void imprimirVetor(int[] vetor) {
        System.out.print("QuickSort\n");
        System.out.print("[");
        for (int num = 0; num < vetor.length; ++num) {
            System.out.print(" " + vetor[num] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        QuickSort execute = new QuickSort();

        int vetor1[] = {3, 7, 4, 1, 5, 2, 6};
        int vetor2[] = {4, 5, 6, 3, 1, 2, 7};

        execute.algoritmoQuickSort(vetor1); //Ficaria -> [1, 2, 3, 4, 5, 6, 7]
        execute.algoritmoQuickSort(vetor2); //Ficaria -> [1, 2, 3, 4, 5, 6, 7]   
        imprimirVetor(vetor1);
        imprimirVetor(vetor2);

    }
}

