import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp06 {

	public static void main(String[] args) {
		String content="hansunping sphan nnhan";
//		String content="123-abc";
		//������һ�����ֿ�ͷ����������Сд��ĸ���ַ���
		//String regStr="^[0-9]+[a-z]*";
		//������һ�����ֿ�ͷ������������һ��Сд��ĸ����
//		String regStr="^[0-9]+\\-[a-z]+$";
		//��ʾƥ��߽��han[����ı߽���ָ����ƥ����ַ������
		//Ҳ�����ǿո�����ַ�������
//		String regStr="han\\b";
		//ƥ��Ŀ���ַ����ķǱ߽磬��\\b�պ��෴
		String regStr="han\\B";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(content);
        while(matcher.find()) {
        	System.out.println("�ҵ�="+matcher.group(0));
        }
	}

}
