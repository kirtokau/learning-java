import java.util.Arrays;

//�������
public class Quicksort {
	public static void sort(Comparable[] a) {
		int lo=0;
		int hi=a.length-1;
		sort(a,lo,hi);
	}

	private static void sort(Comparable[] a, int lo, int hi) {
		if(hi<=lo) {
			return;
		}
		//��a�����У���lo��hi��Ԫ�ؽ����з�
		int partition=partition(a,lo,hi);
		//����߷����е�Ԫ�ؽ�������
		sort(a,lo,partition-1);
		//���ұ߷����е�Ԫ�ؽ�������
		sort(a,partition+1,hi);
	}

	private static int partition(Comparable[] a, int lo, int hi) {
		Comparable key=a[lo];//������ߵ�Ԫ�ص�����׼ֵ
		int left=lo;//����һ�����ָ�룬��ʼָ������ߵ�Ԫ��
		int right=hi+1;//����һ���Ҳ�ָ�룬��ʼָ�����Ҳ��Ԫ��
		//�����з�
		while(true) {
			//�ȴ�������ɨ�裬�ҵ�һ���Ȼ�׼ֵС��Ԫ��
			while(less(key,a[--right])) {
				//ѭ��ֹͣ��֤���ҵ���һ���Ȼ�׼ֵС��Ԫ��
				if(right==lo) {
					break;//�Ѿ�ɨ�赽������ˣ��������ɨ��					
				}
			}
			//�ٴ�������ɨ�裬��һ���Ȼ�׼ֵ���Ԫ��
			while(less(a[++left],key)) {
			//ѭ��ֹͣ��֤���ҵ���һ���Ȼ�׼ֵ���Ԫ��
				if(left==hi) {
					break;//�Ѿ�ɨ�赽�����ұ��ˣ��������ɨ��
				}
			}
			if(left>=right) {
				//ɨ����������Ԫ�أ�����ѭ��
				break;
			}else {
				//����left��right��������Ԫ��
				exch(a,left,right);
			}
		}
		//�������right�������ͻ�׼ֵ���ڵ���������ֵ
		exch(a,lo,right);
		return right;//right�����зֵĽ���
	}

	/*
	 * ����Ԫ��i��j����λ��
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;		
	}
/*
 * �Ƚ�vԪ���Ƿ�С��wԪ��
 */
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w)<0;
	}
   public static void main(String[] args) {
	Integer str[]= {1,21,8,9,7,4,6,6,5,1};
	sort(str);
	System.out.println(Arrays.toString(str));	
}
}
