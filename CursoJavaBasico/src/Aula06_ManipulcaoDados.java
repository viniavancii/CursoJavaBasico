import java.util.Scanner;

public class Aula06_ManipulcaoDados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); // Aqui ele receber� um valor digitado no teclado
		System.out.print("Digite o nome: ");
		String name = teclado.nextLine(); // recebe a variavel name atrav�s de input
		System.out.print("\nDigite o sal�rio: ");
		float soldo = teclado.nextFloat();
		System.out.printf("\nO sal�rio de %s �: %.2f", name, soldo);
	}

}
