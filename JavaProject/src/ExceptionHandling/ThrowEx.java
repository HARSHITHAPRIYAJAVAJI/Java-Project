package ExceptionHandling;

public class ThrowEx {

	public static void main(String[] args){
		int age=4;
		if(age<18) {
			throw new ArithmeticException("Not Eligible");
			
		}
		else {
			throw new ArithmeticException("Eligible");
		}

	}

}
