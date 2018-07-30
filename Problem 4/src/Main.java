import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		long palindrome = 1;
		for(long j = 100; j < 1000; j++) {
			for(long k = j; k < 1000; k++) {
				if (isPalindrome(j * k)){
					palindrome = Math.max(palindrome, j * k);
				}
			}
		}
		System.out.println(palindrome);
	}

	static boolean isPalindrome(long number){
		String number1 = Long.toString(number);
		char[] number2 = number1.toCharArray();
		char[] number3 = new char[number2.length];
		for (int i = 0; i < number2.length; i++) {
			number3[i] = number2[number2.length - 1 - i];
		}
		return Arrays.equals(number2, number3);
	}
}
