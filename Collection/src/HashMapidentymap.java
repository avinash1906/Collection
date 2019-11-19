import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashMapidentymap {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(20);
        Integer i111 = 50;
		Integer i211 = 50;
		m.put(i1, "hi");
		m.put(i2, "hello ");
		m.put(i111, "  hi i111 ");
		m.put(i211, "hello i22");
		System.out.println(m);

		System.out.println("================identity ============");
		IdentityHashMap m1 = new IdentityHashMap();

		Integer i11 = new Integer(20);
		Integer i21 = new Integer(20);
    
		Integer i4 = 60;
		Integer i5 = 60;
		
		m1.put(i11, "hi ansu 11");
		m1.put(i21, "hello ansu  21");
		m1.put(i4, "hi aansu 4");
		m1.put(i5, "hello india 5");
		System.out.println(m1);

	}
}
