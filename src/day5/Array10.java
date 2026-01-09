package day5;

/*
 * SmartTracker App – Daily Sales and Weather Insights
Welcome to the world of SmartTracker, a digital assistant used by small shop owners and local weather stations.
The app stores and analyzes daily sales and temperature data using arrays — helping users make smarter business and lifestyle decisions.

Through this scenario, you’ll learn how 1D arrays can make data tracking and analysis efficient, accurate, and automated.

Background Story
You’ve been hired as a Java developer for SmartTracker Labs, a startup creating intelligent dashboards for community businesses.
Your job is to write a Java module that analyzes:

Shop sales over 7 days
Temperature patterns for the same week
Using arrays and methods, you’ll design algorithms that process, search, and update data — much like what real apps do behind the scenes.

Data Setup
int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
Each array represents a week’s worth of data — from Monday to Sunday.

Activity 1 – Average Temperature
Goal: Find the average weekly temperature.
Use a method to sum all values and divide by the total number of days.

Expected Output:
Average Temperature: 30.3°C


Activity 2 – Hottest and Coldest Day
Goal: Identify the highest and lowest recorded temperatures.
Bonus: Try to print which day (e.g., Day 5) had those temperatures.

Expected Output:
Highest Temperature: 35°C
Lowest Temperature: 27°C


Activity 3 – Count Hot Days
Goal: Count how many days the temperature was above 30°C.

Expected Output:
Number of hot days (>30°C): 3


Activity 4 – Total and Average Sales
Goal: Calculate total revenue and average daily sales using array traversal.

Expected Output:
Total Sales: 825
Average Sales: 117.86


Activity 5 – Record-Breaking Sales
Goal: Identify the highest and lowest sales of the week and the days they occurred.

Expected Output:
Highest Sale: 200 on Day 5
Lowest Sale: 75 on Day 6


Activity 6 – Count High-Sales Days
Goal: Find out how many days had sales above ₹100.

Expected Output:
Number of high sales days (>100): 4


Activity 7 – Search for a Specific Sale
Goal: Search the array for a specific sale amount (for example, ₹150).
If found, print which day it occurred.

Expected Output:
Sale 150 found on Day 3


Activity 8 – Update Sales Record
Goal: Suppose the shop owner updated the sales for Day 2 to ₹95.
Update the array and display the new value.

Expected Output:
Updated sales for Day 2: 95
 */
public class Array10 {
	public static void main(String[] args)
	{
		int[] sales = {120, 80, 150, 90, 200, 75, 110};
		int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; 
		averageWeeklyTemperature(temperatures);
		hottestAndColdestTemperature(temperatures);
		hotDays(temperatures);
		totalAndAverageSales(sales);
		highestAndLowestSales(sales);
		highSalesDays(sales);
		searchSpecificSale(sales, 150);
		updateSpecificSale(sales, 95, 2);
	}
	public static void averageWeeklyTemperature(int[] arr)
	{
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.printf("Average Temperature: %.1f",(sum/7.0));
		System.out.println();
	}
	public static void hottestAndColdestTemperature(int[] arr)
	{
		int hottest = Integer.MIN_VALUE;
		int coldest = Integer.MAX_VALUE;
		for(int i : arr)
		{
			if(i>hottest) hottest=i;
			if(i<coldest) coldest=i;
		}
		System.out.println("Highest Temperature: "+hottest);
		System.out.println("Coldest Temperature: "+coldest);
	}
	public static void hotDays(int[] arr)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>30) count++;
		}
		System.out.println("Number of Hot days: "+count);
	}
	public static void totalAndAverageSales(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("Total Sales: "+sum);
		System.out.printf("Average Sales: %.2f",sum/7.0);
		System.out.println();
	}
	public static void highestAndLowestSales(int[] arr)
	{
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;
		int highestSaleDay=0;
		int lowestSaleDay=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest)
				{
				highest=arr[i];
				highestSaleDay = i+1;
				}
			if(arr[i]<lowest)
				{
				lowest=arr[i];
				lowestSaleDay = i+1;
				}
		}
		System.out.println("Highest sale: "+highest+" on Day "+highestSaleDay);
		System.out.println("Lowest sale: "+lowest+" on Day "+lowestSaleDay);
	}
	public static void highSalesDays(int[] arr)
	{
		int count = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>100) count++;
		}
		System.out.println("Number of high sales days: "+count);
	}
	public static void searchSpecificSale(int[] arr,int sale)
	{
		int day=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==sale) 
			{
				day=i+1;
				break;
			}
		}
		System.out.println("Sale "+sale+" found on Day "+day);
	}
	public static void updateSpecificSale(int[] arr,int sale,int day)
	{
		arr[day-1]=sale;
		System.out.println("Updated sales for Day "+day+": "+sale);
	}
	
	
	
	

}
