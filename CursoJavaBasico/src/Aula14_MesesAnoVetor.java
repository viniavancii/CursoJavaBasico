import java.util.Scanner;

public class Aula14_MesesAnoVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o ano atual: ");
		int ano = teclado.nextInt();
		System.out.println("");

		String mes[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		int dias[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (ano % 4 == 0) { //Verificar ano Bissexto
			dias[1] = 29;
		}

		for (int c = 0; c < mes.length; c++) {
			System.out.println("O mês " + mes[c] + " tem " + dias[c] + " dias");
		}
	}
}
