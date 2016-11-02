package dia021116;

public class Condicionais {

	public Condicionais() {
		// TODO Auto-generated constructor stub
		//comparadorSimples();
		comparadorMultiVariavel();
	}
	
	public void comparadorSimples(){
		int num1 = 4;
		int num2 = 3;
		
		if(num1 == num2){
			System.out.print("Os números são iguais!");
		}
		else if(num1 < num2){
			System.out.print("O número 1 é menor que o número 2!");
		}
		else
			System.out.print("O número 1 é maior que o número 2!");
	}
	
	public void comparadorMultiVariavel(){
		int num1 = 5,
				num2 = 7,
				num3 = 3,
				num4 = 8;
		
		if(num1 > num2 && num1 > num3 && num1 > num4){
			System.out.print("O número 1 é o maior");
		}
		else if(num2 > num1 && num2 > num3 && num2 > num4){
			System.out.print("O número 2 é o maior");
		}
		else if(num3 > num1 && num3 > num2 && num3 > num4){
			System.out.print("O número 3 é o maior");
		}
		else if(num4 > num1 && num4 > num2 && num4 > num3){
			System.out.print("O número 4 é o maior");
		}
	}

}
