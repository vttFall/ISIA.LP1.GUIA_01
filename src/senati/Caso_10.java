package senati;

import java.util.Scanner;

public class Caso_10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		float radio=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("RADIO DEL C�RCULO (m): ");
		radio=sc.nextFloat();
		
		float area= (float)(Math.PI * Math.pow(radio, 2.0));
		float perimetro= (float)(2 * Math.PI * radio);
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("AREA DEL C�RCULO.....: "+area+" m^2");
		System.out.println("PER�METRO DEL C�RCULO: "+perimetro+" m");

	}
}