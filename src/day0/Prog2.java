package day0;
//swap without third variable
class Prog2
{
public static void main(String[] args)
{
int a = 3;
int b = 5;
a=a+b;
b=a-b;
a=a-b;
System.out.println("swap without third variable : "+a+" "+b);

}
}