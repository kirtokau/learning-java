
public class Homework02 {

	public static void main(String[] args) {
		// Ҫ����֤�ǲ�����������С��
		//��ʾ�� �����Ҫ���������͸���
		//���磺123-345 34.89 -87.9 -0.01 0.45��
		/*
		 * 1����д���򵥵�������ʽ
		 * 2�����𲽵�����
		 */
		String content="0.89";
		String regStr="^[-+]?([1-9]\\d*|0)+(\\.\\d+)?$";
		if(content.matches(regStr)) {
			System.out.println("ƥ��ɹ� ����������С��");
		}else {
			System.out.println("ƥ��ʧ��");
		}
		

	}

}
