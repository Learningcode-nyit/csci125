package homeWork;
import java.util.Scanner;

public class SumoOfTwointegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstnumber, secondnumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first integer");
		firstnumber = input.nextInt();
		System.out.println("Please enter your second integer");
		secondnumber = input.nextInt();
		System.out.print("The sum of two integers: ");
		System.out.println(firstnumber+secondnumber);
		
	}

}
