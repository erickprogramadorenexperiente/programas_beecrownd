package papapizza;

import java.util.Scanner;

public class Exercicio20810 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		int A,B,X;
		
		System.out.println ("Digite o valor de A:");
		A = leitura.nextInt();
		System.out.println ("Digite o valor de B:");
		B = leitura.nextInt();
		X = A+B;
		System.out.println ("X ="+X);
		leitura.close();
		
		

	}

}
