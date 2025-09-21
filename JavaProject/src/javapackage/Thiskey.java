package javapackage;
class This{
	int a=3;
	public void Some(){
		int a =5;
		System.out.println("Local variable:"+" "+a);
		System.out.println("Instance variable:"+" "+this.a);
		
		
	}
}
public class Thiskey {

	public static void main(String[] args) {
		This key=new This();
		key.Some();

	}

}
