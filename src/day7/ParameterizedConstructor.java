package day7;

public class ParameterizedConstructor {
	int id;
	String name;
	double percentage;
	String collegeName;
	public ParameterizedConstructor()
	{
		id=1;
		name="Yash";
		percentage=100;
		collegeName="LPU";
		
	}
	public ParameterizedConstructor(int id)
	{
		this.id=id;
	}
	public ParameterizedConstructor(String name)
	{
		this.name=name;
	}
	public ParameterizedConstructor(double percentage)
	{
		this.percentage=percentage;
	}
	public ParameterizedConstructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public ParameterizedConstructor(int id,double percentage)
	{
		this.id=id;
		this.percentage=percentage;
	}
	public ParameterizedConstructor(String name,double percentage)
	{
		this.name=name;
		this.percentage=percentage;
	}
	public ParameterizedConstructor(int id,String name,double percentage)
	{
		this.id=id;
		this.name=name;
		this.percentage=percentage;
	}
	public static void printDetail(ParameterizedConstructor obj) 
	{
		
		System.out.println("id: "+obj.id);
		System.out.println("name: "+obj.name);
		System.out.println("percentage: "+obj.percentage);
		System.out.println("collegeName: "+obj.collegeName);
	}
	public static void main(String[] args) 
	{
		ParameterizedConstructor obj = new ParameterizedConstructor();
		ParameterizedConstructor obj1 = new ParameterizedConstructor(2);
		ParameterizedConstructor obj2 = new ParameterizedConstructor("yash");
		ParameterizedConstructor obj3 = new ParameterizedConstructor(99.89);
		ParameterizedConstructor obj4 = new ParameterizedConstructor(3,"yash");
		ParameterizedConstructor obj5 = new ParameterizedConstructor(4,78.99);
		ParameterizedConstructor obj6 = new ParameterizedConstructor("yash",97.98);
		ParameterizedConstructor obj7 = new ParameterizedConstructor(5,"yash",50.33);
		printDetail(obj);
		printDetail(obj1);
		printDetail(obj2);
		printDetail(obj3);
		printDetail(obj4);
		printDetail(obj5);
		printDetail(obj6);
		printDetail(obj7);
		
	}
	
	
	
	
	

}
