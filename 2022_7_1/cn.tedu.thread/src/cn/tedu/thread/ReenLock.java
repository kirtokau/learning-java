package cn.tedu.thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReenLock {

	public static void main(String[] args) {
		My2 target=new My2();
		Thread t=new Thread(target,"1号窗口：");
		Thread t2=new Thread(target,"2号窗口");
		Thread t3=new Thread(target,"3号窗口");
		Thread t4=new Thread(target,"4号窗口");
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
		// t t2 t3 t4都要开门，t有钥匙，进来了出去后，t2再开门干活再锁门
		//synchronized(this)
		lock.writeLock().lock();
		//sum=1时，t,t2,t3,t4都进来了
		try {
			if(sum>0) {
				try {
					//t t2 t3 t4都睡了
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				//t醒了 sum=1时，sum--=1,sum=0;
				//t2醒了 sum=0时，sum--=0,sum=-1;
				//t3醒了 sum=-1时，sum--=-1,sum=-2
				//t4醒了 sum=-2时，sum--=-2,sum=-3
				System.out.println(Thread.currentThread().getName()+sum--);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.writeLock().unlock();//防止死锁，会自动释放，不释放就独占报错了
		}
		
	}
}
