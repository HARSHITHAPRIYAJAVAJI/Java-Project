package javapackage;
class Sample{
	Sample(){
		System.out.println("This is a default constructor");
	}
	public void show() {
		System.out.println("This is a  show method ");
		
	}
	Sample(int a) {
		System.out.println("Parameterised constructor");
		System.out.println("My age is " + a);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Sample obj =new Sample();
		obj.show();
		Sample pc = new Sample(20);
		
	}

}

		
