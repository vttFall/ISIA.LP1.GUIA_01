package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_15 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		int cantidad=0; float precio =0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("CANTIDAD: ");
		cantidad=sc.nextInt();
		System.out.print("PRECIO..: ");
		precio=sc.nextFloat();
		
		float importe=cantidad*precio;
		float impdolares=(float)(importe/3.24);
		float impeuros=(float)(importe/3.75);
		
		System.out.println("\nRESULTADOS\n=========: ");
		System.out.println("IMPORTE (PEN): "+ df.format(importe));
		System.out.println("IMPORTE (USD): "+ df.format(impdolares));
		System.out.println("IMPORTE (EUR): "+ df.format(impeuros));

	}
}