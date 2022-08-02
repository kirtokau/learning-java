//˳������
public class SequenceList1<T> {
	//�洢Ԫ�ص�����
	private T[] eles;
	//��¼��ǰ˳����е�Ԫ�ظ���
	private int N;
	//���췽��
	public SequenceList1(int capacity) {
		eles=(T[])new Object[capacity];
		N=0;
	}
	//��һ�����Ա���Ϊ�ձ�
	public void clear() {
		N=0;
	}
	//�жϵ�ǰ���Ƿ�Ϊ�ձ�
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
    public void insert(int i,T t) {
    	if(i==eles.length) {
    		throw new RuntimeException("��ǰ������");    		
    	}
    	if(i<0||i>N) {
    		throw new RuntimeException("�����λ�ò��Ϸ�");
    	}
    	//��iλ�ÿճ�����iλ�ü�������Ԫ����������ƶ�һλ
    	for(int index=N;index>i;index--) {
    	    eles[index]=eles[index-1];
    	}
    	//��tλ�÷ŵ�iλ�ô�
    	eles[i]=t;
    	//Ԫ������+1
    	N++;
    }
    //ɾ��ָ��λ��i����Ԫ�أ�������Ԫ��
    public T remove(int i) {
    	if(i<0||i>N-1) {
    		throw new RuntimeException("��ǰҪɾ����Ԫ�ز�����");
    	}
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
    //����TԪ�ص�һ�γ��ֵ�λ��
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
    //���Դ���
  
    	public static void main(String[] args) {
			//����˳������
    		SequenceList1<String>s1=new SequenceList1<>(10);
    		//���Բ���
    		s1.insert("Ҧ��");
    		s1.insert("�Ʊ�");
    		s1.insert("���");
    		s1.insert(1,"ղķ˹");
    		//���Ի�ȡ
    		String getResult=s1.get(1);
    		System.out.println("��ȡ����1���Ľ��Ϊ:"+getResult);
    		//����ɾ��
    		String removeResult=s1.remove(0);
    		System.out.println("ɾ����Ԫ����:"+removeResult);
    		//�������
    		s1.clear();
    		System.out.println("��պ�����Ա��е�Ԫ�ظ���Ϊ��"+s1.length());
		
    }
}