import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp13 {

	public static void main(String[] args) {
		String content="��...��Ҫ.....ѧѧѧѧ....���java";
		//1��ȥ�����е�.
		Pattern pattern=Pattern.compile("\\.");
		Matcher matcher=pattern.matcher(content);
		content=matcher.replaceAll("");
		System.out.println("content="+content);
		
		//ȥ���ظ����� ����Ҫѧѧѧѧ���java
//		pattern=Pattern.compile("(.)\\1+");
//		matcher=pattern.matcher(content);
//		while(matcher.find()) {
//			System.out.println("�ҵ�="+matcher.group(0));
//		}
//		//ʹ�÷�������$1���滻ƥ�䵽������
//		content=matcher.replaceAll("$1");
//		System.out.println("content="+content);
		//ʹ��һ�����ȥ���ظ�����
		content=Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
		System.out.println("content="+content);
		}

}
