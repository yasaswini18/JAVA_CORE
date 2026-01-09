package day7;

import java.util.Arrays;

public class CopyConstructor {
	public static void main(String[] args) {
		int[] marks = {99,98,87};
		Student s1 = new Student(1,"Yash",marks);
		Student s2 = new Student(s1);
		int[] newMarks = {100,100,100};
		System.out.println("Details of first student: ");
		System.out.println("id: "+s1.id);
		System.out.println("name: "+s1.name);
		System.out.println("marks: "+Arrays.toString(s1.marks));
		
		System.out.println("Details of copied student: ");
		System.out.println("id: "+s2.id);
		System.out.println("name: "+s2.name);
		System.out.println("marks: "+Arrays.toString(s2.marks));
		
		
		
		
	}

}
class Student{
	int id;
	String name;
	int[] marks = new int[3];
	Student(int id,String name,int[] arr)
	{
		this.id=id;
		this.name=name;
		this.marks=arr;
	}
	Student(Student ref)
	{
		this.id=ref.id;
		this.name=ref.name;
		this.marks=ref.marks;
	}
	
}