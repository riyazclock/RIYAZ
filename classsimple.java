package myproject;
import java.util.Scanner;
public class classsimple {

	public static void main(String[] args) {
	Scanner S=new Scanner(System.in);
	hero h=new hero();
	h.n=S.nextInt();
	h.m=S.nextInt();
	System.out.println(h.n);
	System.out.println(h.m);
	}

}
class hero{
	int n;
	int m;
}