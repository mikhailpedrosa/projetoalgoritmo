
public class QuickSort {
		 
	     // @param args the command line arguments

	    public static void imprime(int[] aux) {
	        for (int i = 0; i < aux.length; i++) {
	            System.out.print(" " + aux[i]);
	        }
	    }
	    
	 
	    public static void quick_sort(int[] v, int ini, int fim) {
	        int meio;
	 
	        if (ini < fim) {
	            meio = partition(v, ini, fim);
	            quick_sort(v, ini, meio);
	            quick_sort(v, meio + 1, fim);
	        }
	    }
	 
	    public static int partition(int[] v, int ini, int fim) {
	        int pivo, topo, i;
	        pivo = v[ini];
	        topo = ini;
	 
	        for (i = ini + 1; i <= fim; i++) {
	            if (v[i] < pivo) {
	                v[topo] = v[i];
	                v[i] = v[topo + 1];
	                topo++;
	            }
	        }
	        v[topo] = pivo;
	        return topo;
	    }
}

