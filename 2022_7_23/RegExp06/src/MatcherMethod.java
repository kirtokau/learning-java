import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {

	public static void main(String[] args) {
		String content="hello hspedu jack tom hello smith hello hspedu hspedu";
		String regStr="hello";
		
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("==================");
			System.out.println(matcher.start());
			System.out.println(matcher.end());
			System.out.println("找到："+content.substring(matcher.start(),matcher.end()));
		}
		//整体匹配方法，常用于去校验某个字符串是否满足某个规则
		System.out.println("整体匹配="+matcher.matches());
		//完成如果content 有hspedu替换成韩顺平教育
		regStr="hspedu";
		 pattern =Pattern.compile(regStr);
		 matcher=pattern.matcher(content);
		 //注意返回的字符串才是替换后的字符串原来的content不变
		 String newContent=matcher.replaceAll("韩顺平教育");
		 System.out.println("newContent="+newContent);
		 System.out.println("content="+content);
		
		

	}

}
