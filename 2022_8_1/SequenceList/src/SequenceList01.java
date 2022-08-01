import java.util.Iterator;

//˳������
public class SequenceList01<T> implements Iterable<T> {
	public class SIterator implements Iterator {
	       private int cur;
	       public SIterator() {
	    	   this.cur=0;
	       }
			@Override
			public boolean hasNext() {
				return cur<N;
			}

			@Override
			public T next() {
				return eles[cur++];
			}

		}
	
	//�洢�����Ԫ��
	private  T[] eles;
	//��¼��ǰ˳����е�Ԫ�ظ���
	private int N;
	//���췽��
	public SequenceList01(int capacity) {
		eles=(T[])new Object[capacity];
		N=0;
	}
	//��һ�����Ա���Ϊ�ձ�
	public void clear() {
		N=0;
	}
	//�жϵ�ǰ���Ա��Ƿ�Ϊ�ձ�
	public boolean isEmpty() {
		return N==0;
	}
	//��ȡ���Ա�ĳ���
	public int  length() {
		return N;
	}
	//��ȡָ��λ�õ�Ԫ��
	public T get(int i) {
		if(i<0||i>=N) {
			throw new RuntimeException("��ǰԪ�ز����ڣ�");
		}
		return eles[i];
	}
	//�����Ա������Ԫ��
	public void insert(int i, T t) {
		if(i<0||i>N) {
			throw new RuntimeException("�����λ�ò��Ϸ�");			
		}
		//Ԫ���Ѿ����������飬��Ҫ����
		if(N==eles.length) {
			resize(eles.length*2);
		}
		//��iλ�ÿճ�����iλ�ü�������Ԫ����������ƶ�һλ
		for(int index=N-1;index>i;index--) {
			eles[index]=eles[index-1];
		}
		//��t�ŵ�iλ�ô�
		eles[i]=t;
		//Ԫ������+1
		N++;
		
	}
	//ɾ��ָ��λ��i����Ԫ�أ������ظ�Ԫ��
	public T remove(int i) {
		if(i<0||i>N-1) {
			throw new RuntimeException("��ǰҪɾ����Ԫ�ز�����");
		}
		//��¼iλ�ô���Ԫ��
		T result=eles[i];
		//��iλ�ú����Ԫ�ض���ǰ�ƶ�һλ
		for(int index=i;index<N-1;index++) {
			eles[index]=eles[index++];
		}
		//��ǰԪ������-1
		N--;
		//��Ԫ���Ѿ���������Ĵ�С��1/4������������Ĵ�С
		if(N>0&&N<eles.length/4) {
			resize(eles.length/2);
		}
		return result;
		
	}
	//����tԪ�ص�һ�γ��ֵ�λ��
	public int indexof(T t) {
		
		if(t==null) {
			throw new RuntimeException("���ҵ�Ԫ�ز��Ϸ�");
		}
		for(int i=0;i<N;i++) {
			if(eles[i].equals(t)) {
				return i;
			}
		}
		return -1;
		
	}
	//��ӡ��ǰ���Ա��Ԫ��
	public void showEles() {
		for(int i=0;i<N;i++) {
			System.out.println(eles[i]+" ");
		}
		System.out.println();
	}
	//�ı�����
	private void resize(int newSize) {
		// ��¼������
		T[] temp=eles;
		//����������
		eles=(T[])new Object[newSize];
		//�Ѿ������е�Ԫ�ؿ�����������
		for(int i=0;i<N;i++) {
			eles[i]=temp[i];
		}
		
	}
	public int capacity() {
		return eles.length ;
		
	}
	@Override
	public Iterator iterator() {
		
		return new SIterator();
	}
	//���Դ���

		public static void main(String[] args) {
			SequenceList01<String>sequence=new SequenceList01<>(5);
			//���Ա���
			sequence.insert(0,"Ҧ��");
			sequence.insert(1, "�Ʊ�");
			sequence.insert(2, "���");
			sequence.insert(3, "����ɭ");
			sequence.insert(4, "����");
			System.out.println(sequence.capacity());
			sequence.insert(5, "aa");
			System.out.println(sequence.capacity());
			sequence.insert(5, "aa");
			sequence.insert(5, "aa");
			sequence.insert(5, "aa");
			sequence.insert(5, "aa");
			sequence.insert(5, "aa");
			System.out.println(sequence.capacity());
			sequence.remove(1);
			sequence.remove(1);
			sequence.remove(1);
			sequence.remove(1);
			sequence.remove(1);
			sequence.remove(1);
			sequence.remove(1);
			System.out.println(sequence.capacity());
		
	}


}
