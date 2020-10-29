package senati;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso_16 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		float ht=0, tph=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("HORAS TRABAJADAS: ");
		ht=sc.nextFloat();
		System.out.print("TARIFA POR HORA.: ");
		tph=sc.nextFloat();
		
		float sueldo=ht*tph;
		float bono=(float)(sueldo*0.05);
		float total=sueldo+bono;
		float tdolares=(float)(total/3.24);
		
		System.out.println("\nRESULTADOS\n=========");
		System.out.println("SUELDO (PEN): "+df.format(sueldo));
		System.out.println("BONO...(PEN): "+df.format(bono));
		System.out.println("TOTAL..(PEN): "+df.format(total));
		System.out.println("TOTAL..(USD): "+df.format(tdolares));
		
	}
}