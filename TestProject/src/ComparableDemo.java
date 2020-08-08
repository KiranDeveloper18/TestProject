import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>  //it is compulsory to implement the comparable interface in sorting the objects in collection.
{
	int rollno,marks;
	String name;
	 
	public Student(int rollno , int marks, String name)
	{
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}
	
	
	@Override
	public String toString()              
	{
		return "Student [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	public int compareTo(Student s)     // this is the method of comparable 
	{
		return rollno>s.rollno?1:-1;
	}

}
public class ComparableDemo
{

	public static void main(String[] args) 
	{
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(28, 95, "Uday"));
		studs.add(new Student(34, 98, "Harsh"));
		studs.add(new Student(45, 75, "Sai"));
		studs.add(new Student(12, 82, "Narendra"));

		Collections.sort(studs);  // this is for sorting
		
        for (Student s : studs)   //enhanced for loop
        {
        	System.out.println(s);
        }
	}

}
