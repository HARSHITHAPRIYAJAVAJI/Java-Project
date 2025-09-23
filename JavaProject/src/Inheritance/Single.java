package Inheritance;
class A{
	public void sum() {
		System.out.println("Iam Father");
	}
}
class B extends A{
	public void some() {
		System.out.println("Iam Child");
	}
	
}
public class Single {

	public static void main(String[] args) {
		B obj = new B();
		obj.sum();
		obj.some();

	}

}
