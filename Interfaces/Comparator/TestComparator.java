package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestComparator {
	public static void main(String[] args) {
		// creating a list of students:-
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting By Name: ");
		// Using NameComparator to sort the elements:-
		Collections.sort(al, new NameComparator());
		// Traversing the elements of List:-
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println();
		System.out.println("Sorting By Age:");
		// Using AgeComparator to sort the elements:-
		Collections.sort(al, new AgeComparator());
		// Traversing the list Again:-
		for (Student st : al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}// main()
}// TestComparator class
