import java.util.Scanner;

public class Aula07_PreIncremento_PosIncremento {

	public static void main(String[] args) {
		//P�s Incremento ++
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int n5 = teclado.nextInt();
		n5++;
		System.out.println("O prox�mo n�mero �: " + n5);
		
		//P�s Incremento --
		Scanner teclado2 = new Scanner(System.in);
		System.out.println("\n\nDigite um n�mero: ");
		int n6 = teclado2.nextInt();
		n6--;
		System.out.println("O n�mero anterior �: " + n6);

		
		//Pre incremento ++
		Scanner teclado3 = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int n7 = teclado3.nextInt();
		int valor = 5 + ++n7; //Ele pega o valor que recebeu a variavel valor, soma com n7 e adiciona mais 1
		System.out.println(valor);
		
		//Pre incremento ++
		Scanner teclado4 = new Scanner(System.in);
		System.out.println("\n\nDigite um n�mero: ");
		int n8 = teclado4.nextInt();
		int valor2 = 5 + --n8; //Ele pega o valor que recebeu a variavel valor2, soma com n8 e retira 1
		System.out.println(valor2);
	}

}
