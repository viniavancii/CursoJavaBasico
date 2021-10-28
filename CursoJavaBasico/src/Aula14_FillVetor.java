import java.util.Arrays;

public class Aula14_FillVetor {

	public static void main(String[] args) {
		int n[] = new int[10];
		Arrays.fill(n, 0); // coloca em todo vetor o valor desejado, no caso zero

		for (int c : n) {
			System.out.print(c + " ");
		}
	}

}
