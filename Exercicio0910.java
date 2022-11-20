package papapizza;

import java.util.Scanner;

public class Exercicio0910 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		double A,B,C,MEDIA;
		
		System.out.println ("Escreva o valor da nota A:");
		A = leitura.nextDouble();
		System.out.println ("Escreva o valor da nota B:");
		B = leitura.nextDouble();
		System.out.println ("Escreva o valor da nota C:");
		C = leitura.nextDouble();
		MEDIA = (A*2)+(B*3)+(C*5)/10;
		System.out.println ("MEDIA =" +MEDIA);
		
		leitura.close();
		
		
		

	}

}
