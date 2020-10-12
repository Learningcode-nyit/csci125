package homeWork3;
import java.util.Scanner;
public class homeWork3Q1 {
public static void main(String[ ]args){
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your number: ");
	float FirstNumber = input.nextFloat();
	TellIfPositive(FirstNumber);
	
	
	}

public static void TellIfPositive (float n1 ) {
	if (n1 > 0)
		System.out.print("The number is positive.");
	else if (n1<0)
		System.out.print("The number is negative.");
	else
		System.out.print("The number is 0");
	
	
	
	}



}
