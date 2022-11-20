package papapizza;

import java.util.Scanner;

public class Exercicio50910 {

	public static void main(String[] args) {
		// Programa: calculo simples
		Scanner leitura = new Scanner (System.in);
		int codigoPeça1,codigoPeça2;
		double numeroPeça1,numeroPeça2,valorPeça1,valorPeça2,TOTAL;
		
		System.out.println ("Escreva o codigo da peça 1:");
		codigoPeça1 = leitura.nextInt();
		System.out.println ("Escreva o número da peça 1: ");
		numeroPeça1 = leitura.nextDouble();
		System.out.println ("Escreva o valor da peça 1:");
		valorPeça1 = leitura.nextDouble();
		System.out.println ("Escreva o codigo da peça 2");
		codigoPeça2 = leitura.nextInt();
		System.out.println ("Escreva o número da peça 2:");
		numeroPeça2 = leitura.nextDouble();
		System.out.println ("Escreva o valor da peça 2:");
		valorPeça2 = leitura.nextDouble();
		TOTAL = (numeroPeça1*valorPeça1) + (numeroPeça2*valorPeça2);
		System.out.println ("Valor a pagar :" +"R$" +TOTAL);
		
		leitura.close();

	}

}
