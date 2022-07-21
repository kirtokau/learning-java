import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
 /**
  * 
  * 演示字符匹配符的使用
  */

	public static void main(String[] args) {
		String comtent="a11c8abcABC";
//		String regStr="[A-Z]";//匹配a-z之间任意一个字符
//		String regStr="[a-z]";//匹配A-Z之间任意一个字符
//		String regStr="abc";//匹配abc字符串[默认区分大小写]
//		String regStr="(?i)abc";//匹配abc字符串[不区分大小写]
		String regStr="[^a-z]";//匹配不再a-z之间任意一个字符
		//当创建Pattern对象时，指定Pattern.CASE_INSENSITIVE,表示匹配是不区分字母大小写
		Pattern pattern=Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(comtent);
		while(matcher.find()) {
			System.out.println("找到"+matcher.group(0));
		}

	}

}
