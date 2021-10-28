
public class Aula15_Metodos {

	static void soma(int a, int b) { // Novo procedimento --> precisar ser static porque o metodo principal é static
		int s = a + b;
		System.out.println("A soma é: " + s);
	}

	static int soma2(int c, int d) { // Método cálculo
		int s2 = c + d;
		return s2;
	}

	public static void main(String[] args) { // Executado primeiro
		System.out.println("Começou o programa");
		soma(5, 2); // Chama o procedimento criando dentro do método principal
		int sm = soma2(5, 3);
		System.out.println("A nova soma é: " + sm);
	}

}
