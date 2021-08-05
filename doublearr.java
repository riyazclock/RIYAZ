package myproject;
import java.util.Scanner;
public class doublearr {
public static void main (String args[]) {
	int [][] a= new int[2][2];
	Scanner S =new Scanner(System.in);
	System.out.println("Enter");
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			a[i][j]=S.nextInt();
			}}	
	
	
	for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
			System.out.println(a[i][j]+"  ");
		}System.out.println();
	}
	
}
}
