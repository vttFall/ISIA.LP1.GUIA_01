package senati;

import java.util.Scanner;

public class Caso_03 {

	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		float n1=0, n2=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("Ingrese primer número...: ");
		n1=sc.nextFloat();
		System.out.print("Ingrese segundo número..: ");
		n2=sc.nextFloat();
		
		System.out.println("\nNÚMEROS INGRESADOS");
		System.out.println("==================");
		System.out.println("NÚMERO 1: "+ n1);
		System.out.println("NÚMERO 2: "+ n2);

	}

}
