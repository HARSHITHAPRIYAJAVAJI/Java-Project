package Polymorphism;
class Add{
	public void add() {
		System.out.println("--This is Method Overloading--");
		
	}
	public void add(int a,int b) {
		System.out.println(a+b);
		
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b);
		
	}
	public void add(double a,double b) {
		System.out.println(a+b);
		
	}
	
}

public class MOverloading {

	public static void main(String[] args) {
		Add obj= new Add();
		obj.add();
		obj.add(3,4);
		obj.add(5,3,4);
		obj.add(2.3,5.6);
		
		

	}

}
