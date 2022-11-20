package papapizza;

import java.util.Scanner;

public class Exercicio51010 {

	public static void main(String[] args) {
		// PROGRAMA: distancia 
		Scanner leitura = new Scanner (System.in);
		double KM,MINUTOS;
		
		System.out.println ("Escreva a quantidade de quilometros:");
		KM = leitura.nextDouble();
		MINUTOS = KM*2;
		System.out.println ("MINUTOS =" +MINUTOS);
		
		leitura.close();
		
		

	}

}
