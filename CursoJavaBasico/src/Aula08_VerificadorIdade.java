import java.util.Scanner;

public class Aula08_VerificadorIdade {

	public static void main(String[] args) {
		String sit;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o ano de nascimento");
		int nasc = teclado.nextInt();
		
		int idade = 2021 - nasc;
		System.out.println("Você tem: "+ idade + " anos");
		
		sit = idade>=18 ? "Maior de idade":"Menor de idade";
		System.out.println(sit);
	}

}
