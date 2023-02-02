package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your start amount.");
		int startAmount = scan.nextInt();
		System.out.println("Please enter your win chance.");
		double winChance = scan.nextDouble();
		System.out.println("Please enter your win limit.");
		int winLimit = scan.nextInt();
		System.out.println("Please enter the total amount of simulations.");
		int totalSimulation = scan.nextInt();
		
		for (int i = 1; i <= totalSimulation; i++)
		{		
		int currentAmount = startAmount;
		while ((currentAmount < winLimit) && (currentAmount > 0))
		{
		//winning statement
		if (winChance >= Math.random())
		{
			currentAmount = currentAmount + 1;
			
		}
		
		//loss statement
		else 
		{
			currentAmount = currentAmount - 1;
		}
		}
		System.out.println("Simulation #" + i);
		if (currentAmount == winLimit)
		{
			System.out.println("YOU WON :)");
			System.out.println();
		}
		else
		{
			System.out.println("YOU LOST :(");
			System.out.println();
		}
		}
		
	}
}
