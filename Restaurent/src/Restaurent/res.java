package Restaurent;

import java.util.LinkedList;
import java.util.Scanner;

public class res {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		 selection sel =new selection();
		 coupen cop=new coupen();
		 menu menu=new menu();
		 menu.menus();
		 sel.select(S);
		 int SS=sel.Sum;
		 System.out.println("enter coupen");
		 String op=S.next();
		 cop.coups(op,SS);
		 
		
		
	}


}
class menu {
	public void menus() {
	System.out.println("1.Idly");
	System.out.println("2.Porotta");
	System.out.println("3.Sambar");
	System.out.println("4.Puri");
	System.out.println("5.Chola Puri");
	System.out.println("6.Biriyani");
	System.out.println("7.Curd Rice");
	System.out.println("8.Lemon Rice");
	System.out.println("9.Dosai");
	System.out.println("10.Fried Rice");
	System.out.println("11.Quit");
						}
		}


class price {
	int idly=10,Porotta=40,Sambar=80,Puri=20,Chola_Puri=30,Biriyani=60,Curd_rice=30,Lemon_rice=30,Dosai=20,Fried_rice=50;
	Boolean Quit=false;
			}
class selection extends price {
	Scanner S;
	int Sum=0;
	String order="";
	
	public void select(Scanner S) {
		this.S=S;
		
		
		do{
			System.out.println("Select");
			int select=S.nextInt();
		switch(select) {
		case 1:
		 System.out.println("Idly-10");
		 System.out.println("Quantity");
		 int q=S.nextInt();
		 
		 
		 int al=idly*q;
		 Sum=Sum+al;
		 order=order.concat("\n"+"idly-10"+"\n"+al+"\n"+"Quantity"+"\n"+q);
		 break;
		case 2:
			 System.out.println("Parotta-40");
			 System.out.println("Quantity");
			 int q1=S.nextInt();
			 
			  
			 int ak=Porotta*q1;
			 Sum=Sum+ak;
			 order=order.concat("\n"+"Parotta-40"+"\n"+ak+"\n"+"Quantity"+"\n"+q1);
			 break;
		case 3:
			 System.out.println("Sambar-80");
			 System.out.println("Quantity");
			 int q2=S.nextInt();
			 
			 
			 int aj=Sambar*q2;
			 Sum=Sum+aj;
			 order=order.concat("\n"+"Sambar-80"+"\n"+aj+"\n"+"Quantity"+"\n"+q2);
			 break;	 
		case 4:
			 System.out.println("Puri-20");
			 System.out.println("Quantity");
			 int quan=S.nextInt();
			 
			 
			 int ai=Puri*quan;
			 Sum=Sum+ai;
			 order=order.concat("\n"+"Puri-20"+"\n"+ai+"\n"+"Quantity"+"\n"+quan);
			 break;
		case 5:
			 System.out.println("Chola Puri-30");
			 System.out.println("Quantity");
			 int q3=S.nextInt();
			 
			 
			 int ah=Chola_Puri*q3;
			 Sum=Sum+ah;
			 order=order.concat("\n"+"Clola Puri-30"+"\n"+ah+"\n"+"Quantity"+"\n"+q3);
			 break;
		case 6:
			 System.out.println("Biriyani-60");
			 System.out.println("Quantity");
			 int q4=S.nextInt();
			 
			 
			 int ag=Biriyani*q4;
			 Sum=Sum+ag;
			 order=order.concat("\n"+"Biriyani-60"+"\n"+ag+"\n"+"Quantity"+"\n"+q4);
			 break;
		case 7:
			 System.out.println("Curd rice-30");
			 System.out.println("Quantity");
			 int q5=S.nextInt();
			 
			 
			 int af=Curd_rice*q5;
			 Sum=Sum+af;
			 order=order.concat("\n"+"Curd rice-30"+"\n"+af+"\n"+"Quantity"+"\n"+q5);
			 break;
		case 8:
			 System.out.println("Lemon rice-30");
			 System.out.println("Quantity");
			 int q6=S.nextInt();
			 
			 
			 int ae=Lemon_rice*q6;
			 Sum=Sum+ae;
			 order=order.concat("\n"+"lemon rice-30"+"\n"+ae+"\n"+"Quantity"+"\n"+q6);
			 break;
		case 9:
			 System.out.println("Dosai-20");
			 System.out.println("Quantity");
			 int q7=S.nextInt();
			 
			 
			 int ad=Dosai*q7;
			 Sum=Sum+ad;
			 order=order.concat("\n"+"dosai-20"+"\n"+ad+"\n"+"Quantity"+"\n"+q7);
			 break;
		case 10:
			 System.out.println("fried rice-50");
			 System.out.println("Quantity");
			 int q8=S.nextInt();
			 
			
			 int ac=Fried_rice*q8;
			 Sum=Sum+ac;
			 order=order.concat("\n"+"fried rice-50"+"\n"+ac+"\n"+"Quantity"+"\n"+q8);
			 break;
		case 11:
			 Quit=true;
			 break;
		default:
			System.out.println("Wrong Input");
		
		}
		}while(!Quit);
		System.out.println("Orders are:\n" +order);
		System.out.println("Total amount-----"  +Sum);
									}
	}

class coupen extends selection{
	tax tax=new tax();
	
	public void coups(String W,int Sum)
	{	
	
		LinkedList<String> cou=new LinkedList<String>();
		cou.add("dmi");
		cou.add("abc");
		Boolean g=cou.contains(W);
		if(g==true) 
		{
		Sum=Sum-5;
		System.out.println("Total amount after coupen-----"  +Sum);}
		else if(g==false) {
			System.out.println("invalid (or) no coupen");
			System.out.println("No change in total-----" +Sum);
			}
		tax.taxes(Sum);
		
		
		
	}
	
}
class tax {
	public void taxes(int t) {	
		double tax;
		if(t<=70)
			tax=0;
		else if(t<=140)
			tax=0.1*t;
		else if(t<=280)
			tax=0.2*t;
		else if(t<=560)
			tax=0.3*t;
		else
			tax=0.4*t;
		System.out.println("TAX-----"  +tax);
		int taxval=(int)tax;
		int z=taxval+t;
		System.out.println("Total with tax-----" +z);
		System.out.println("Thank you");
		
		
	}
	
	}