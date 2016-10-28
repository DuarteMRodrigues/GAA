package dia281016;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

	int numero;
	final int valormax = 101;
	
	public AdivinhaNumero() {
		Random r = new Random();
		numero = r.nextInt(valormax);
		
		tentarAdivinhar();
	}
	
	public void tentarAdivinhar(){
		int adivinhar, tentativas = 5;
		
		System.out.println(numero);
		System.out.print("insira um numero entre 0 e 100: ");
		adivinhar = (new Scanner(System.in)).nextInt();
		
		while(tentativas != 0){
			while(adivinhar > 100 || adivinhar < 0){
				System.out.println("\n\n" + numero);
				System.out.print("insira um numero entre 0 e 100: ");
				adivinhar = (new Scanner(System.in)).nextInt();
			}
			tentativas--;	
			
			if(adivinhar == numero){
				tentativas = 0;
				System.out.print("\n\nGanhou");
			}
			else if (tentativas == 0){
				System.out.print("\n\nPerdeu");
			}
			else{
				if (adivinhar > numero){
					System.out.print("O numero é menor que o valor introduzido\n1");
				}
				else
					System.out.print("O numero é maior que o valor introduzido\n");
				adivinhar = -1;
				System.out.print("Ainda tem " + tentativas + " tentativas");
			}
		}
		
	}

}
