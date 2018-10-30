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
		System.out.println(ps4.middleMan("programming"));
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
}