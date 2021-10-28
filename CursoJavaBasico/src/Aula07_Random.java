
public class Aula07_Random {

	public static void main(String[] args) {
		double random = Math.random();
		int n = (int) (random * (100-0)); 
		System.out.print(n);
		
		double random2 = Math.random();
		int n2 = (int) (4 + random2 * (10-4));
		System.out.print("\n"+n2);
	}

}
