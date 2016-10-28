package dia281016;

import java.util.Scanner;


public class BalancoGAA {
	
	int receitas, despesas;
	
	public BalancoGAA() {
		receitas();
		despesas();
		apresentarBalanco();		
	}
	
	public void receitas(){
		int quotas, recBaile, recBar;
		
		System.out.print("Introduza o valor das receitas\n\nQuotas: ");
		quotas = (new Scanner(System.in)).nextInt();
		System.out.print("Receitas do Baile: ");
		recBaile = (new Scanner(System.in)).nextInt();
		System.out.print("Receitas do Bar: ");
		recBar = (new Scanner(System.in)).nextInt();
		
		receitas = quotas + recBaile + recBar;
		System.out.print("\nO valor total das receitas é: " + receitas + "€");
	}
	
	public void despesas(){
		int agua, luz, telefone; 
		
		System.out.print("\n\n\nIntroduza o valor das despesas\n\nAgua: ");
		agua = (new Scanner(System.in)).nextInt();
		System.out.print("Luz: ");
		luz = (new Scanner(System.in)).nextInt();
		System.out.print("Telefone: ");
		telefone = (new Scanner(System.in)).nextInt();
		
		despesas = agua + luz + telefone;
		System.out.print("\nO valor total das despesas é: " + despesas + "€");
	}
	
	public void apresentarBalanco(){
		int balanco;
		
		balanco = receitas - despesas;
		System.out.print("\n\n\nO balanço é: " + balanco + "€");	
	}
}
