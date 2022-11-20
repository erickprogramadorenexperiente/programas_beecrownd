package papapizza;

import java.util.Scanner;

public class Exercicio40910 {

	public static void main(String[] args) {
		// Sálario com bonús
		Scanner leitura = new Scanner (System.in);
		String nome;
		double salario,vendas,TOTAL;
		
		System.out.println ("Escreva o seu nome:");
		String String = leitura.next();
		System.out.println ("Escreva o seu salario fixo:");
		salario = leitura.nextDouble();
		System.out.println ("Escreva o valor de quanto você recebeu este mês em vandas:");
		vendas = leitura.nextDouble();
		TOTAL = (salario+vendas)*0.15;
		System.out.println ("TOTAL ="+TOTAL);
		
		leitura.close();
		
		

	}

}
