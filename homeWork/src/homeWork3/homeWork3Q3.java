package homeWork3;
import java.util.Scanner;

public class homeWork3Q3 {
	
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter the number: ");
	int numb = input.nextInt();
	System.out.println(theDay(numb));
	
	
}
public static String theDay (int numb){
	String weekDay ="";
	
	switch(numb) {
    case 1: weekDay = "Monday"; break;
    case 2: weekDay = "Tuesday"; break;
    case 3: weekDay = "Wednesday"; break;
    case 4: weekDay = "Thursday"; break;
    case 5: weekDay = "Friday"; break;
    case 6: weekDay = "Saturday"; break;
    case 7: weekDay = "Sunday"; break;
    default:weekDay = "Invalid day range";
	
	
	
	}
	
	return weekDay;
	
}

	

}
