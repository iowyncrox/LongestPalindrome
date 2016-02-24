import java.util.Objects;

public class LongestPalindrome {
	public String longestPalindrome(final String string) {
		Objects.requireNonNull(string);
		String longest = string.substring(0, 1);

		for (int i = 0; i < string.length(); ++i) {

			String temp = longest(string, i, i);
			if (temp.length() > longest.length()) {
				longest = temp;
			}

			temp = longest(string, i, i + 1);
			if (temp.length() > longest.length()) {
				longest = temp;
			}
		}

		return longest;
	}

	private String longest(String str, int start, int end) {
		while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
			--start;
			++end;
		}
		return str.substring(start + 1, end);
	}

	public static void main(String[] args) {
		LongestPalindrome l = new LongestPalindrome();
		System.out.println(l.longestPalindrome("sunny"));
		System.out.println(l.longestPalindrome("banana"));
	}
}