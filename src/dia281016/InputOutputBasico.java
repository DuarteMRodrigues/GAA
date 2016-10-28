package dia281016;

import java.util.Scanner;

public class InputOutputBasico {

	public InputOutputBasico() {
		System.out.println("Bom Dia\nComo se chama?");
		
		String name;
		
		//Instrumento para leitura do teclado, em linha de comandos
		//Leitura de linha: (new Scanner(System.in)).nextLine();
		//Leitura de numero: (new Scanner(System.in)).nextInt();
		name = (new Scanner(System.in)).nextLine();
	}

}
