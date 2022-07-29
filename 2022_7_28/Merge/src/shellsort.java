

import java.util.Arrays;

//�������
public class shellsort {
	/*
	 * ������a�е�Ԫ�ؽ�������
	 */
	public static void sort(Comparable[] a) {
		int N=a.length;
		//ȷ��������h�����ֵ
		int h=1;
		while(h<N/2) {
			h=h*2+1;		
	}
	//��������hС��1���������
	while(h>=1) {
	//�ҵ��������Ԫ��
		for(int i=h;i<N;i++) {
			//a[i]���Ǵ������Ԫ��
			//��a[i]���뵽a[i-h],a[i-2h],a[i-3h]...������
			for(int j=i;j>=h;j-=h) {
				/*a[j]���Ǵ�����Ԫ�أ����κ�a[j-h],a[j-2h],a[j-3h]���бȽϣ����a[j]С��
				��ô����λ�ã������С�ڣ�a[j]����������
				*/
				if(greater(a[j-h],a[j])) {
					exch(a,j,j-h);
				}else {
					break;
				}
			}
		}
		h/=2;
	}

}

	private static void exch(Comparable[] a, int j, int i) {
		Comparable t=a[i];
		a[i]=a[j];
		a[j]=t;
		
	}

	private static boolean greater(Comparable v, Comparable w) {
		
		return v.compareTo(w)>0;
	}
	
	public static void main(String[] args) {
		Integer[]a= {9,1,2,5,7,4,8,6,3,5};
		sort(a);
		System.out.println(Arrays.toString(a));
	}
}