
public class BolhaSort {
	
    public static void imprime(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" " + aux[i]);
        }
    }
	
	public static void ordena(int [] vetor){
		int aux;
		for (int i = 0; i < vetor.length; i++) {
	        for (int j = 0; j < vetor.length-1; j++) {
	            if (vetor[j] > vetor[j + 1]) {
	                aux = vetor[j];
	                vetor[j] = vetor[j + 1];
	                vetor[j + 1] = aux;
	            }
	        }
	    }
	}
}
