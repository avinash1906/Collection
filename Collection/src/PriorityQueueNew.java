import java.util.PriorityQueue;

public class PriorityQueueNew {
public static void main(String[] args) {
	PriorityQueue pq = new PriorityQueue();
	
	pq.add("a");
	pq.add("v");
	pq.add("i");
	pq.add("n");
	pq.add("a");
	pq.add("n");
	pq.add("s");
	pq.add("h");
	System.out.println(pq);
	
	System.out.println("peek :"+ pq.remove());
	System.out.println("peek :"+ pq.poll());
	System.out.println("peek :"+ pq);
	
//	System.out.println(pq);
//	
//	System.out.println("poll  :"+pq.poll());
//	System.out.println(pq);
//	System.out.println("Element  :"+pq.element());
//	System.out.println(pq);
//	System.out.println("remove  :"+pq.remove());
//	System.out.println(pq);
}
}
