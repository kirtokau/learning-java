package bubbleSort;

import java.util.Arrays;

public class Test1_Bubble {

	public static void main(String[] args) {
		//1��������������
		int[]a= {21,96,75,23,25};
		//2������method()����
//		int[] newA=method(a);
		//�ײ�ʹ�õ������㷨�ǣ������Ż���Ŀ��������㷨
		Arrays.sort(a);//�����������������
		System.out.println(Arrays.toString(a));
	}
	//�������
	public static int[] method(int[] a) {
		//1����ѭ�������ƱȽ�����������n��������Ҫ�Ƚ�n-1��
		//a.length-1��ָ��Ҫ�Ƚϵ�����������ĳ���-1
		for(int i=0;i<a.length-1;i++){
			//����Ԫ�ص�ֵ�Ƚϣ�a[j]�������ǰһ��Ԫ�أ����Ҳ����ٴβ���Ƚ�
			for(int j=0;j<a.length-1;j++){
				//����Ԫ�ص�ֵ�Ƚϣ�a[j]�������ǰһ��Ԫ�أ�a[i+j]������Ǻ�һ��Ԫ��
				if(a[j]>a[j+1]) {
					//��������
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		return a;//�����������鷵��
	}

}
