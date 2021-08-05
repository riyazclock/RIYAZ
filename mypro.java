package myproject;
import java.util.Scanner;
public class mypro {

	public static void main(String[] args) {
		int a,b,c;
		Scanner S=new Scanner(System.in);
		System.out.println("enter value of a");
		a=S.nextInt();
		System.out.println("enter value of b");
		b=S.nextInt();
		c=a+b;
		System.out.println("Add = "+c);
	}

}
