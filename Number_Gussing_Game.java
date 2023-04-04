// task2 Number Guessing Game

package OASIS_INFOBYTE;

import java.util.Scanner;
import  static java.lang.System.out;
import java.util.Random;

public class Number_Gussing_Game {
	
	// create 2 variable
	// one is win for counting the no. of winn
	// another is a for loop
	
	
	static int win=0;
	static int a=0;
	static Scanner sc=new Scanner(System.in);
	
	static void guess() {
		
		out.println("Guess a no. 1 to 100");
		out.println();
		out.println("Enter the which one you gussing");
		
		int num=sc.nextInt();
		// create object  of Random class
		Random random=new Random();
		// giving limit upto 100
		int ran=random.nextInt(100);
		
		if(num==ran)
		{	
			out.println("congratulation You Win ");
			win++;
		}
		else {
			if(num>ran)
				out.println("your no. is Higher than "+ran);
			else 
				out.println("your no. is Lower than "+ran);
			}
		
		out.println();
		out.println("enter 1 for  play again or enter 0 for exit ");
		a=sc.nextInt();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		out.println("|_GUESS THE NUMBER_|");
		out.println();
		out.println();
		out.println("Let's play the Game __GUESS THE NUMBER__ with Computer");
		out.println();
		out.println();
		
		guess();
		
		while(a==1) 
		{
			switch(a) {
			case 1-> guess();
			default ->out.println("enter a valid option ");}
		}
		out.println("no. of times you Win "+win);
		
	}

}
