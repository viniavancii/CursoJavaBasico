import java.util.Scanner;

public class Aula08_Exercicio_Genio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tente adivinhar o n�mero que estou pensando entre 0-5");
		int num = teclado.nextInt();
		
		int random = (int) (Math.random() * (6-0));
		String f1 = "Voc� acertou";
		String f2 = "Voc� errou, eu pensei em " + random;
		String ver = (num == random) ? f1: f2;
		System.out.println(ver);
	}
}
