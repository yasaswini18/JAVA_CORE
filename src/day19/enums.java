package day19;

enum Student_Names{
	Aditya,Devansh,Vishnu,Animesh,Mohit,Pawan,Nitish,Kabir;

}
public class enums {
public static void main(String[] args) {
	System.out.println(Student_Names.Aditya.name());   //returns name
	System.out.println(Student_Names.Aditya.ordinal()); // returns index
	
	System.out.println("All values of enum");
	Student_Names[] names =  Student_Names.values();
	for(Student_Names name :  names)
	{
		System.out.println(name);
	}
	
	String find = "Aditya";
	Student_Names f = Student_Names.valueOf(find);
	for(Student_Names name : names) {
		if(f==name)
		{
			System.out.println(name+" is present");
		}
	}
}
}
