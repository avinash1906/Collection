import java.util.TreeSet;

public class StringBufferConvert {
 public static void main(String[] args) {
	@SuppressWarnings("unchecked")
	TreeSet s = new TreeSet(new Mycomparator());
	s.add(new StringBuffer("K"));
	s.add(new StringBuffer("A"));
	s.add(new StringBuffer("Z"));
	s.add(new StringBuffer("V"));
	
	System.out.println(s);

}
}
