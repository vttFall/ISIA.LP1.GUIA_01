package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_23 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		DecimalFormat dfp=new DecimalFormat("#");
		
		String producto = "";
		float precio = 0; int cantidad = 0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("PRODUCTO...: ");
		producto = sc.nextLine();
		System.out.print("PRECIO (S/): ");
		precio = sc.nextFloat();
		System.out.print("CANTIDAD...: ");
		cantidad = sc.nextInt();
		
		float pdescuento=3, pigv = 18;
		/* 3% (descuento) --------- 18 % (igv, incluido en el precio) */
		float importe = precio*cantidad;
		float igv = importe*(pigv/100); 
		float descuento = importe*(pdescuento/100);
		float total = importe - descuento;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("PRODUCTO.................: " + producto);
		System.out.println("IMPORTE..............(S/): " + df.format(importe));
		System.out.println("IGV ("+ dfp.format(pigv) +"%) DE IMPORTE (S/): " + df.format(igv));
		System.out.println("DESCUENTO ("+ dfp.format(pdescuento) +"%).......(S/): " + df.format(descuento));
		System.out.println("TOTAL................(S/): " + df.format(total));

	}
}