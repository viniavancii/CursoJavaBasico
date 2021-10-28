import java.util.Scanner;

public class Aula10_SistemaVotacao {

	public static void main(String[] args) {
		int idade, voto;
		Scanner t = new Scanner(System.in);
		System.out.print("Digite seu ano de nascimento: ");
		int nasc = t.nextInt();
		
		idade = 2021 - nasc;
		System.out.println("\nVocê tem " + idade + " anos");
		
		if(idade<16) {
			System.out.println("Não pode votar");
		}
		
		else if((idade>=16 && idade<18 || (idade>70))) {
			System.out.println("Voto opcional");
		}
		
		else {
			System.out.println("Voto obrigatório");
		}
	}
}
