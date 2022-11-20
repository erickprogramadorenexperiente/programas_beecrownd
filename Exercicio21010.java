package papapizza;

import java.util.Scanner;

public class Exercicio21010 {

	public static void main(String[] args) {
		// Programa área
		Scanner leitura = new Scanner (System.in);
		double A,B,C,TRIANGULO,CIRCULO,TRAPEZIO,QUADRADO,RETANGULO;
		
		System.out.println ("Escreva o valor de A:");
		A = leitura.nextDouble();
		System.out.println ("Escreva o valor de B:");
		B = leitura.nextDouble();
		System.out.println ("Escreva o valor de C:");
		C = leitura.nextDouble();
		TRIANGULO = (A*C)/2;
		CIRCULO = (C*C)*3.14159;
		TRAPEZIO = ((A+B)*C)/2;
		QUADRADO = B*B;
		RETANGULO = A*B;
		System.out.println ("TRIANGULO =" +TRIANGULO);
		System.out.println ("CIRCULO =" +CIRCULO);
		System.out.println ("TRAPEZIO =" +TRAPEZIO);
		System.out.println ("QUADRADO ="+QUADRADO);
		System.out.println ("RETANGULO ="+RETANGULO);
		
		leitura.close();
		
		

	}

}
