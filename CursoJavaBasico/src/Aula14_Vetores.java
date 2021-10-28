
public class Aula14_Vetores {

	public static void main(String[] args) {
		int n[] = { 1, 5, 1, 0, 3, 4, 5 };
		System.out.println("Total de casas do Vetor é: " + n.length + "\n");

		for (int c = 0; c < n.length; c++) { // c < nlenght por que são 7 posições e começa no zero (0-6)
			System.out.println("Na posição " + c + " temos o valor " + n[c]); // exibiu o vetor a partir da variavel c
																				// simbolizada como contador do vetor
		}
	}

}
