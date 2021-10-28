
public class Aula08_OperadoresLogicos {

	public static void main(String[] args) {
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		boolean res; //True ou false --> Variavel logica
		
		//&& --> Os dois deve atender a condi��o
		res = z>y && y<x ? true:false;
		System.out.println(res);

		// || --> Ou uma ou outra, ou as duas condi��es
		res = z>y || y<x ? true:false;
		System.out.println(res);
		
		// ^ --> Exclusivamente uma ou outra condi��o, se as duas atenderem uma condi��o retornar� false
		res = z>y ^ y>x ? true:false;
		System.out.println(res);
	}

}
