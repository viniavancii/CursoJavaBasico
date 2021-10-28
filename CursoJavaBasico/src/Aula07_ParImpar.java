import java.util.Scanner;

public class Aula07_ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.print("Digite um número: ");
		int num = teclado.nextInt();
		
		if (num%2 == 0){
			System.out.format("\nO número " + num + " é par");
		}
		else {
			System.out.printf("\nO número " + num + " é ímpar");
		}
	}

}
