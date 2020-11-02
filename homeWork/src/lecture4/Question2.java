package lecture4;

public class Question2 {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		public static void removeDuplicates(char[] str) {
			  if (str == null) return;
			  int len = str.length;
			  if (len < 2) return;
			  int num = 1;
			  for (int i = 1; i < len; ++i) {
			    int j;
			    for (j = 0; j < num; ++j) {
			      if (str[i] == str[j]) break;
			    }
			    if (j == num) {
			      str[num] = str[i];
			      ++num;
			    }
			  }
			  str[num] = 0;
			}
	

}
