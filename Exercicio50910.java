package papapizza;

import java.util.Scanner;

public class Exercicio50910 {

	public static void main(String[] args) {
		// Programa: calculo simples
		Scanner leitura = new Scanner (System.in);
		int codigoPe�a1,codigoPe�a2;
		double numeroPe�a1,numeroPe�a2,valorPe�a1,valorPe�a2,TOTAL;
		
		System.out.println ("Escreva o codigo da pe�a 1:");
		codigoPe�a1 = leitura.nextInt();
		System.out.println ("Escreva o n�mero da pe�a 1: ");
		numeroPe�a1 = leitura.nextDouble();
		System.out.println ("Escreva o valor da pe�a 1:");
		valorPe�a1 = leitura.nextDouble();
		System.out.println ("Escreva o codigo da pe�a 2");
		codigoPe�a2 = leitura.nextInt();
		System.out.println ("Escreva o n�mero da pe�a 2:");
		numeroPe�a2 = leitura.nextDouble();
		System.out.println ("Escreva o valor da pe�a 2:");
		valorPe�a2 = leitura.nextDouble();
		TOTAL = (numeroPe�a1*valorPe�a1) + (numeroPe�a2*valorPe�a2);
		System.out.println ("Valor a pagar :" +"R$" +TOTAL);
		
		leitura.close();

	}

}
