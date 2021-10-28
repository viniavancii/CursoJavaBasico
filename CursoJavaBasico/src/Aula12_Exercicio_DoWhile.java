import java.util.Scanner;

public class Aula12_Exercicio_DoWhile {

	public static void main(String[] args) {
		int qtdnum = 0, qtdnumpares = 0, qtdnumimpar = 0;
		float n, soma = 0, media;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite um número inteiro (0 para interromper): ");
			n = teclado.nextInt();
			soma += n; // soma= soma + n
			qtdnum++;
			if (n == 0) {
				qtdnum -= 1;
				qtdnumpares -= 1;
			}
			if (n % 2 == 0) {
				qtdnumpares++;
			} else {
				qtdnumimpar++;
			}
		} while (n != 0);

		media = soma / qtdnum;
		System.out.format("\nA soma dos valores é: %.1f ", soma);
		System.out.println("\nA quantidade de valores são: " + qtdnum);
		System.out.format("A média dos valores é: %.1f", media);
		System.out.println("\nA quantidade de números pares é: " + qtdnumpares);
		System.out.println("A quantidade de números ímpares é: " + qtdnumimpar);
	}

}
