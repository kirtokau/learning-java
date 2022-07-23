import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp07 {

	public static void main(String[] args) {
		String content="hanshunping s7789 nn1189han";
		//下面就是非命名分组
		//说明
		//1、matcher.group(0)得到匹配的字符串
		//2、matcher.group(1)得到匹配的字符串的第一个分组的内容
		//3、matcher.group(2)得到匹配的字符串的第二个分组的内容
		
//		String regStr="(\\d\\d)(\\d)(\\d)";//匹配四个数组的字符串
		String regStr="(?<g1>\\d\\d)(?<g2>\\d\\d)";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
//		while(matcher.find()) {
//			System.out.println("找到="+matcher.group(0));
//			System.out.println("第一个分组内容"+matcher.group(1));
//			System.out.println("第二个分组内容"+matcher.group(2));
//			System.out.println("第三个分组内容"+matcher.group(3));
//		}
		while(matcher.find()) {
//			System.out.println("找到="+matcher.group(0));
//			System.out.println("第一个分组内容"+matcher.group(1));
//			System.out.println("第二个分组内容"+matcher.group(2));
//			System.out.println("第三个分组内容"+matcher.group(3));
			System.out.println("找到="+matcher.group(0));
			System.out.println("第一个分组内容[通过组名]"+matcher.group("g1"));
			System.out.println("第二个分组内容[通过组名]"+matcher.group("g2"));
				}

	}

}
