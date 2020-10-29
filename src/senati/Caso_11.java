package senati;

import java.util.Scanner;

public class Caso_11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String nombre= ""; //Crea objeto de tipo string
		
		System.out.println("INGRESO DE DATOS\n=================");
		System.out.print("PALABRA O FRASE: ");
		nombre=sc.nextLine();
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("NÚMERO DE CARACTERES: "+nombre.length());
		// length toma en cuenta espacios entre pañabras
	}
}