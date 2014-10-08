package ordenacao;

public class MergeSort {

	    public static void imprime(int[] aux) {
	        for (int i = 0; i < aux.length; i++) {
	            System.out.print(" " + aux[i]);
	        }
	    }
	    
	     // M�todo recursivo que divide o vetor em dois e depois os mescla e ordena
	    public static void merge(int[] vetor, int inicio, int fim) {
	        if (inicio < fim) {
	            int meio = (inicio + fim) / 2;
	            merge(vetor,inicio, meio);
	            merge(vetor,meio + 1, fim);
	            mesclar(vetor,inicio, meio, fim);
	        }
	    }

	    // Ordena dois trechos ordenados e adjacente de vetores e ordena-os conjuntamente
	    public static void mesclar(int[] vetor, int inicio, int meio, int fim1) {
	        int tamanho = fim1 - inicio + 1;
	        
	        // Inicializa��o de um vetor temporario para auxiliar na ordena��o O vetor tempor�rio � uma c�pia do trecho que ser� ordenado
	         
	        int[] temp = new int[tamanho];
	        for (int posicao = 0; posicao < tamanho; posicao++) {
	            temp[posicao] = vetor[inicio + posicao];
	        }
	        
	         // La�o para ordena��o do vetor, utilizando o vetor tempor�rio, usando �ndices i e j para cada trecho de vetor da mesclagem<br />
	        int i = 0;
	        int j = meio - inicio + 1;
	        //A depender das condi��es, recebe um elemento de um trecho ou outro
	        for (int posicao = 0; posicao < tamanho; posicao++) {
	            vetor[inicio + posicao] =
	                    (j <= tamanho - 1)
	                    ? ((i <= meio - inicio)
	                    ? (temp[i] < temp[j])
	                    ? temp[i++]
	                    : temp[j++]
	                    : temp[j++])
	                    : temp[i++];
	        }
	    }
	}