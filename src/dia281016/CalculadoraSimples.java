package dia281016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		System.out.println("\"Calculadora Simples\"\n\nIntroduza dois valores para somar\n\n1� n�mero:");
		
		int numero1;
		numero1 = (new Scanner(System.in)).nextInt();
		
		System.out.println("\n\n2� n�mero:");
		
		int numero2;
		numero2 = (new Scanner(System.in)).nextInt();
		
		int resultado = numero1 + numero2;
		
		System.out.println("O resultado da soma de \"" + numero1 + "\" com \"" + numero2 + "\" � igual a: " + resultado);
	}

}
