package app.ito.poo;

import java.time.LocalDate;

import java.util.Scanner;

import clases.ito.poo.Calzado;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Costo();
	}
	
	static void Costo() {
		
		Scanner sc = new Scanner(System.in);
		
		float costo;
				
		System.out.println("Ingrese el costo por par");
		costo= sc.nextInt();
				
		if (costo>=0);
			
		float lote;
				
		System.out.println("Ingrese el numero de lote");
		lote= sc.nextInt();
				
		if (lote>=0);


		System.out.println(new Calzado(89999,"sintetico","Lamina",(float) 24.5,(int) lote,costo,"negro y blanco"));
		
		float costolote=costo*lote;
		System.out.println(" El costo por lote es de: $" + costolote);
		
}

		
	}
