
public class Aula11_WhileContinue {

	public static void main(String[] args) {
		int camb = 0;
		while (camb<10) {
			camb++;
			if(camb == 5 || camb == 7) {
				continue; //n�o exibir� os valores ditos e ir� CONTINUAR a repeti��o
			}
		System.out.println("Cambalhota n�mero " + camb);
		}
	}
}
