import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ��ʾת���ַ���ʹ��
 *
 */
public class Regexp02 {
     public static void main(String[] args) {
		String content="abc$(a.bc(123";
		//ƥ��(
		String regStr="\\.";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("�ҵ�"+matcher.group(0));
		}
		
	}
}
