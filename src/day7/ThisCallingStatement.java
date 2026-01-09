package day7;
/*
 * A mobile phone can be initialized with default settings or custom settings.
Create class Mobile with:
	•	String brand
	•	int storage
	•	boolean is5G
Requirements:
	1.	Default constructor sets:
	•	brand = “Unknown”
	•	storage = 64
	•	is5G = false
	2.	Parameterized constructor sets all values.
	3.	Use this() to chain constructors.
 */
public class ThisCallingStatement {
	public static void main(String[] args) {
		Mobile M1 = new Mobile("Apple",256,true);
		System.out.println(M1.brand);
		System.out.println(M1.storage);
		System.out.println(M1.is5G);
	}

}
class Mobile{
	String brand;
	int storage;
	boolean is5G;
	public Mobile() {
		// TODO Auto-generated constructor stub
		brand = "unknown";
		storage=64;
		is5G=false;
	}
	public Mobile(String brand,int storage,boolean is5G)
	{
		this();
		this.brand=brand;
		this.storage=storage;
		this.is5G=is5G;
	}
}