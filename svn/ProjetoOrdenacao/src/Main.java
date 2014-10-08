/* Projeto da Disciplina de Metodos e Ferramentas de Engenharia de Software - Prof. Taveira - IFCE
 * Curso: Engenharia de Computação
 * Equipe: Daniel e Mikhail
 * 
 * Metodos Implementados: Seleção, Bolha, Inserção, Merge, Heap e Quick
 * 
 * */

/*Cliente - Ordena��o*/

import ordenacao.*;

public class Main {
        //Funcao Principal do Projeto Algoritmo @Alteracao Servidor
        public static int[] vetorMerge = {56, 446, 389, 18, 446, 17, 493, 186, 455,
        94, 374, 119, 81, 250, 496, 84, 129, 73, 414, 156, 199, 84, 17, 16, 56};
        
        public static int[] vetorBolha = {44, 346, 379, 8, 546, 99, 193, 86, 45,
        4, 34, 19, 84, 25, 0, 1, 100, 20, 999, 186, 129, 8, 11, 14, 66};
        
        public static int[] vetorQuick = {30, 74, 219, 4, 65, 87, 12, 73, 54,
            5, 65, 74, 23, 87, 54, 78, 98, 75, 34, 37, 21, 54, 76, 87, 23};
        
        public static int[] vetorInsertion = {54, 65, 87, 3, 54, 23, 58, 94, 52,
            65, 73, 56, 98, 45, 32, 76, 34, 63, 97, 54, 92, 46, 28, 33, 46};
        
        public static int[] vetorHeap = {44, 55, 17, 23, 64, 13, 28, 884, 552,
            95, 3, 55, 89, 47, 12, 64, 24, 43, 97, 4, 2, 6, 8, 334, 460};
        
        public static int[] vetorSelecao = {14, 15, 7, 13, 24, 93, 98, 784, 152,
            65, 1, 0, 9, 7, 112, 164, 524, 943, 997, 40, 20, 60, 80, 34, 46, 999};
        
        public static void main(String[] args) {
                
            System.out.print("Vetor Merge de Entrada: ");
            MergeSort.imprime(vetorMerge);
            MergeSort.merge(vetorMerge, 0, vetorMerge.length - 1);
            System.out.print("\nVetor Merge Ordenado: ");
            MergeSort.imprime(vetorMerge);
            
            System.out.println();
            
            System.out.print("\nVetor Bolha de Entrada: ");
            BolhaSort.imprime(vetorBolha);
            BolhaSort.ordena(vetorBolha);
            System.out.print("\nVetor Bolha Ordenado: ");
            BolhaSort.imprime(vetorBolha);
            
            System.out.println();
            
            System.out.print("\nVetor Quick de Entrada: ");
            QuickSort.imprime(vetorQuick);
            QuickSort.quick_sort(vetorQuick, 0, vetorQuick.length - 1);
            System.out.print("\nVetor Quick de saida: ");
            QuickSort.imprime(vetorQuick);
            
            System.out.println();
            
            System.out.print("\nVetor Insertion de Entrada: ");
            InsertionSort.imprime(vetorInsertion);
            InsertionSort.ordena(vetorInsertion);
            System.out.print("\nVetor Insertion de saida: ");
            InsertionSort.imprime(vetorInsertion);
            
            System.out.println();
            
            System.out.print("\nVetor Heap de Entrada: ");
            HeapSort.imprime(vetorHeap);
            HeapSort.ordena(vetorHeap);
            System.out.print("\nVetor Heap de saida: ");
            HeapSort.imprime(vetorHeap);
            
            System.out.println();
            
            System.out.print("\nVetor Seleção de Entrada: ");
            SelecaoSort.imprime(vetorSelecao);
            SelecaoSort.ordena(vetorSelecao);
            System.out.print("\nVetor Seleção de saida: ");
            SelecaoSort.imprime(vetorSelecao);
        }

}
