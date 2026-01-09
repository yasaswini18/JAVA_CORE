package day0;
//printing all primitive types values and types
class Prog6
{
public static void main(String[] args)
{
byte a = 3;
short b = 4;
int c = 44;
long d = 345;
float e = 4.5f;
double f = 55.777888;
boolean g = true;
char h = 'y';
System.out.println("Value of a is "+a+" of type "+ ((Object)a).getClass().getSimpleName());
System.out.println("Value of b is "+b+" of type "+ ((Object)b).getClass().getSimpleName());
System.out.println("Value of c is "+c+" of type "+ ((Object)c).getClass().getSimpleName());
System.out.println("Value of d is "+d+" of type "+ ((Object)d).getClass().getSimpleName());
System.out.println("Value of e is "+e+" of type "+ ((Object)e).getClass().getSimpleName());
System.out.println("Value of f is "+f+" of type "+ ((Object)f).getClass().getSimpleName());
System.out.println("Value of g is "+g+" of type "+ ((Object)g).getClass().getSimpleName());
System.out.println("Value of h is "+h+" of type "+ ((Object)h).getClass().getSimpleName());
}
}