package papapizza;

import java.util.Scanner;

public class exercicio40810 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		int A,B,SOMA;
		
		System.out.println ("Escreva o valor de A:");
		A = leitura.nextInt();
		System.out.println ("Escreva o valor de B:");
		B = leitura.nextInt();
		SOMA = A+B;
		System.out.println ("SOMA=" +SOMA);
		
		leitura.close();
		
		

	}

}
