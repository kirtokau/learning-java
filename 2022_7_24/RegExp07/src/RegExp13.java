import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp13 {

	public static void main(String[] args) {
		String content="我...我要.....学学学学....编程java";
		//1、去掉所有的.
		Pattern pattern=Pattern.compile("\\.");
		Matcher matcher=pattern.matcher(content);
		content=matcher.replaceAll("");
		System.out.println("content="+content);
		
		//去掉重复的字 我我要学学学学编程java
//		pattern=Pattern.compile("(.)\\1+");
//		matcher=pattern.matcher(content);
//		while(matcher.find()) {
//			System.out.println("找到="+matcher.group(0));
//		}
//		//使用反向引用$1来替换匹配到的内容
//		content=matcher.replaceAll("$1");
//		System.out.println("content="+content);
		//使用一条语句去掉重复的字
		content=Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
		System.out.println("content="+content);
		}

}
