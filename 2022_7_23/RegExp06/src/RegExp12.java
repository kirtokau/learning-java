import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ��������
 */
public class RegExp12 {

	public static void main(String[] args) {
		String content="hello33333 jack14 tom11 j12321-333999111ack22 yyy12345 xxx";
		//Ҫƥ������������ͬ�����֣�(\\d)\\1
//		String regStr="(\\d)\\1";
		//Ҫƥ�����������ͬ�����֣�(\\d)\\1{4}
//		String regStr="(\\d)\\1{4}";
		//Ҫƥ���λ��ǧλ��ͬ��ʮλ���λ��ͬ���� 5525,1551����\\d)(\\d)\\2\\1
//		String regStr="(\\d)(\\d\\2\\1";
		
		/*
		 * �����ַ����м�����Ʒ��ţ���ʽ�磺12321-333999111 �����ĺ���
		 * Ҫ������ǰ����һ����λ����Ȼ��һ��-�ţ�Ȼ����һ����λ����������ÿ��λҪ��ͬ	
		 */
		String regStr="\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("�ҵ�"+matcher.group(0));
		}
	}

}
