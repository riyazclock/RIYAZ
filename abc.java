package myproject;


class abc extends mydemo {
	public void display2() {
		
	}

	public static void main(String[] args) {
		abc a=new abc();
		a.display();
	

	}

  } 
abstract class mydemo{
	public void display() {
		System.out.println("Non abstract method");
	}
	public abstract void display2(); 
	{System.out.println("abstract method");
	}
		

	
}