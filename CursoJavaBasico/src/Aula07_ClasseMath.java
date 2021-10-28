
public class Aula07_ClasseMath {

	public static void main(String[] args) {
		float n = 81;
		float raiz = (float) Math.sqrt(n);
		System.out.printf("A ra�z de %.2f �: %.2f", n, raiz);
		
		float n2 = (float) Math.PI;
		System.out.printf("\nO valor de PI �: " + n2);
		
		float a = 4;
		float b = 3;
		float n3 = (float) Math.pow(a, b);
		System.out.printf("\n%.1f elevado a %.1f �: %.1f", a, b, n3);
		
		float n4 = 27;
		float raiz2 = (float) Math.cbrt(n4); 
		System.out.printf("\nA ra�z cubida de %.1f �: %.1f", n4, raiz2);
	}

}
