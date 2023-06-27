package Ejercicios;

import java.util.Scanner;

public class ParImparPrimo {
	
	public static void main(String[] args) {
		int numero;
		Scanner leer=new Scanner(System.in);
		System.out.println("Anote un numero");
		numero=leer.nextInt();
		
		if(numero % 2==0) {
			System.out.println("Numero Par");
		}else {
			System.out.println("Numero Impar");			 
		}
	}
}
