
public class Aula07_Arredondamento {

	public static void main(String[] args) {
		//Valor absoluto (desconsidera o sinal na frente do número)
		double n1 = -10;
		double abs = Math.abs(n1);
		System.out.println(abs);
		
		//Arredondamento para baixo
		double n = 3.9;
		double floor = Math.floor(n);
		System.out.println(floor);
		
		//Arredondamento para cima
		double n2 = 3.1;
		double ceil = Math.ceil(n2);
		System.out.println(ceil);
		
		//Arredondamento aritmentico
		double n3 = 4.;
		double arit = Math.round(n3);
		System.out.println(arit);
	}

}
