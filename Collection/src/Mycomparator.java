import java.util.Comparator;

public class Mycomparator implements Comparator {
	
  @Override
  public int compare(Object obj1 , Object obj2) {
	  String i1= obj1.toString();
	  String i2 = obj2.toString();
	   return i1.compareTo(i2);  }
  
}
