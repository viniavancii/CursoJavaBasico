
public class Aula15_Metodos {

	static void soma(int a, int b) { // Novo procedimento --> precisar ser static porque o metodo principal � static
		int s = a + b;
		System.out.println("A soma �: " + s);
	}

	static int soma2(int c, int d) { // M�todo c�lculo
		int s2 = c + d;
		return s2;
	}

	public static void main(String[] args) { // Executado primeiro
		System.out.println("Come�ou o programa");
		soma(5, 2); // Chama o procedimento criando dentro do m�todo principal
		int sm = soma2(5, 3);
		System.out.println("A nova soma �: " + sm);
	}

}
