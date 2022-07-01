package cn.tedu.thread;
//����������yԇ���̱߳�̵�ͬ����
public class Test5_Synchrionized {

	public static void main(String[] args) {
		TicketSync target=new TicketSync();
		Thread t1=new Thread(target);
		Thread t2=new Thread(target);
		Thread t3=new Thread(target);
		Thread t4=new Thread(target);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
//������߳���Ʊ����
class TicketSync implements Runnable{
	int tickets=100;
	Object O=new Object();
	//���������Ĵ��뱻ͬ���ˣ�ֱ�Ӱѷ�����ͬ�����Σ���֮Ϊͬ���������õ�������This
	@Override
	//synchronized public void run()
	public void run() {
		while(true) {
			//ͬ������飺��ָ��ͬһʱ����Դ�ᱻ��ռû����
			//���߳������ݰ�ȫ������ǰ�᣺���̳߳���+�й������ݣ���Ա������+������������������
			//ͬ������λ�ã�̫��Ҳ���У������Ч��̫�ͣ�̫СҲ���У�������ڸ��Լ�����һ�����������ⷢ����λ�ÿ�ʼ����ֹ������λ��
			//�����󣺶��̼߳�ʹ�õı�����ͬһ��������ͬ����������������������������
			//synchronized(new Object()){
			//���ԣ��൱��ÿ���߳������Լ�����������̼߳䲢�����õ�ͬһ����
			//synchronized(o)//���̼߳�ʹ����ͬһ��O����
			synchronized(this) {
				//���̼߳�ʹ����ͬһ��O����
				if(tickets>0) {
					try {
						Thread.sleep(10);//�ӳٷ���
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()+"="+tickets--);
				}
				if(tickets<=0) break;
			}
		}
		
	}
}
