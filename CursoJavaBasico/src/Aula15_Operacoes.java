
public class Aula15_Operacoes {
	public static String contador(int i, int f) { // Deve ser public e static para que eu possa chamá-lo fora da classe atual
		String s = ""; // Começa vazio
		for (int c = i; c <= f; c++) { // Faz um contador de i(inicio) a f(fim)
			s += c + " "; // Cria o contador jogando na variavel s 
		}
		return s; // Retorna a variavel s que recebeu o contador c
	}
}
 