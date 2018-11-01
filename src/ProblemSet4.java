/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps4 = new ProblemSet4();
		System.out.println(ps4.addMe("a123b456c789", false));
	}
	
	public String surroundMe(String out, String in) {
		if(out.isEmpty() || in.isEmpty() || out.length() != 4 || in.length() != 3) {
			return "null";
		}
		else {
			return out.substring(0, 2) + in + out.substring(2);
		}
	}
	
	public String endsMeet(String str, int n) {
		if(str.isEmpty() || str.length() < 1 || str.length() > 10 || n < 1|| n > str.length()) {
			return "null";
		}
		else {
			return str.substring(0, n) + str.substring(str.length() - n);
		}
	}
	
	public String middleMan(String str) {
		if(str.isEmpty() || str.length() % 2 == 0) {
			return "null";
		}
		else {
			return str.substring(((str.length() - 1) / 2) - 1, ((str.length() - 1) / 2) + 2);
		}
	}
	
	public String doubleVision(String str) {
		if(str.isEmpty()) {
			return "null";
		}
		else {
			String fstr = "";
			for(int x = 0; x < str.length(); x++) {
				fstr = fstr + str.charAt(x) + str.charAt(x);
			}
			return fstr;
		}
	}
	
	public boolean centered(String str, String target) {
		if(str.isEmpty() || target.isEmpty() || target.length() != 3) {
			return false;
		}
		else if(str.length() % 2 == 1) {
			if(target.equals(str.substring(((str.length() - 1) / 2) - 1, ((str.length() - 1) / 2) + 2))) {
				return true;
			}
			else {
				return false;
			}
				
		}
		else {
			if((target.equals(str.substring((str.length() / 2) - 2, (str.length() / 2) + 1))) || (target.equals(str.substring((str.length() / 2) - 1, (str.length() / 2) + 2)))) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public int upOrDown(double number, char operation) {
		if(operation == 'r') {
			if(number - (int) number >= .5) {
				return (int) number + 1;
			}
			else {
				return (int) number;
			}
		}
		else if(operation == 'f') {
			return (int) number;
		}
		else if(operation == 'c') {
			return (int) number + 1;
		}
		else {
			return -1;
		}
	}
	
	public int countMe(String text, char end) {
		if(text.isEmpty() || Character.isLetter(end) == false) {
			return -1;
		}
		else {
			int count = 0;
			for(int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == end) {
					if(i == text.length() - 1) {
						count++;
					}
					else if(text.charAt(i + 1) == ' ') {
						count++;
					}
				}
			}
			return count;
		}
	}
	
	public boolean isNotEqual(String str) {
		if(str.isEmpty()) {
			return false;
		}
		else {
			int isCount = 0;
			int notCount = 0;
			for(int i = 0; i < str.length(); i++) {
				if(i == str.length() - 2) {
					if(str.charAt(i) == 'i' && str.charAt(i + 1) == 's' && str.charAt(i - 1) == ' ') {
						isCount++;
					}
				}
				else if(i == 0) {
					String substr = str.substring(i, i + 2);
					if(substr.equals("is")) {
						isCount++;
					}
				}
				else if(i != str.length() - 1) {
					String substr = str.substring(i, i + 2);
					if(substr.equals("is") && str.charAt(i - 1) == ' ') {
						isCount++;
					}
				}
			}
			for(int i = 0; i < str.length(); i++) {
				if(i == str.length() - 3) {
					if(str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't' && str.charAt(i - 1) == ' ') {
						notCount++;
					}
				}
				else if(i == 0) {
					String substr = str.substring(i, i + 3);
					if(substr.equals("not")) {
						notCount++;
					}
				}
				else if(i != str.length() - 1 && i != str.length() - 2) {
					String substr = str.substring(i, i + 3);
					if(substr.equals("not") && str.charAt(i - 1) == ' ') {
						notCount++;
					}
				}
			}
			if(isCount == notCount) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	
	public int triplets(String str) {
		boolean valid = true;
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isWhitespace(str.charAt(i)) == true|| Character.isLetter(str.charAt(i)) == false) {
				valid = false;
			}
		}
		if(str.isEmpty() || valid == false) {
			return -1;
		}
		else {
			for(int i = 0; i < str.length(); i++) {
				if(i < str.length() - 2) {
					char letter = str.charAt(i);
					if(letter == str.charAt(i + 1) && letter == str.charAt(i + 2)) {
						count++;
					}
				}
			}
			return count;
		}
	}
	
	public int addMe(String str, boolean digits) {
		boolean valid = true;
		for(int i = 0; i < str.length(); i++) {
			if(Character.isWhitespace(str.charAt(i)) == true) {
				valid = false;
			}
		}
		if(str.isEmpty() || valid == false) {
			return -1;
		}
		else {
			int sum = 0;
			if(digits == true) {
				for(int i = 0; i < str.length(); i++) {
					if(Character.isDigit(str.charAt(i))) {
						sum += Character.getNumericValue(str.charAt(i));
					}
				}
			}
			else {
				boolean reset = false;
				String numTemp = "";
				for(int i = 0; i < str.length(); i++) {
					if(Character.isDigit(str.charAt(i))) {
						if(reset == true) {
							numTemp = str.substring(i, i + 1);
							reset = false;
						}
						else {
							numTemp = numTemp + str.substring(i, i + 1);
						}
					}
					else {
						reset = true;
					}
					sum += Integer.parseInt(numTemp);
				}
			}
			return sum;
		}
	}
}