import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestTemp {

	public static void main(String[] args) {
		String content="hello abc 11.1";
		String regStr=".";//ƥ�����\n�������ַ�
//		String regStr="[.]";//ƥ��.����
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("�ҵ�="+matcher.group(0));
		}
		

	}

}
