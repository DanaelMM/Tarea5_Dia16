package Ejercicios;

import java.util.Scanner;

public class PositivoNegativoCero {
	
	static Scanner leer = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		int numero;
		
		System.out.println("Ingresar numero: ");
		numero = leer.nextInt();
		
		    if( numero >0) {
		       System.out.print("Numero Positivo");
		    }
		    if( numero ==0) {
			       System.out.print("Numero Cero");
		    }
		    if( numero <0) {
			       System.out.print("Numero Negativo");
		    }
	}

		    	
}