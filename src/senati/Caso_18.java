package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_18 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		float base=0, altura=0;
		
		System.out.println("ÁREA DEL TRIÁNGULO\n==================");
		System.out.println("INGRESO DE DATOS\n===============");
		System.out.print("BASE (m)>>>> ");
		base = sc.nextFloat();
		System.out.print("ALTURA (m)>> ");
		altura = sc.nextFloat();
		
		float area=base*altura/2;
		
		System.out.println("\nRESULTADO\n=========");
		System.out.println("ÁREA: "+ df.format(area)+" m^2");
		
	}
}