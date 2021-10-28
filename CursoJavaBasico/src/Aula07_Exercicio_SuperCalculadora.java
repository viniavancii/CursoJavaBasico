import java.util.Scanner;

public class Aula07_Exercicio_SuperCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro");
		int n = teclado.nextInt();
		
		//Resto da divis�o
		float resto = n % 2;
		System.out.println("\nO resto da divis�o por 2 �: " + resto);
		
		//Elevado ao cubo
		float cubo = (float) Math.pow(n, 3);
		System.out.println("Elevado ao cubo �: " + cubo);
		
		//Raiz quadrada
		float quad = (float) Math.sqrt(n);
		System.out.println(String.format("A raiz quadrada �: %.2f", quad)); //formatado para duas casas decimais
		
		//Raiz cubica
		float cub = (float) Math.cbrt(n);
		System.out.println(String.format("A raiz cubida �: %.2f", cub));
		
		//Valor absoluto
		float abs = Math.abs(n);
		System.out.println("O valor absoluto �: " + abs);
		
	}
	
}
