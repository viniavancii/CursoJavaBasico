
public class Aula13_LacosAninhadosFor {

	public static void main(String[] args) {
		for (int n1 = 1; n1 <= 3; n1++) {
			System.out.println("Laço 1 = " + n1);
			for (int n2 = 0; n2 <= 2; n2 += 2) { // Executa UMA VEZ (uma verificação) o primeiro laço for, partindo para
													// o segundo laço, executando até ele acabar (todas as intruções),
													// depois retorna ao primeiro laço e faz a mesma coisa que anteriormente
				System.out.println("Laço 2 = " + n2);
			}
		}

	}

}
