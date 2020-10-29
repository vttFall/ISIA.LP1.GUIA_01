package senati;

import java.util.Scanner;

public class Caso_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float base=0, altura=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("BASE DEL CUADRADO (m)..: ");
		base=sc.nextFloat();
		System.out.print("ALTURA DEL CUADRADO (m): ");
		altura=sc.nextFloat();
		
		float area=base*altura;
		float perimetro=2*(base+altura);
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("ÁREA DEL CUADRADO.....: "+area+" m^2");
		System.out.println("PERÍMETRO DEL CUADRADO: "+perimetro+" m");

	}
}