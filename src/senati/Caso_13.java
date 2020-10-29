package senati;

import java.util.Scanner;

public class Caso_13 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String pl1="",pl2="";
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("NOMBRE...: ");
		pl1=sc.nextLine();
		System.out.print("APELLIDOS: ");
		pl2=sc.nextLine();
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("ALUMNO...: "+pl1+" "+pl2);

	}
}