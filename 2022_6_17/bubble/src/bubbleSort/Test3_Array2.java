package bubbleSort;

public class Test3_Array2 {

	public static void main(String[] args) {
		//1��������ά����
		int[][]a= {{1,3},{4,6},{7,9}};
		//2��������ά����
		for(int i=0;i<a.length;i++){//�����ⲿ����
			//a[i].length--�����ⲿ������±��ȡ��a[i]����һ�����飬a[i].length���ڲ�����ĳ���
			for(int j=0;j<a[i].length;j++){//�����ڲ�����
				//a[i][j]--�����ⲿ������±���ڲ�������±궨λ�����Ԫ��
				System.out.println(a[i][j]);
			}
			
		}
		
		

	}

}
