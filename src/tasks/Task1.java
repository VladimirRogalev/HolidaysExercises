package tasks;

public class Task1 {
	public static void main(String[] args) {
		String word = "madam";
		System.out.println(isPalindrome(word));

		word = "java";
		System.out.println(isPalindrome(word));

	}

	private static boolean isPalindrome(String word) {
//		StringBuilder builder = new StringBuilder();
//		builder.append(word);
//		builder.reverse();
//		if (word.equals(builder)) { 
//			return true;
//		}
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);

		}
		if (word.equals(reverseWord)) {
			return true;
		}

		return false;
	}

}
