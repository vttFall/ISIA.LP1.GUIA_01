package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso_17 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		float na=0, nd=0, nr=0;
		
		System.out.println("INGRESO DE DATOS\n================");
		System.out.print("# DE APROBADOS...: ");
		na=sc.nextFloat();
		System.out.print("# DE DESAPROBADOS: ");
		nd=sc.nextFloat();
		System.out.print("# DE RETIRADOS...: ");
		nr=sc.nextFloat();
		
		Float total=na+nd+nr;
		float pa=(na/total)*100;
		float pd=(nd/total)*100;
		float pr=(nr/total)*100;
		
		System.out.println("\nRESULTADOS\n==========");
		System.out.println("% DE APROBADOS...: "+df.format(pa)+" %");
		System.out.println("% DE DESAPROBADOS: "+df.format(pd)+" %");
		System.out.println("% DE RETIRADOS...: "+df.format(pr)+" %");

	}
}