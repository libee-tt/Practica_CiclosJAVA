
public class AsteriscosAsc {
	public static void main(String[] args) {
		// arbolito ascendiente 
		int a = 1;
		while (a<=5) {
			int b = 1;
			while (b<=a) {
				System.out.print("* ");
				// System.out.print(a+"-"+b);
				b++;
			} // cierre while b>=a
			System.out.println();
			a++;
		} //cierre while a<=5
	}//cierre main
} //cierre class
