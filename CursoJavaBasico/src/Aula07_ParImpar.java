import java.util.Scanner;

public class Aula07_ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		System.out.print("Digite um n�mero: ");
		int num = teclado.nextInt();
		
		if (num%2 == 0){
			System.out.format("\nO n�mero " + num + " � par");
		}
		else {
			System.out.printf("\nO n�mero " + num + " � �mpar");
		}
	}

}
