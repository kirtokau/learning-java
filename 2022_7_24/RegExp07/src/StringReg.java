
public class StringReg {

	public static void main(String[] args) {
		String content="2000��5�£�JDK1.3��JDK1.4��J2SE1.3��̷�����"
				+ "���ܺ�������Apple��˾Mac OS X�Ĺ�ҵ��׼��֧�֡�2001��9��24�գ�J2EE1.3������"
				+ "2002��2��26�գ�J2SE1.4�������Դ�Java�ļ����������˴����������J2SE1.3��ȣ�����˽�62%����ͽӿڡ�"
				+ "����Щ�����Ե��У����ṩ�˹㷺��XML֧�֡���ȫ�׽��֣�Socket��֧�֣�ͨ��SSL��TLSЭ�飩��ȫ�µ�I/OAPI��������ʽ��"
				+ "��־����ԡ�";
		//ʹ��������ʽ��ʽ����JDK1.3��JDK1.4�滻��JDK
		content=content.replaceAll("JDK1\\.3|JDK1\\.4","JDK");
		System.out.println(content);
		//Ҫ����֤һ���ֻ��ţ�Ҫ���������138 139��ͷ��
		content="13888889999";
		if(content.matches("1(38|39)\\d{8}")) {
			System.out.println("��֤�ɹ�");
		}else {
			System.out.println("��֤ʧ��");
		}
        //Ҫ����#����-����~�����������ָ�
		content="hello#abc-jack12smith~����";
		String spilt[]=content.split("#|-|~|\\d+");	
		for(String s:spilt) {
			System.out.println(s);
			}
		}

}
