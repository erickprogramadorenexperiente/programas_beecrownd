package papapizza;

import java.util.Scanner;

public class Exercicio41010 {

	public static void main(String[] args) {
		// Programa consumo
		Scanner leitura = new Scanner (System.in);
		double DISTANCIA,COMBUSTIVEL,KML;
		
		System.out.println ("Escreva a distancia total que você percorreu:");
		DISTANCIA = leitura.nextDouble();
		System.out.println ("Escreva a quantidade de combustivel que você usou:");
		COMBUSTIVEL = leitura.nextDouble();
		KML = DISTANCIA/COMBUSTIVEL;
		System.out.println ("KM/L =" +KML);
		
		leitura.close();
		

	}

}
