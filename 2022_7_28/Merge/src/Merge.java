import java.util.Arrays;

//�������
public class Merge {
	private static Comparable[] assit;//�鲢����Ҫ�ĸ�������
    /*
     * ������a�е�Ԫ�ؽ�������
     */
	public static void sort(Comparable[] a) {
		assit=new Comparable[a.length];
		int lo=0;
		int hi=a.length-1;
		sort(a,lo,hi);
	}
	/*
	 * ������a�д�lo��hi��Ԫ�ؽ�������
	 */
	private static void sort(Comparable[] a, int lo, int hi) {
		if(hi<=lo) {
			return;
		}
		int mid=lo+(hi-lo)/2;
		//��lo��mid֮���Ԫ�ؽ�������
		sort(a,lo,mid);
		//��mid+1��hi֮���Ԫ�ؽ�������
		sort(a,mid+1,hi);
		//��lo��mid�������ݺ�mid��hi�������ݽ��й鲢
		merage(a,lo,mid,hi);
	}
	/*
	 * �������У���lo��midΪһ�飬��mid+1��hiΪһ�飬�����������ݽ��й鲢
	 */
	private static void merage(Comparable[] a, int lo, int mid, int hi) {
		// lo��mid�������ݺ�mid+1��hi�������ݹ鲢����������assit��Ӧ��������
		int i=lo;//����һ��ָ�룬ָ��assit�����п�ʼ������ݵ�����
		int p1=lo;//����һ��ָ�룬ָ���һ�����ݵĵ�һ��Ԫ��
		int p2=mid+1;//����һ��ָ�룬ָ��ڶ������ݵĵ�һ��Ԫ��
		//�Ƚ����������ұ������е�Ԫ�ش�С���ĸ�С���Ͱ��ĸ�������䵽assit����
		while(p1<=mid&&p2<=hi) {
			if(less(a[p1],a[p2])) {
			  assit[i++]=a[p1++];
			}else {
			  assit[i++]=a[p2++];
			}
		}
		//�����ѭ������������˳�ѭ����������p1<=mid,��֤����������е������Ѿ��鲢��ϣ����
         //�˳�ѭ����������P2<=hi,��֤���ұ�С��������Ѿ�������
		 //������Ҫ��δ�����ϵ����ݼ�����䵽assit�У���������ѭ����ֻ��ִ�����е�һ��
		while(p1<=mid) {
			assit[i++]=a[p1++];
		}
		while(p2<=hi) {
			assit[i++]=a[p2++];
		}
		//������Ϊֹ��assit�����У���lo��hi��Ԫ��������ģ��ٰ����ݿ�����a�����е�������
		for(int index=lo;index<=hi;index++) {
			a[index]=assit[index];
		}		
	}
	/*
	 * �Ƚ�VԪ���Ƿ�С��wԪ��
	 */
	private static boolean less(Comparable v,Comparable w) {
		return v.compareTo(w)<0;
	}
	/*
	 * ����Ԫ��i��j����λ��
	 */
	private static void exch(Comparable[] a,int i,int j) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;	
	}
	//���Դ���
	public static void main(String[] args) {
		Integer[] arr= {8,4,5,7,1,3,6,2};
        Merge.sort(arr);
        System.out.println(Arrays.toString(arr));
	
	}
}
