package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_19 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		float l1=0, l2=0, l3=0;
		
		System.out.println("PER�METRO DEL TRI�NGULO\n======================");
		System.out.println("INGRESO DE DATOS\n===============");
		System.out.print("LADO 1 (m) >> ");
		l1 = sc.nextFloat();
		System.out.print("LADO 2 (m) >> ");
		l2 = sc.nextFloat();
		System.out.print("LADO 3 (m) >> ");
		l3 = sc.nextFloat();
		
		/*No aplico restricci�n de existencia de tri�ngulos por
		el simple hecho de que en esta gu�a01 a�n no consideramos
		las condicionales if - else, y porque es para conocer 
		la similitud de java con python */
		
		float perimetro=l1+l2+l3;
		
		System.out.println("\nRESULTADO\n=========");
		System.out.println("PER�METRO: "+ df.format(perimetro)+" m");

	}
}