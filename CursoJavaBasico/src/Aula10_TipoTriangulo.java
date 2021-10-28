import java.util.Scanner;

public class Aula10_TipoTriangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro lado do triângulo: ");
		int lado1 = teclado.nextInt();
		System.out.print("Digite o segundo lado do triângulo: ");
		int lado2 = teclado.nextInt();
		System.out.print("Digite o terceiro lado do triângulo: ");
		int lado3 = teclado.nextInt();
		
		if ((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0)) {
			System.out.println("\nInválido");
		}
		
		else if ((lado1 == lado2) && (lado1 == lado3)) {
			System.out.println("\nTriângulo Equilátero");
		}
		
		else if(((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))) {
			System.out.println("\nTriângulo isósceles");
		}
		
		else if((lado1 != lado2) && (lado1 != lado3)) {
			System.out.println("\nTriângulo escaleno");
		}
	}

}
