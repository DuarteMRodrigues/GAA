import java.util.Scanner;

import dia021116.Blackjack;
import dia021116.Calculadora;
import dia021116.Ciclos;
import dia021116.Condicionais;
import dia09112016.Desafios;
import dia09112016.GolosDaLiga;
import dia09112016.TreinoArrays;
import dia281016.AdivinhaNumero;
import dia281016.BalancoGAA;
import dia281016.CalculadoraSimples;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		
		int escolha=0;
		
		System.out.println("Escolha um programa: ");
		System.out.println("1: CalculadoraSimples");
		System.out.println("2: BalancoGAA");
		System.out.println("3: AdivinhaNumero");
		System.out.println("4: Condicionais");
		System.out.println("5: Ciclos");
		System.out.println("6: Calculadora");
		System.out.println("7: BlackJack");
		System.out.println("8: TreinoArrays");
		System.out.println("9: Desafios");
		System.out.println("10: Golos da Liga");
		System.out.print("Escolha: ");
		escolha = (new Scanner(System.in)).nextInt();
		
		switch (escolha){
		case 1:
			new CalculadoraSimples();
			break;
		case 2:
			new BalancoGAA();
			break;
		case 3:
			new AdivinhaNumero();
			break;
		case 4:
			new Condicionais();
			break;
		case 5:
			new Ciclos();
			break;
		case 6:
			new Calculadora();
			break;
		case 7:
			new Blackjack();
			break;
		case 8:
			new TreinoArrays();
			break;
		case 9:
			new Desafios();
			break;
		case 10:
			new GolosDaLiga();
			break;
		default:
			System.out.println("Escolha Inválida.");
		}
		System.out.print("\n\n\n\n\nIntroduza \"0\" para utilizar outro programa: ");
		escolha = (new Scanner(System.in)).nextInt();
		if(escolha == 0){
			String[] args1 = {};
			Principal.main(args1);
		}
		else
		{
			
		}
	}

}
