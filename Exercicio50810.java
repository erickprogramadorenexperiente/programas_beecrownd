package papapizza;

import java.util.Scanner;

public class Exercicio50810 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		
		int valor1,valor2,PROD;
		
		System.out.println ("Escreva o valor do valor1:");
		valor1 = leitura.nextInt();
		System.out.println ("Escreva o valor do valor2:");
		valor2 = leitura.nextInt();
		PROD = valor1*valor2;
		System.out.println ("PROD="+PROD);
		
		leitura.close();

	}

}
