
public class Aula06_ConversaoTipos {

	public static void main(String[] args) {
		int idade = 30;
		String valor = Integer.toString(idade); // Converte um valor para String
		System.out.println(valor);
		
		String valor2 = "30";
		int idade2 = Integer.parseInt(valor2); //Parse = converter, ou seja, um valor será convertido a inteiro
		System.out.println(idade2);
		
		String valor3 = "30.5";
		float idade3 = Float.parseFloat(valor3); //Parse = converter, ou seja, um valor será convertido a float
		System.out.println(idade3);
	}
}
