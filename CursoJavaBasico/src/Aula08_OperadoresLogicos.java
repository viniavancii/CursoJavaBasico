
public class Aula08_OperadoresLogicos {

	public static void main(String[] args) {
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		boolean res; //True ou false --> Variavel logica
		
		//&& --> Os dois deve atender a condição
		res = z>y && y<x ? true:false;
		System.out.println(res);

		// || --> Ou uma ou outra, ou as duas condições
		res = z>y || y<x ? true:false;
		System.out.println(res);
		
		// ^ --> Exclusivamente uma ou outra condição, se as duas atenderem uma condição retornará false
		res = z>y ^ y>x ? true:false;
		System.out.println(res);
	}

}
