package Array;

public class StaicDynamic {
	public static void main(String[] args) {
		int[] stat = new int[5];
		stat[0]=1;
		stat[1]=2;
		stat[2]=3;
		stat[3]=4;
		stat[4]=5;
		System.out.println("---Static Array---");
		for(int x:stat) {
			System.out.println(x);
		}
		int[] dyn = {101,102,103,104};
		System.out.println("---Dynamic Array---");
		for(int y:dyn) {
			System.out.println(y);
		}
	}

}
