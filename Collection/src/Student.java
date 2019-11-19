
public class Student implements Comparable {
	 int rollnum;
	 Student(int rollnum){
		 this.rollnum =rollnum;
	 }
	   
	 @Override
	 
	 public String toString() {
		return rollnum +" ";
		 
	 }
	 @Override
	 public int compareTo(Object obj) {
		 Student iobj = (Student)obj;
		 if(this.rollnum > iobj.rollnum) return 1; 
		 if(this.rollnum <iobj.rollnum) return -1;
		    else                   return 0;
	 }
	 
	 
}
