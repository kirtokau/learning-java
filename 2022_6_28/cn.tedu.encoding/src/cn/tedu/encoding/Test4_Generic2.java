package cn.tedu.encoding;
//������������Է��͵ĺô�
public class Test4_Generic2 {

	public static void main(String[] args) {
		// ��ӡ�����е�Ԫ��
		Integer[] a= {1,2,3,4,5};
		print(a);
		
		String[]b= {"tony","jack","rose","xiongda","xionger"};
		print(b);
		
		Double[]c= {1.1,2.2,3.3};
		print(c);
	}
	public static void print(Double[] y) {
		for(Double d:y) {
			System.out.println(d);
		}
	}
	public static void print(Integer[] x) {
		//��Чforѭ��/foreachѭ�� �ô��ǣ�����ͨforѭ����Ч�ʸ� ,�﷨��� �����ǣ�û�������±��ȡֵ
		//for(1 2:3){}--3��Ҫ���������� 1�Ǳ����õ������ݵ����� 2�Ǳ�����
		for(Integer m:x) {
			System.out.println(m);
		}
	}
	public static void print(String[] x) {
		for(String s:x) {
			System.out.println(s);
		}
	}
}
