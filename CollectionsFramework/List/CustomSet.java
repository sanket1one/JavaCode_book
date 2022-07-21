import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class CustomSet {
	public static void main(String args[]) {
		Set<Student> student = new HashSet<>();
		
		student.add(new Student("sanket", 52));
		student.add(new Student("tejas", 1));
		student.add(new Student("ubed", 55));
		student.add(new Student("aniket", 54));
		student.add(new Student("sanket", 1));
		
		Student s1 = new Student("Anuj", 2);
		Student s2 = new Student("Rohit", 3);
		
		System.out.println(s1.compareTo(s2));
			
		
//		System.out.println(student); // it is printing the student object
	}
}

class Student implements Comparable<Student>{
	
	String name;
	int rollNo;
	
	public Student(String name, int rollNo) 
	{
		this.name = name;
		this.rollNo = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student{" +" name ' " + name + '\'' + 
				", rollNo=" + rollNo + '}';
	}
	
	@Override
	public boolean equals(Object o) {
		//boiler plate
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
 		Student student = (Student) o;
 		
 		
		return rollNo == student.rollNo;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	
	@Override
	public int compareTo(Student that) {
		
		return this.rollNo - that.rollNo;
//		return this.name.compareTo(that.name);
	}
	
	
	  
}
