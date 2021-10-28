
public class Aula11_WhileContinue {

	public static void main(String[] args) {
		int camb = 0;
		while (camb<10) {
			camb++;
			if(camb == 5 || camb == 7) {
				continue; //não exibirá os valores ditos e irá CONTINUAR a repetição
			}
		System.out.println("Cambalhota número " + camb);
		}
	}
}
