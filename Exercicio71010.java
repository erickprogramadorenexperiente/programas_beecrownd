package papapizza;

import java.util.Scanner;

public class Exercicio71010 {

	public static void main(String[] args) {
		// PRAGRAMA: Cédulas
		Scanner leitura = new Scanner (System.in);
		double CEM,CINQUENTA,VINTE,DEZ,CINCO,DOIS,UM,TROCO;
		
		System.out.println ("Escreva o valor de um número:");
		TROCO = leitura.nextDouble();
		CEM = TROCO/100;
		TROCO = TROCO - (CEM*100);
		CINQUENTA = TROCO/50;
		TROCO = TROCO - (CINQUENTA*50);
		VINTE = TROCO/20;
		TROCO = TROCO- (VINTE*20);
		DEZ = TROCO/10;
		TROCO = TROCO - (DEZ*10);
		CINCO = TROCO/5;
		TROCO = TROCO - (CINCO*5);
		DOIS = TROCO/2;
		TROCO = TROCO - (DOIS*2);
		UM = TROCO/1;
		TROCO = TROCO - (UM*1);
		System.out.println ("RESULTADOS ABAIXO:" +TROCO);
		System.out.println("%d nota(s) de R$ 100,00\n"+CEM);

		System.out.println ("%d nota(s) de R$ 50,00\n"+CINQUENTA);

		System.out.println ("%d nota(s) de R$ 20,00\n"+VINTE);

		System.out.println ("%d nota(s) de R$ 10,00\n"+DEZ);

		System.out.println ("%d nota(s) de R$ 5,00\n"+CINCO);

		System.out.println ("%d nota(s) de R$ 2,00\n"+DOIS);

		leitura.close();
		

	}

}
