package day2;

import java.util.Scanner;
public class TravelTicketBookingAndFairProcessingSystem {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter passenger ID: ");
		int id = sc.nextInt();
		System.out.print("Enter passenger name: ");
		String name = sc.next();
		System.out.print("Enter passenger age: ");
		int age = sc.nextInt();
		if(age<5)
		{
			System.out.println("Free ticket - No booking required");
			
		}else if(age>80)
		{
			System.out.println("Medical clearance required");
		}else {
		System.out.print("Enter choice of travel 1-bus 2-train 3-flight");
		String travel_Type = "";
		String travel_class ="";
		double multiplier = 1;
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : 
			travel_Type="Bus";
			System.out.print("Enter type of booking 1-sleeper 2-seater");
			int type1 = sc.nextInt();
			switch(type1)
			{
			case 1:
				travel_class="sleeper";
				multiplier=1.2;
				break;
			case 2:
				travel_class="seater";
				multiplier=1.0;
				break;
			default:
				System.out.println("Invalid");
			}
			break;
		case 2:
			travel_Type="Train";
			System.out.print("Enter type of booking 1-general 2-sleeper 3-AC");
			int type2 = sc.nextInt();
			switch(type2)
			{
			case 1:
				travel_class="general";
				multiplier=1.0;
				break;
			case 2:
				travel_class="sleeper";
				multiplier=1.3;
				break;
			case 3:
				travel_class="AC";
				multiplier=1.6;
				break;
			default:
				System.out.println("Invalid");
			}
			break;
		case 3:
			travel_Type="Flight";
			System.out.print("Enter type of booking 1-Economy 2-Business");
			int type3 = sc.nextInt();
			switch(type3)
			{
			case 1:
				travel_class="Economy";
				multiplier=2.5;
				break;
			case 2:
				travel_class="Business";
				multiplier=3.5;
				break;
			default:
				System.out.println("Invalid");
			}
			break;
		default:
			System.out.println("Invalid");
		}
		System.out.print("Enter the base fare: ");
		double base_fare = sc.nextDouble();
		System.out.print("Are you a Government Employee: True/False");
		boolean govt_Employee = sc.nextBoolean();
		double fare_after_class = base_fare*multiplier;
		double final_fare = 0;
		String booking_status="";
		double discount = 0;
		if(age>=60)
		{
			discount=fare_after_class*30/100;
			final_fare = (fare_after_class)-(discount);
		}else if(govt_Employee)
		{
			discount=fare_after_class*15/100;
			final_fare = (fare_after_class)-(discount);
		}else if(age>5 && age<12)
		{
			discount=fare_after_class*50/100;
			final_fare=(fare_after_class)-(discount);
		}else {
			final_fare = fare_after_class;
		}
		if(final_fare>=10000)
		{
			if(travel_Type.equals("Flight"))
			{
				booking_status="Confirmed";
			}else {
				booking_status="Waiting List";
			}
		}else {
			booking_status="Confirmed";
		}
		System.out.println("Passenger Details: ");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Travel Type: "+travel_Type);
		System.out.println("Class: "+travel_class);
		System.out.println("Base Fare: "+base_fare);
		System.out.println("Final Fare: "+final_fare);
		System.out.println("Discount: "+discount);
		System.out.println("Booking status: "+booking_status);
		
		
		
		}
	}
}
