
public class ExercicioBalanco {
	
	int receitas;
	int despesas;
	
	public ExercicioBalanco() {
				
			calcularReceitas();
			calcularDespesas();		
			
			int balanco = receitas - despesas;
			
			System.out.println("O valor total de receitas é: " + receitas + "€\nO valor total de despesas é: " + despesas + "€");
			System.out.println("O balanco é: " + balanco + "€... Tas lixado.");
	}
	
	public void calcularReceitas(){
		int quotas = 300, 
			recBaile = 300, 
			recBar = 250;
			
		receitas = quotas + recBaile + recBar;
	}
	
	public void calcularDespesas(){
		int agua = 500,
			luz = 600,
			telefone = 75;
			
		despesas = agua + luz + telefone;
	}
}
