
public class FindingLargestPalindrome {
	
	public static void main(String[] args) {
		int largestPalindrome = 0, maxI = 0, maxJ = 0, n = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j>=i; j--) {
				int result = i*j; 
				n++;
				if (result < largestPalindrome) {
					if (j == 999) i = 0;
					break;
				}
				String resultStr = String.valueOf(result); 
				StringBuilder resultSB = new StringBuilder(resultStr);
				String reverseStr = resultSB.reverse().toString();
				if (resultStr.equals(reverseStr)) {
					if (result > largestPalindrome) {
						largestPalindrome = result;
						maxI = i;
						maxJ = j;
						break;
					}
				}
			}
		}
		System.out.println("The largest Palindrome number is "+largestPalindrome+" = "+maxI+" * "+maxJ);
		System.out.println("Number of iterations - "+n);
	}

}
