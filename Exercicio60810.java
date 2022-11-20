package papapizza;

import java.util.Scanner;

public class Exercicio60810 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		double A,B,MEDIA;
		
		System.out.println ("Escreva o valor da nota A:");
		A = leitura.nextDouble();
		System.out.println ("Escreva o valor da nota B:");
		B = leitura.nextDouble();
		MEDIA = (A*3.5)+(B*7.5)/11;
		System.out.println ("MEDIA="+MEDIA);
		
		leitura.close();
		

	}

}
