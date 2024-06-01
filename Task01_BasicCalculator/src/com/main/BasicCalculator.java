package com.main;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String [] args) {
		
		System.out.println("******** WELCOME TO BASIC CALCULATOR ********");		
		//Declare variables
		double num1,num2;
		char operator;
		
		//for taking input from user
		Scanner sc = new Scanner(System.in);				
				
		System.out.println("Enter the first number:");
		num1 =sc.nextDouble();
		System.out.println("Enter the second number:");
		num2= sc.nextDouble();
		
		System.out.println("\n Choose one operator : ");
		System.out.println("+  -> Addition");
		System.out.println("-  -> Substraction");
		System.out.println("*  -> Multiplication");
		System.out.println("/  -> Division");
		System.out.println("Enter operator :");
		
		double result = 0;
		operator = sc.next().charAt(0);
		
		switch(operator) {
		
		case '+' :
			result = num1 + num2;
		    break;
		 
		case '-' :
			result = num1 - num2;
		    break;
		    
		case '*' :
			result = num1 * num2;
		    break;
		    
		case '/' :
			if(num2!=0) {
				result = num1 / num2;
			}
			else {
				System.out.println("Undefined");
			}
			 break;
			   
		 default:
			 System.out.println("You Entered Wrong Input, Try Again!!");
		}
		System.out.println("Result:" +result);
		System.out.println("\n***Thank You For Visiting, Visit Again!!***");
		
	  //close Scanner object
	  sc.close();
	}
}
