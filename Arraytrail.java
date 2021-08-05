package myproject;
import java.util.Scanner;
public class Arraytrail {
	public static void main (String args[]) {
		//int n;
		Scanner S=new Scanner(System.in);
		//System.out.println("Enter array size");
		//n=S.nextInt();
		int [] a=new int[5];
		System.out.println("Enter the elements");
		for(int i=0;i<5;i++) {
			a[i]=S.nextInt();
			}
		System.out.println("Display");
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}

}
// or you can use n from user