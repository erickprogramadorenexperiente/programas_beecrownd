package papapizza;

import java.util.Scanner;

public class Exercicio20910 {

	public static void main(String[] args) {
		// programa diferen�a;
		Scanner leitura = new Scanner (System.in);
		int A,B,C,D,DIFEREN�A;
		
		System.out.println ("Escreva o valor de A:");
		A = leitura.nextInt();
		System.out.println ("Escreva o valor de B:");
		B = leitura.nextInt();
		System.out.println ("Escreva o valor de C:");
		C = leitura.nextInt();
		System.out.println ("Escreva o valor de D:");
		D = leitura.nextInt();
		DIFEREN�A = (A*B)-(C*D);
		System.out.println ("DIFEREN�A ="+DIFEREN�A);
		
		leitura.close();
		
		

	}

}
