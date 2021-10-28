import java.util.Arrays;
import java.util.Scanner;

public class Aula14_ExercicioConstruirVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Insira o primeiro valor do vetor: ");
		int v1 = teclado.nextInt();
		System.out.print("Insira o segundo valor do vetor: ");
		int v2 = teclado.nextInt();
		System.out.print("Insira o terceiro valor do vetor: ");
		int v3 = teclado.nextInt();
		System.out.print("Insira o quarto valor do vetor: ");
		int v4 = teclado.nextInt();
		System.out.print("Insira o quinto valor do vetor: ");
		int v5 = teclado.nextInt();

		int vetor[] = { v1, v2, v3, v4, v5 };

		System.out.print("\nDeseja ordenar o vetor? [S-N] ");
		String resp = teclado.next();

		if (resp.equals("S")) {
			Arrays.sort(vetor);
		}

		System.out.println("\nO Vetor criado foi:");

		for (int c : vetor) {
			System.out.print(c + " ");
		}
		
		System.out.println("\n\nDeseja zerar algum valor do vetor? [S-N] ");
		String resp2 = teclado.next();
		
		if(resp2.equals("S")) {
			System.out.print("\nQual índice deseja remover? (0-4) ");
			int resp3 = teclado.nextInt();
			vetor[resp3] = 0;
			System.out.println("\nO novo vetor é:");
			for (int c : vetor) {
				System.out.print(c + " ");
			}	
		}
		else {
			System.out.println("\nFim");
			System.exit(0);
		}
			
	}

}
