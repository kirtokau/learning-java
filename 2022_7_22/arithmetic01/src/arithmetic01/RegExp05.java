package arithmetic01;
/*
 * �޶��ַ�����ʹ��
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {

	public static void main(String[] args) {
		String content="a11111111aaahello";
		//a{3},1{4},(\\d){2}
		//String regStr="a{3};//��ʾƥ�� aaa
//		 String regStr="1{4}";//��ʾƥ�� aaa
//		 String regStr="\\d{2}";//��ʾƥ����λ��������
		//java��ʾƥ��Ĭ��̰��ƥ�䣬������ƥ����
//		 String regStr="a{3,4}";//��ʾƥ��aaa����aaaa
//		 String regStr="1{4,5}";//��ʾƥ��1111����11111
//		String regStr="1+";//��ʾƥ��һ��1���߶��1
//		String regStr="\\d+";//��ʾƥ��һ�����ֻ��߶������
//		String regStr="1*";//ƥ��0��1���߶��1
		String regStr="a1?";//ƥ��a����a1
		
//		 String regStr="\\d{2,5}";//ƥ��2λ������3,4,5
		Pattern pattern=Pattern.compile(regStr);
		 Matcher matcher=pattern.matcher(content);
		 
		 while(matcher.find()) {
			 System.out.println("�ҵ�"+matcher.group(0));
		 }

	}

}
