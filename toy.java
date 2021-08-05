package myproject;
//import java.util.Scanner;
public class toy {

	public static void main(String[] args) {
	//int a;
	//String b;
	kill k=new kill();
	//Scanner S=new Scanner(System.in);
	//a=S.nextInt();
	//b=S.next();
	k.insert(7,"jill"); //k.insert(a,b);
	k.display();
	}

}
class kill{
	int Sage;
	String Sname;
	void insert(int age,String name)
	{Sname=name;
	Sage=age;}
	void display() {
		System.out.println(Sname);
		System.out.println(Sage);
	}
}