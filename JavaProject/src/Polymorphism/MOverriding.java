package Polymorphism;

class Dad{
	int age=55;
	public void profession() {
		System.out.println("Dad is a Farmer");
	}
	
}
class Son extends Dad {
	int age=25;
	public void profession() {
		System.out.println("Son is a Developer");
	}
	
}
public class MOverriding {

	public static void main(String[] args) {
		Son o = new Son();
		Dad d = new Dad();
		System.out.println("Son's age is : "+o.age);
		System.out.println("Dad's age is : "+d.age);
		o.profession();
		d.profession();
		
		
			
	}

}
