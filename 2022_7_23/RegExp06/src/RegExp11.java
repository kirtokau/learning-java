import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {

	public static void main(String[] args) {
		String content="https://www.bilibili.com/";
		/*
		 * ˼·
		 * 1.��ȷ��url�Ŀ�ʼ����https://|http://|http://
		 */
		String regStr="^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[w-?=&/%.#]*)?$";//ע�⣺[.]��ʾƥ�����.����
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
		if(matcher.find()) {
			System.out.println("��ʽƥ��");
		}else {
			System.out.println("��ʽ��ƥ��");
		}

	}

}
