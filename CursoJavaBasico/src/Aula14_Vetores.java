
public class Aula14_Vetores {

	public static void main(String[] args) {
		int n[] = { 1, 5, 1, 0, 3, 4, 5 };
		System.out.println("Total de casas do Vetor �: " + n.length + "\n");

		for (int c = 0; c < n.length; c++) { // c < nlenght por que s�o 7 posi��es e come�a no zero (0-6)
			System.out.println("Na posi��o " + c + " temos o valor " + n[c]); // exibiu o vetor a partir da variavel c
																				// simbolizada como contador do vetor
		}
	}

}
