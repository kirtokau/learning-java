import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * ������ʽӦ��ʵ��
 */
public class RegExp10 {

	public static void main(String[] args) {
		String cotent="123a89";
		//����
//		String regStr="^[\u0391-\uffe5]+$";
		//�������� Ҫ����1-9��ͷ��һ����λ�������磺123890
//		String regStr="^[1-9]\\d{5}$";
		//QQ����  Ҫ����1-9��ͷ��һ��(5λ��-10λ����������12389,13456887,18987896
		String regStr="^[1-9]\\d{4,9}$";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(cotent);
		if(matcher.find()) {
			System.out.println("�����ʽ");
		}else {
			System.out.println("�������ʽ");
		}

	}

}
