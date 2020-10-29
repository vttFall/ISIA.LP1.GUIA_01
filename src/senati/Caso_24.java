package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_24 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("MONTO #1 (S/): ");
		float mt1 = sc.nextFloat();
		System.out.print("MONTO #2 (S/): ");
		float mt2 = sc.nextFloat();
		System.out.print("MONTO #3 (S/): ");
		float mt3 = sc.nextFloat();
		
		float op1 = (float)((mt1/5) + (0.2*mt2));
		float op2 = (float)(0.5*1.6*mt3);
		float op3 = (mt1 + mt2 + mt3)*(float)0.92;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("5TA PARTE DE MONTO #1 + 20% DE MONTO #2:\n >> S/ " + df.format(op1));
		System.out.println("MITAD DEL 160% DE MONTO #3:\n >> S/ " + df.format(op2));
		System.out.println("92% DE LA SUMA DE MONTOS:\n >> S/ " + df.format(op3));
		
	}
}