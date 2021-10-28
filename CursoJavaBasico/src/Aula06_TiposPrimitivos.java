
public class Aula06_TiposPrimitivos {

	public static void main(String[] args) {
		int idade1 = 3; // do tipo int
		int idade2 = (int) 3; // considere o 3 como inteiro --> Typecast
		Integer idade3 = 7; // Involocro --> Sempre come�a com letra maiuscula

		float sal = 1678.56f; // do tipo float
		float sal2 = (float) 1678.56; // considere o 1678.56 como float --> Typecast
		Float sal3 = 3757.88f; // Involocro --> Sempre come�a com letra maiuscula

		char letra = 'G'; // do tipo character
		char letra2 = (char) 'G'; // considere o G como char --> Typecast
		Character letra3 = 'G'; // Involocro --> Sempre come�a com letra maiuscula

		boolean casado = false;
		boolean casado2 = (boolean) false;
		Boolean casado3 = false;

		String nome1 = "Vinicius";
		String nome2 = "Jo�o";
		String nome3 = "Jos�";

		
		 System.out.println("A soma das idade �: " + (idade1+idade2+idade3));
		 System.out.printf("A soma dos sal�rios �: %.2f", sal+sal2+sal3); //float com duas casas decimais
		 System.out.printf("\nA soma dos sal�rios de %s, %s e %s �: %.2f", nome1,nome2, nome3, sal+sal2+sal3); //float com duas casas decimais
		 System.out.format("\nA soma dos sal�rios de %s, %s e %s �: %.2f", nome1,nome2, nome3, sal+sal2+sal3);

	}

}
