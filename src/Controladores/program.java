package Controladores;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba la primera cadena: ");
		String cadena1 = sc.next();
		System.out.println("Escriba la segunda cadena: ");
		String cadena2 = sc.next();
		
		String cadenasConcatenadas = cadena1 + " " + cadena2 ;
		System.out.println(cadenasConcatenadas + " tiene: " + cadenasConcatenadas.length() + " caracteres");

	}

}