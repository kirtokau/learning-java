package cn.tedu.thread;
//������������Զ��߳���Ʊ
//���4����Ʊ���ڣ��ܼ���Ʊ100��
public class Test3_Ticket {

	public static void main(String[] args) {
		// �����̶߳���
		TicketThread t=new TicketThread();
		TicketThread t2=new TicketThread();
		TicketThread t3=new TicketThread();
		TicketThread t4=new TicketThread();
		//�������ó���ֻ��100��Ʊ������Ŀǰ����400�ţ�Ϊʲô��
		t.start();
		t2.start();
		t3.start();
		t4.start();
 	}
}
//���̱߳�̣�extends Thread
class TicketThread extends Thread{
	//int tickets=100;//�����������¼Ʊ�����ݣ���Ա����-ʵ������
	static int tickets=100;//���Ա����������ֻ�����һ��
	//��ҵ��д��run()��
	@Override
	public void run() {
		// һֱ��Ʊ
		while(true) {
			//!!!��������ܹ�����sleep�Ŀ��У�����˵������û���˰�ȫ����
			try {
				//������������ͬһ��Ʊ�����˶����
				//�����˳�����������Ʊ��������������0��-1��-2
				Thread.sleep(10);//�ó�������10ms
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(getName()+"="+tickets--);
			if(tickets<=0) break;//��ѭ���ĳ���
		}
	}
}
