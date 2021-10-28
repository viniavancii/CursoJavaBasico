
public class Aula08_ComparacaoString {

	public static void main(String[] args) {
		String nome1 = "Vinicius";
		String nome2 = "Vinicius";
		String nome3 = new String("Vinicius"); 
		String res;
		
		res = nome1==nome2 ? "Iguais":"Diferentes"; //Dessa forma ela compara toda a estrutura do Objeto
		System.out.println(res);
		
		res = nome1.equals(nome3) ? "Iguais":"Diferentes"; //Aqui ele compara apenas o conteudo do objeto (o que está dentro de aspas no caso)
		System.out.println(res);
	}
}
