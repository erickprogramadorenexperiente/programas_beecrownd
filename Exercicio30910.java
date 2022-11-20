package papapizza;

import java.util.Scanner;

public class Exercicio30910 {

	public static void main(String[] args) {
		// Programa salario
		
		Scanner leitura = new Scanner (System.in);
		double numeroFuncionario,Horastrabalhadas,valor,salario;
		
		System.out.println ("Informe o seu número:");
		numeroFuncionario = leitura.nextInt();
		System.out.println ("Informe a sua quantidade de horas trabalhadas:");
		Horastrabalhadas = leitura.nextDouble();
		System.out.println ("Informe o valor que você recebe por hora:");
		valor = leitura.nextDouble();
		salario = Horastrabalhadas * valor;
		System.out.println ("Número do funcionario:"+ numeroFuncionario);
		System.out.println ("Salario ="+salario);
		
		leitura.close();

	}

}
