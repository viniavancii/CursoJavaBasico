import java.util.Arrays;

public class Aula14_VetoresForEach {

	public static void main(String[] args) {
		int num[] = {1, 3, 2, 0, 5, 6, 2, 8, 9};

		for (int valor : num) { // Para cada elemento de "num" coloque dentro de "valor"
			System.out.print(valor + " ");
		}

		int pos = Arrays.binarySearch(num, 3); // Encontrar valor em um vetor
		System.out.println("\nO número 3 foi encontrado na posição " + pos);

		Arrays.sort(num); // Deixa em ordem os valores dos vetores

	}

}
