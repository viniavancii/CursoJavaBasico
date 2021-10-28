import java.util.Scanner;

public class Aula12_SomaDo {

	public static void main(String[] args) {
		int n, soma = 0;
		String resp;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Digite um número inteiro: ");
			n = teclado.nextInt();
			soma += n; //soma = soma + n 
			System.out.println("Quer continuar? [S/N]");
			resp = teclado.next();
		} while (resp.equals("S"));
		System.out.println("\nA soma de todos os valores é: " + soma);
	}

}
