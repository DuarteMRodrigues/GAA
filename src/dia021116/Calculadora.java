package dia021116;

import java.util.Scanner;

public class Calculadora {
	
	public Calculadora() {
		int num1 = 0, num2 = 1, escolha = 0, resultado = 0;
		
		System.out.print("Introduza o primeiro numero: ");
		num1 = (new Scanner(System.in)).nextInt();
		System.out.print("Introduza o segundo numero: ");
		num2 = (new Scanner(System.in)).nextInt();
		
		while (num2 != 0){
		
				System.out.println("Escolha uma operação:");
				System.out.print("1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\nEscolha: ");
				escolha = (new Scanner(System.in)).nextInt();
			
			switch (escolha){
			case 1:
				resultado = somar(num1, num2);
				System.out.println("O resultado é: " + resultado);
				break;
			case 2:
				resultado = subtrair(num1, num2);
				System.out.println("O resultado é: " + resultado);
				break;
			case 3:
				resultado = multiplicar(num1, num2);
				System.out.println("O resultado é: " + resultado);
				break;
			case 4:
				resultado = dividir(num1, num2);
				System.out.println("O resultado é: " + resultado);
				break;
			default:
				System.out.println("Operação inválida");
				break;
			}
			System.out.print("Introduza o primeiro numero: ");
			num1 = (new Scanner(System.in)).nextInt();
			System.out.print("Introduza o segundo numero: ");
			num2 = (new Scanner(System.in)).nextInt();
		}
		System.out.print("End");
	}

	public int somar(int num1, int num2){
		return num1 + num2;
	}
	
	public int subtrair(int num1, int num2){
		return num1 - num2;	
	}
	
	public int multiplicar(int num1, int num2){
		return num1 * num2;
	}
	
	public int dividir(int num1, int num2){
		return num1 / num2;
	}

}
