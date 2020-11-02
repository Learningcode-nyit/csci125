package lecture4;

public class Question4 {

	public static void main(String[] args) {}
	
public static int[] combineOrder(int[] order1, int[] order2){
        
        // Find the number of values that will be in the result
        int[] combinedOrder = new int[5];
        for(int i=0; i<5; i++){
            combinedOrder[i] = order1[i] + order2[i];
        }
        
        return combinedOrder;
    }

	
	
}
