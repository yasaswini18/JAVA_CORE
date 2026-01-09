package day12;
/*
 * Write a Java program to create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) 
 * that allow an object to be resized. 
 * Create a class Rectangle that implements the Resizable interface and implements the resize methods.

### Explanation:

1. *Resizable Interface:*
   - The Resizable interface is defined with two methods: resizeWidth(int width) and resizeHeight(int height).

2. *Rectangle Class:*
   - The Rectangle class implements the Resizable interface.
   - It has private fields width and height to store the dimensions of the rectangle.
   - The class constructor initializes these fields.
   - Getter methods getWidth() and getHeight() are provided to access the dimensions.
   - The resizeWidth and resizeHeight methods are overridden to update the dimensions of the rectangle and print the new dimensions.
   - The toPrint method is to return a string representation of the rectangle's dimensions.

3. *Main Class:*
   - In the main method, a Rectangle object is created with initial dimensions.
   - The initial dimensions are printed.
   - The resizeWidth and resizeHeight methods are called to change the dimensions.
   - The updated dimensions are printed.
 */
public class Interface2 {
	public static void main(String[] args) {
		Resizable r = new Rectangle(10,20);
		r.resizeWidth(30);
		r.resizeHeight(40);
		Rectangle s = (Rectangle)r;
				
		System.out.println(s.toPrint());
	}

}
interface Resizable{
	void resizeWidth(int width);
	void resizeHeight(int height);
}
class Rectangle implements Resizable{
	private double width;
	private double height;
	Rectangle(double width,double height)
	{
		this.width=width;
		this.height=height;
	}
	public double getWidth()
	{
		return width;
}

	public double getHeight()
	{
		return height;
	}
	
	public void resizeWidth(int width)
	{
		this.width=width;
	}
	@Override 
	public void resizeHeight(int height)
	{
		this.height=height;
	}
	public String toPrint()
	{
		return "height: "+height+"\nwidth: "+width;
	}
}