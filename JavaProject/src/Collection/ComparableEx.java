package Collection;
import java.util.ArrayList;
import java.util.Collections;


class Comp implements Comparable<Comp> {
	private String Name;
	private int RollNo;
	private int Marks;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return RollNo;
	}
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Comp [Name: " + Name + ", RollNo: " + RollNo + ", Marks: " + Marks + "]";
	}
	public Comp(String Name, int RollNo, int Marks) {
		super();
		this.Name = Name;
		this.RollNo = RollNo;
		this.Marks = Marks;
	}
	public int compareTo(Comp o) {
		if(this.getMarks() > o.getMarks())
			return 1;
		else
			return -1;
	}
}
public class ComparableEx {

	public static void main(String[] args) {
		ArrayList<Comp> al = new ArrayList<Comp>();
        al.add(new Comp("Bunny", 101, 978));
        al.add(new Comp("Pinky", 102, 981));
        al.add(new Comp("Bablu", 103, 975));

        // Sort using Comparable
        Collections.sort(al);

        // Print sorted list
        for (Comp c : al) {
            System.out.println(c);
        }
	}

}