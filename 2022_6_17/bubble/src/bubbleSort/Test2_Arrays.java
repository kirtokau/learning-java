package bubbleSort;

import java.util.Arrays;

//����������������鹤����Arrays
		//�ܽ᣺
		//1��toString(m[])--���ǽ�m�����е�Ԫ�ؽ���ƴ�ӳ��ַ�������չʾ
		//2��sort()--��һ���������������������ԭ������Ļ�����ֱ������
		//3��copyof(m,n)--�����������nҪ����m�ĳ��ȣ������������nҪС��m�ĳ��ȣ��������������飬ԭ�������ݲ�û�����仯
		
public class Test2_Arrays {

	public static void main(String[] args) {
		//copyof()--��������һ����������
		int[]from= {1,2,3,4,5};
		int[]to=Arrays.copyOf(from,10);
		System.out.println(Arrays.toString(to));
		int[] to2=Arrays.copyOf(from,3);
		System.out.println(Arrays.toString(to2));
	}

}
