package dia09112016;

public class GolosDaLiga {

	public GolosDaLiga() {
		// Apresentar jogos e golos marcados e sofridos dentro e fora de casa
		
		int[] vGuimaraesNacional = {2, 1};
		int[] estorilTondela = {2, 0};
		int[] pFerreiraChaves = {1, 1};
		int[] feirenseBelenenses = {0, 1};
		int[] rioAveBoavista = {1, 2};
		int[] moreirenseVSetubal = {1, 2};
		int[] portoBenfica = {1, 1};
		int[] sportingArouca = {3, 0};
		int[] maritimoSpBraga = {1, 0};
		
		int[][] golosJogos = new int[9][2];
		golosJogos[0][0] = vGuimaraesNacional[0];
		golosJogos[0][1] = vGuimaraesNacional[1];
		golosJogos[1][0] = estorilTondela[0];
		golosJogos[1][1] = estorilTondela[1];
		golosJogos[2][0] = pFerreiraChaves[0];
		golosJogos[2][1] = pFerreiraChaves[1];
		golosJogos[3][0] = feirenseBelenenses[0];
		golosJogos[3][1] = feirenseBelenenses[1];
		golosJogos[4][0] = rioAveBoavista[0];
		golosJogos[4][1] = rioAveBoavista[1];
		golosJogos[5][0] = moreirenseVSetubal[0];
		golosJogos[5][1] = moreirenseVSetubal[1];
		golosJogos[6][0] = portoBenfica[0];
		golosJogos[6][1] = portoBenfica[1];
		golosJogos[7][0] = sportingArouca[0];
		golosJogos[7][1] = sportingArouca[1];
		golosJogos[8][0] = maritimoSpBraga[0];
		golosJogos[8][1] = maritimoSpBraga[1];
		
	}

}
