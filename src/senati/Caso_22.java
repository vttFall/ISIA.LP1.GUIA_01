package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_22 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		String name="";
		float n1=0, n2=0, n3=0;
	
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("NOMBRE COMPLETO....: ");
		name=sc.nextLine();
		System.out.print("1RA NOTA (PESO 20%): ");
		n1=sc.nextFloat();
		System.out.print("2DA NOTA (PESO 30%): ");
		n2=sc.nextFloat();
		System.out.print("3RA NOTA (PESO 50%): ");
		n3=sc.nextFloat();
		
		float promp = (n1*20 + n2*30 + n3*50)/100;
		/* los pesos respectivos de las notas son del 20%, 30% y 50% */
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("NOMBRE: " + name);
		System.out.println("PROMEDIO PONDERADO: " + promp);
	
	}
}