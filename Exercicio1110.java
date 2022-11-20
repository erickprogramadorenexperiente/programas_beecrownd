package papapizza;

import java.util.Scanner;

public class Exercicio1110 {

	public static void main(String[] args) {
		// PROGRAMA: idade em dias
		Scanner leitura = new Scanner (System.in);
		int ANOS,MESES,DIAS,IDADE;
		
		System.out.println ("Escreva a sua idade:");
		IDADE = leitura.nextInt();
		ANOS = IDADE/365;
		MESES = (IDADE%365)/30;
		DIAS = (IDADE%365)%30;
		System.out.println ("ANOS:" +ANOS);
		System.out.println ("MESES:" +MESES);
		System.out.println ("DIAS:" +DIAS);
		
		leitura.close();
		

	}

}
