import java.util.Scanner;

public class Aula08_VotoOpcionalOuNao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a sua data de nascimento: ");
		int nasc = teclado.nextInt();
		
		int idade = 2021 - nasc;
		String vota;
		
		vota = (idade>=16 && idade<18) || (idade>70)?  "É opcional": "Não é opcional";
		System.out.println(vota);
	}

}
