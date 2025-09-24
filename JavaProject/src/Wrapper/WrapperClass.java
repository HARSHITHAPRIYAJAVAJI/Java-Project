package Wrapper;

	
public class WrapperClass {
	public static void main(String[] args) {
	int i=5;
	Integer i1= i; //Auto boxing
	int i2 = i1;    //Auto unboxing
	System.out.println("-Integer-");
	System.out.println("Autoboxing of int type: " + i1);		
	System.out.println("Autounboxing of Integer class: " + i2);
	
	byte b = 1;
	Byte b1 = b; //Auto boxing
	byte b2 = b1; //Auto unboxing
	System.out.println("-Byte-");
	System.out.println("Autoboxing of byte type: " + b1);		
	System.out.println("Autounboxing of Byte class: " + b2);
	
	short s = 12;
	Short s1 = s; //Auto boxing
	short s2 = s1; //Auto unboxing
	System.out.println("-Short-");
	System.out.println("Autoboxing of short type: " + s1);		
	System.out.println("Autounboxing of Short class: " + s2);
	
	long l = 123;
	Long l1 = l; //Auto boxing
	long l2 = l1; //Auto unboxing
	System.out.println("-Long-");
	System.out.println("Autoboxing of long type: " + l1);		
	System.out.println("Autounboxing of long class: " + l2);
	
	float f = 12.9f;
	Float f1 = f; //Auto boxing
	float f2 = f1; //Auto unboxing
	System.out.println("-Float-");
	System.out.println("Autoboxing of float type: " + f1);		
	System.out.println("Autounboxing of Float class: " + f2);
	
	double d = 12.96;
	Double d1 = d; //Auto boxing
	double d2 = d1; //Auto unboxing
	System.out.println("-Double-");
	System.out.println("Autoboxing of double type: " + d1);		
	System.out.println("Autounboxing of Double class: " + d2);
	
	char c = 'r';
	Character c1 = c; //Auto boxing
	char c2 = c1; //Auto unboxing
	System.out.println("-Character-");
	System.out.println("Autoboxing of char type: " + c1);		
	System.out.println("Autounboxing of Character class: " + c2);
	
	boolean n = true;
	Boolean n1 = n; //Auto boxing
	boolean n2 = n1; //Auto unboxing
	System.out.println("-Boolean-");
	System.out.println("Autoboxing of boolean type: " + n1);		
	System.out.println("Autounboxing of Boolean class: " + n2);
	
	
	}

}
