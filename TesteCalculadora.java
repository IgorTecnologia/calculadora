package com.igor.cursojava.POO;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int op;
		float n1 = 0, n2 = 0;
		
		do {
			System.out.println("\nCalculadora família 69");
			System.out.println("\n1- Somar");
			System.out.println("\n2- Subtrair");
			System.out.println("\n3- Multiplicar");
			System.out.println("\n4- Dividir");
			System.out.println("\n5- Frase");
			System.out.println("\n0- Sair");

			op = scan.nextInt();
			
			if(op >0 && op <=4) {
				
			System.out.println("\nDigite o primeiro número:");
			n1 = scan.nextFloat();

			System.out.println("\nDigite o segundo número:");
			n2 = scan.nextFloat();
			
			}else if(op == 5) {
				Calculadora.frase();
			}else if(op ==0) {
				System.out.println("Programa finalizado!!!");
			}else {
				System.out.println("Opção inválida!!!");
			}
			switch (op) {
			case 1:
				System.out.println("\nSoma: " + Calculadora.somar(n1, n2));

				break;
			case 2:
				System.out.println("\nSubtração: " + Calculadora.subtrair(n1, n2));

				break;
			case 3:
				System.out.println("\nMultiplicação: " + Calculadora.multiplicar(n1, n2));

				break;
			case 4:
				System.out.println("\nDivisão: " + Calculadora.dividir(n1, n2));

				break;
			}

		} while (op != 0);

	}
}
