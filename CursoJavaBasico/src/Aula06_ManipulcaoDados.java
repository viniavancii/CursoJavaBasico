import java.util.Scanner;

public class Aula06_ManipulcaoDados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Aqui ele receberá um valor digitado no teclado
		System.out.print("Digite o nome: ");
		String name = teclado.nextLine(); // recebe a variavel name através de input
		System.out.print("\nDigite o salário: ");
		float soldo = teclado.nextFloat();
		System.out.printf("\nO salário de %s é: %.2f", name, soldo);
	}

}
