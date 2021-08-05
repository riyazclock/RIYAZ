package myproject;
interface yellow{
public void disp();
}
class red implements yellow{
	public void disp() {
		System.out.println("abs met");
	}
public static void main(String[] args) {
	red r=new red();
	r.disp();
}

}
