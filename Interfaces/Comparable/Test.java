package Comparable;

//example of a Comparable interface that sorts the list elements on the basis of age
import java.util.ArrayList;
import java.util.Collections;

//Java Program to demonstrate the use of Java Comparable.  
//Creating a class which implements Comparable Interface
class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	// Alt shift : s and o : for constructors
	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	// Implementing compareTo():-
	@Override
	public int compareTo(Student st) {
		if (age == st.age)
			return 0;
		else if (age > st.age)
			return 1;
		else
			return -1;
	}

}// Student class

// Creating a test class to sort the elements
public class Test {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}// main()
}// Test class
