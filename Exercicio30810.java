package papapizza;

import java.util.Scanner;

public class Exercicio30810 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		double A,n,raio;
		n = 3.14159;
		
		System.out.println ("Escreva o valor do raio:");
		raio = leitura.nextDouble();
		A = n*(raio*raio);
		System.out.println("A =" +A);
		
		leitura.close();

	}

}
