//������ȶ��д���
public class MaxPriorityQueue<T extends Comparable<T>>{
 //�洢���е�Ԫ��
	private T[] items;
	//��¼����Ԫ�صĸ���
	private int N;
	public MaxPriorityQueue(int capacity) {
		items=(T[])new Comparable[capacity+1];
		N=0;
	}
	//��ȡ������Ԫ�صĸ���
	public int size() {
		return N;
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return N==0;
	}
	//�ж϶�������i����Ԫ���Ƿ�С������j����Ԫ��
	private boolean less(int i,int j) {
		return items[i].compareTo(items[j])<0;
	}
	//��������i������j��������ֵ
	private void exch(int i,int j) {
		T tmp=items[i];
		items[i]=items[j];
		items[j]=tmp;
	}
	//�����в���һ��Ԫ��
	public void insert(T t) {
		items[++N]=t;
		swim(N);
	}
	//ɾ����������Ԫ�أ�������������Ԫ��
	public T delMax() {
		T max=items[1];
		//��������1��������N����ֵ
		exch(1,N);
		//ɾ�����λ���ϵ�Ԫ��
		items[N]=null;
		N--;//����-1
		sink(1);		
		return max;
		
	}
	//ʹ���³��㷨��ʹ����K����Ԫ�����ڶ��д���һ����ȷ��λ��
	private void sink(int K) {
	//�����ǰ�Ѿ�����ײ��ˣ��Ͳ���Ҫѭ����
	 while(2*K<=N) {
	//�ҵ��ӽڵ��еĽϴ���
		 int max=2*K;
		 if(2*K+1<=N) {
		 //�������ӽڵ�
			 if(less(2*K,2*K+1)) {
				max=2*K+1;     
		}
     }
		 //�Ƚϵ�ǰ�����ӽ���еĽϴ��ߣ������ǰ��㲻С�������ѭ��
		 if(!less(K,max)) {
			 break;
		 }
		 //��ǰ���С���򽻻�
		 exch(K,max);
		 K=max;
    }
  }

	//ʹ���ϸ��㷨��ʹ����K����Ԫ�����ڶ��д���һ����ȷ��λ��
	private void swim(int K) {
		// ����Ѿ����˸��ڵ㣬�Ͳ���Ҫѭ����
		while(K>1) {
		//�Ƚϵ�ǰ�����丸���
		if(less(K/2,K)) {
		//���ڵ�С�ڵ�ǰ�ڵ㣬��Ҫ����
			exch(K/2,K);
		}
		K=K/2;
	}		
  }
}
