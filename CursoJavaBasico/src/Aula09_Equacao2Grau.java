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
		System.out.println("\nO valor de Delta é: " + delta);
		
		if (delta<0) {
			System.out.println("\nNão há raízes reais");
			System.exit(0);
		}
		else {
			System.out.println("\nHá raízes reais");
		}
		
		float x1 = (float) (-b + (Math.sqrt(delta)))/(2 * a);
		System.out.println("\nO X1 é: " + x1);
		
		float x2 = (float) (-b - (Math.sqrt(delta)))/(2 * a);
		System.out.println("O X2 é: " + x2);
	}

}
