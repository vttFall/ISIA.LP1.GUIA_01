package senati;

public class Caso_12 {

	public static void main(String[] args) {

		String frase="ESCUELA DE TECNOLOGÍA E INFORMÁTICA";
		String pl1 = frase.substring(0,7);
		String pl2 = frase.substring(11,21);
		String pl3 = frase.substring(24,35);
		
		System.out.println("RESULTADOS\n==========");
		System.out.println("1RA PALABRA : "+pl1);
		System.out.println("3RA PALABRA : "+pl2);
		System.out.println("5TA PALABRA : "+pl3);
		
	}
}