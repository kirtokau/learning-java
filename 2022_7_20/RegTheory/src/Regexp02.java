import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 演示转义字符的使用
 *
 */
public class Regexp02 {
     public static void main(String[] args) {
		String content="abc$(a.bc(123";
		//匹配(
		String regStr="\\.";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("找到"+matcher.group(0));
		}
		
	}
}
