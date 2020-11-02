package lecture4;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	

	public static boolean isStrictlyIncreasing(double[] in) {
        boolean result = true;
        for(int i=0; i< (in.length - 1); i++){
            if(in[i+1] <= in[i])
                result = false;
        }
        return result;
}

	
	
}
