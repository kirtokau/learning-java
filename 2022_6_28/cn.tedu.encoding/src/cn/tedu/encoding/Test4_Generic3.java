package cn.tedu.encoding;

public class Test4_Generic3 {

	public static void main(String[] args) {
		// ��ӡ�����е�Ԫ��
		Integer[]a= {1,2,3,4,5};
		String[]b={"tony","jack","rose","xiongda","xionger"};
		Double[]c= {1.1,2.2,3.3};
		
		print(a);
		print(b);
		print(c);

	}
	//���Ϳ���ʵ��ͨ�ô���ı�д��ʹ��E��ʾԪ�ص�������Element���� --���������ƶ�̬
	//���͵��﷨Ҫ������ڷ�����ʹ�÷��ͣ���������ͬʱ���֣�һ���ǲ�����һ���Ƿ���ֵǰ�ķ���
	public static <E> void print(E[] y) {
		for(E d:y) {
			System.out.println(d);
		}
	}

}
