
public class Homework01 {

	public static void main(String[] args) {
		//�̶������ʼ�����Ϊ
		//ֻ����һ��@
		//@ǰ�����û�����������a-z,A-z,0-9,_-�ַ�
		//@��������������������ֻ����Ӣ����ĸ������sohu.com,����tsinghua.org.cn
		//д����Ӧ��������ʽ����֤������ַ����Ƿ�Ϊ�������
		
		String content="hsp@sohu.com";
		String regStr="[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+";
//		String regStr="^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
		//String ��matches������ƥ��
		if(content.matches(regStr)) {
			System.out.println("ƥ��ɹ�");
		}else {
			System.out.println("ƥ��ʧ��");
		}

	}

}
