package ordenacao;

public class SelecaoSort {
	
	
    public static void imprime(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" " + aux[i]);
        }
    }
	
	public static void ordena(int[] array) {
		for (int fixo = 0; fixo < array.length - 1; fixo++) {
			int menor = fixo;
	 
			for (int i = menor + 1; i < array.length; i++){
				if (array[i] < array[menor]){
					menor = i;
				}
			}
			if (menor != fixo) {
				// Troca
				array[fixo] += array[menor];
				array[menor] = array[fixo] - array[menor];
				array[fixo] -= array[menor];
			}
		}
	}
}
