import java.util.Scanner;

public class Aula11_Exercicio_Fatorial {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número a partir de 1: ");
		long num = teclado.nextInt();
		long c = num;
		long fatorial = 1;

		System.out.print("\nO fatorial de " + c + " é: ");
		while (c > 1) {
			fatorial = fatorial * c;
			System.out.printf(c + " * ");
			c--;
		}
		if (num <= 1) {
			System.out.println("" + fatorial);
		} else {
			System.out.println("1 = " + fatorial);
		}
	}
}
