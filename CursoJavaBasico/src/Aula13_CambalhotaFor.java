
public class Aula13_CambalhotaFor {

	public static void main(String[] args) {
		for (int camb = 1; camb <= 4; camb++) { // Ele irá executar o bloco até que camb seja 4, acrescentando um valor
												// a cada loop
			System.out.println("Cambalhota número " + camb);
		}

		System.out.println("");

		for (int camb2 = 1; camb2 <= 4; camb2 += 2) { // pular de dois em dois --> camb = camb + 2 ou camb+=2
			System.out.println("Cambalhota 2 número " + camb2);
		}

		System.out.println("");

		for (int camb3 = 15; camb3 >= 4; camb3--) { // faz o comando de traz para frente
			System.out.println("Cambalhota 3 número " + camb3);
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
