import java.util.Set;
import java.util.TreeSet;



public class DemoTree {
public static void main(String[] args) {
	
	
	Set<Student> t = new TreeSet<Student>();
	t.add(new Student(15));
	t.add(new Student(87));
	t.add(new Student(10));
	t.add(new Student(4));
	t.add(new Student(20));
	
	System.out.println(t);
}

}
