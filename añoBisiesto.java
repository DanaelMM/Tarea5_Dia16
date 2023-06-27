package Ejercicios;

import java.util.Scanner;

public class añoBisiesto {
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main (String[] args)
	{
		int año;
		
		System.out.println("Ingresar el año: ");
		año = entrada.nextInt();
		
		    if( año % 100 <=0) {
		    	if (año % 4 ==0)
		    		System.out.print("Bisiesto");
		    	else
		    		System.out.print("No Bisiesto");
		    } else if(año % 400==0)
		    	System.out.print("Bisiesto");
		    else
		    	System.out.print("No Bisiesto");
		    }
	}
