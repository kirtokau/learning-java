package cn.tedu.api;
//����String����÷�
public class Test2_String {
   public static void main(String[] args) {
	//1������String����
	   char value[]= {'a','b','c'};
	   String s1=new String(value);//�ַ����ײ�ά����һ��char[],������ڴ�Ķ���
	   String s2="abc";//�ײ�Ҳ��new String����,������ڴ�Ķѵó������У�Ч�ʸߡ�
	   //���÷���
	   System.out.println(s2.charAt(1));//��ȡ�±�Ϊ1��char�ַ�
	   System.out.println(s2.concat("opq"));//��ԭ�е��ַ��������Ͻ���ƴ��
	   
	   System.out.println(s2.endsWith("c"));//TRUE���ж��Ƿ���c�ַ�������
	   System.out.println(s1.equals(s2));//true��String��д��equals(),�Ƚ���s1��s2������ֵabc����
	   
	   System.out.println(s2.getBytes());//�ַ���ת��byte
	   System.out.println(s2.indexOf("c"));//ָc���ֵĵ�һ�ε�λ������ֵ
	   
	   s2="abcac";
	   System.out.println(s2.lastIndexOf("c"));//ָc���ֵĵ����һ��λ�õ�����ֵ
	   System.out.println(s2.length());//��ȡ�ַ����ĳ���
	   
	   s2="a b c d e f";
	   System.out.println(s2.split(" "));//���ַ�������һ���Ĺ�������и�γ�String[]
	   System.out.println(s2.startsWith("a"));//true���ж��ַ����Ƿ���a��ʼ
	   
	   System.out.println(s2.substring(1));//���±�Ϊ1��λ�ÿ�ʼ����ȡ�����ַ���
	   System.out.println(s2.substring(3,7));//��ͷ����β�Ľ�ȡ�ַ���
	   
	   System.out.println(s2.toLowerCase());//a b c d e f g��ȥ������ǰ�Ŀո�
	   System.out.println(s2.toUpperCase());//A B C D E F G 
	   
	   s2=" abcdefg ";
	   System.out.println(s2.trim());//abcdefg��ȥ�����ݵ�ǰ��ո�
	   System.out.println(String.valueOf(11)+698);//ת�����ַ�������
}
}
