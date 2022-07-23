import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {

	public static void main(String[] args) {
		String content="https://www.bilibili.com/";
		/*
		 * 思路
		 * 1.先确定url的开始部分https://|http://|http://
		 */
		String regStr="^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[w-?=&/%.#]*)?$";//注意：[.]表示匹配就是.本身
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		if(matcher.find()) {
			System.out.println("格式匹配");
		}else {
			System.out.println("格式不匹配");
		}

	}

}
