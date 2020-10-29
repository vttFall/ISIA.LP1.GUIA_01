package senati;

import java.util.Scanner;

public class Caso_08 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int lado=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("Lado del cuadrado (m): ");
		lado=sc.nextInt();
		
		int area=lado*lado; int perimetro=lado*4;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("AREA DEL CUADRADO.....: "+area+" m^2");
		System.out.println("PERÍMETRO DEL CUADRADO: "+perimetro+" m");
	
	}
}
