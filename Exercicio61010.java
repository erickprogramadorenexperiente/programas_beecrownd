package papapizza;

import java.util.Scanner;

public class Exercicio61010 {

	public static void main(String[] args) {
		// PROGRAMA: gasto de combustivel
		Scanner leitura = new Scanner (System.in);
		double TEMPO,VELOCIDADE,KM,LITROS;
		
		System.out.println ("Escreva a quantidade de tempo que você gastou:");
		TEMPO = leitura.nextDouble();
		System.out.println ("Escreva a velocidade que você estava dirigindo:");
		VELOCIDADE = leitura.nextDouble();
		KM = TEMPO*VELOCIDADE;
		LITROS = KM/12;
		System.out.println ("LITROS ="+LITROS);
		
		leitura.close();

	}

}
