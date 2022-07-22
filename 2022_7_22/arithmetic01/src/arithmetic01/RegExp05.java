package arithmetic01;
/*
 * 限定字符串的使用
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {

	public static void main(String[] args) {
		String content="a11111111aaahello";
		//a{3},1{4},(\\d){2}
		//String regStr="a{3};//表示匹配 aaa
//		 String regStr="1{4}";//表示匹配 aaa
//		 String regStr="\\d{2}";//表示匹配两位任意数字
		//java表示匹配默认贪婪匹配，尽可能匹配多的
//		 String regStr="a{3,4}";//表示匹配aaa或者aaaa
//		 String regStr="1{4,5}";//表示匹配1111或者11111
//		String regStr="1+";//表示匹配一个1或者多个1
//		String regStr="\\d+";//表示匹配一个数字或者多个数字
//		String regStr="1*";//匹配0个1或者多个1
		String regStr="a1?";//匹配a或者a1
		
//		 String regStr="\\d{2,5}";//匹配2位数或者3,4,5
		Pattern pattern=Pattern.compile(regStr);
		 Matcher matcher=pattern.matcher(content);
		 
		 while(matcher.find()) {
			 System.out.println("找到"+matcher.group(0));
		 }

	}

}
