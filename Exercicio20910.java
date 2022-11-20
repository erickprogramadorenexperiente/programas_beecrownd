package papapizza;

import java.util.Scanner;

public class Exercicio20910 {

	public static void main(String[] args) {
		// programa diferença;
		Scanner leitura = new Scanner (System.in);
		int A,B,C,D,DIFERENÇA;
		
		System.out.println ("Escreva o valor de A:");
		A = leitura.nextInt();
		System.out.println ("Escreva o valor de B:");
		B = leitura.nextInt();
		System.out.println ("Escreva o valor de C:");
		C = leitura.nextInt();
		System.out.println ("Escreva o valor de D:");
		D = leitura.nextInt();
		DIFERENÇA = (A*B)-(C*D);
		System.out.println ("DIFERENÇA ="+DIFERENÇA);
		
		leitura.close();
		
		

	}

}
