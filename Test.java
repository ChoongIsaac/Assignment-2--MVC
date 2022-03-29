package assignment2;
import java.sql.*; 
import java.util.Scanner;

/* Name: CHOONG WEN JIAN ISAAC*/
/* Matric number: 207545      */
/* course: SSE4350      */

//This is a test demo class of Assignment 2
//which will show how a simple MVC Architecture works.
//basically the user can only interact with the view.
//and the Controller will handle all the logics and communicate between Model and View
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// Create a view
		Student_UI view = new Student_UI();
		
		
		System.out.print("1. Input Marks \n2. Check Student's Mark \nSelect: ");
		int option = input.nextInt();
		
		//display different view base on the option
		view.displayMenu(option);
		
	
	}
}
