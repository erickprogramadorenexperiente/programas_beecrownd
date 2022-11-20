package papapizza;

import java.util.Scanner;

public class Exercicio1610 {

	public static void main(String[] args) {
		// PROGRAMA: BASKARAH
		Scanner leitura = new Scanner (System.in);
		double peso,altura,imc;
		
		System.out.println ("Escreva o seu peso:");
		peso = leitura.nextDouble();
		System.out.println ("Escreva a sua altura:");
		altura = leitura.nextDouble();
		imc = peso/(altura*altura);
		System.out.println ("resultado do imc:" +imc);
		if (imc<18.5) {
		   System.out.println ("excesso de magreza");	
		}else if (imc>=18.5 & imc<25) {
		   System.out.println ("peso normal"); 	
		}else if (imc>=25 & imc<30) {
		   System.out.println ("excesso de peso"); 	 
		}else if (imc>=30 & imc<35) {
		   System.out.println ("obesidade grau 1"); 	
		}else if (imc>=35 & imc<40) {
		   System.out.println ("obesidade grau 2"); 	
		}else {
		   System.out.println ("obesidade grau 3"); 	 
		}
		
		leitura.close();

	}

}
