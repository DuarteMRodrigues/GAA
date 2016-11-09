package dia09112016;

import java.util.Scanner;

public class Desafios {

	public Desafios() {
		exercicio3();
	}
	
	public void exercicio1(){
		// Utilize um ciclo for para imprimir uma mensagem 5 vezes
		// A mensagem deve ser introduzida pelo utilizador
		// Utilize 2 Metodos. O 1º para introduzir a mensagem, e o 2º para imprimir a mensagem
				
		String msg="";
		msg = mensagem();
		ciclo(msg);
	}
	
	public void exercicio2(){
		// Utilize um ciclo while para imprimir 5 mensagens
		// As mensagem devem introduzidas pelo utilizador e ser armazenadas num array 
		String[] mensagens = new String[5];
		int contador=0;
		
		for(int i=0; i<5; i++){
			System.out.print("Escreva a mensagem" + (i+1) + ": ");
			mensagens[i] = (new Scanner(System.in)).nextLine();
		}
		
		while(contador < 5){
			System.out.println("mensagem " + (contador + 1) + ": " + mensagens[contador]);
			contador++;
		}
	}
	
	public void exercicio3(){
		// Crie um ciclo do while que faça somas infinitas.
		// O ciclo so deve parar se o utilizador introduzir "0"
		// No final o valor da soma total deve ser apresentado
		
		int numero=0, soma=0;
		
		do{
			System.out.print("Introduza um numero: ");
			numero = (new Scanner(System.in)).nextInt();
			soma+=numero;
		}
		while(numero!=0);
		
		System.out.print("\nO valor da soma total é: " + soma);
	}

	public String mensagem(){
		String msg = "";
		System.out.print("Escreva uma mensagem: ");
		msg = (new Scanner(System.in)).nextLine();
		return msg;
	}
	
	public void ciclo(String msg){
		for(int i=0; i<5; i++){
			System.out.println(msg);
		}
	}
}
