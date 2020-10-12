package homeWork3;
import java.util.Scanner;

public class homeWork3Q2 {

public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter 1st Number: ");
	float n1= input.nextFloat();
	System.out.println("Please enter 2nd Number: ");
	float n2= input.nextFloat();
	System.out.println("Please enter 3rd Number: ");
	float n3= input.nextFloat();
	
	System.out.println("Maximum value:" + Max(n1,n2,n3));
	
	
}

public static float Max (float n1, float n2 ,float n3){
	
	float Maxnumber;
	
	if (n1 > n2)
		Maxnumber = n1;
	else 
		Maxnumber = n2;
	
	if (Maxnumber <n3)
		Maxnumber = n3;
	
	
	else
		;
	
	return Maxnumber;
				
				
			
	
		
	
	
}


	
	

}
