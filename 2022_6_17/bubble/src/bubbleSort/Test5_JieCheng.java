package bubbleSort;
//�������������5�Ľ׳�
public class Test5_JieCheng {

	public static void main(String[] args) {
		int res=method(5);
		System.out.println(res);
    }
	//������5�Ľ׳�
	public static int method(int i) {
		if(i==1) {//��1�Ľ׶�
			return 1;
		}else {
			//�����ĵݹ飬���ǲ��ϵ��ظ�����ͬ��ҵ����˭�Ľ׳�
			//�ݹ飺�ڷ����ڲ����÷�������
			return i*method(i-1);
			
		}
	}

}
