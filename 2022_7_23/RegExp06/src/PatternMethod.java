import java.util.regex.Pattern;

/*
 * ��ʾmatches��������������ƥ�䣬����֤������ַ����Ƿ���������ʹ��
 */
public class PatternMethod {

	public static void main(String[] args) {
		String content="hello abc hello,��˳ƽ����";
		//String regStr="hello";
		String regStr="hello.*";
		
		boolean matches=Pattern.matches(regStr, content);
		System.out.println("����ƥ��="+matches);

	}

}
