package cn.tedu.api;

public class Test5_Number {
 public static void main(String[] args) {
	//��������
	 Integer i1=new Integer(5);//i1��Ĭ��ֵ��null
	 Integer i2=Integer.valueOf(5);//��-128~127��Χ��Ч�ʸߣ���Ϊ��ͬ����ֻ���һ��
	 Integer i3=Integer.valueOf(5);
	 System.out.println(i1==i2);//false,==�Ƚϵ�����������ĵ�ֵַ
	 System.out.println(i2==i3);
	 //���÷���
	 System.out.println(i1.parseInt("8000")+10);//8010,�ӷ����㣬��ΪparseInt()�Ѿ����ַ����͵�����ת��Int������
	 //����Double����
	 Double d1=new Double(3.14);
	 Double d2=Double.valueOf(3.14);
	 Double d3=Double.valueOf(3.14);
	 
	 System.out.println(d2==d3);//false
	 //���÷���
	 System.out.println(d1.parseDouble("3.14")+1);//4.14
}
}
