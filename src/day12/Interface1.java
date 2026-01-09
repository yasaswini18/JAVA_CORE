package day12;
/*
 * 1. Create a base class Person with method:
	showRole() → prints "I am a person"

2. Create two child classes:
	Student extends Person
	Teacher extends Person

3. Create two interfaces:
	Sports → method play()
	Cultural → method perform()

4. Create a class CollegeStudent that:
	Extends Student
	Implements both Sports and Cultural

5. In main():
	Create object of CollegeStudent
	Call all methods
 */
public class Interface1 {

}
class Person{
	public void showRole() {
		System.out.println("I am a person");
	}
}
