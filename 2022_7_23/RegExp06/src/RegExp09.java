import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp09 {

	public static void main(String[] args) {
		String content="hello111111 ok";
//		String regStr="\\d+";//Ĭ����̰��ƥ��
		String regStr="\\d+?";//Ĭ���Ƿ�̰��ƥ��
		
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println(matcher.group(0));
		}

	}

}
