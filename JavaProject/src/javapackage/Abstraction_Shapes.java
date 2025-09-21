package javapackage;

abstract class Shape {       //has abstract and non-abstarct methods
	int area;
	public abstract void calcArea();  //since its abstract method no need for method definition
	public void show() {             //non-abstract method with method definition
		System.out.println("The area of the shape is " + area);	}
}

class Square extends Shape {
	int side;
	Square(int side){ //constructor
		this.side = side;
	}
	public void calcArea() {
		super.area = side * side;
		System.out.println("The area of the Square is " + super.area);	
	}
}

class Rectangle extends Shape {
	int length;
	int bredth;
	Rectangle(int length, int bredth){
		this.length = length;
		this.bredth = bredth;
	}
	public void calcArea() {
		super.area = length * bredth;
		System.out.println("The area of the Rectangle is " + super.area);	
	}
}
public class Abstraction_Shapes {

	public static void main(String[] args) {
		
		Square sq = new Square(4);
		sq.calcArea();
		
		Rectangle re = new Rectangle(5,4);
		re.calcArea();
		
	}

}