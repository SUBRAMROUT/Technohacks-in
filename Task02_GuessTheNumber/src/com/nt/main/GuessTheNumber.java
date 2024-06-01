package com.nt.main;

import java.util.Scanner;

public class GuessTheNumber {
	
	public static void main (String[] args) {
		
		int i,guess;
		int k = 6;
		int number = 1+(int)(100*Math.random());
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A number is choosen between 1 to 100."
		                        +"Guess the number within 6 trails....");
		for(i=0;i<k;i++) {
			System.out.println("guess the number : ");
			guess=sc.nextInt();
			
			if(number==guess) {
				System.out.println("Congratulations!!" + " You guess the number.....");
				break;
			}
			else if (number > guess && i != k-1) {
				System.out.println("The number is greater than " + guess);
			}
			else if (number < guess && i != k-1) {
				System.out.println("The number is lesser than " + guess);
			}
		}
		if (i==k) {
			System.out.println("You have exhausted"+ k +"trails");
			System.out.println("the correct number is:"+number);
			
		}
	     //close Scanner
	     sc.close();   
	}
	

}
