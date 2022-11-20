package papapizza;

import java.util.Scanner;

public class Exercicio81010 {

	public static void main(String[] args) {
		// PROGRAMA: CONVERSÃO DE TEMPO
		Scanner leitura = new Scanner (System.in);
		double HORAS,MINUTOS,SEGUNDOS,VALOR;
		
		System.out.println ("Escreva um valor:");
		VALOR = leitura.nextDouble();
		HORAS = VALOR/3600;
		MINUTOS = (VALOR/3600)/60;
		SEGUNDOS = (VALOR/3600)%60;
		
		System.out.println ("HORAS:" +HORAS);
		System.out.println ("MINUTOS:"+MINUTOS);
		System.out.println ("SEGUNDOS:"+SEGUNDOS);
		
		leitura.close();

	}

}
