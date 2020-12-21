package homeworkFinal;

public class SubstitutionCipher implements MessageEncoder {
	
	int shift;
	
	public SubstitutionCipher(int theShift){
		shift = theShift;
	}

	@Override
	public String encode(String plainText) {
		// TODO Auto-generated method stub
		//cat encoded should be fdw
		String encoded="";
		for(int i =0; i<plainText.length();i++){
			char x = plainText.charAt(i);
			//some code to shift 
			x = shiftCharacter(x);
			encoded = encoded+x;
		}
		
		
		return encoded;
	}

	@Override
	public String decode(String plainText) {
		// TODO Auto-generated method stub
		//fdw should become cat
		String decoded ="";
		for(int i =0; i<plainText.length();i++){
			char x = plainText.charAt(i);
			//code to reverse the shift 
			x=reverseShiftCharacter(x);
			decoded=decoded+x;
			
		}
		
		
		
		return decoded;
	}
	
	Character shiftCharacter(Character x) {
		return  (char) (x+shift);
	}
	
	Character reverseShiftCharacter(Character x) {
		return  (char) (x-shift);
	}

}
