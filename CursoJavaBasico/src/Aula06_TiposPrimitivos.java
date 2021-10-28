
public class Aula06_TiposPrimitivos {

	public static void main(String[] args) {
		int idade1 = 3; // do tipo int
		int idade2 = (int) 3; // considere o 3 como inteiro --> Typecast
		Integer idade3 = 7; // Involocro --> Sempre começa com letra maiuscula

		float sal = 1678.56f; // do tipo float
		float sal2 = (float) 1678.56; // considere o 1678.56 como float --> Typecast
		Float sal3 = 3757.88f; // Involocro --> Sempre começa com letra maiuscula

		char letra = 'G'; // do tipo character
		char letra2 = (char) 'G'; // considere o G como char --> Typecast
		Character letra3 = 'G'; // Involocro --> Sempre começa com letra maiuscula

		boolean casado = false;
		boolean casado2 = (boolean) false;
		Boolean casado3 = false;

		String nome1 = "Vinicius";
		String nome2 = "João";
		String nome3 = "José";

		
		 System.out.println("A soma das idade é: " + (idade1+idade2+idade3));
		 System.out.printf("A soma dos salários é: %.2f", sal+sal2+sal3); //float com duas casas decimais
		 System.out.printf("\nA soma dos salários de %s, %s e %s é: %.2f", nome1,nome2, nome3, sal+sal2+sal3); //float com duas casas decimais
		 System.out.format("\nA soma dos salários de %s, %s e %s é: %.2f", nome1,nome2, nome3, sal+sal2+sal3);

	}

}
