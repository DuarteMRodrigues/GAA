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
			System.out.print("Os n�meros s�o iguais!");
		}
		else if(num1 < num2){
			System.out.print("O n�mero 1 � menor que o n�mero 2!");
		}
		else
			System.out.print("O n�mero 1 � maior que o n�mero 2!");
	}
	
	public void comparadorMultiVariavel(){
		int num1 = 5,
				num2 = 7,
				num3 = 3,
				num4 = 8;
		
		if(num1 > num2 && num1 > num3 && num1 > num4){
			System.out.print("O n�mero 1 � o maior");
		}
		else if(num2 > num1 && num2 > num3 && num2 > num4){
			System.out.print("O n�mero 2 � o maior");
		}
		else if(num3 > num1 && num3 > num2 && num3 > num4){
			System.out.print("O n�mero 3 � o maior");
		}
		else if(num4 > num1 && num4 > num2 && num4 > num3){
			System.out.print("O n�mero 4 � o maior");
		}
	}

}
