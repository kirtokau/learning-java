package cn.tedu.thread;
//������������Զ��̣߳���̷�ʽ��extends Thread
public class Test1_Thread {

	public static void main(String[] args) {
		// ����Thread����
		MyThread t=new MyThread();//�½�״̬
        //�����̵߳���start()��JVM���Զ�����run()��ҵ��---ʹ�̴߳��½�ת�ɿ�����״̬���ȴ�CPU����
		t.start();
		//--6ģ����̣߳���Ҫ��������2���߳̽ж��̳߳������ֻ����һ���̣߳��е��̳߳���
		MyThread t2=new MyThread();
		t2.start();//ʹ�̴߳��½�ת�ɿ�����״̬���ȴ�CPU����
		//run()��start()������ʲô��run()��ִ��ʱֻ�ǵ���һ����ͨ������ִ�У���û�ж��߳�Ч��
//		t.run();
		//�̵߳�����ԣ�CPU���Զ����ȿ�����״̬���߳��ǣ������Ǹ�ʱ��Ƭִ���ĸ��߳������޷�����
		//0=Thread-0
		//0=Thread-1
		//1=Thread-0
		//1=Thread-1
		//2=Thread-0
	}
}
//�Զ�����߳��࣬��ʽ��extends Thread
class MyThread extends Thread{
	//��дThread���run()alt+/,��ҵ�����run()
	@Override
	public void run() {
		
		super.run();//Ĭ��ʹ��Thread�����ҵ��
		//���10�ε�ǰ���߳�����
		for(int i=0;i<10;i++) {
			//getName()���Ի�ȡ����ִ��������߳�����
			System.out.println(i+"="+getName());
		}
	}
}


