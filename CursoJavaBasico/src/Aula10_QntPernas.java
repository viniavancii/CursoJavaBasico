import java.util.Scanner;

public class Aula10_QntPernas {

	public static void main(String[] args) {
		String tipo;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a quantidade de pernas: ");
		int pernas = teclado.nextInt();

		switch (pernas) {
			case 1:
				tipo = "Sacikkk";
				break;
			case 2: 
				tipo = "Bípede";
				break;
			case 4:
				tipo = "Quadrúpede";
				break;
			case 6, 8:
				tipo = "Aranha";
				break;
			default: //Ultimo caso for de todos os outros e não precisa de break
				tipo = "E.T.";
		}
		System.out.println("\n" + tipo);
	}
}
