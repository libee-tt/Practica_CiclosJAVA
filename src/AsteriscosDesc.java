
public class AsteriscosDesc {
	public static void main(String[] args) {
		//Arbolito decreciente de asteriscos	
		int a = 5;
		while (a>0) {
			int b = 1;
			while (b<=a) {
				System.out.print("* ");
				// System.out.print(a+"-"+b);
				b++;
			} // cierre while b<=a
			System.out.println();
			a--;
		} //cierre while a>0
	} //cierre main
} //cierre class
