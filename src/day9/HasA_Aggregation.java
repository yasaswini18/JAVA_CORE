package day9;

public class HasA_Aggregation {
	public static void main(String[] args)
	{
		Address ad = new Address("Jalandhar","Punjab");
		Student s = new Student(1,"yash",99,ad);
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.marks);
		System.out.println(s.address.city);
		System.out.println(s.address.state);
		
	}

}
class Address{
	String city;
	String state;
	public Address(String city,String state) {
		// TODO Auto-generated constructor stub
		this.city=city;
		this.state=state;
	}
}
class Student{
	int id;
	String name;
	double marks;
	Address address;
	public Student(int id,String name,double marks,Address address) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.marks=marks;
		this.address= address;
	}
}
