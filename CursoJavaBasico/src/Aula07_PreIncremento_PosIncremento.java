import java.util.Scanner;

public class Aula07_PreIncremento_PosIncremento {

	public static void main(String[] args) {
		//Pós Incremento ++
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n5 = teclado.nextInt();
		n5++;
		System.out.println("O proxímo número é: " + n5);
		
		//Pós Incremento --
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("\n\nDigite um número: ");
		int n6 = teclado2.nextInt();
		n6--;
		System.out.println("O número anterior é: " + n6);

		
		//Pre incremento ++
		Scanner teclado3 = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n7 = teclado3.nextInt();
		int valor = 5 + ++n7; //Ele pega o valor que recebeu a variavel valor, soma com n7 e adiciona mais 1
		System.out.println(valor);
		
		//Pre incremento ++
		Scanner teclado4 = new Scanner(System.in);
		System.out.println("\n\nDigite um número: ");
		int n8 = teclado4.nextInt();
		int valor2 = 5 + --n8; //Ele pega o valor que recebeu a variavel valor2, soma com n8 e retira 1
		System.out.println(valor2);
	}

}
