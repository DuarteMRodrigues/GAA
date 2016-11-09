package dia021116;

import java.util.Random;
import java.util.Scanner;

public class Blackjack {
	
	public Blackjack() {
		int escolha = 1, repetir = 1, qtdCartas = 0, valor = 0, valorDealer = 0, especial = 0, especialDealer = 0;
		String cartaEspecifica = "", cartaEspecificaDealer = "";
		System.out.println("Consultar regras do Blackjack em: \"https://pt.wikipedia.org/wiki/Blackjack\"\n\nJoguem de forma responsavel!\n");
		System.out.println("Clique no enter para continuar");
		cartaEspecifica = (new Scanner(System.in)).nextLine();
		
		// Repete o jogo até o utilizador decidir parar.
		while(repetir != 0){
			// Dá cartas ao utilizador até este parar de as pedir, ou o jogo acabar.
			while(escolha == 1){
				// Quando o utilizador e o dealer recebem 2 cartas, o utilizador pode decidir se quer mais cartas ou nao
				if(qtdCartas >= 2){
					// Recebe uma carta aleatória para o utilizador
					cartaEspecifica = cartas(); 
					// Recebe uma carta aleatória para o computador
					cartaEspecificaDealer = cartasDealer(); 
					// Aumenta o valor à variavel especial, que influencia o valor do AS
					especial += cartaEspecial(cartaEspecifica); 
					// Aumenta o valor à variavel especial para o dealer, que influencia o valor do AS
					especialDealer += cartaEspecialDealer(cartaEspecificaDealer); 
					// Consoante a carta que calhou, o utilizador recebe X pontos.
					valor += valorCarta(cartaEspecifica, especial); 
					// Consoante a carta que calhou, o dealer recebe X pontos.
					valorDealer += valorCartaDealer(cartaEspecificaDealer, especial);
					System.out.print("\nRecebeu a carta: \"" + cartaEspecifica + "\"\n");
					System.out.print("Tem " + valor + " pontos\n\n");
				}
				// Enquanto o utilizador e o Dealer nao receberem duas cartas, nao podem fazer jogadas
				// Dentro do ciclo executa-se o mesmo processo do if acima. 
				while(qtdCartas < 2){
					cartaEspecifica = cartas();
					cartaEspecificaDealer = cartasDealer();
					especial += cartaEspecial(cartaEspecifica);
					especialDealer += cartaEspecialDealer(cartaEspecificaDealer);
					valor += valorCarta(cartaEspecifica, especial);
					valorDealer += valorCartaDealer(cartaEspecificaDealer, especial);
					qtdCartas++;
					System.out.print("\nRecebeu a carta: \"" + cartaEspecifica + "\"\n");
					System.out.print("Tem " + valor + " pontos\n\n");
				}
				
				// Se o utilizador tiver 21 pontos ganha por blackjack. 
				if(valor == 21){
					System.out.print("Blackjack!\n\nGanhou");
					// A escolha = 3, server para sair do ciclo de jogo e para o utilizador nao poder pedir mais cartas, pois o jogo ja terminou.
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
				
				// se o jogo nao tiver terminado, o jogo pode pedir ou nao, outra carta
				if(escolha != 3){
					System.out.print("Pedir outra carta?\n1 - Sim\n2 - Nao\nEscolha: ");
					escolha = (new Scanner(System.in)).nextInt();
				}
				
				// se o utilizador nao quiser mais cartas, o jogo acaba e faz as proximas 3 verificações
				if(escolha == 2 && valor > valorDealer){
					System.out.print("Tem mais pontos do que o dealer!\n\nGanhou");
				}
				else if(escolha == 2 && valorDealer > valor){
					System.out.print("Tem menos pontos do que o dealer!\n\nPerdeu");
				}
				else if(escolha == 2 && valor == valorDealer){
					System.out.print("Tem os mesmos pontos que o dealer!\n\nEmpate");
				}
			}
			// reinicialização do valor das variáveis
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
		
		if(carta == 0){
			cartaEspecifica = "AS";
		}
		else if(carta == 0){
			cartaEspecifica = "AS";
		}
		else if(carta == 1){
			cartaEspecifica = "2";
		}
		else if(carta == 2){
			cartaEspecifica = "3";
		}
		else if(carta == 3){
			cartaEspecifica = "4";
		}
		else if(carta == 4){
			cartaEspecifica = "5";
		}
		else if(carta == 5){
			cartaEspecifica = "6";
		}
		else if(carta == 6){
			cartaEspecifica = "7";
		}
		else if(carta == 7){
			cartaEspecifica = "8";
		}
		else if(carta == 8){
			cartaEspecifica = "9";
		}
		else if(carta == 9){
			cartaEspecifica = "10";
		}
		else if(carta == 10){
			cartaEspecifica = "Valete";
		}
		else if(carta == 11){
			cartaEspecifica = "Rei";
		}
		else{
			cartaEspecifica = "Rainha";
		}
		return cartaEspecifica;
	}
	
	public String cartasDealer(){
		int carta;
		String cartaEspecificaDealer="";
		Random r = new Random();
		carta = r.nextInt(12);
		
		
		if(carta == 0){
			cartaEspecificaDealer="AS";
		}
		else if(carta == 0){
			cartaEspecificaDealer="AS";
		}
		else if(carta == 1){
			cartaEspecificaDealer="2";
		}
		else if(carta == 2){
			cartaEspecificaDealer="3";
		}
		else if(carta == 3){
			cartaEspecificaDealer="4";
		}
		else if(carta == 4){
			cartaEspecificaDealer="5";
		}
		else if(carta == 5){
			cartaEspecificaDealer="6";
		}
		else if(carta == 6){
			cartaEspecificaDealer="7";
		}
		else if(carta == 7){
			cartaEspecificaDealer="8";
		}
		else if(carta == 8){
			cartaEspecificaDealer="9";
		}
		else if(carta == 9){
			cartaEspecificaDealer="10";
		}
		else if(carta == 10){
			cartaEspecificaDealer="Valete";
		}
		else if(carta == 11){
			cartaEspecificaDealer="Rei";
		}
		else{
			cartaEspecificaDealer="Rainha";
		}
		return cartaEspecificaDealer;
	}

	public int cartaEspecial(String cartaEspecifica){
		int especial = 0;
		
		if(cartaEspecifica == "Rei"){
			especial += 1;
		}
		else if(cartaEspecifica == "Rainha"){
			especial += 1;
		}
		else if(cartaEspecifica == "Valete"){
			especial += 1;
		}
			
		return especial;
	}
	
	public int cartaEspecialDealer(String cartaEspecifica){
		int especial = 0;
		
		if(cartaEspecifica == "Rei"){
			especial += 1;
		}
		else if(cartaEspecifica == "Rainha"){
			especial += 1;
		}
		else if(cartaEspecifica == "Valete"){
			especial += 1;
		}
			
		return especial;
	}
	
	public int valorCarta(String cartaEspecifica, int especial){
		int valor = 0;
		
		if(cartaEspecifica == "AS"){
			valor = 1;
		}
		else if(cartaEspecifica == "AS" && especial >= 1){
			valor = 11;
		}
		else if(cartaEspecifica == "2"){
			valor = 2;
		}
		else if(cartaEspecifica == "3"){
			valor = 3;
		}
		else if(cartaEspecifica == "4"){
			valor = 4;
		}
		else if(cartaEspecifica == "5"){
			valor = 5;
		}
		else if(cartaEspecifica == "6"){
			valor = 6;
		}
		else if(cartaEspecifica == "7"){
			valor = 7;
		}
		else if(cartaEspecifica == "8"){
			valor = 8;
		}
		else if(cartaEspecifica == "9"){
			valor = 9;
		}
		else if(cartaEspecifica == "10"){
			valor = 10;
		}
		else{
			valor = 10;
		}
		return valor;
	}

	public int valorCartaDealer(String cartaEspecifica, int especial){
		int valor = 0;
		
		if(cartaEspecifica == "AS"){
			valor = 1;
		}
		else if(cartaEspecifica == "AS" && especial >= 1){
			valor = 11;
		}
		else if(cartaEspecifica == "2"){
			valor = 2;
		}
		else if(cartaEspecifica == "3"){
			valor = 3;
		}
		else if(cartaEspecifica == "4"){
			valor = 4;
		}
		else if(cartaEspecifica == "5"){
			valor = 5;
		}
		else if(cartaEspecifica == "6"){
			valor = 6;
		}
		else if(cartaEspecifica == "7"){
			valor = 7;
		}
		else if(cartaEspecifica == "8"){
			valor = 8;
		}
		else if(cartaEspecifica == "9"){
			valor = 9;
		}
		else if(cartaEspecifica == "10"){
			valor = 10;
		}
		else{
			valor = 10;
		}
		return valor;
	}
}
