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
			System.out.println("�ҵ���"+content.substring(matcher.start(),matcher.end()));
		}
		//����ƥ�䷽����������ȥУ��ĳ���ַ����Ƿ�����ĳ������
		System.out.println("����ƥ��="+matcher.matches());
		//������content ��hspedu�滻�ɺ�˳ƽ����
		regStr="hspedu";
		 pattern =Pattern.compile(regStr);
		 matcher=pattern.matcher(content);
		 //ע�ⷵ�ص��ַ��������滻����ַ���ԭ����content����
		 String newContent=matcher.replaceAll("��˳ƽ����");
		 System.out.println("newContent="+newContent);
		 System.out.println("content="+content);
		
		

	}

}
