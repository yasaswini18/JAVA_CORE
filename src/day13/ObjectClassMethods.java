package day13;

public class ObjectClassMethods {
public static void main(String[] args) {
	P7 obj = new P7(1,"Yash");
	System.out.println(obj);
	System.out.println(obj.toString());
	System.out.println(obj.hashCode()); //prints integer
	System.out.println(Integer.toHexString(obj.hashCode()));
	System.out.println(obj.getClass());
	System.out.println(obj.getClass().getName());
	
}
}
class P7{
	int id;
	String name;
	public P7(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
//	@Override
//	public String toString() {
//		return "P7 [id=" + id + ", name=" + name + "]";
//	}
	

	
}
