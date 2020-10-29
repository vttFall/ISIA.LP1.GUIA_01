package senati;

import java.util.Scanner;

public class Caso_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float n1=0, n2=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("Ingrese primer número: ");
		n1=sc.nextFloat();
		System.out.print("Ingrese segundo número: ");
		n2=sc.nextFloat();
		
		/* 
		PARA IMPRESIÓN CON VARIABLES
		float suma=n1+n2;
		float resta=n1-n2;
		float producto=n1*n2;
		float division=n1/n2;
		int residuo=(int)(n1%n2); CAST, con esto forzamos a que le lea como entero
		*/
		
		System.out.println("NÚMEROS INGRESADOS");
		System.out.println("==================");
		System.out.println("SUMA...........: "+ (n1+n2));
		System.out.println("RESTA..........: "+ (n1-n2));
		System.out.println("PRODUCTO.......: "+ (n1*n2));
		System.out.println("DIVISIÓN.......: "+ (n1/n2));
		System.out.println("RESTO..........: "+ (n1%n2));

	}

}
