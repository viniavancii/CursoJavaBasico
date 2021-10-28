
public class Aula15_ExercicioFatorialOperacao {
	 int n1 = 0;
	 int fat = 1;
	 String formula = "";

	public void setarValor(int n) {
		n1 = n;
		int f = 1;
		String s = "";

			for (int c = n; c > 1; c--) {
				f *= c;
				s+= c + " x ";
			}
			s += "1 = ";
			if(n <= 1) {
				s = "";
			}
			fat = f;
			formula = s;
		}
	
	public int pegarFatorial() {
		return fat;
	}
	
	public String pegarFormula() {
		return formula;
	}
}

