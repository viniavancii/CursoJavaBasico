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
				tipo = "B�pede";
				break;
			case 4:
				tipo = "Quadr�pede";
				break;
			case 6, 8:
				tipo = "Aranha";
				break;
			default: //Ultimo caso for de todos os outros e n�o precisa de break
				tipo = "E.T.";
		}
		System.out.println("\n" + tipo);
	}
}
