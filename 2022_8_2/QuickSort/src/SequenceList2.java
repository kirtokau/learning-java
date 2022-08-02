import java.util.Iterator;

//˳������
	public class SequenceList2<T> implements Iterable<T>{
		//�洢Ԫ�ص�����
		public T[] eles;
		//��¼��ǰ˳����е�Ԫ�ظ���
		public int N;
	
		//���췽��
		public SequenceList2(int capacity) {
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
		public int length() {
			return N;
			
		}
		//��ȡָ��λ�õ�Ԫ��
		public T get(int i) {
			if(i<0||i>=N) {
				throw new RuntimeException("��ǰԪ�ز����ڣ�");
			}
			return eles[i];
		}
		//�����Ա������Ԫ��t
		public void insert(T t) {
			if(N==eles.length) {
				throw new RuntimeException("��ǰ������");
			}
			eles[N++]=t;
		}
		//��iԪ�ش�����Ԫ��t
		public void insert(int i, T t) {
			if(i==eles.length) {
				throw new RuntimeException("��ǰ������");
			}
			if(i<0||i>N) {
				throw new RuntimeException("�����λ�ò��Ϸ�");
			}
			//��iλ�ÿճ�����iλ�ü�������Ԫ����������ƶ�һλ
			for(int index=N;index>i;index++) {
				eles[index]=eles[index-1];
			}
			//��t�ŵ�iλ�ô�
			eles[i]=t;
			//Ԫ������+1
			N++;
		}
		//ɾ��ָ��λ��i����Ԫ�أ������ظ�Ԫ��
		public T remove(int i) {
			if(i<0||i>N-1)
			throw new RuntimeException("��ǰҪɾ����Ԫ�ز�����");
			//��¼iλ�ô���Ԫ��
			T result=eles[i];
			//��iλ�ú����Ԫ�ض���ǰ�ƶ�һλ
			for(int index=i;index<N-1;index++) {
				eles[index]=eles[index+1];
			}
			//��ǰԪ������-1
			N--;
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
		public void  showEles() {
			for(int i=0;i<N;i++) {
				System.out.println(eles[i]+" ");
			}
			System.out.println();
		}
		@Override
		public Iterator iterator() {			
			return new SIterator();
		}
		

public class SIterator  implements Iterator {
  		

	private int cur;
    	
	public SIterator() {
		this.cur=0;
	}

	@Override
	public boolean hasNext() {
		
		return cur<N;
	}


	@Override
	public Object next() {
		
		return eles[cur++];
	}
	
}
		
		public static void main(String[] args) {
			SequenceList2<String> squence=new SequenceList2<String>(5);
			//���Ա���
			squence.insert(0,"Ҧ��");
			squence.insert(1,"�Ʊ�");
			squence.insert(2,"���");
			squence.insert(3,"����ɭ");
			squence.insert(4,"����");
			
			for(String s:squence) {
				System.out.println(s);
			}
		}
	}
	
	

