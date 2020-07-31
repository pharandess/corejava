package sandeep.com;
import java.util.*;

public class TestCollections2 {

	public static void main(String args[]){	

	ArrayList<Student> al = new ArrayList<Student>();

	Student s1 = new Student(1,"Sandeep","Pharande");
	Student s2 = new Student(2,"Shraddha","Pharande");
	Student s3 = new Student(3,"Saish","Pharande");
	Student s4 = new Student(4,"Supash","Pharande");
	
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);

	Iterator i = al.iterator();
	
	while(i.hasNext()){
		
		System.out.println("*******");
		Student tmp = (Student)i.next();
		tmp.display();
		
	}
	
	System.out.println("******* Printing Again **********");
	
	
	for(Student s:al){
		s.display();
	}
}
}
