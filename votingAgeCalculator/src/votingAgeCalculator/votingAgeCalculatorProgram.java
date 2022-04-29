package votingAgeCalculator;

import java.util.Scanner;

public class votingAgeCalculatorProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input your age!");
		
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("You have been eligible to vote since "+ (2022 - age)+ "!");
		}
			else {
				System.out.println("Sorry, you still must wait " + (18 - age) + " years until you are eligible to vote.");
			}
		
	}

}
