package dia021116;

public class Ciclos {

	public Ciclos() {
		// TODO Auto-generated constructor stub
		de_para();
	}

	public void enquanto(){
		int i = 1;
		System.out.println("I can count to 5 look: ");
		
		while(i <= 5){
			System.out.println("" + i);
			i++;
		}
		System.out.println("hehe xd");
	}
	
	public void fazerEnquanto(){
		int i = 1;
		System.out.println("I can count to 5 look: ");
		
		do{
			System.out.println("" + i);
			i++;
		}
		while(i <= 5);
		System.out.println("hehe xd");
	}
	
	public void de_para(){
		System.out.println("I can count to 5 look: ");
		
		for(int i = 1; i <= 5; i++){
			System.out.println("" + i);
		}
		System.out.println("hehe xd");
	}
	
}
