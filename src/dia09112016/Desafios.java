package dia09112016;

import java.util.Random;
import java.util.Scanner;

public class Desafios {

	public Desafios() {
		exercicio2();
	}
	
	public void exercicio1(){
		// Utilize um ciclo for para imprimir uma mensagem 5 vezes
		// A mensagem deve ser introduzida pelo utilizador
		// Utilize 2 Metodos. O 1º para ler a mensagem, e o 2º para imprimir a mensagem
		// Dificuldade: Medio
				
		String msg="";
		msg = mensagem();
		ciclo(msg);
	}
	
	public void exercicio2(){
		// Utilize um ciclo while para imprimir 5 mensagens
		// As mensagem devem introduzidas pelo utilizador e ser armazenadas num array
		// A ordem das mensagens deve ser alterada de forma aleatoria ao serem apresentadas
		// Nao pode haver repetição de mensagens
		// Verifique a repeticao de mensagens utilizado um segundo array
		// Dificuldade: Dificil
		
		String[] mensagens = new String[5];
		int[] verificacao = new int[5];
		verificacao[0] = -1;
		int contador=0, ordem = 0;
		
		for(int i=0; i<5; i++){
			System.out.print("Escreva a mensagem" + (i+1) + ": ");
			mensagens[i] = (new Scanner(System.in)).nextLine();
		}
		
		while(contador < 5){
			if(verificacao[0] == -1){
				Random r = new Random();
				ordem = r.nextInt(5);
				verificacao[0] = ordem;
			}
			else{
				Random r = new Random();
				ordem = r.nextInt(5);
				verificacao[contador] = ordem;
				for(int i=0; i<5; i++){
					if (verificacao[i] == ordem){
						if(i!=contador){
							ordem = r.nextInt(5);
							verificacao[contador] = ordem;
							i=-1;
						}
					}
				}
			}
			System.out.println("mensagem " + (contador + 1) + ": " + mensagens[ordem]);
			contador++;
		}
	}
	
	public void exercicio3(){
		// Crie um ciclo do while que faça somas infinitas.
		// O valor das somas deve ser armazenado numa unica variavel 
		// O ciclo so deve parar se o utilizador introduzir "0"
		// No final o valor da soma total deve ser apresentado
		// Dificuldade: Facil
		
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
