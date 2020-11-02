package lecture4;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[]remove(int v, int[]in){
		
		
		int timeOfnumber = 0;
			for(int index = 0; index< in.length; index++)
			{
				if(in[index]==v)
					timeOfnumber++;
				
				
			}
		int[] newArray = new int[in.length-timeOfnumber];
		int index2 = 0;
		for (int index = 0; index<in.length;index++)
		{
			
			if(in[index] != v)
			{
			
				newArray[index2] = in[index];
				index2 ++;
		}
			
		
		}
	
		return newArray;
	
	}
	
}
