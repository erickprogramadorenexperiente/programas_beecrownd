package papapizza;

import java.util.Scanner;

public class Exercicio11010 {

	public static void main(String[] args) {
		// Programa: Esfera
		Scanner leitura = new Scanner (System.in);
		double PI,R,VOLUME;
		PI = 3.14159;
		
		System.out.println ("Leia o valor do raio:");
		R = leitura.nextDouble();
		VOLUME = (4/3.0)*PI*R*R*R;
		System.out.println ("VOLUME =" +VOLUME);
		
		leitura.close();
		
		

	}

}
