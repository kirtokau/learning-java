import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
 /**
  * 
  * ��ʾ�ַ�ƥ�����ʹ��
  */

	public static void main(String[] args) {
		String comtent="a11c8abcABC";
//		String regStr="[A-Z]";//ƥ��a-z֮������һ���ַ�
//		String regStr="[a-z]";//ƥ��A-Z֮������һ���ַ�
//		String regStr="abc";//ƥ��abc�ַ���[Ĭ�����ִ�Сд]
//		String regStr="(?i)abc";//ƥ��abc�ַ���[�����ִ�Сд]
		String regStr="[^a-z]";//ƥ�䲻��a-z֮������һ���ַ�
		//������Pattern����ʱ��ָ��Pattern.CASE_INSENSITIVE,��ʾƥ���ǲ�������ĸ��Сд
		Pattern pattern=Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(comtent);
		while(matcher.find()) {
			System.out.println("�ҵ�"+matcher.group(0));
		}

	}

}
