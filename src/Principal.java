
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		//TODO Auto-generated method stub
		System.out.println("Olá Turma");
		
		int quotas = 300, 
			recBaile = 300, 
			recBar = 250;
		
		int totalReceitas = quotas + recBaile + recBar;
		
		int agua = 500,
			luz = 600,
			telefone = 75;
		
		int despesas = agua + luz + telefone;
		int balanco = totalReceitas - despesas;
		
		System.out.println("O valor total de receitas é: " + totalReceitas + "€\nO valor total de despesas é: " + despesas + "€");
		System.out.println("O balanco é: " + balanco + "€... Tas lixado.");
	}

}
