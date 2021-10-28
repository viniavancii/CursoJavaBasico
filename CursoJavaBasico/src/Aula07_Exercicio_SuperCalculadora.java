import java.util.Scanner;

public class Aula07_Exercicio_SuperCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número inteiro");
		int n = teclado.nextInt();
		
		//Resto da divisão
		float resto = n % 2;
		System.out.println("\nO resto da divisão por 2 é: " + resto);
		
		//Elevado ao cubo
		float cubo = (float) Math.pow(n, 3);
		System.out.println("Elevado ao cubo é: " + cubo);
		
		//Raiz quadrada
		float quad = (float) Math.sqrt(n);
		System.out.println(String.format("A raiz quadrada é: %.2f", quad)); //formatado para duas casas decimais
		
		//Raiz cubica
		float cub = (float) Math.cbrt(n);
		System.out.println(String.format("A raiz cubida é: %.2f", cub));
		
		//Valor absoluto
		float abs = Math.abs(n);
		System.out.println("O valor absoluto é: " + abs);
		
	}
	
}
