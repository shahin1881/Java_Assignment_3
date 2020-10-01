package Section1_20_Question;


public class Q17_sumofthenumber {
	
	public static void main(String[] args) {

		/*
		  Question:  Find the sum of the numbers in the given input string array
                     Input{“2AA”,”12”,”ABC”,”c1a”)
                     Output:6 (2+1+2+1)
                     
                     Note in the above array 12 must not considered as such
                     i.e,it must be considered as 1,2 */
		
		
		String[] s = { "2AA", "12", "ABC", "c1a" ,"4Ab" };//skip for the character then digit num addition.
		
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			String n = s[i];//2AA,12,ABC,c1a
			for (int j = 0; j < n.length(); j++) {
				if (Character.isDigit(n.charAt(j))) {
					ans = ans + Character.getNumericValue(n.charAt(j));//2+1+2+1+4=10
				}
			}
		}
		System.out.println(ans);

	}

}
		
		
		
	