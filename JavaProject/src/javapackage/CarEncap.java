package javapackage;

 class Carinfo {
	int tyres= 4;
	String colour= "white";
	float milage= 90;
	public void start() {
		System.out.println("We need keys to start a car");
	}
	public void speed() {
		System.out.println("To increase the speed put more pressure on the right pedal");
	}
	public void slow() {
		System.out.println("To decrease the speed release pressure from the right pedal");
	}
	public void stop() {
		System.out.println("To stop the car use brake pedal");
	}
 }
public class CarEncap{	
	public static void main(String[] args) {
		Carinfo c = new Carinfo();
		System.out.println("Any car has "+c.tyres+" "+"tyres");
		System.out.println("I want "+c.colour+" "+"colour car");
		System.out.println("A good car must give atleast: "+c.milage+" "+"milage");
		System.out.println("--Basic things we must know to operate a Car are--");
		c.start();
		c.speed();
		c.slow();
		c.stop();
		

	}

}