import java.util.Scanner;

public class Aula09_CondicaoIF {

	public static void main(String[] args) {
		float nota1, nota2, media;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextFloat();
		
		media = (nota1+nota2)/2;
		System.out.println("A média do aluno(a) foi: " + media);
		if (media >= 9) {
			System.out.println("Parabéns!!");
		}
	}

}
