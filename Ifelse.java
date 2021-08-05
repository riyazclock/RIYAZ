package myproject;
import java.util.Scanner;
public class Ifelse {

	public static void main(String[] args) {
		int a;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your age");
		a=S.nextInt();
		if(a>18){
			System.out.println("Eligible");
		}
		else if(a==18) {
			System.out.println("super eligible");
			}
		else {System.out.println("not");}

	}

}
