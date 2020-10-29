package senati;

import java.util.Scanner;

public class Caso_14 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("NÚMERO: ");
		n=sc.nextInt();
		
		//PPOR EJEMPLO: SI 	n=5, (5*6)/2 -> 15
		int sumatoria =(n*(n+1))/2;
		
		System.out.println("\nRESULTADO\n=========");
		System.out.println("SUMATORIA: "+sumatoria);
		
	}
}