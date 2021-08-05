package myproject;
import java.util.Scanner;
public class inher extends tree{

	public static void main(String[] args) {
	int a,c,d;
	tree I=new tree();
	Scanner S=new Scanner(System.in);
	System.out.println("Enter first number:");
	c=S.nextInt();
	System.out.println("Enter Second number:");
	d=S.nextInt();
	I.plus(c,d);
	I.add();
		
		

	}

}
/**class inher2{
	int first;
	int second;
	int p;
	void plus(int x,int y) {
	first=x;
	second=y;
	p=first+second;
	}
	void add() {
		System.out.println("Addition of two numbers:"+p);
	}
	
	}**/
	