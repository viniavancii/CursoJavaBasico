import java.util.Scanner;

public class Aula13_ExercicioLacoFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o início do laço (0-5): ");
		int n1 = teclado.nextInt();
		System.out.print("Digite o fim do laço (6-20): ");
		int n2 = teclado.nextInt();
		System.out.print("Digite o passo (1-5): ");
		int n3 = teclado.nextInt();
		System.out.println();
		
		for (int c = n1; c <= n2; c += n3) { //preciso criar uma nova variavel para receber o valor de n1 digitado no teclado
			System.out.println(c);
		}
	}
}
