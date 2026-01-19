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
		Queue<Task> q=new PriorityQueue<>();
		q.offer(new Task("revising notes",3));
		q.offer(new Task("attending classes",4));
		q.offer(new Task("wake up early",2));
		q.offer(new Task("extra-curricular activities",1));
		while(!q.isEmpty()){
			System.out.println(q.poll());
		}
	}
}
class Task implements Comparable<Task>{
	String task;
	int priority;
	Task(String task,int priority){
		this.priority=priority;
		this.task=task;
	}
	@Override
	public int compareTo(Task t){
		return Integer.compare(this.priority,t.priority);
	}
	@Override
	public String toString(){
		 return task+" "+priority;
	}
	
}