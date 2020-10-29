package senati;

public class Caso_06 {

	public static void main(String[] args) {
		
		int rp1=(int)Math.pow(5,3); //CAST para forzar
		float rp2=(float)Math.pow(81.0, 1/2.0);
		float rp3=(float)Math.pow(125, 1/3.0);
		float rp4=(float)Math.pow(256.0, 1/4.0) + (float)Math.pow(25.0, 1/2.0);
		
		System.out.println("R E S U L T A D O S");
		System.out.println("===================");
		System.out.println("RESPUESTA 1: "+rp1);
		System.out.println("RESPUESTA 2: "+rp2);
		System.out.println("RESPUESTA 2: "+rp3);
		System.out.println("RESPUESTA 2: "+rp4);
		
	}
}