package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String pattern = "^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$";
		
		//System.out.println("adef".matches("[abc]def"));
		System.out.println("ugrkadioglu@gmail.com".matches(pattern));
		//System.out.println("adefaaaa".matches(pattern));
		
			//Pattern pattern1=Pattern.compile("[^abc]def");
			//Matcher matcher1=pattern1.matcher("adef");
			//System.out.println(matcher1.matches());
		/*String s = "bir berber bir berbere gel beraber bir berber dükkaný açalým deniþ";
		Pattern pattern =Pattern.compile("b.r");
		Matcher matcher=pattern.matcher(s);
		
		int sayac=0;
		while (matcher.find()) {
			sayac++;
		}
		System.out.println(sayac);
		
		System.out.println(Pattern.matches(".z.", "azd"));*/

	}

}
