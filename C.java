package myproject;
import second.A;
import second.B;
public class C implements A,B {



	public void msg() {
		A.super.msg();
		B.msg();
	}

	public static void main(String[] args) {
	C v=new C();
	v.msg();
	
	}

}
