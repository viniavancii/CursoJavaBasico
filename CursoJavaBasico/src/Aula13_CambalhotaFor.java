
public class Aula13_CambalhotaFor {

	public static void main(String[] args) {
		for (int camb = 1; camb <= 4; camb++) { // Ele ir� executar o bloco at� que camb seja 4, acrescentando um valor
												// a cada loop
			System.out.println("Cambalhota n�mero " + camb);
		}

		System.out.println("");

		for (int camb2 = 1; camb2 <= 4; camb2 += 2) { // pular de dois em dois --> camb = camb + 2 ou camb+=2
			System.out.println("Cambalhota 2 n�mero " + camb2);
		}

		System.out.println("");

		for (int camb3 = 15; camb3 >= 4; camb3--) { // faz o comando de traz para frente
			System.out.println("Cambalhota 3 n�mero " + camb3);
		}

		System.out.println("\n1 a 100 pulando de 10 em 10\n");

		for (int n = 1; n <= 100; n += 9) {
			if (n >= 11) {
				n += 1;
			}
			System.out.println(n);
		}
	}

}
