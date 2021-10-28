
public class Aula11_WhileBreak {

	public static void main(String[] args) {
		int camb = 0;
		while (camb<=10) {
			camb++;
			if (camb == 9) {
				break;	//para o contador no valor especificado
			}
			System.out.println("Cambalhota número " + camb);
		}
	}
}
