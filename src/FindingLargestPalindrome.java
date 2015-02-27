
public class FindingLargestPalindrome {

	public static void main(String[] args) {
		int biggest = 0, maxI = 0, maxJ = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j>=i; j--) {
				int result = i*j; 
				String resultStr = String.valueOf(result); 
				// we use StringBuilder shell because this class has reverse() method
				// otherwise we should revert String as char array using str.toCharArray()
				// then use cycle to revert this String
				StringBuilder resultSB = new StringBuilder(resultStr);
				String reverseStr = resultSB.reverse().toString();
				if (resultStr.equals(reverseStr)) {
					if (result > biggest) {
						biggest = result;
						maxI = i;
						maxJ = j;
					}
					
				}
				
			}
			
		}
		
		System.out.println("The largest Palindrome number is "+biggest+" = "+maxI+" * "+maxJ);

	}

}
