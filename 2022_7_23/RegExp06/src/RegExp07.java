import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp07 {

	public static void main(String[] args) {
		String content="hanshunping s7789 nn1189han";
		//������Ƿ���������
		//˵��
		//1��matcher.group(0)�õ�ƥ����ַ���
		//2��matcher.group(1)�õ�ƥ����ַ����ĵ�һ�����������
		//3��matcher.group(2)�õ�ƥ����ַ����ĵڶ������������
		
//		String regStr="(\\d\\d)(\\d)(\\d)";//ƥ���ĸ�������ַ���
		String regStr="(?<g1>\\d\\d)(?<g2>\\d\\d)";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
//		while(matcher.find()) {
//			System.out.println("�ҵ�="+matcher.group(0));
//			System.out.println("��һ����������"+matcher.group(1));
//			System.out.println("�ڶ�����������"+matcher.group(2));
//			System.out.println("��������������"+matcher.group(3));
//		}
		while(matcher.find()) {
//			System.out.println("�ҵ�="+matcher.group(0));
//			System.out.println("��һ����������"+matcher.group(1));
//			System.out.println("�ڶ�����������"+matcher.group(2));
//			System.out.println("��������������"+matcher.group(3));
			System.out.println("�ҵ�="+matcher.group(0));
			System.out.println("��һ����������[ͨ������]"+matcher.group("g1"));
			System.out.println("�ڶ�����������[ͨ������]"+matcher.group("g2"));
				}

	}

}
