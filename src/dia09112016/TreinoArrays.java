package dia09112016;

import java.util.Scanner;

public class TreinoArrays {

	public TreinoArrays() {
		
		int killsTSM = 0, killsSKT = 0, killsFnatic = 0, killsCLG = 0 , jogo = 1;
		
		// N. de kills por jogo
		// Tipo de varável; [] Array; Nome de variável; Tamanho; Inicialização
		// TSM - SKT
		int[] tsmSKT1 = new int [2];
		int[] tsmSKT2 = new int [2];
		int[] tsmSKT3 = new int [2];
		int[] fnaticCLG1 = new int [2];
		int[] fnaticCLG2 = new int [2];
		int[] fnaticCLG3 = new int [2];
		
		for(int i=1; i<=6; i++){
			switch (i){
				case 1:
					System.out.println("Jogo " + jogo + " TSM - SKT");
					System.out.print("Introduza a quantidade de kills dos TSM: ");
					killsTSM = (new Scanner(System.in)).nextInt();
					
					tsmSKT1[0] = killsTSM;
				break;
				
				case 2:
					System.out.print("Introduza a quantidade de kills dos SKT: ");
					killsSKT = (new Scanner(System.in)).nextInt();
					tsmSKT1[1] = killsSKT;
					jogo++;
				break;
				
				case 3:
					System.out.println("\n\nJogo " + jogo + " TSM - SKT");
					System.out.print("Introduza a quantidade de kills dos TSM: ");
					killsTSM = (new Scanner(System.in)).nextInt();
					tsmSKT2[0] = killsTSM;
				break;
				
				case 4:
					System.out.print("Introduza a quantidade de kills dos SKT: ");
					killsSKT = (new Scanner(System.in)).nextInt();
					tsmSKT2[1] = killsSKT;
					jogo++;
				break;
				
				case 5:
					System.out.println("\n\nJogo " + jogo + " TSM - SKT");
					System.out.print("Introduza a quantidade de kills dos TSM: ");
					killsTSM = (new Scanner(System.in)).nextInt();
					tsmSKT3[0] = killsTSM;
				break;
				
				case 6:
					System.out.print("Introduza a quantidade de kills dos SKT: ");
					killsSKT = (new Scanner(System.in)).nextInt();
					tsmSKT3[1] = killsSKT;
					jogo=1;
				break;
			}
		}
		
		// Fnatic-CLG
		for(int i=1; i<=6; i++){
			switch (i){
				case 1:
					System.out.println("\n\n\nJogo " + jogo + " Fnatic - CLG");
					System.out.print("Introduza a quantidade de kills dos Fnatic: ");
					killsFnatic = (new Scanner(System.in)).nextInt();
					fnaticCLG1[0] = killsFnatic;
				break;
				
				case 2:
					System.out.print("Introduza a quantidade de kills dos CLG: ");
					killsCLG = (new Scanner(System.in)).nextInt();
					fnaticCLG1[1] = killsCLG;
					jogo++;
				break;
				
				case 3:
					System.out.println("\n\nJogo " + jogo + " Fnatic - CLG");
					System.out.print("Introduza a quantidade de kills dos Fnatic: ");
					killsFnatic = (new Scanner(System.in)).nextInt();
					fnaticCLG2[0] = killsFnatic;
				break;
				
				case 4:
					System.out.print("Introduza a quantidade de kills dos CLG: ");
					killsCLG = (new Scanner(System.in)).nextInt();
					fnaticCLG2[1] = killsCLG;
					jogo++;
				break;
				
				case 5:
					System.out.println("\n\nJogo " + jogo + " Fnatic - CLG");
					System.out.print("Introduza a quantidade de kills dos Fnatic: ");
					killsFnatic = (new Scanner(System.in)).nextInt();
					fnaticCLG3[0] = killsFnatic;
				break;
				
				case 6:
					System.out.print("Introduza a quantidade de kills dos CLG: ");
					killsCLG = (new Scanner(System.in)).nextInt();
					fnaticCLG3[1] = killsCLG;
				break;
			}
		}
		
		/*
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 * [][]
		 */
		
		int[][] killsJogo = new int[6][2];
		killsJogo[0][0] = tsmSKT1[0]; // kills TSM
		killsJogo[0][1] = tsmSKT1[1]; // kills SKT
		killsJogo[1][0] = tsmSKT2[0];
		killsJogo[1][1] = tsmSKT2[1];
		killsJogo[2][0] = tsmSKT3[0];
		killsJogo[2][1] = tsmSKT3[1];
		killsJogo[3][0] = fnaticCLG1[0]; // kills Fnatic
		killsJogo[3][1] = fnaticCLG1[1]; // kills CLG
		killsJogo[4][0] = fnaticCLG2[0];
		killsJogo[4][1] = fnaticCLG2[1];
		killsJogo[5][0] = fnaticCLG3[0];
		killsJogo[5][1] = fnaticCLG3[1];
		
		for(int i=0; i < 6; i++){
			for(int j=0; j < 2; j++){
				if (i < 3){
					if (j % 2 == 0){
						System.out.print("Kills de cada equipa no jogo " + (i + 1) + " de TSM - SKT: " + killsJogo[i][j]);
					}
					else
						System.out.println(" - " + killsJogo[i][j]);
				}
				else{
					if (j % 2 == 0){
						System.out.print("Kills de cada equipa no jogo " + (i - 2) + " de Fnatic - CLG: " + killsJogo[i][j]);
					}
					else
						System.out.println(" - " + killsJogo[i][j]);
				}
			}
		}
	}

}
