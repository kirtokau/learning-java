import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * ��ʾ�ǲ�����飬�﷨�Ƚ����
 *
 */
public class RegExp08 {

	public static void main(String[] args) {
		String content="hello��˳ƽ���� jack��˳ƽ��ʦ ��˳ƽͬѧhello";
		//�ҵ���˳ƽ��������˳ƽ��ʦ����˳ƽͬѧ�ַ���
//		String regStr="��˳ƽ����|��˳ƽ��ʦ|��˳ƽͬѧ";
		//�����д�����Եȼ۷ǲ������,ע�⣺����matcher.group(1)
//		String regStr="��˳ƽ(?:����|��ʦ|ͬѧ)";
		//�ҵ���˳ƽ����ؼ��֣�����Ҫ��ֻ�ǲ��Һ�˳ƽ�����ͺ�˳ƽ��ʦ�а����еĺ�˳ƽ
//		String regStr="��˳ƽ(?=����|��ʦ)";
		String regStr="��˳ƽ(!=����|��ʦ)";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		while(matcher.find()) {
			System.out.println("�ҵ���"+matcher.group(0));
		}

	}

}
