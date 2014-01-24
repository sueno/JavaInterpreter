package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RexpSample {

	
	public static void main(String[] args) {
		
		Pattern[] matchPatterns = new Pattern[] {
				Pattern.compile("^[\\w\\d\\$]+"),
				Pattern.compile("\\\".*\\\""),
				Pattern.compile("^[^\\\"\\w]+")
		};
		
		
		
		String[] commands = new String[] {
			"a = 9",
			"a10 = 9",
			"$ss = 5",
			"__a = 4",
			"$_ = \"2\"",
			"\" s	\"aaa",
			"\"(aaa) \""
		};
	
		
		for (String cmd : commands) {
			System.err.println("\""+cmd+"\"");
			for (Pattern p : matchPatterns) {
				Matcher m = p.matcher(cmd);
				System.out.println(m.find() ? m.group():"#");
			}
			System.err.println();
		}
	}
	
}
