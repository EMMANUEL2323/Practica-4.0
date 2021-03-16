package app.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

import clases.ito.poo.CuerpoCeleste;

import clases.ito.poo.Ubicacion;

public class MyApp {

	private static final float Float = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       run();
       Ubicacion();
	}

	static void run() {
		System.out.println(new Ubicacion((Float),(Float),"12 meses",(Float) ));
		System.out.println(new CuerpoCeleste("Estrellita",null,"gases"));
	}
	
	static void Ubicacion() {
	float latitud;
	float longitud;
	float distancia = 0;
	Scanner entrada=new Scanner(System.in);
	System.out.println("Ingrese la latitud");
	System.out.println("Ingrese la longitud");
	latitud=entrada.nextInt();
	longitud=entrada.nextInt();
	System.out.println((distancia= latitud*longitud));
	System.out.println(new Ubicacion(latitud,longitud,"12 meses",(Float)distancia ));
	
	}
}
