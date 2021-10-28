import java.util.Scanner;

public class Aula09_Equacao2Grau {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		int a = teclado.nextInt();
		System.out.print("Digite o valor de B: ");
		int b = teclado.nextInt();
		System.out.print("Digite o valor de C: ");
		int c = teclado.nextInt();
		
		float delta = (float) (Math.pow(b, 2))-(4* a * c);
		System.out.println("\nO valor de Delta �: " + delta);
		
		if (delta<0) {
			System.out.println("\nN�o h� ra�zes reais");
			System.exit(0);
		}
		else {
			System.out.println("\nH� ra�zes reais");
		}
		
		float x1 = (float) (-b + (Math.sqrt(delta)))/(2 * a);
		System.out.println("\nO X1 �: " + x1);
		
		float x2 = (float) (-b - (Math.sqrt(delta)))/(2 * a);
		System.out.println("O X2 �: " + x2);
	}

}
