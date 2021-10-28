import java.util.Scanner;

public class Aula09_IF_Else_MaiorMenorIdade {

	public static void main(String[] args) {
		int nasc, idade;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu ano de nascimento: ");
		nasc = teclado.nextInt();
		idade = 2021 - nasc;
		System.out.println("Você tem "+ idade + " anos");
		if(idade>=18) {
			System.out.println("Maior de idade");
		}
		else {
			System.out.println("Menor de idade");
		}
	}

}
