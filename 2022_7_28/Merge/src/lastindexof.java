
public class lastindexof {
public static void main(String[] args) {
	String Str=new String("blog.csdn.net/weixin_46564496");
	String SubStr1=new String("csdn");
	String SubStr2=new String("net");
	System.out.println("�����ַ�w�����ֵ�λ��:");
	System.out.println(Str.lastIndexOf('w'));
	System.out.println("�ӵ�14��λ�ò����ַ�w�����ֵ�λ�ã�");
	System.out.println(Str.lastIndexOf('w',14));
	System.out.println("���ַ���SubStr1�����ֵ�λ�ã�");
	System.out.println(Str.lastIndexOf(SubStr1));
	System.out.println("�ӵ�ʮ���λ�ÿ�ʼ�������ַ���Substr1�����ֵ�λ��");
	System.out.println(Str.lastIndexOf(SubStr1,15));
	System.out.println("���ַ���SubStr2�����ֵ�λ��");
	System.out.println(Str.lastIndexOf(SubStr2));
}
}
