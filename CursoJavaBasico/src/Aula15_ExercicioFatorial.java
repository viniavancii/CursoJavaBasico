import java.util.Scanner;

public class Aula15_ExercicioFatorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número (0-12): ");
		int n1 = teclado.nextInt();

		Aula15_ExercicioFatorialOperacao f = new Aula15_ExercicioFatorialOperacao();
		f.setarValor(n1);
		System.out.print("\nO Fatorial de " + n1 + " é: ");
		System.out.print(f.pegarFormula());
		System.out.print(f.pegarFatorial());
	}

}
