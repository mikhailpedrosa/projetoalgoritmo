package ordenacao;

public class InsertionSort {
	static int chave, i;
	public static void ordena(int []element)
	{
		for (int j = 1; j < element.length; j++) {
            chave = element[j];
            i = j - 1;
            while (i >= 0 && element[i] > chave) {
                element[i + 1] = element[i];
                i = i - 1;
            }
            element[i + 1] = chave;
        }
	}
	
	public static void imprime(int[] aux) {
        for (int i = 0; i < aux.length; i++) {
            System.out.print(" " + aux[i]);
        }
    }
}
