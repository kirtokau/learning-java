package cn.tedu.thread;
//������������Զ��̣߳���̷�ʽ2:implements Runnable
public class Test2_Runnable {

	public static void main(String[] args) {
		// �����̶߳���
		MyRunnable target=new MyRunnable();
		//���⣺��ô�ѽӿڵ�ʵ�����Thread���
		Thread thread=new Thread(target,"�ܴ�");
		//�����߳�
		thread.start();
		//ģ����̱߳�̣���Ҫ��������̶߳�������
		Thread thread2=new Thread(target,"�ܶ�");
		thread2.start();
		//�Լ�����start()��run()������run()ֻ��һ����ͨ����ִ�е�Ч��Ҳ���ǵ��߳�˳��
		//�Լ��޸��߳�����--ʹ��Thread��ĺ��ι���
	}
}
//�Զ�����߳��࣬��ʽ2��implements Runnable
class MyRunnable implements Runnable{
	//��ҵ�����run(),��д��Runnable�ӿ����
	@Override
	public void run() {
		// дҵ�񣬴�ӡ10���߳�����
		for(int i=0;i<10;i++) {
			//���⣺Runnable�ӿ��У�û���ṩ����ķ���Ψ��ֻ��һ��run()
//			Thread.currentThread()��ȡ��ǰ����ִ��ҵ����̶߳���.getName()����
			System.out.println(Thread.currentThread().getName()+"="+i);
		}
		
	}
}
