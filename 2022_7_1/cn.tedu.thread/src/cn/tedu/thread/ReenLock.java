package cn.tedu.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReenLock {

	public static void main(String[] args) {
		My2 target=new My2();
		Thread t=new Thread(target,"1�Ŵ��ڣ�");
		Thread t2=new Thread(target,"2�Ŵ���");
		Thread t3=new Thread(target,"3�Ŵ���");
		Thread t4=new Thread(target,"4�Ŵ���");
		t.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class My2 implements Runnable{
	int sum=100;
	static ReentrantReadWriteLock lock=new ReentrantReadWriteLock(true);
	@Override
	public void run() {
		// t t2 t3 t4��Ҫ���ţ�t��Կ�ף������˳�ȥ��t2�ٿ��Ÿɻ�������
		//synchronized(this)
		lock.writeLock().lock();
		//sum=1ʱ��t,t2,t3,t4��������
		try {
			if(sum>0) {
				try {
					//t t2 t3 t4��˯��
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//t���� sum=1ʱ��sum--=1,sum=0;
				//t2���� sum=0ʱ��sum--=0,sum=-1;
				//t3���� sum=-1ʱ��sum--=-1,sum=-2
				//t4���� sum=-2ʱ��sum--=-2,sum=-3
				System.out.println(Thread.currentThread().getName()+sum--);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.writeLock().unlock();//��ֹ���������Զ��ͷţ����ͷžͶ�ռ������
		}
		
	}
}
