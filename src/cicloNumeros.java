public class cicloNumeros {

	public static void main(String[] args) {
		//Dos columnas (a y b) de números (1 al 3)
		int a = 1;
		while (a<=3) {
			int b = 1; 
			while (b<=3) {
				System.out.println(a+" "+b);
				b++;
			} // cierre while columna b
			a++;
		} // cierre while columna a
		
		
	} //cierre main
} //cierre ciclosAnidados