import java.util.Scanner;

public class Aula10_TipoTriangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o primeiro lado do tri�ngulo: ");
		int lado1 = teclado.nextInt();
		System.out.print("Digite o segundo lado do tri�ngulo: ");
		int lado2 = teclado.nextInt();
		System.out.print("Digite o terceiro lado do tri�ngulo: ");
		int lado3 = teclado.nextInt();
		
		if ((lado1 <= 0) || (lado2 <= 0) || (lado3 <= 0)) {
			System.out.println("\nInv�lido");
		}
		
		else if ((lado1 == lado2) && (lado1 == lado3)) {
			System.out.println("\nTri�ngulo Equil�tero");
		}
		
		else if(((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3))) {
			System.out.println("\nTri�ngulo is�sceles");
		}
		
		else if((lado1 != lado2) && (lado1 != lado3)) {
			System.out.println("\nTri�ngulo escaleno");
		}
	}

}
