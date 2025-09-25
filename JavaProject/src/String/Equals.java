package String;

public class Equals {
	    static String s = "bunny"; // literal
	    static String S = new String("bunny"); // object
	    static String messy = "   Hello World!   "; // for trim

	public static void main(String[] args) {
		
		        System.out.println("We have a string: " + S);
		        System.out.println("The other string is: " + s);
		        System.out.println(s.equals(S));//same characters 
		        System.out.println(s==S);//memory location of the values
		        
		       
	}

}
