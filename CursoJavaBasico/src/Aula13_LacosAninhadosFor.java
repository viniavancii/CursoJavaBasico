
public class Aula13_LacosAninhadosFor {

	public static void main(String[] args) {
		for (int n1 = 1; n1 <= 3; n1++) {
			System.out.println("La�o 1 = " + n1);
			for (int n2 = 0; n2 <= 2; n2 += 2) { // Executa UMA VEZ (uma verifica��o) o primeiro la�o for, partindo para
													// o segundo la�o, executando at� ele acabar (todas as intru��es),
													// depois retorna ao primeiro la�o e faz a mesma coisa que anteriormente
				System.out.println("La�o 2 = " + n2);
			}
		}

	}

}
