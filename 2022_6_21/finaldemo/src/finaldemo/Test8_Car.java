package finaldemo;
//��������ĳ���
public class Test8_Car {

	public static void main(String[] args) {
		// ����������󣬽�������Ĺ��ܲ���
		BMW bm=new BMW();
		bm.start();
		bm.end();
		bm.run();
		/*
		 * ������̬���󣬽��й��ܲ���
		 * ����ֻҪ��д�˸��෽��������ʵ�־ͻᱻ����
		 * ��̬������ǰ�᣺�̳�+��д
		 *��̬�Ĺ����Ǵ�С���������ת�͵Ĺ���
		 *��̬�У�ֻ�ܵ��ø��๦�ܣ����������д����������ģ���������ͳһ���ñ�׼
		 */
		Car c=new BMW();
		c.start();
		c.end();
		c.run();
		}
}
//���������࣬�ṩ������ֹͣ�����й���
class Car{
	public void start() {
		System.out.println("Fu..start()");
	}
	public void end() {
		System.out.println("Fu..end()");
	}
	public void run() {
		System.out.println("Fu..run()");
	}
}
//�������࣬�̳������࣬����/��д ������ֹͣ����
class BMW extends Car{
	public void start() {
		System.out.println("Zi..start");
	}
	public void end() {
		System.out.println("Zi..end()");
	}
}
