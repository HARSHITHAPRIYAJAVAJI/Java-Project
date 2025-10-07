package Loops;

public class While_loop {
	int num=123;
	While_loop() {
	while(num!=0) {
		System.out.println("Actual number"+num);
		num=num/10;
		System.out.println(num);
	}
	}
	public static void main(String[] args) {
		While_loop f = new While_loop();

	}

}
