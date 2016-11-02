package dia021116;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	
	int valor = 0, valorDealer = 0, especial = 0, especialDealer = 0;
	
	public Blackjack() {
		int escolha = 1, repetir = 1, qtdCartas = 0;
		String cartaEspecifica = "";
		
		while(repetir != 0){
			while(escolha == 1){
				
				if(valor >= 17 || valorDealer >=17 || qtdCartas > 4){
					cartaEspecifica = cartas();
					cartasDealer();
					System.out.print("\nRecebeu a carta: \"" + cartaEspecifica + "\"\n");
					System.out.print("Tem " + valor + " pontos\n\n");
				}
				
				while (valor <=16 && valorDealer <=16 && qtdCartas < 5){
					cartaEspecifica = cartas();
					cartasDealer();
					qtdCartas++;
					System.out.print("\nRecebeu a carta: \"" + cartaEspecifica + "\"\n");
					System.out.print("Tem " + valor + " pontos\n\n");
				}
				
				if(valor == 21){
					System.out.print("Blackjack!\n\nGanhou");
					escolha = 3;
				}
				else if(valor > 21){
					System.out.print("Rebentou!\n\nPerdeu");
					escolha = 3;
				}
				else if(valorDealer == 21){
					System.out.print("Dealer rebentou!\n\nGanhou");
					escolha = 3;
				}
				else if(valorDealer > 21){
					System.out.print("Dealer teve blackjack!\n\nPerdeu");
					escolha = 3;
				}
				
				if(escolha != 3){
					System.out.print("Pedir outra carta?\n1 - Sim\n2 - Nao\nEscolha: ");
					escolha = (new Scanner(System.in)).nextInt();
				}
				
				if(escolha == 2 && valor > valorDealer){
					System.out.print("Tem mais pontos do que o dealer!\n\nGanhou");
					escolha = 2;
				}
				else if(escolha == 2 && valorDealer > valor){
					System.out.print("Tem menos pontos do que o dealer!\n\nPerdeu");
					escolha = 2;
				}
			}
			escolha = 1;qtdCartas = 0;
			valor = 0;valorDealer = 0;especial = 0;especialDealer = 0;
			System.out.print("\n\nInsira qualquer valor excepto 0 para fazer mais jogos: ");
			repetir = (new Scanner(System.in)).nextInt();
		}
	}
	
	public String cartas(){
		int carta;
		String cartaEspecifica = "";
		
		Random r = new Random();
		carta = r.nextInt(12);
		
		if(carta == 0 && especial > 0){
			valor += 11;
			cartaEspecifica = "AS";
		}
		else if(carta == 0 && especial == 0){
			valor += 1;
			cartaEspecifica = "AS";
		}
		else if(carta == 1){
			valor += 2;
			cartaEspecifica = "2";
		}
		else if(carta == 2){
			valor += 3;
			cartaEspecifica = "3";
		}
		else if(carta == 3){
			valor += 4;
			cartaEspecifica = "4";
		}
		else if(carta == 4){
			valor += 5;
			cartaEspecifica = "5";
		}
		else if(carta == 5){
			valor += 6;
			cartaEspecifica = "6";
		}
		else if(carta == 6){
			valor += 7;
			cartaEspecifica = "7";
		}
		else if(carta == 7){
			valor += 8;
			cartaEspecifica = "8";
		}
		else if(carta == 8){
			valor += 9;
			cartaEspecifica = "9";
		}
		else if(carta == 9){
			valor += 10;
			cartaEspecifica = "10";
		}
		else if(carta == 10){
			valor += 10;
			especial += 1;
			cartaEspecifica = "Valete";
		}
		else if(carta == 11){
			valor += 10;
			especial += 1;
			cartaEspecifica = "Rei";
		}
		else{
			valor += 10;
			especial += 1;
			cartaEspecifica = "Rainha";
		}
		return cartaEspecifica;
	}
	
	public void cartasDealer(){
		int carta;
		Random r = new Random();
		carta = r.nextInt(12);
		
		if(carta == 0 && especialDealer > 0){
			valorDealer += 11;
		}
		else if(carta == 0 && especialDealer == 0){
			valorDealer += 1;
		}
		else if(carta == 1){
			valorDealer += 2;
		}
		else if(carta == 2){
			valorDealer += 3;
		}
		else if(carta == 3){
			valorDealer += 4;
		}
		else if(carta == 4){
			valorDealer += 5;
		}
		else if(carta == 5){
			valorDealer += 6;
		}
		else if(carta == 6){
			valorDealer += 7;
		}
		else if(carta == 7){
			valorDealer += 8;
		}
		else if(carta == 8){
			valorDealer += 9;
		}
		else if(carta == 9){
			valorDealer += 10;
		}
		else if(carta == 10){
			valorDealer += 10;
			especialDealer += 1;
		}
		else if(carta == 11){
			valorDealer += 10;
			especialDealer += 1;
		}
		else{
			valorDealer += 10;
			especialDealer += 1;
		}
	}
}
