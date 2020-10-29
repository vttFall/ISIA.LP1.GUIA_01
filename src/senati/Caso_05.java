package senati;

import java.util.Scanner;

public class Caso_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		float n1=0, n2=0;
		
		System.out.print("D A T O S\n=========\nIngrese #1..: ");
		n1=sc.nextFloat();
		System.out.print("Ingrese #2..: ");
		n2=sc.nextFloat();
		
		/*
		PARA INPRESIÓN CON VARIABLES
		float prom=(n1+n2)/2; //promedio
		float pern1=(1.2*n1); //120% de n1
		float pern2=(0.7.n2); //70% de n2
		*/
		
		System.out.println("\nR E S U L T A D O S");
		System.out.println("===================");
		System.out.println("PROMEDIO....: "+ (n1+n2)/2);
		System.out.println("120% de #1..: "+ (n1*1.2));
		System.out.println("70% de #2...: "+ (n2*0.7));

	}
}