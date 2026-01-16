package day17;

import java.util.Queue;
import java.util.PriorityQueue;

/*
 * Write a Java program that uses a PriorityQueue to schedule and execute tasks based on their 
 * priority (lower number = higher priority). You should:
Create a Task class with name and priority.
Store tasks in a PriorityQueue<Task> so that tasks with higher priority (i.e., lower priority value) are processed
 first.
Add at least 5 tasks with different priorities.
Print the tasks in the order they are executed.
In a priority queue, elements are ordered based on priority (not insertion order). By default Java’s PriorityQueue behaves like a min-heap, meaning the smallest element is at the head.
 */
public class Priorityqueue {
	public static void main(String[] args) {
		Queue<Task> task = new PriorityQueue<>();
		task.offer(new Task("Yash" ,18));
		task.offer(new Task("Sidd",13));
		task.offer(new Task("Ram",30));
		task.offer(new Task("Bob",29));
		System.out.println(task);
	}

}
class Task{
	String name;
	int priority;
	Task(String name , int priority){
		this.name=name;
		this.priority = priority;
	}
	
}
