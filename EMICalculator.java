package day3;

import java.util.Scanner;

public class EMICalculator {

	public static void main(String[] args)
	{
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter the Principle Amount");
		double p = Scanner.nextDouble();
		System.out.println("Enter the Rate of Interest ");
		double r = Scanner.nextDouble();
		System.out.println("Enter the number of months ");
		double n = Scanner.nextDouble();
		double emi = (p*(r/(12*100))*(Math.pow(1+(r/(12*100)),n)/(Math.pow(1+(r/1200), n) - 1)));	
		System.out.println("Your EMI will be: "+emi);
		Scanner.close();

		
	}

}
